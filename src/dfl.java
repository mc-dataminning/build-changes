import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfl(bvj c, jq<awu> d, Optional<alp> e, Optional<alp> f, Optional<ju<bvi<?>>> g, boolean h, boolean i, boolean j) {
   public static final Codec<dfl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bvj.k.fieldOf("slot").forGetter(dfl::a),
               awu.b.optionalFieldOf("equip_sound", awv.as).forGetter(dfl::b),
               alp.a.optionalFieldOf("model").forGetter(dfl::c),
               alp.a.optionalFieldOf("camera_overlay").forGetter(dfl::d),
               kf.a(mb.z).optionalFieldOf("allowed_entities").forGetter(dfl::e),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dfl::f),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dfl::g),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dfl::h)
            )
            .apply($$0, dfl::new)
   );
   public static final zi<wv, dfl> b = zi.a(
      bvj.l,
      dfl::a,
      awu.d,
      dfl::b,
      alp.b.a(zg::a),
      dfl::c,
      alp.b.a(zg::a),
      dfl::d,
      zg.c(mb.z).a(zg::a),
      dfl::e,
      zg.b,
      dfl::f,
      zg.b,
      dfl::g,
      zg.b,
      dfl::h,
      dfl::new
   );

   public static dfl a(cwd $$0) {
      return a(bvj.g).a(awv.oE).a(dfk.j.get($$0)).a(bvi.ay, bvi.by).a();
   }

   public static dfl.a a(bvj $$0) {
      return new dfl.a($$0);
   }

   public bta a(cxg $$0, cpo $$1) {
      if (!$$1.e(this.c)) {
         return bta.e;
      } else {
         cxg $$2 = $$1.a(this.c);
         if ((!dds.a($$2, ddr.E) || $$1.b()) && !cxg.c($$0, $$2)) {
            if (!$$1.dW().B_()) {
               $$1.b(axf.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cxg $$3 = $$2.f() ? $$0 : $$2.g();
               cxg $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bta.a.a($$3);
            } else {
               cxg $$5 = $$2.g();
               cxg $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
                  $$1.a($$5, false);
               }

               return bta.a.a($$0);
            }
         } else {
            return bta.d;
         }
      }
   }

   public boolean a(bvi<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bvj a() {
      return this.c;
   }

   public jq<awu> b() {
      return this.d;
   }

   public Optional<alp> c() {
      return this.e;
   }

   public Optional<alp> d() {
      return this.f;
   }

   public Optional<ju<bvi<?>>> e() {
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
      private jq<awu> b = awv.as;
      private Optional<alp> c = Optional.empty();
      private Optional<alp> d = Optional.empty();
      private Optional<ju<bvi<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;

      a(bvj $$0) {
         this.a = $$0;
      }

      public dfl.a a(jq<awu> $$0) {
         this.b = $$0;
         return this;
      }

      public dfl.a a(alp $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dfl.a b(alp $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dfl.a a(bvi<?>... $$0) {
         return this.a(ju.a(bvi::r, $$0));
      }

      public dfl.a a(ju<bvi<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dfl.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dfl.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dfl.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dfl a() {
         return new dfl(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
