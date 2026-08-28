import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfm(bvj c, jr<avz> d, Optional<akt<dfk>> e, Optional<aku> f, Optional<jv<bvi<?>>> g, boolean h, boolean i, boolean j) {
   public static final Codec<dfm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bvj.k.fieldOf("slot").forGetter(dfm::a),
               avz.b.optionalFieldOf("equip_sound", awa.as).forGetter(dfm::b),
               akt.a(dfl.a).optionalFieldOf("asset_id").forGetter(dfm::c),
               aku.a.optionalFieldOf("camera_overlay").forGetter(dfm::d),
               kg.a(mc.z).optionalFieldOf("allowed_entities").forGetter(dfm::e),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dfm::f),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dfm::g),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dfm::h)
            )
            .apply($$0, dfm::new)
   );
   public static final yn<wa, dfm> b = yn.a(
      bvj.l,
      dfm::a,
      avz.d,
      dfm::b,
      akt.b(dfl.a).a(yl::a),
      dfm::c,
      aku.b.a(yl::a),
      dfm::d,
      yl.c(mc.z).a(yl::a),
      dfm::e,
      yl.b,
      dfm::f,
      yl.b,
      dfm::g,
      yl.b,
      dfm::h,
      dfm::new
   );

   public static dfm a(cwe $$0) {
      return a(bvj.g).a(awa.oO).a(dfl.k.get($$0)).a(bvi.ax, bvi.bx).a();
   }

   public static dfm.a a(bvj $$0) {
      return new dfm.a($$0);
   }

   public bsy a(cxh $$0, cpr $$1) {
      if (!$$1.e(this.c)) {
         return bsy.e;
      } else {
         cxh $$2 = $$1.a(this.c);
         if ((!ddt.a($$2, dds.E) || $$1.b()) && !cxh.c($$0, $$2)) {
            if (!$$1.dU().w_()) {
               $$1.b(awk.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cxh $$3 = $$2.f() ? $$0 : $$2.g();
               cxh $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bsy.a.a($$3);
            } else {
               cxh $$5 = $$2.g();
               cxh $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gl().f($$5)) {
                  $$1.a($$5, false);
               }

               return bsy.a.a($$0);
            }
         } else {
            return bsy.d;
         }
      }
   }

   public boolean a(bvi<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bvj a() {
      return this.c;
   }

   public jr<avz> b() {
      return this.d;
   }

   public Optional<akt<dfk>> c() {
      return this.e;
   }

   public Optional<aku> d() {
      return this.f;
   }

   public Optional<jv<bvi<?>>> e() {
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
      private final bvj a;
      private jr<avz> b = awa.as;
      private Optional<akt<dfk>> c = Optional.empty();
      private Optional<aku> d = Optional.empty();
      private Optional<jv<bvi<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;

      a(bvj $$0) {
         this.a = $$0;
      }

      public dfm.a a(jr<avz> $$0) {
         this.b = $$0;
         return this;
      }

      public dfm.a a(akt<dfk> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dfm.a a(aku $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dfm.a a(bvi<?>... $$0) {
         return this.a(jv.a(bvi::r, $$0));
      }

      public dfm.a a(jv<bvi<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dfm.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dfm.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dfm.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dfm a() {
         return new dfm(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
