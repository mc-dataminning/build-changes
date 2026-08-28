import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddy(but c, jq<awm> d, Optional<alj> e, Optional<ju<bus<?>>> f, boolean g, boolean h, boolean i) {
   public static final Codec<ddy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               but.k.fieldOf("slot").forGetter(ddy::a),
               awm.b.optionalFieldOf("equip_sound", awn.as).forGetter(ddy::b),
               alj.a.optionalFieldOf("model").forGetter(ddy::c),
               kf.a(ma.z).optionalFieldOf("allowed_entities").forGetter(ddy::d),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(ddy::e),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(ddy::f),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(ddy::g)
            )
            .apply($$0, ddy::new)
   );
   public static final zh<wu, ddy> b = zh.a(
      but.l, ddy::a, awm.d, ddy::b, alj.b.a(zf::a), ddy::c, zf.c(ma.z).a(zf::a), ddy::d, zf.b, ddy::e, zf.b, ddy::f, zf.b, ddy::g, ddy::new
   );

   public static ddy a(cvj $$0) {
      return a(but.g).a(awn.of).a(ddx.j.get($$0)).a(bus.aw, bus.bu).a();
   }

   public static ddy.a a(but $$0) {
      return new ddy.a($$0);
   }

   public bsk a(cwm $$0, cou $$1) {
      if (!$$1.e(this.c)) {
         return bsk.e;
      } else {
         cwm $$2 = $$1.a(this.c);
         if ((!dcf.a($$2, dce.E) || $$1.b()) && !cwm.c($$0, $$2)) {
            if (!$$1.dV().A_()) {
               $$1.b(awx.c.b($$0.h()));
            }

            if ($$0.L() <= 1) {
               cwm $$3 = $$2.f() ? $$0 : $$2.g();
               cwm $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bsk.a.a($$3);
            } else {
               cwm $$5 = $$2.g();
               cwm $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gg().f($$5)) {
                  $$1.a($$5, false);
               }

               return bsk.a.a($$0);
            }
         } else {
            return bsk.d;
         }
      }
   }

   public boolean a(bus<?> $$0) {
      return this.f.isEmpty() || this.f.get().a($$0.r());
   }

   public but a() {
      return this.c;
   }

   public jq<awm> b() {
      return this.d;
   }

   public Optional<alj> c() {
      return this.e;
   }

   public Optional<ju<bus<?>>> d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public static class a {
      private final but a;
      private jq<awm> b = awn.as;
      private Optional<alj> c = Optional.empty();
      private Optional<ju<bus<?>>> d = Optional.empty();
      private boolean e = true;
      private boolean f = true;
      private boolean g = true;

      a(but $$0) {
         this.a = $$0;
      }

      public ddy.a a(jq<awm> $$0) {
         this.b = $$0;
         return this;
      }

      public ddy.a a(alj $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public ddy.a a(bus<?>... $$0) {
         return this.a(ju.a(bus::r, $$0));
      }

      public ddy.a a(ju<bus<?>> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ddy.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      public ddy.a b(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public ddy.a c(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public ddy a() {
         return new ddy(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
