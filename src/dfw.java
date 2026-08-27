import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfw extends dba implements cyv, dfs {
   public static final MapCodec<dfw> c = b(dfw::new);
   private static final dma g = dlz.C;
   public static final dmd d = dlz.R;
   protected static final float e = 6.0F;
   protected static final eos f = cys.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dfw> a() {
      return c;
   }

   public dfw(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmf.b).a(g, Boolean.valueOf(false)).a(d, ie.c));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return f;
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(aua.bw) || $$1.b_($$2.c()).a(egx.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if (!$$0.y_()) {
         hz $$5 = $$1.c();
         dlj $$6 = dba.c($$0, $$5, this.o().a(b, dmf.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(g) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      if ($$0.c(b) == dmf.a) {
         return super.a($$0, $$1, $$2);
      } else {
         hz $$3 = $$2.d();
         dlj $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return true;
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      if ($$3.c(dba.b) == dmf.b) {
         hz $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cyp.a($$0, $$1, $$2, $$3.c(d));
      } else {
         hz $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float ay_() {
      return 0.1F;
   }
}
