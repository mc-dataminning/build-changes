import com.mojang.serialization.MapCodec;

public class czq extends dcg implements cyv, czo {
   public static final MapCodec<czq> c = b(czq::new);

   @Override
   public MapCodec<czq> a() {
      return c;
   }

   public czq(dli.d $$0) {
      super($$0, ie.a, t_, false);
      this.k(this.E.b().a(u_, Boolean.valueOf(false)));
   }

   @Override
   protected dch c() {
      return (dch)cyu.sv;
   }

   @Override
   protected dlj a(dlj $$0, dlj $$1) {
      return $$1.a(u_, $$0.c(u_));
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(cpg.wm);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      return czo.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(u_);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return !$$2.c(u_);
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      $$0.a($$2, $$3.a(u_, Boolean.valueOf(true)), 2);
   }
}
