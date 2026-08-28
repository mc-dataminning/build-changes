import com.mojang.serialization.MapCodec;

public class dgd extends dit implements dfi, dgb {
   public static final MapCodec<dgd> c = b(dgd::new);

   @Override
   public MapCodec<dgd> a() {
      return c;
   }

   public dgd(dsg.d $$0) {
      super($$0, jf.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected diu c() {
      return (diu)dfh.sv;
   }

   @Override
   protected dsh a(dsh $$0, dsh $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(cud.wv);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      return dgb.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
