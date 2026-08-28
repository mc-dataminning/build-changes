import com.mojang.serialization.MapCodec;

public class dkl extends dnb implements dkj {
   public static final MapCodec<dkl> c = b(dkl::new);

   @Override
   public MapCodec<dkl> a() {
      return c;
   }

   public dkl(dww.d $$0) {
      super($$0, jn.a, s_, false);
      this.l(this.F.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dnc c() {
      return (dnc)djo.sX;
   }

   @Override
   protected dwx a(dwx $$0, dwx $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(cwt.xw);
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      return dkj.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(t_);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
