import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class fsq implements fsn {
   private final dno a;
   private final List<fsq.b> b;
   private final Set<ect<?>> c;

   fsq(dno $$0, List<fsq.b> $$1, Set<ect<?>> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   static Set<ect<?>> a(Set<ect<?>> $$0, dno $$1, fsr<?> $$2) {
      List<ect<?>> $$3 = $$2.b();
      $$3.forEach($$2x -> {
         if ($$1.l().a($$2x.f()) != $$2x) {
            throw new IllegalStateException("Property " + $$2x + " is not defined for block " + $$1);
         } else if ($$0.contains($$2x)) {
            throw new IllegalStateException("Values of property " + $$2x + " already defined for block " + $$1);
         }
      });
      Set<ect<?>> $$4 = new HashSet<>($$0);
      $$4.addAll($$3);
      return $$4;
   }

   public fsq a(fsr<gtk> $$0) {
      Set<ect<?>> $$1 = a(this.c, this.a, $$0);
      List<fsq.b> $$2 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new fsq(this.a, $$2, $$1);
   }

   public fsq a(gtk $$0) {
      List<fsq.b> $$1 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new fsq(this.a, $$1, this.c);
   }

   @Override
   public gsy b() {
      Map<String, gta.b> $$0 = new HashMap<>();

      for (fsq.b $$1 : this.b) {
         $$0.put($$1.a.a(), $$1.b.a());
      }

      return new gsy(Optional.of(new gsy.b($$0)), Optional.empty());
   }

   @Override
   public dno a() {
      return this.a;
   }

   public static fsq.a a(dno $$0) {
      return new fsq.a($$0);
   }

   public static fsq a(dno $$0, fsm $$1) {
      return new fsq($$0, List.of(new fsq.b(fss.a, $$1)), Set.of());
   }

   public static class a {
      private final dno a;

      public a(dno $$0) {
         this.a = $$0;
      }

      public fsq a(fsr<fsm> $$0) {
         Set<ect<?>> $$1 = fsq.a(Set.of(), this.a, $$0);
         List<fsq.b> $$2 = $$0.a().entrySet().stream().map($$0x -> new fsq.b((fss)$$0x.getKey(), (fsm)$$0x.getValue())).toList();
         return new fsq(this.a, $$2, $$1);
      }
   }

   static record b(fss a, fsm b) {

      public Stream<fsq.b> a(fsr<gtk> $$0) {
         return $$0.a().entrySet().stream().map($$0x -> {
            fss $$1 = this.a.a((fss)$$0x.getKey());
            fsm $$2 = this.b.a((gtk)$$0x.getValue());
            return new fsq.b($$1, $$2);
         });
      }

      public Stream<fsq.b> a(gtk $$0) {
         return Stream.of(new fsq.b(this.a, this.b.a($$0)));
      }
   }
}
