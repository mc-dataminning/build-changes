import com.mojang.serialization.MapCodec;

public class dok extends dfq {
   public static final MapCodec<dok> a = b(dok::new);
   protected static final ewy b = dfh.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   protected dok(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqm && $$3 instanceof coh) {
         $$1.a(new ja($$2), true, $$3);
      }
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      eoh $$3 = $$1.b_($$2);
      eoh $$4 = $$1.b_($$2.c());
      return ($$3.a() == eoi.c || $$0.b() instanceof djf) && $$4.a() == eoi.a;
   }
}
