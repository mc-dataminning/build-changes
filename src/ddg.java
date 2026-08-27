import com.mojang.serialization.MapCodec;

public class ddg extends dfa implements dfs {
   public static final MapCodec<ddg> b = b(ddg::new);
   public static final dma c = dlz.C;
   public static final dma d = dlz.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<ddg> a() {
      return b;
   }

   public ddg(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ie.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == egx.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(c) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dlj $$0, cvr $$1, hz $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dlj $$0, cvr $$1, hz $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$1.aa() && (long)$$1.z.a(200) <= $$1.X() % 200L && $$2.v() == $$1.a(dqv.a.b, $$2.u(), $$2.w()) - 1) {
         awl.a($$0.c(a).o(), $$1, $$2, 0.125, jz.aQ, blh.a(1, 2));
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      if ($$0.aa() && $$3 instanceof ciq && ((ciq)$$3).K()) {
         hz $$4 = $$2.a();
         if ($$0.h($$4)) {
            boh $$5 = bnw.ak.a($$0);
            if ($$5 != null) {
               $$5.e(enz.c($$4.c()));
               bnq $$6 = $$3.w();
               $$5.b($$6 instanceof aox ? (aox)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, atl.za, atm.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }
}
