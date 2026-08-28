import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record deu(bus c, jr<avz> d, Optional<akt<des>> e, Optional<aku> f, Optional<jv<bur<?>>> g, boolean h, boolean i, boolean j) {
   public static final Codec<deu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bus.k.fieldOf("slot").forGetter(deu::a),
               avz.b.optionalFieldOf("equip_sound", awa.as).forGetter(deu::b),
               akt.a(det.a).optionalFieldOf("asset_id").forGetter(deu::c),
               aku.a.optionalFieldOf("camera_overlay").forGetter(deu::d),
               kg.a(mc.z).optionalFieldOf("allowed_entities").forGetter(deu::e),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(deu::f),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(deu::g),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(deu::h)
            )
            .apply($$0, deu::new)
   );
   public static final ym<vz, deu> b = ym.a(
      bus.l,
      deu::a,
      avz.d,
      deu::b,
      akt.b(det.a).a(yk::a),
      deu::c,
      aku.b.a(yk::a),
      deu::d,
      yk.c(mc.z).a(yk::a),
      deu::e,
      yk.b,
      deu::f,
      yk.b,
      deu::g,
      yk.b,
      deu::h,
      deu::new
   );

   public static deu a(cvm $$0) {
      return a(bus.g).a(awa.oE).a(det.k.get($$0)).a(bur.ay, bur.by).a();
   }

   public static deu.a a(bus $$0) {
      return new deu.a($$0);
   }

   public bsj a(cwp $$0, cox $$1) {
      if (!$$1.e(this.c)) {
         return bsj.e;
      } else {
         cwp $$2 = $$1.a(this.c);
         if ((!ddb.a($$2, dda.E) || $$1.b()) && !cwp.c($$0, $$2)) {
            if (!$$1.dW().B_()) {
               $$1.b(awk.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cwp $$3 = $$2.f() ? $$0 : $$2.g();
               cwp $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bsj.a.a($$3);
            } else {
               cwp $$5 = $$2.g();
               cwp $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
                  $$1.a($$5, false);
               }

               return bsj.a.a($$0);
            }
         } else {
            return bsj.d;
         }
      }
   }

   public boolean a(bur<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bus a() {
      return this.c;
   }

   public jr<avz> b() {
      return this.d;
   }

   public Optional<akt<des>> c() {
      return this.e;
   }

   public Optional<aku> d() {
      return this.f;
   }

   public Optional<jv<bur<?>>> e() {
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
      private final bus a;
      private jr<avz> b = awa.as;
      private Optional<akt<des>> c = Optional.empty();
      private Optional<aku> d = Optional.empty();
      private Optional<jv<bur<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;

      a(bus $$0) {
         this.a = $$0;
      }

      public deu.a a(jr<avz> $$0) {
         this.b = $$0;
         return this;
      }

      public deu.a a(akt<des> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public deu.a a(aku $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public deu.a a(bur<?>... $$0) {
         return this.a(jv.a(bur::r, $$0));
      }

      public deu.a a(jv<bur<?>> $$0) {
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
