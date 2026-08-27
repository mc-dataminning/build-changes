import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class den extends cwc implements czy {
   public static final MapCodec<den> a = b(den::new);
   public static final dkf<dkr> b = djx.bj;

   @Override
   public MapCodec<den> a() {
      return a;
   }

   protected den(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkr.b));
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dij($$0, $$1);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      dgv $$6 = $$1.c_($$2);
      if ($$6 instanceof dij) {
         return ((dij)$$6).a($$3) ? bkb.a($$1.B) : bkb.d;
      } else {
         return bkb.d;
      }
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dgv $$5 = $$0.c_($$1);
            if ($$5 instanceof dij) {
               ((dij)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if ($$1 instanceof and) {
         if ($$1.c_($$2) instanceof dij $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.F();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((and)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(and $$0, dij $$1) {
      switch ($$1.x()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.D();
         case d:
      }
   }
}
