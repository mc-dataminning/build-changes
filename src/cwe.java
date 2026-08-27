import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwe extends cwk {
   public static final MapCodec<cwe> a = b(cwe::new);
   public static final dkj b = dkf.P;
   public static final dkg c = dkf.u;

   @Override
   public MapCodec<cwe> a() {
      return a;
   }

   public cwe(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof dgw) {
            $$3.a((dgw)$$5);
            $$3.a(asd.ar);
            ceh.a($$3, true);
         }

         return bkc.b;
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      bjy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      dhd $$4 = $$1.c_($$2);
      if ($$4 instanceof dgw) {
         ((dgw)$$4).m();
      }
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dgw($$0, $$1);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgw) {
            ((dgw)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return cij.a($$1.c_($$2));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
