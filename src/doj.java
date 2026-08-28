import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doj extends djq {
   public static final MapCodec<doj> a = b(doj::new);
   public static final dye b = dyd.n;

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   protected doj(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, @Nullable bwb $$3, cxk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czt $$5 = $$4.a(ku.Y, czt.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dvt $$5) {
         $$5.t();
         return bte.a;
      } else {
         return bte.e;
      }
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$1.c(b)) {
         return bte.f;
      } else {
         cxk $$7 = $$4.b($$5);
         bte $$8 = cxp.a($$2, $$3, $$7, $$4);
         return (bte)(!$$8.a() ? bte.f : $$8);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dvt $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvt($$0, $$1);
   }

   @Override
   public boolean f_(dxn $$0) {
      return true;
   }

   @Override
   public int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      if ($$1.c_($$2) instanceof dvt $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return $$1.c_($$2) instanceof dvt $$3 ? $$3.u() : 0;
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$1.c(b) ? a($$2, dur.e, dvt::a) : null;
   }
}
