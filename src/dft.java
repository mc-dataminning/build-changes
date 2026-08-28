import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dft(bvr c, jq<axe> d, Optional<alz> e, Optional<alz> f, Optional<ju<bvq<?>>> g, boolean h, boolean i, boolean j) {
   public static final Codec<dft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bvr.k.fieldOf("slot").forGetter(dft::a),
               axe.b.optionalFieldOf("equip_sound", axf.as).forGetter(dft::b),
               alz.a.optionalFieldOf("model").forGetter(dft::c),
               alz.a.optionalFieldOf("camera_overlay").forGetter(dft::d),
               kf.a(mb.z).optionalFieldOf("allowed_entities").forGetter(dft::e),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dft::f),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dft::g),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dft::h)
            )
            .apply($$0, dft::new)
   );
   public static final zt<xg, dft> b = zt.a(
      bvr.l,
      dft::a,
      axe.d,
      dft::b,
      alz.b.a(zr::a),
      dft::c,
      alz.b.a(zr::a),
      dft::d,
      zr.c(mb.z).a(zr::a),
      dft::e,
      zr.b,
      dft::f,
      zr.b,
      dft::g,
      zr.b,
      dft::h,
      dft::new
   );

   public static dft a(cwl $$0) {
      return a(bvr.g).a(axf.oy).a(dfs.j.get($$0)).a(bvq.ay, bvq.by).a();
   }

   public static dft.a a(bvr $$0) {
      return new dft.a($$0);
   }

   public bti a(cxo $$0, cpw $$1) {
      if (!$$1.e(this.c)) {
         return bti.e;
      } else {
         cxo $$2 = $$1.a(this.c);
         if ((!dea.a($$2, ddz.E) || $$1.b()) && !cxo.c($$0, $$2)) {
            if (!$$1.dV().B_()) {
               $$1.b(axp.c.b($$0.h()));
            }

            if ($$0.L() <= 1) {
               cxo $$3 = $$2.f() ? $$0 : $$2.g();
               cxo $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bti.a.a($$3);
            } else {
               cxo $$5 = $$2.g();
               cxo $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gg().f($$5)) {
                  $$1.a($$5, false);
               }

               return bti.a.a($$0);
            }
         } else {
            return bti.d;
         }
      }
   }

   public boolean a(bvq<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bvr a() {
      return this.c;
   }

   public jq<axe> b() {
      return this.d;
   }

   public Optional<alz> c() {
      return this.e;
   }

   public Optional<alz> d() {
      return this.f;
   }

   public Optional<ju<bvq<?>>> e() {
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
      private final bvr a;
      private jq<axe> b = axf.as;
      private Optional<alz> c = Optional.empty();
      private Optional<alz> d = Optional.empty();
      private Optional<ju<bvq<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;

      a(bvr $$0) {
         this.a = $$0;
      }

      public dft.a a(jq<axe> $$0) {
         this.b = $$0;
         return this;
      }

      public dft.a a(alz $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dft.a b(alz $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dft.a a(bvq<?>... $$0) {
         return this.a(ju.a(bvq::r, $$0));
      }

      public dft.a a(ju<bvq<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dft.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dft.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dft.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dft a() {
         return new dft(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
