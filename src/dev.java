import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dev(buu c, jr<avz> d, Optional<aku<det>> e, Optional<akv> f, Optional<jv<but<?>>> g, boolean h, boolean i, boolean j) {
   public static final Codec<dev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               buu.k.fieldOf("slot").forGetter(dev::a),
               avz.b.optionalFieldOf("equip_sound", awa.as).forGetter(dev::b),
               aku.a(deu.a).optionalFieldOf("asset_id").forGetter(dev::c),
               akv.a.optionalFieldOf("camera_overlay").forGetter(dev::d),
               kg.a(mc.z).optionalFieldOf("allowed_entities").forGetter(dev::e),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dev::f),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dev::g),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dev::h)
            )
            .apply($$0, dev::new)
   );
   public static final yn<wa, dev> b = yn.a(
      buu.l,
      dev::a,
      avz.d,
      dev::b,
      aku.b(deu.a).a(yl::a),
      dev::c,
      akv.b.a(yl::a),
      dev::d,
      yl.c(mc.z).a(yl::a),
      dev::e,
      yl.b,
      dev::f,
      yl.b,
      dev::g,
      yl.b,
      dev::h,
      dev::new
   );

   public static dev a(cvn $$0) {
      return a(buu.g).a(awa.oE).a(deu.k.get($$0)).a(but.ax, but.bx).a();
   }

   public static dev.a a(buu $$0) {
      return new dev.a($$0);
   }

   public bsl a(cwq $$0, coy $$1) {
      if (!$$1.e(this.c)) {
         return bsl.e;
      } else {
         cwq $$2 = $$1.a(this.c);
         if ((!ddc.a($$2, ddb.E) || $$1.b()) && !cwq.c($$0, $$2)) {
            if (!$$1.dV().B_()) {
               $$1.b(awk.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cwq $$3 = $$2.f() ? $$0 : $$2.g();
               cwq $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bsl.a.a($$3);
            } else {
               cwq $$5 = $$2.g();
               cwq $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
                  $$1.a($$5, false);
               }

               return bsl.a.a($$0);
            }
         } else {
            return bsl.d;
         }
      }
   }

   public boolean a(but<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public buu a() {
      return this.c;
   }

   public jr<avz> b() {
      return this.d;
   }

   public Optional<aku<det>> c() {
      return this.e;
   }

   public Optional<akv> d() {
      return this.f;
   }

   public Optional<jv<but<?>>> e() {
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
      private final buu a;
      private jr<avz> b = awa.as;
      private Optional<aku<det>> c = Optional.empty();
      private Optional<akv> d = Optional.empty();
      private Optional<jv<but<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;

      a(buu $$0) {
         this.a = $$0;
      }

      public dev.a a(jr<avz> $$0) {
         this.b = $$0;
         return this;
      }

      public dev.a a(aku<det> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dev.a a(akv $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dev.a a(but<?>... $$0) {
         return this.a(jv.a(but::r, $$0));
      }

      public dev.a a(jv<but<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dev.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dev.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dev.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dev a() {
         return new dev(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
