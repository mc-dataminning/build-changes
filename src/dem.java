import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dem extends cwb implements czx {
   public static final MapCodec<dem> a = b(dem::new);
   public static final dke<dkq> b = djw.bj;

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   protected dem(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkq.b));
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dii($$0, $$1);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      dgu $$6 = $$1.c_($$2);
      if ($$6 instanceof dii) {
         return ((dii)$$6).a($$3) ? bka.a($$1.B) : bka.d;
      } else {
         return bka.d;
      }
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dgu $$5 = $$0.c_($$1);
            if ($$5 instanceof dii) {
               ((dii)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if ($$1 instanceof and) {
         if ($$1.c_($$2) instanceof dii $$7) {
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

   private void a(and $$0, dii $$1) {
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
