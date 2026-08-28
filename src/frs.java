import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class frs implements frp {
   private final dmr a;
   private final List<frs.b> b;
   private final Set<ebw<?>> c;

   frs(dmr $$0, List<frs.b> $$1, Set<ebw<?>> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   static Set<ebw<?>> a(Set<ebw<?>> $$0, dmr $$1, frt<?> $$2) {
      List<ebw<?>> $$3 = $$2.b();
      $$3.forEach($$2x -> {
         if ($$1.l().a($$2x.f()) != $$2x) {
            throw new IllegalStateException("Property " + $$2x + " is not defined for block " + $$1);
         } else if ($$0.contains($$2x)) {
            throw new IllegalStateException("Values of property " + $$2x + " already defined for block " + $$1);
         }
      });
      Set<ebw<?>> $$4 = new HashSet<>($$0);
      $$4.addAll($$3);
      return $$4;
   }

   public frs a(frt<gsn> $$0) {
      Set<ebw<?>> $$1 = a(this.c, this.a, $$0);
      List<frs.b> $$2 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new frs(this.a, $$2, $$1);
   }

   public frs a(gsn $$0) {
      List<frs.b> $$1 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new frs(this.a, $$1, this.c);
   }

   @Override
   public gsc b() {
      Map<String, gsi> $$0 = new HashMap<>();

      for (frs.b $$1 : this.b) {
         $$0.put($$1.a.a(), $$1.b);
      }

      return new gsc($$0, Optional.empty());
   }

   @Override
   public dmr a() {
      return this.a;
   }

   public static frs.a a(dmr $$0) {
      return new frs.a($$0);
   }

   public static frs a(dmr $$0, gsi $$1) {
      return new frs($$0, List.of(new frs.b(fru.a, $$1)), Set.of());
   }

   public static class a {
      private final dmr a;

      public a(dmr $$0) {
         this.a = $$0;
      }

      public frs a(frt<gsi> $$0) {
         Set<ebw<?>> $$1 = frs.a(Set.of(), this.a, $$0);
         List<frs.b> $$2 = $$0.a().entrySet().stream().map($$0x -> new frs.b((fru)$$0x.getKey(), (gsi)$$0x.getValue())).toList();
         return new frs(this.a, $$2, $$1);
      }
   }

   static record b(fru a, gsi b) {

      public Stream<frs.b> a(frt<gsn> $$0) {
         return $$0.a().entrySet().stream().map($$0x -> {
            fru $$1 = this.a.a((fru)$$0x.getKey());
            gsi $$2 = this.b.a((gsn)$$0x.getValue());
            return new frs.b($$1, $$2);
         });
      }

      public Stream<frs.b> a(gsn $$0) {
         return Stream.of(new frs.b(this.a, this.b.a($$0)));
      }
   }
}
