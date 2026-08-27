import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dgu extends dch implements djh {
   public static final MapCodec<dgu> a = b(dgu::new);
   public static final int b = 15;
   public static final dqi c = dpy.aP;
   public static final dpz d = dpy.C;
   public static final ToIntFunction<dpi> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dgu> a() {
      return a;
   }

   public dgu(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if (!$$1.B && $$3.gw()) {
         $$1.a($$2, $$0.a(c), 2);
         return bof.a;
      } else {
         return bof.b;
      }
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return $$3.a(crv.hB) ? esz.b() : esz.a();
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return true;
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.a;
   }

   @Override
   protected float d(dpi $$0, cym $$1, id $$2) {
      return 1.0F;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(d) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static crs a(crs $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(jr.R, ctz.a.a(c, $$1));
      }

      return $$0;
   }
}
