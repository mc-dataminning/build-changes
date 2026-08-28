import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhb(bwk c, je<awk> d, Optional<ald<dgz>> e, Optional<ale> f, Optional<ji<bwj<?>>> g, boolean h, boolean i, boolean j, boolean k) {
   public static final Codec<dhb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bwk.l.fieldOf("slot").forGetter(dhb::b),
               awk.b.optionalFieldOf("equip_sound", awl.as).forGetter(dhb::c),
               ald.a(dha.a).optionalFieldOf("asset_id").forGetter(dhb::d),
               ale.a.optionalFieldOf("camera_overlay").forGetter(dhb::e),
               jt.a(mg.B).optionalFieldOf("allowed_entities").forGetter(dhb::f),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dhb::g),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dhb::h),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dhb::i),
               Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(dhb::j)
            )
            .apply($$0, dhb::new)
   );
   public static final yu<wh, dhb> b = yu.a(
      bwk.m,
      dhb::b,
      awk.d,
      dhb::c,
      ald.b(dha.a).a(ys::a),
      dhb::d,
      ale.b.a(ys::a),
      dhb::e,
      ys.c(mg.B).a(ys::a),
      dhb::f,
      ys.b,
      dhb::g,
      ys.b,
      dhb::h,
      ys.b,
      dhb::i,
      ys.b,
      dhb::j,
      dhb::new
   );

   public static dhb a(cxq $$0) {
      return a(bwk.g).a(awl.oO).a(dha.l.get($$0)).a(bwj.ax, bwj.by).a();
   }

   public static dhb a() {
      jf<bwj<?>> $$0 = mf.a(mf.f);
      return a(bwk.h).a(awl.no).a(dha.k).a($$0.b(axd.J)).d(true).a();
   }

   public static dhb.a a(bwk $$0) {
      return new dhb.a($$0);
   }

   public bty a(cys $$0, cqs $$1) {
      if ($$1.e(this.c) && this.a($$1.aq())) {
         cys $$2 = $$1.a(this.c);
         if ((!dfh.a($$2, dfg.E) || $$1.b()) && !cys.c($$0, $$2)) {
            if (!$$1.dV().w_()) {
               $$1.b(awv.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cys $$3 = $$2.f() ? $$0 : $$2.g();
               cys $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bty.a.a($$3);
            } else {
               cys $$5 = $$2.g();
               cys $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
                  $$1.a($$5, false);
               }

               return bty.a.a($$0);
            }
         } else {
            return bty.d;
         }
      } else {
         return bty.e;
      }
   }

   public bty a(cqs $$0, bwz $$1, cys $$2) {
      if ($$1.a($$2, this.c) && !$$1.d(this.c) && $$1.bK()) {
         if (!$$0.dV().w_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof bxb $$3) {
               $$3.g(this.c);
            }
         }

         return bty.a;
      } else {
         return bty.e;
      }
   }

   public boolean a(bwj<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bwk b() {
      return this.c;
   }

   public je<awk> c() {
      return this.d;
   }

   public Optional<ald<dgz>> d() {
      return this.e;
   }

   public Optional<ale> e() {
      return this.f;
   }

   public Optional<ji<bwj<?>>> f() {
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
      private final bwk a;
      private je<awk> b = awl.as;
      private Optional<ald<dgz>> c = Optional.empty();
      private Optional<ale> d = Optional.empty();
      private Optional<ji<bwj<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;
      private boolean i;

      a(bwk $$0) {
         this.a = $$0;
      }

      public dhb.a a(je<awk> $$0) {
         this.b = $$0;
         return this;
      }

      public dhb.a a(ald<dgz> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dhb.a a(ale $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dhb.a a(bwj<?>... $$0) {
         return this.a(ji.a(bwj::r, $$0));
      }

      public dhb.a a(ji<bwj<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dhb.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dhb.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dhb.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dhb.a d(boolean $$0) {
         this.i = $$0;
         return this;
      }

      public dhb a() {
         return new dhb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
