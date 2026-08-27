import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djp extends dch {
   public static final MapCodec<djp> a = b(djp::new);
   public static final int b = 8;
   public static final dqi c = dpy.aF;
   protected static final etc[] d = new etc[]{
      esz.a(),
      dch.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   protected djp(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected etc b_(dpi $$0, cym $$1, id $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected etc c(dpi $$0, cym $$1, id $$2, eso $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   protected float d(dpi $$0, cym $$1, id $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      dpi $$3 = $$1.a_($$2.d());
      if ($$3.a(ave.ci)) {
         return false;
      } else {
         return $$3.a(ave.cj) ? true : dch.a($$3.k($$1, $$2.d()), ij.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.a(czp.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.p()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ij.b : true;
      }
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }
}
