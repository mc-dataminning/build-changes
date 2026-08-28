import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dit(bxo c, jg<awx> d, Optional<alq<dir>> e, Optional<alr> f, Optional<jk<bxn<?>>> g, boolean h, boolean i, boolean j, boolean k) {
   public static final Codec<dit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bxo.l.fieldOf("slot").forGetter(dit::b),
               awx.b.optionalFieldOf("equip_sound", awy.as).forGetter(dit::c),
               alq.a(dis.a).optionalFieldOf("asset_id").forGetter(dit::d),
               alr.a.optionalFieldOf("camera_overlay").forGetter(dit::e),
               jv.a(mi.B).optionalFieldOf("allowed_entities").forGetter(dit::f),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dit::g),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dit::h),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dit::i),
               Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(dit::j)
            )
            .apply($$0, dit::new)
   );
   public static final ze<wp, dit> b = ze.a(
      bxo.m,
      dit::b,
      awx.d,
      dit::c,
      alq.b(dis.a).a(zc::a),
      dit::d,
      alr.b.a(zc::a),
      dit::e,
      zc.c(mi.B).a(zc::a),
      dit::f,
      zc.b,
      dit::g,
      zc.b,
      dit::h,
      zc.b,
      dit::i,
      zc.b,
      dit::j,
      dit::new
   );

   public static dit a(czi $$0) {
      return a(bxo.g).a(awy.oS).a(dis.l.get($$0)).a(bxn.ay, bxn.bz).a();
   }

   public static dit a() {
      jh<bxn<?>> $$0 = mh.a(mh.f);
      return a(bxo.h).a(awy.ns).a(dis.k).a($$0.b(axq.J)).d(true).a();
   }

   public static dit.a a(bxo $$0) {
      return new dit.a($$0);
   }

   public bvc a(dak $$0, csi $$1) {
      if ($$1.e(this.c) && this.a($$1.an())) {
         dak $$2 = $$1.a(this.c);
         if ((!dgz.a($$2, dgy.E) || $$1.gz()) && !dak.c($$0, $$2)) {
            if (!$$1.dV().A_()) {
               $$1.b(axi.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               dak $$3 = $$2.f() ? $$0 : $$2.g();
               dak $$4 = $$1.gz() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bvc.a.a($$3);
            } else {
               dak $$5 = $$2.g();
               dak $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gj().g($$5)) {
                  $$1.a($$5, false);
               }

               return bvc.a.a($$0);
            }
         } else {
            return bvc.d;
         }
      } else {
         return bvc.e;
      }
   }

   public bvc a(csi $$0, byf $$1, dak $$2) {
      if ($$1.a($$2, this.c) && !$$1.d(this.c) && $$1.bJ()) {
         if (!$$0.dV().A_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof byh $$3) {
               $$3.g(this.c);
            }
         }

         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   public boolean a(bxn<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bxo b() {
      return this.c;
   }

   public jg<awx> c() {
      return this.d;
   }

   public Optional<alq<dir>> d() {
      return this.e;
   }

   public Optional<alr> e() {
      return this.f;
   }

   public Optional<jk<bxn<?>>> f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public boolean h() {
      return this.i;
   }

   public boolean i() {
      return this.j;
   }

   public boolean j() {
      return this.k;
   }

   public static class a {
      private final bxo a;
      private jg<awx> b = awy.as;
      private Optional<alq<dir>> c = Optional.empty();
      private Optional<alr> d = Optional.empty();
      private Optional<jk<bxn<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;
      private boolean i;

      a(bxo $$0) {
         this.a = $$0;
      }

      public dit.a a(jg<awx> $$0) {
         this.b = $$0;
         return this;
      }

      public dit.a a(alq<dir> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dit.a a(alr $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dit.a a(bxn<?>... $$0) {
         return this.a(jk.a(bxn::r, $$0));
      }

      public dit.a a(jk<bxn<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dit.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dit.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dit.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dit.a d(boolean $$0) {
         this.i = $$0;
         return this;
      }

      public dit a() {
         return new dit(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
