import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfm(bvn c, jq<axe> d, Optional<alz> e, Optional<ju<bvm<?>>> f, boolean g, boolean h, boolean i) {
   public static final Codec<dfm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bvn.k.fieldOf("slot").forGetter(dfm::a),
               axe.b.optionalFieldOf("equip_sound", axf.as).forGetter(dfm::b),
               alz.a.optionalFieldOf("model").forGetter(dfm::c),
               kf.a(mb.z).optionalFieldOf("allowed_entities").forGetter(dfm::d),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dfm::e),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dfm::f),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dfm::g)
            )
            .apply($$0, dfm::new)
   );
   public static final zt<xg, dfm> b = zt.a(
      bvn.l, dfm::a, axe.d, dfm::b, alz.b.a(zr::a), dfm::c, zr.c(mb.z).a(zr::a), dfm::d, zr.b, dfm::e, zr.b, dfm::f, zr.b, dfm::g, dfm::new
   );

   public static dfm a(cwh $$0) {
      return a(bvn.g).a(axf.ox).a(dfl.j.get($$0)).a(bvm.ay, bvm.by).a();
   }

   public static dfm.a a(bvn $$0) {
      return new dfm.a($$0);
   }

   public bte a(cxk $$0, cps $$1) {
      if (!$$1.e(this.c)) {
         return bte.e;
      } else {
         cxk $$2 = $$1.a(this.c);
         if ((!ddt.a($$2, dds.E) || $$1.b()) && !cxk.c($$0, $$2)) {
            if (!$$1.dV().B_()) {
               $$1.b(axp.c.b($$0.h()));
            }

            if ($$0.L() <= 1) {
               cxk $$3 = $$2.f() ? $$0 : $$2.g();
               cxk $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bte.a.a($$3);
            } else {
               cxk $$5 = $$2.g();
               cxk $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gg().f($$5)) {
                  $$1.a($$5, false);
               }

               return bte.a.a($$0);
            }
         } else {
            return bte.d;
         }
      }
   }

   public boolean a(bvm<?> $$0) {
      return this.f.isEmpty() || this.f.get().a($$0.r());
   }

   public bvn a() {
      return this.c;
   }

   public jq<axe> b() {
      return this.d;
   }

   public Optional<alz> c() {
      return this.e;
   }

   public Optional<ju<bvm<?>>> d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public static class a {
      private final bvn a;
      private jq<axe> b = axf.as;
      private Optional<alz> c = Optional.empty();
      private Optional<ju<bvm<?>>> d = Optional.empty();
      private boolean e = true;
      private boolean f = true;
      private boolean g = true;

      a(bvn $$0) {
         this.a = $$0;
      }

      public dfm.a a(jq<axe> $$0) {
         this.b = $$0;
         return this;
      }

      public dfm.a a(alz $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dfm.a a(bvm<?>... $$0) {
         return this.a(ju.a(bvm::r, $$0));
      }

      public dfm.a a(ju<bvm<?>> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dfm.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      public dfm.a b(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dfm.a c(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dfm a() {
         return new dfm(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
