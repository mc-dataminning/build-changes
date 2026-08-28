import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhm(bwp c, je<awm> d, Optional<alf<dhk>> e, Optional<alg> f, Optional<ji<bwo<?>>> g, boolean h, boolean i, boolean j, boolean k) {
   public static final Codec<dhm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bwp.l.fieldOf("slot").forGetter(dhm::b),
               awm.b.optionalFieldOf("equip_sound", awn.as).forGetter(dhm::c),
               alf.a(dhl.a).optionalFieldOf("asset_id").forGetter(dhm::d),
               alg.a.optionalFieldOf("camera_overlay").forGetter(dhm::e),
               jt.a(mg.B).optionalFieldOf("allowed_entities").forGetter(dhm::f),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dhm::g),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dhm::h),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dhm::i),
               Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(dhm::j)
            )
            .apply($$0, dhm::new)
   );
   public static final yw<wj, dhm> b = yw.a(
      bwp.m,
      dhm::b,
      awm.d,
      dhm::c,
      alf.b(dhl.a).a(yu::a),
      dhm::d,
      alg.b.a(yu::a),
      dhm::e,
      yu.c(mg.B).a(yu::a),
      dhm::f,
      yu.b,
      dhm::g,
      yu.b,
      dhm::h,
      yu.b,
      dhm::i,
      yu.b,
      dhm::j,
      dhm::new
   );

   public static dhm a(cyb $$0) {
      return a(bwp.g).a(awn.oS).a(dhl.l.get($$0)).a(bwo.ax, bwo.by).a();
   }

   public static dhm a() {
      jf<bwo<?>> $$0 = mf.a(mf.f);
      return a(bwp.h).a(awn.ns).a(dhl.k).a($$0.b(axf.J)).d(true).a();
   }

   public static dhm.a a(bwp $$0) {
      return new dhm.a($$0);
   }

   public bud a(czd $$0, crc $$1) {
      if ($$1.e(this.c) && this.a($$1.aq())) {
         czd $$2 = $$1.a(this.c);
         if ((!dfs.a($$2, dfr.E) || $$1.b()) && !czd.c($$0, $$2)) {
            if (!$$1.dV().w_()) {
               $$1.b(awx.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               czd $$3 = $$2.f() ? $$0 : $$2.g();
               czd $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bud.a.a($$3);
            } else {
               czd $$5 = $$2.g();
               czd $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gj().g($$5)) {
                  $$1.a($$5, false);
               }

               return bud.a.a($$0);
            }
         } else {
            return bud.d;
         }
      } else {
         return bud.e;
      }
   }

   public bud a(crc $$0, bxe $$1, czd $$2) {
      if ($$1.a($$2, this.c) && !$$1.d(this.c) && $$1.bK()) {
         if (!$$0.dV().w_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof bxg $$3) {
               $$3.g(this.c);
            }
         }

         return bud.a;
      } else {
         return bud.e;
      }
   }

   public boolean a(bwo<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bwp b() {
      return this.c;
   }

   public je<awm> c() {
      return this.d;
   }

   public Optional<alf<dhk>> d() {
      return this.e;
   }

   public Optional<alg> e() {
      return this.f;
   }

   public Optional<ji<bwo<?>>> f() {
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
      private final bwp a;
      private je<awm> b = awn.as;
      private Optional<alf<dhk>> c = Optional.empty();
      private Optional<alg> d = Optional.empty();
      private Optional<ji<bwo<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;
      private boolean i;

      a(bwp $$0) {
         this.a = $$0;
      }

      public dhm.a a(je<awm> $$0) {
         this.b = $$0;
         return this;
      }

      public dhm.a a(alf<dhk> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dhm.a a(alg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dhm.a a(bwo<?>... $$0) {
         return this.a(ji.a(bwo::r, $$0));
      }

      public dhm.a a(ji<bwo<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dhm.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dhm.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dhm.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dhm.a d(boolean $$0) {
         this.i = $$0;
         return this;
      }

      public dhm a() {
         return new dhm(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
