import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfu(bvs c, jq<axe> d, Optional<alz> e, Optional<alz> f, Optional<ju<bvr<?>>> g, boolean h, boolean i, boolean j) {
   public static final Codec<dfu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bvs.k.fieldOf("slot").forGetter(dfu::a),
               axe.b.optionalFieldOf("equip_sound", axf.as).forGetter(dfu::b),
               alz.a.optionalFieldOf("model").forGetter(dfu::c),
               alz.a.optionalFieldOf("camera_overlay").forGetter(dfu::d),
               kf.a(mb.z).optionalFieldOf("allowed_entities").forGetter(dfu::e),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dfu::f),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dfu::g),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dfu::h)
            )
            .apply($$0, dfu::new)
   );
   public static final zt<xg, dfu> b = zt.a(
      bvs.l,
      dfu::a,
      axe.d,
      dfu::b,
      alz.b.a(zr::a),
      dfu::c,
      alz.b.a(zr::a),
      dfu::d,
      zr.c(mb.z).a(zr::a),
      dfu::e,
      zr.b,
      dfu::f,
      zr.b,
      dfu::g,
      zr.b,
      dfu::h,
      dfu::new
   );

   public static dfu a(cwm $$0) {
      return a(bvs.g).a(axf.oy).a(dft.j.get($$0)).a(bvr.ay, bvr.by).a();
   }

   public static dfu.a a(bvs $$0) {
      return new dfu.a($$0);
   }

   public btj a(cxp $$0, cpx $$1) {
      if (!$$1.e(this.c)) {
         return btj.e;
      } else {
         cxp $$2 = $$1.a(this.c);
         if ((!deb.a($$2, dea.E) || $$1.b()) && !cxp.c($$0, $$2)) {
            if (!$$1.dW().B_()) {
               $$1.b(axp.c.b($$0.h()));
            }

            if ($$0.L() <= 1) {
               cxp $$3 = $$2.f() ? $$0 : $$2.g();
               cxp $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return btj.a.a($$3);
            } else {
               cxp $$5 = $$2.g();
               cxp $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
                  $$1.a($$5, false);
               }

               return btj.a.a($$0);
            }
         } else {
            return btj.d;
         }
      }
   }

   public boolean a(bvr<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bvs a() {
      return this.c;
   }

   public jq<axe> b() {
      return this.d;
   }

   public Optional<alz> c() {
      return this.e;
   }

   public Optional<alz> d() {
      return this.f;
   }

   public Optional<ju<bvr<?>>> e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public static class a {
      private final bvs a;
      private jq<axe> b = axf.as;
      private Optional<alz> c = Optional.empty();
      private Optional<alz> d = Optional.empty();
      private Optional<ju<bvr<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;

      a(bvs $$0) {
         this.a = $$0;
      }

      public dfu.a a(jq<axe> $$0) {
         this.b = $$0;
         return this;
      }

      public dfu.a a(alz $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dfu.a b(alz $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dfu.a a(bvr<?>... $$0) {
         return this.a(ju.a(bvr::r, $$0));
      }

      public dfu.a a(ju<bvr<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dfu.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dfu.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dfu.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dfu a() {
         return new dfu(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
