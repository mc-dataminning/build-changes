import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record deu(but c, jr<avz> d, Optional<aku<des>> e, Optional<akv> f, Optional<jv<bus<?>>> g, boolean h, boolean i, boolean j) {
   public static final Codec<deu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               but.k.fieldOf("slot").forGetter(deu::a),
               avz.b.optionalFieldOf("equip_sound", awa.as).forGetter(deu::b),
               aku.a(det.a).optionalFieldOf("asset_id").forGetter(deu::c),
               akv.a.optionalFieldOf("camera_overlay").forGetter(deu::d),
               kg.a(mc.z).optionalFieldOf("allowed_entities").forGetter(deu::e),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(deu::f),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(deu::g),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(deu::h)
            )
            .apply($$0, deu::new)
   );
   public static final yn<wa, deu> b = yn.a(
      but.l,
      deu::a,
      avz.d,
      deu::b,
      aku.b(det.a).a(yl::a),
      deu::c,
      akv.b.a(yl::a),
      deu::d,
      yl.c(mc.z).a(yl::a),
      deu::e,
      yl.b,
      deu::f,
      yl.b,
      deu::g,
      yl.b,
      deu::h,
      deu::new
   );

   public static deu a(cvm $$0) {
      return a(but.g).a(awa.oE).a(det.k.get($$0)).a(bus.ax, bus.bx).a();
   }

   public static deu.a a(but $$0) {
      return new deu.a($$0);
   }

   public bsk a(cwp $$0, cox $$1) {
      if (!$$1.e(this.c)) {
         return bsk.e;
      } else {
         cwp $$2 = $$1.a(this.c);
         if ((!ddb.a($$2, dda.E) || $$1.b()) && !cwp.c($$0, $$2)) {
            if (!$$1.dV().B_()) {
               $$1.b(awk.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cwp $$3 = $$2.f() ? $$0 : $$2.g();
               cwp $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bsk.a.a($$3);
            } else {
               cwp $$5 = $$2.g();
               cwp $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
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
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public but a() {
      return this.c;
   }

   public jr<avz> b() {
      return this.d;
   }

   public Optional<aku<des>> c() {
      return this.e;
   }

   public Optional<akv> d() {
      return this.f;
   }

   public Optional<jv<bus<?>>> e() {
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
      private final but a;
      private jr<avz> b = awa.as;
      private Optional<aku<des>> c = Optional.empty();
      private Optional<akv> d = Optional.empty();
      private Optional<jv<bus<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;

      a(but $$0) {
         this.a = $$0;
      }

      public deu.a a(jr<avz> $$0) {
         this.b = $$0;
         return this;
      }

      public deu.a a(aku<des> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public deu.a a(akv $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public deu.a a(bus<?>... $$0) {
         return this.a(jv.a(bus::r, $$0));
      }

      public deu.a a(jv<bus<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public deu.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public deu.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public deu.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public deu a() {
         return new deu(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
