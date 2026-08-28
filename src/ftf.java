import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class ftf implements ftc {
   private final dne a;
   private final List<ftf.b> b;
   private final Set<ecj<?>> c;

   ftf(dne $$0, List<ftf.b> $$1, Set<ecj<?>> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   static Set<ecj<?>> a(Set<ecj<?>> $$0, dne $$1, ftg<?> $$2) {
      List<ecj<?>> $$3 = $$2.b();
      $$3.forEach($$2x -> {
         if ($$1.l().a($$2x.f()) != $$2x) {
            throw new IllegalStateException("Property " + $$2x + " is not defined for block " + $$1);
         } else if ($$0.contains($$2x)) {
            throw new IllegalStateException("Values of property " + $$2x + " already defined for block " + $$1);
         }
      });
      Set<ecj<?>> $$4 = new HashSet<>($$0);
      $$4.addAll($$3);
      return $$4;
   }

   public ftf a(ftg<gtz> $$0) {
      Set<ecj<?>> $$1 = a(this.c, this.a, $$0);
      List<ftf.b> $$2 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new ftf(this.a, $$2, $$1);
   }

   public ftf a(gtz $$0) {
      List<ftf.b> $$1 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new ftf(this.a, $$1, this.c);
   }

   @Override
   public gtn b() {
      Map<String, gtp.b> $$0 = new HashMap<>();

      for (ftf.b $$1 : this.b) {
         $$0.put($$1.a.a(), $$1.b.a());
      }

      return new gtn(Optional.of(new gtn.b($$0)), Optional.empty());
   }

   @Override
   public dne a() {
      return this.a;
   }

   public static ftf.a a(dne $$0) {
      return new ftf.a($$0);
   }

   public static ftf a(dne $$0, ftb $$1) {
      return new ftf($$0, List.of(new ftf.b(fth.a, $$1)), Set.of());
   }

   public static class a {
      private final dne a;

      public a(dne $$0) {
         this.a = $$0;
      }

      public ftf a(ftg<ftb> $$0) {
         Set<ecj<?>> $$1 = ftf.a(Set.of(), this.a, $$0);
         List<ftf.b> $$2 = $$0.a().entrySet().stream().map($$0x -> new ftf.b((fth)$$0x.getKey(), (ftb)$$0x.getValue())).toList();
         return new ftf(this.a, $$2, $$1);
      }
   }

   static record b(fth a, ftb b) {

      public Stream<ftf.b> a(ftg<gtz> $$0) {
         return $$0.a().entrySet().stream().map($$0x -> {
            fth $$1 = this.a.a((fth)$$0x.getKey());
            ftb $$2 = this.b.a((gtz)$$0x.getValue());
            return new ftf.b($$1, $$2);
         });
      }

      public Stream<ftf.b> a(gtz $$0) {
         return Stream.of(new ftf.b(this.a, this.b.a($$0)));
      }
   }
}
