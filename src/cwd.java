import com.mojang.serialization.MapCodec;

public class cwd extends cyt implements cvi, cwb {
   public static final MapCodec<cwd> c = b(cwd::new);

   @Override
   public MapCodec<cwd> a() {
      return c;
   }

   public cwd(dhm.d $$0) {
      super($$0, ib.a, r_, false);
      this.k(this.E.b().a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected cyu c() {
      return (cyu)cvh.sv;
   }

   @Override
   protected dhn a(dhn $$0, dhn $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(clr.wi);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      return cwb.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(s_);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
