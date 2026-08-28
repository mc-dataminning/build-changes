import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsf extends djq implements dnn {
   public static final MapCodec<dsf> a = b(dsf::new);
   public static final dyk<dyw> b = dyd.bk;

   @Override
   public MapCodec<dsf> a() {
      return a;
   }

   protected dsf(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyw.b));
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwh($$0, $$1);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      dup $$5 = $$1.c_($$2);
      if ($$5 instanceof dwh) {
         return (bte)(((dwh)$$5).a($$3) ? bte.a : bte.e);
      } else {
         return bte.e;
      }
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, @Nullable bwb $$3, cxk $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dup $$5 = $$0.c_($$1);
            if ($$5 instanceof dwh) {
               ((dwh)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if ($$1 instanceof ash) {
         if ($$1.c_($$2) instanceof dwh $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((ash)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(ash $$0, dwh $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
