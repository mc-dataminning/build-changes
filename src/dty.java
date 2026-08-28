import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dty extends dlg implements dpe {
   public static final MapCodec<dty> a = b(dty::new);
   public static final eam<eay> b = eae.bm;

   @Override
   public MapCodec<dty> a() {
      return a;
   }

   protected dty(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, eay.b));
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyg($$0, $$1);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      dwn $$5 = $$1.c_($$2);
      if ($$5 instanceof dyg) {
         return (bty)(((dyg)$$5).a($$3) ? bty.a : bty.e);
      } else {
         return bty.e;
      }
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, @Nullable bwz $$3, cys $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dwn $$5 = $$0.c_($$1);
            if ($$5 instanceof dyg) {
               ((dyg)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if ($$1 instanceof aro) {
         if ($$1.c_($$2) instanceof dyg $$7) {
            boolean $$8 = $$1.D($$2);
            boolean $$9 = $$7.E();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((aro)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(aro $$0, dyg $$1) {
      switch ($$1.v()) {
         case a:
            $$1.c(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.C();
         case d:
      }
   }
}
