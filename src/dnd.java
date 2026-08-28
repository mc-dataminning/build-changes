import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnd extends der implements din {
   public static final MapCodec<dnd> a = b(dnd::new);
   public static final dtf<dtr> b = dsx.bj;

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   protected dnd(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtr.b));
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new drc($$0, $$1);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      dpn $$5 = $$1.c_($$2);
      if ($$5 instanceof drc) {
         return ((drc)$$5).a($$3) ? bqd.a($$1.B) : bqd.e;
      } else {
         return bqd.e;
      }
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, @Nullable bsy $$3, cua $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dpn $$5 = $$0.c_($$1);
            if ($$5 instanceof drc) {
               ((drc)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if ($$1 instanceof aqk) {
         if ($$1.c_($$2) instanceof drc $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqk)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqk $$0, drc $$1) {
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
