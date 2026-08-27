import com.mojang.serialization.MapCodec;

public class dex extends dhp implements ded, dew {
   public static final MapCodec<dex> c = b(dex::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dex> a() {
      return c;
   }

   public dex(drc.d $$0) {
      super($$0, it.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(aym $$0) {
      return 1;
   }

   @Override
   protected boolean g(drd $$0) {
      return $$0.i();
   }

   @Override
   protected dea b() {
      return dec.sw;
   }

   @Override
   protected drd a(drd $$0, drd $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected drd a(drd $$0, aym $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(ctt.ws);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      return dew.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
