import com.mojang.serialization.MapCodec;

public class dko extends dfl {
   public static final MapCodec<dko> a = b(dko::new);
   public static final int b = 3;
   public static final duc c = dts.as;
   private static final exn[] d = new exn[]{
      dfc.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   protected dko(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(dfe.eK);
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(cuk.tG);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }
}
