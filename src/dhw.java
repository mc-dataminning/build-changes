import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhw(bws c, jf<awm> d, Optional<alf<dhu>> e, Optional<alg> f, Optional<jj<bwr<?>>> g, boolean h, boolean i, boolean j, boolean k) {
   public static final Codec<dhw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bws.l.fieldOf("slot").forGetter(dhw::b),
               awm.b.optionalFieldOf("equip_sound", awn.as).forGetter(dhw::c),
               alf.a(dhv.a).optionalFieldOf("asset_id").forGetter(dhw::d),
               alg.a.optionalFieldOf("camera_overlay").forGetter(dhw::e),
               ju.a(mh.B).optionalFieldOf("allowed_entities").forGetter(dhw::f),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dhw::g),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dhw::h),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dhw::i),
               Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(dhw::j)
            )
            .apply($$0, dhw::new)
   );
   public static final yw<wj, dhw> b = yw.a(
      bws.m,
      dhw::b,
      awm.d,
      dhw::c,
      alf.b(dhv.a).a(yu::a),
      dhw::d,
      alg.b.a(yu::a),
      dhw::e,
      yu.c(mh.B).a(yu::a),
      dhw::f,
      yu.b,
      dhw::g,
      yu.b,
      dhw::h,
      yu.b,
      dhw::i,
      yu.b,
      dhw::j,
      dhw::new
   );

   public static dhw a(cyl $$0) {
      return a(bws.g).a(awn.oS).a(dhv.l.get($$0)).a(bwr.ax, bwr.by).a();
   }

   public static dhw a() {
      jg<bwr<?>> $$0 = mg.a(mg.f);
      return a(bws.h).a(awn.ns).a(dhv.k).a($$0.b(axf.J)).d(true).a();
   }

   public static dhw.a a(bws $$0) {
      return new dhw.a($$0);
   }

   public bug a(czn $$0, crm $$1) {
      if ($$1.e(this.c) && this.a($$1.an())) {
         czn $$2 = $$1.a(this.c);
         if ((!dgc.a($$2, dgb.E) || $$1.b()) && !czn.c($$0, $$2)) {
            if (!$$1.dU().w_()) {
               $$1.b(awx.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               czn $$3 = $$2.f() ? $$0 : $$2.g();
               czn $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bug.a.a($$3);
            } else {
               czn $$5 = $$2.g();
               czn $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().g($$5)) {
                  $$1.a($$5, false);
               }

               return bug.a.a($$0);
            }
         } else {
            return bug.d;
         }
      } else {
         return bug.e;
      }
   }

   public bug a(crm $$0, bxj $$1, czn $$2) {
      if ($$1.a($$2, this.c) && !$$1.d(this.c) && $$1.bI()) {
         if (!$$0.dU().w_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof bxl $$3) {
               $$3.g(this.c);
            }
         }

         return bug.a;
      } else {
         return bug.e;
      }
   }

   public boolean a(bwr<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bws b() {
      return this.c;
   }

   public jf<awm> c() {
      return this.d;
   }

   public Optional<alf<dhu>> d() {
      return this.e;
   }

   public Optional<alg> e() {
      return this.f;
   }

   public Optional<jj<bwr<?>>> f() {
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
      private final bws a;
      private jf<awm> b = awn.as;
      private Optional<alf<dhu>> c = Optional.empty();
      private Optional<alg> d = Optional.empty();
      private Optional<jj<bwr<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;
      private boolean i;

      a(bws $$0) {
         this.a = $$0;
      }

      public dhw.a a(jf<awm> $$0) {
         this.b = $$0;
         return this;
      }

      public dhw.a a(alf<dhu> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dhw.a a(alg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dhw.a a(bwr<?>... $$0) {
         return this.a(jj.a(bwr::r, $$0));
      }

      public dhw.a a(jj<bwr<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dhw.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dhw.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dhw.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dhw.a d(boolean $$0) {
         this.i = $$0;
         return this;
      }

      public dhw a() {
         return new dhw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
