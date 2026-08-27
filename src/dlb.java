import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlb extends dbt {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final dql<dov> b = dpy.bz;
   public static final dqc c = dgc.aE;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ij.c).a(b, dov.a));
   }

   @Override
   public boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$0.d() || $$1.c(b) != dov.b) {
         return boh.d;
      } else if ($$2 instanceof apu $$7) {
         if ($$7.c_($$3) instanceof doq $$9) {
            doq.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return boh.a;
         } else {
            return boh.d;
         }
      } else {
         return boh.b;
      }
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new doq($$0, $$1);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0 instanceof apu $$3
         ? a($$2, dmq.R, ($$1x, $$2x, $$3x, $$4) -> doq.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dmq.R, ($$0x, $$1x, $$2x, $$3x) -> doq.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(c, $$0.g().g());
   }

   @Override
   public dpi a(dpi $$0, dit $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dim b_(dpi $$0) {
      return dim.c;
   }
}
