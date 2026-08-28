import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bs(
   Optional<Boolean> b, Optional<Boolean> c, Optional<Boolean> d, Optional<Boolean> e, Optional<Boolean> f, Optional<Boolean> g, Optional<Boolean> h
) {
   public static final Codec<bs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("is_on_ground").forGetter(bs::a),
               Codec.BOOL.optionalFieldOf("is_on_fire").forGetter(bs::b),
               Codec.BOOL.optionalFieldOf("is_sneaking").forGetter(bs::c),
               Codec.BOOL.optionalFieldOf("is_sprinting").forGetter(bs::d),
               Codec.BOOL.optionalFieldOf("is_swimming").forGetter(bs::e),
               Codec.BOOL.optionalFieldOf("is_flying").forGetter(bs::f),
               Codec.BOOL.optionalFieldOf("is_baby").forGetter(bs::g)
            )
            .apply($$0, bs::new)
   );

   public boolean a(bsd $$0) {
      if (this.b.isPresent() && $$0.aE() != this.b.get()) {
         return false;
      } else if (this.c.isPresent() && $$0.bQ() != this.c.get()) {
         return false;
      } else if (this.d.isPresent() && $$0.ca() != this.d.get()) {
         return false;
      } else if (this.e.isPresent() && $$0.cb() != this.e.get()) {
         return false;
      } else if (this.f.isPresent() && $$0.cc() != this.f.get()) {
         return false;
      } else {
         if (this.g.isPresent()) {
            boolean var10000;
            label53: {
               if ($$0 instanceof bsy $$1 && ($$1.fA() || $$1 instanceof cmh $$2 && $$2.fZ().b)) {
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

         if (this.h.isPresent() && $$0 instanceof bsy $$4 && $$4.p_() != this.h.get()) {
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

      public static bs.a a() {
         return new bs.a();
      }

      public bs.a a(Boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bs.a b(Boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bs.a c(Boolean $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bs.a d(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bs.a e(Boolean $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bs.a f(Boolean $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public bs.a g(Boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public bs b() {
         return new bs(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
