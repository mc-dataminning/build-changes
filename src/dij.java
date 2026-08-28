import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dij(bxf c, jg<awq> d, Optional<alj<dih>> e, Optional<alk> f, Optional<jk<bxe<?>>> g, boolean h, boolean i, boolean j, boolean k) {
   public static final Codec<dij> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bxf.l.fieldOf("slot").forGetter(dij::b),
               awq.b.optionalFieldOf("equip_sound", awr.as).forGetter(dij::c),
               alj.a(dii.a).optionalFieldOf("asset_id").forGetter(dij::d),
               alk.a.optionalFieldOf("camera_overlay").forGetter(dij::e),
               jv.a(mi.B).optionalFieldOf("allowed_entities").forGetter(dij::f),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dij::g),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dij::h),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dij::i),
               Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(dij::j)
            )
            .apply($$0, dij::new)
   );
   public static final za<wn, dij> b = za.a(
      bxf.m,
      dij::b,
      awq.d,
      dij::c,
      alj.b(dii.a).a(yy::a),
      dij::d,
      alk.b.a(yy::a),
      dij::e,
      yy.c(mi.B).a(yy::a),
      dij::f,
      yy.b,
      dij::g,
      yy.b,
      dij::h,
      yy.b,
      dij::i,
      yy.b,
      dij::j,
      dij::new
   );

   public static dij a(cyy $$0) {
      return a(bxf.g).a(awr.oS).a(dii.l.get($$0)).a(bxe.ay, bxe.bz).a();
   }

   public static dij a() {
      jh<bxe<?>> $$0 = mh.a(mh.f);
      return a(bxf.h).a(awr.ns).a(dii.k).a($$0.b(axj.J)).d(true).a();
   }

   public static dij.a a(bxf $$0) {
      return new dij.a($$0);
   }

   public but a(daa $$0, crz $$1) {
      if ($$1.e(this.c) && this.a($$1.an())) {
         daa $$2 = $$1.a(this.c);
         if ((!dgp.a($$2, dgo.E) || $$1.b()) && !daa.c($$0, $$2)) {
            if (!$$1.dV().A_()) {
               $$1.b(axb.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               daa $$3 = $$2.f() ? $$0 : $$2.g();
               daa $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return but.a.a($$3);
            } else {
               daa $$5 = $$2.g();
               daa $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gj().g($$5)) {
                  $$1.a($$5, false);
               }

               return but.a.a($$0);
            }
         } else {
            return but.d;
         }
      } else {
         return but.e;
      }
   }

   public but a(crz $$0, bxw $$1, daa $$2) {
      if ($$1.a($$2, this.c) && !$$1.d(this.c) && $$1.bJ()) {
         if (!$$0.dV().A_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof bxy $$3) {
               $$3.g(this.c);
            }
         }

         return but.a;
      } else {
         return but.e;
      }
   }

   public boolean a(bxe<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bxf b() {
      return this.c;
   }

   public jg<awq> c() {
      return this.d;
   }

   public Optional<alj<dih>> d() {
      return this.e;
   }

   public Optional<alk> e() {
      return this.f;
   }

   public Optional<jk<bxe<?>>> f() {
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
      private final bxf a;
      private jg<awq> b = awr.as;
      private Optional<alj<dih>> c = Optional.empty();
      private Optional<alk> d = Optional.empty();
      private Optional<jk<bxe<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;
      private boolean i;

      a(bxf $$0) {
         this.a = $$0;
      }

      public dij.a a(jg<awq> $$0) {
         this.b = $$0;
         return this;
      }

      public dij.a a(alj<dih> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dij.a a(alk $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dij.a a(bxe<?>... $$0) {
         return this.a(jk.a(bxe::r, $$0));
      }

      public dij.a a(jk<bxe<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dij.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dij.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dij.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dij.a d(boolean $$0) {
         this.i = $$0;
         return this;
      }

      public dij a() {
         return new dij(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
