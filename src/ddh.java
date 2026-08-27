import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddh extends dis implements djh {
   public static final MapCodec<ddh> a = b(ddh::new);
   public static final dpz b = dpy.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final etc e = dch.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final etc f = dch.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final etc g = dch.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   public ddh(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ij.a.b));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      switch ((ij.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == elc.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(b) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
