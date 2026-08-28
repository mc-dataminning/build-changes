import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class frn implements frk {
   private final dmm a;
   private final List<frn.b> b;
   private final Set<ebr<?>> c;

   frn(dmm $$0, List<frn.b> $$1, Set<ebr<?>> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   static Set<ebr<?>> a(Set<ebr<?>> $$0, dmm $$1, fro<?> $$2) {
      List<ebr<?>> $$3 = $$2.b();
      $$3.forEach($$2x -> {
         if ($$1.l().a($$2x.f()) != $$2x) {
            throw new IllegalStateException("Property " + $$2x + " is not defined for block " + $$1);
         } else if ($$0.contains($$2x)) {
            throw new IllegalStateException("Values of property " + $$2x + " already defined for block " + $$1);
         }
      });
      Set<ebr<?>> $$4 = new HashSet<>($$0);
      $$4.addAll($$3);
      return $$4;
   }

   public frn a(fro<gsi> $$0) {
      Set<ebr<?>> $$1 = a(this.c, this.a, $$0);
      List<frn.b> $$2 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new frn(this.a, $$2, $$1);
   }

   public frn a(gsi $$0) {
      List<frn.b> $$1 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new frn(this.a, $$1, this.c);
   }

   @Override
   public grx b() {
      Map<String, gsd> $$0 = new HashMap<>();

      for (frn.b $$1 : this.b) {
         $$0.put($$1.a.a(), $$1.b);
      }

      return new grx($$0, Optional.empty());
   }

   @Override
   public dmm a() {
      return this.a;
   }

   public static frn.a a(dmm $$0) {
      return new frn.a($$0);
   }

   public static frn a(dmm $$0, gsd $$1) {
      return new frn($$0, List.of(new frn.b(frp.a, $$1)), Set.of());
   }

   public static class a {
      private final dmm a;

      public a(dmm $$0) {
         this.a = $$0;
      }

      public frn a(fro<gsd> $$0) {
         Set<ebr<?>> $$1 = frn.a(Set.of(), this.a, $$0);
         List<frn.b> $$2 = $$0.a().entrySet().stream().map($$0x -> new frn.b((frp)$$0x.getKey(), (gsd)$$0x.getValue())).toList();
         return new frn(this.a, $$2, $$1);
      }
   }

   static record b(frp a, gsd b) {

      public Stream<frn.b> a(fro<gsi> $$0) {
         return $$0.a().entrySet().stream().map($$0x -> {
            frp $$1 = this.a.a((frp)$$0x.getKey());
            gsd $$2 = this.b.a((gsi)$$0x.getValue());
            return new frn.b($$1, $$2);
         });
      }

      public Stream<frn.b> a(gsi $$0) {
         return Stream.of(new frn.b(this.a, this.b.a($$0)));
      }
   }
}
