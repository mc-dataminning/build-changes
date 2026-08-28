import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhh(bwn c, je<awm> d, Optional<alf<dhf>> e, Optional<alg> f, Optional<ji<bwm<?>>> g, boolean h, boolean i, boolean j, boolean k) {
   public static final Codec<dhh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bwn.l.fieldOf("slot").forGetter(dhh::b),
               awm.b.optionalFieldOf("equip_sound", awn.as).forGetter(dhh::c),
               alf.a(dhg.a).optionalFieldOf("asset_id").forGetter(dhh::d),
               alg.a.optionalFieldOf("camera_overlay").forGetter(dhh::e),
               jt.a(mg.B).optionalFieldOf("allowed_entities").forGetter(dhh::f),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dhh::g),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dhh::h),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dhh::i),
               Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(dhh::j)
            )
            .apply($$0, dhh::new)
   );
   public static final yw<wj, dhh> b = yw.a(
      bwn.m,
      dhh::b,
      awm.d,
      dhh::c,
      alf.b(dhg.a).a(yu::a),
      dhh::d,
      alg.b.a(yu::a),
      dhh::e,
      yu.c(mg.B).a(yu::a),
      dhh::f,
      yu.b,
      dhh::g,
      yu.b,
      dhh::h,
      yu.b,
      dhh::i,
      yu.b,
      dhh::j,
      dhh::new
   );

   public static dhh a(cxw $$0) {
      return a(bwn.g).a(awn.oP).a(dhg.l.get($$0)).a(bwm.ax, bwm.by).a();
   }

   public static dhh a() {
      jf<bwm<?>> $$0 = mf.a(mf.f);
      return a(bwn.h).a(awn.np).a(dhg.k).a($$0.b(axf.J)).d(true).a();
   }

   public static dhh.a a(bwn $$0) {
      return new dhh.a($$0);
   }

   public bub a(cyy $$0, cqy $$1) {
      if ($$1.e(this.c) && this.a($$1.aq())) {
         cyy $$2 = $$1.a(this.c);
         if ((!dfn.a($$2, dfm.E) || $$1.b()) && !cyy.c($$0, $$2)) {
            if (!$$1.dV().w_()) {
               $$1.b(awx.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cyy $$3 = $$2.f() ? $$0 : $$2.g();
               cyy $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bub.a.a($$3);
            } else {
               cyy $$5 = $$2.g();
               cyy $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
                  $$1.a($$5, false);
               }

               return bub.a.a($$0);
            }
         } else {
            return bub.d;
         }
      } else {
         return bub.e;
      }
   }

   public bub a(cqy $$0, bxc $$1, cyy $$2) {
      if ($$1.a($$2, this.c) && !$$1.d(this.c) && $$1.bK()) {
         if (!$$0.dV().w_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof bxe $$3) {
               $$3.g(this.c);
            }
         }

         return bub.a;
      } else {
         return bub.e;
      }
   }

   public boolean a(bwm<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bwn b() {
      return this.c;
   }

   public je<awm> c() {
      return this.d;
   }

   public Optional<alf<dhf>> d() {
      return this.e;
   }

   public Optional<alg> e() {
      return this.f;
   }

   public Optional<ji<bwm<?>>> f() {
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
      private final bwn a;
      private je<awm> b = awn.as;
      private Optional<alf<dhf>> c = Optional.empty();
      private Optional<alg> d = Optional.empty();
      private Optional<ji<bwm<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;
      private boolean i;

      a(bwn $$0) {
         this.a = $$0;
      }

      public dhh.a a(je<awm> $$0) {
         this.b = $$0;
         return this;
      }

      public dhh.a a(alf<dhf> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dhh.a a(alg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dhh.a a(bwm<?>... $$0) {
         return this.a(ji.a(bwm::r, $$0));
      }

      public dhh.a a(ji<bwm<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dhh.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dhh.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dhh.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dhh.a d(boolean $$0) {
         this.i = $$0;
         return this;
      }

      public dhh a() {
         return new dhh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
