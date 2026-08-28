import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record des(bur c, jr<avy> d, Optional<akt<deq>> e, Optional<aku> f, Optional<jv<buq<?>>> g, boolean h, boolean i, boolean j) {
   public static final Codec<des> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bur.k.fieldOf("slot").forGetter(des::a),
               avy.b.optionalFieldOf("equip_sound", avz.as).forGetter(des::b),
               akt.a(der.a).optionalFieldOf("asset_id").forGetter(des::c),
               aku.a.optionalFieldOf("camera_overlay").forGetter(des::d),
               kg.a(mc.z).optionalFieldOf("allowed_entities").forGetter(des::e),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(des::f),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(des::g),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(des::h)
            )
            .apply($$0, des::new)
   );
   public static final ym<vz, des> b = ym.a(
      bur.l,
      des::a,
      avy.d,
      des::b,
      akt.b(der.a).a(yk::a),
      des::c,
      aku.b.a(yk::a),
      des::d,
      yk.c(mc.z).a(yk::a),
      des::e,
      yk.b,
      des::f,
      yk.b,
      des::g,
      yk.b,
      des::h,
      des::new
   );

   public static des a(cvk $$0) {
      return a(bur.g).a(avz.oE).a(der.k.get($$0)).a(buq.ax, buq.bx).a();
   }

   public static des.a a(bur $$0) {
      return new des.a($$0);
   }

   public bsi a(cwn $$0, cov $$1) {
      if (!$$1.e(this.c)) {
         return bsi.e;
      } else {
         cwn $$2 = $$1.a(this.c);
         if ((!dcz.a($$2, dcy.E) || $$1.b()) && !cwn.c($$0, $$2)) {
            if (!$$1.dW().B_()) {
               $$1.b(awj.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cwn $$3 = $$2.f() ? $$0 : $$2.g();
               cwn $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bsi.a.a($$3);
            } else {
               cwn $$5 = $$2.g();
               cwn $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
                  $$1.a($$5, false);
               }

               return bsi.a.a($$0);
            }
         } else {
            return bsi.d;
         }
      }
   }

   public boolean a(buq<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bur a() {
      return this.c;
   }

   public jr<avy> b() {
      return this.d;
   }

   public Optional<akt<deq>> c() {
      return this.e;
   }

   public Optional<aku> d() {
      return this.f;
   }

   public Optional<jv<buq<?>>> e() {
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
      private final bur a;
      private jr<avy> b = avz.as;
      private Optional<akt<deq>> c = Optional.empty();
      private Optional<aku> d = Optional.empty();
      private Optional<jv<buq<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;

      a(bur $$0) {
         this.a = $$0;
      }

      public des.a a(jr<avy> $$0) {
         this.b = $$0;
         return this;
      }

      public des.a a(akt<deq> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public des.a a(aku $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public des.a a(buq<?>... $$0) {
         return this.a(jv.a(buq::r, $$0));
      }

      public des.a a(jv<buq<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public des.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public des.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public des.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public des a() {
         return new des(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
