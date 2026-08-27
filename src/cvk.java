import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvk extends cwb {
   public static final dka a = dak.aE;
   public static final djx b = djw.r;

   protected cvk(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cvk> a();

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         this.a($$1, $$2, $$3);
         return bka.b;
      }
   }

   protected abstract void a(cto var1, hx var2, cfh var3);

   @Override
   public djg a(cpg $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dgj) {
            ((dgj)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgu $$5 = $$1.c_($$2);
         if ($$5 instanceof dgj) {
            if ($$1 instanceof and) {
               bjw.a($$1, $$2, (dgj)$$5);
               ((dgj)$$5).a((and)$$1, els.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return cia.a($$1.c_($$2));
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dgu> dgv<T> a(cto $$0, dgw<T> $$1, dgw<? extends dgj> $$2) {
      return $$0.B ? null : a($$1, $$2, dgj::a);
   }
}
