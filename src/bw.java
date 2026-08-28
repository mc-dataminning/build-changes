import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bw(
   Optional<Boolean> b, Optional<Boolean> c, Optional<Boolean> d, Optional<Boolean> e, Optional<Boolean> f, Optional<Boolean> g, Optional<Boolean> h
) {
   public static final Codec<bw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("is_on_ground").forGetter(bw::a),
               Codec.BOOL.optionalFieldOf("is_on_fire").forGetter(bw::b),
               Codec.BOOL.optionalFieldOf("is_sneaking").forGetter(bw::c),
               Codec.BOOL.optionalFieldOf("is_sprinting").forGetter(bw::d),
               Codec.BOOL.optionalFieldOf("is_swimming").forGetter(bw::e),
               Codec.BOOL.optionalFieldOf("is_flying").forGetter(bw::f),
               Codec.BOOL.optionalFieldOf("is_baby").forGetter(bw::g)
            )
            .apply($$0, bw::new)
   );

   public boolean a(bwi $$0) {
      if (this.b.isPresent() && $$0.aH() != this.b.get()) {
         return false;
      } else if (this.c.isPresent() && $$0.bW() != this.c.get()) {
         return false;
      } else if (this.d.isPresent() && $$0.cg() != this.d.get()) {
         return false;
      } else if (this.e.isPresent() && $$0.ch() != this.e.get()) {
         return false;
      } else if (this.f.isPresent() && $$0.ci() != this.f.get()) {
         return false;
      } else {
         if (this.g.isPresent()) {
            boolean var10000;
            label53: {
               if ($$0 instanceof bxj $$1 && ($$1.fI() || $$1 instanceof crj $$2 && $$2.gj().b)) {
                  var10000 = true;
                  break label53;
               }

               var10000 = false;
            }

            boolean $$3 = var10000;
            if ($$3 != this.g.get()) {
               return false;
            }
         }

         if (this.h.isPresent() && $$0 instanceof bxj $$4 && $$4.n_() != this.h.get()) {
            return false;
         }

         return true;
      }
   }

   public Optional<Boolean> a() {
      return this.b;
   }

   public Optional<Boolean> b() {
      return this.c;
   }

   public Optional<Boolean> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public Optional<Boolean> g() {
      return this.h;
   }

   public static class a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();
      private Optional<Boolean> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<Boolean> e = Optional.empty();
      private Optional<Boolean> f = Optional.empty();
      private Optional<Boolean> g = Optional.empty();

      public static bw.a a() {
         return new bw.a();
      }

      public bw.a a(Boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bw.a b(Boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bw.a c(Boolean $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bw.a d(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bw.a e(Boolean $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bw.a f(Boolean $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public bw.a g(Boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public bw b() {
         return new bw(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
