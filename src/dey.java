import com.mojang.serialization.MapCodec;

public class dey extends dho implements ded, dew {
   public static final MapCodec<dey> c = b(dey::new);

   @Override
   public MapCodec<dey> a() {
      return c;
   }

   public dey(drc.d $$0) {
      super($$0, it.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dhp c() {
      return (dhp)dec.sv;
   }

   @Override
   protected drd a(drd $$0, drd $$1) {
      return $$1.a(r_, $$0.c(r_));
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
