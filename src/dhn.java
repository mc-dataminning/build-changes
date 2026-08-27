import com.mojang.serialization.MapCodec;

public class dhn extends dcq {
   public static final MapCodec<dhn> a = b(dhn::new);
   public static final int b = 3;
   public static final dqi c = dpy.as;
   private static final etc[] d = new etc[]{
      dch.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   protected dhn(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.a(dcj.dW);
   }

   @Override
   protected boolean e_(dpi $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs(crv.si);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }
}
