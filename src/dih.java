import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dih(bxd c, jf<awo> d, Optional<alh<dif>> e, Optional<ali> f, Optional<jj<bxc<?>>> g, boolean h, boolean i, boolean j, boolean k) {
   public static final Codec<dih> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bxd.l.fieldOf("slot").forGetter(dih::b),
               awo.b.optionalFieldOf("equip_sound", awp.as).forGetter(dih::c),
               alh.a(dig.a).optionalFieldOf("asset_id").forGetter(dih::d),
               ali.a.optionalFieldOf("camera_overlay").forGetter(dih::e),
               ju.a(mh.B).optionalFieldOf("allowed_entities").forGetter(dih::f),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dih::g),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dih::h),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dih::i),
               Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(dih::j)
            )
            .apply($$0, dih::new)
   );
   public static final yy<wl, dih> b = yy.a(
      bxd.m,
      dih::b,
      awo.d,
      dih::c,
      alh.b(dig.a).a(yw::a),
      dih::d,
      ali.b.a(yw::a),
      dih::e,
      yw.c(mh.B).a(yw::a),
      dih::f,
      yw.b,
      dih::g,
      yw.b,
      dih::h,
      yw.b,
      dih::i,
      yw.b,
      dih::j,
      dih::new
   );

   public static dih a(cyw $$0) {
      return a(bxd.g).a(awp.oS).a(dig.l.get($$0)).a(bxc.ay, bxc.bz).a();
   }

   public static dih a() {
      jg<bxc<?>> $$0 = mg.a(mg.f);
      return a(bxd.h).a(awp.ns).a(dig.k).a($$0.b(axh.J)).d(true).a();
   }

   public static dih.a a(bxd $$0) {
      return new dih.a($$0);
   }

   public bur a(czy $$0, crx $$1) {
      if ($$1.e(this.c) && this.a($$1.an())) {
         czy $$2 = $$1.a(this.c);
         if ((!dgn.a($$2, dgm.E) || $$1.b()) && !czy.c($$0, $$2)) {
            if (!$$1.dV().A_()) {
               $$1.b(awz.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               czy $$3 = $$2.f() ? $$0 : $$2.g();
               czy $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bur.a.a($$3);
            } else {
               czy $$5 = $$2.g();
               czy $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gj().g($$5)) {
                  $$1.a($$5, false);
               }

               return bur.a.a($$0);
            }
         } else {
            return bur.d;
         }
      } else {
         return bur.e;
      }
   }

   public bur a(crx $$0, bxu $$1, czy $$2) {
      if ($$1.a($$2, this.c) && !$$1.d(this.c) && $$1.bJ()) {
         if (!$$0.dV().A_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof bxw $$3) {
               $$3.g(this.c);
            }
         }

         return bur.a;
      } else {
         return bur.e;
      }
   }

   public boolean a(bxc<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bxd b() {
      return this.c;
   }

   public jf<awo> c() {
      return this.d;
   }

   public Optional<alh<dif>> d() {
      return this.e;
   }

   public Optional<ali> e() {
      return this.f;
   }

   public Optional<jj<bxc<?>>> f() {
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
      private final bxd a;
      private jf<awo> b = awp.as;
      private Optional<alh<dif>> c = Optional.empty();
      private Optional<ali> d = Optional.empty();
      private Optional<jj<bxc<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;
      private boolean i;

      a(bxd $$0) {
         this.a = $$0;
      }

      public dih.a a(jf<awo> $$0) {
         this.b = $$0;
         return this;
      }

      public dih.a a(alh<dif> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dih.a a(ali $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dih.a a(bxc<?>... $$0) {
         return this.a(jj.a(bxc::r, $$0));
      }

      public dih.a a(jj<bxc<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dih.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dih.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dih.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dih.a d(boolean $$0) {
         this.i = $$0;
         return this;
      }

      public dih a() {
         return new dih(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
