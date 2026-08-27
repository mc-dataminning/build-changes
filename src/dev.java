import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dev extends cwk implements dag {
   public static final MapCodec<dev> a = b(dev::new);
   public static final dkn<dkz> b = dkf.bj;

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   protected dev(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkz.b));
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dir($$0, $$1);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      dhd $$5 = $$1.c_($$2);
      if ($$5 instanceof dir) {
         return ((dir)$$5).a($$3) ? bkc.a($$1.B) : bkc.d;
      } else {
         return bkc.d;
      }
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dhd $$5 = $$0.c_($$1);
            if ($$5 instanceof dir) {
               ((dir)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if ($$1 instanceof ane) {
         if ($$1.c_($$2) instanceof dir $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.F();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((ane)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(ane $$0, dir $$1) {
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
