import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duz extends dmd implements dqd {
   public static final MapCodec<duz> a = b(duz::new);
   public static final ebr<ecd> b = ebj.bm;

   @Override
   public MapCodec<duz> a() {
      return a;
   }

   protected duz(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecd.b));
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzk($$0, $$1);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      dxr $$5 = $$1.c_($$2);
      if ($$5 instanceof dzk) {
         return (bug)(((dzk)$$5).a($$3) ? bug.a : bug.e);
      } else {
         return bug.e;
      }
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, @Nullable bxj $$3, czn $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dxr $$5 = $$0.c_($$1);
            if ($$5 instanceof dzk) {
               ((dzk)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if ($$1 instanceof arq) {
         if ($$1.c_($$2) instanceof dzk $$7) {
            boolean $$8 = $$1.D($$2);
            boolean $$9 = $$7.E();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((arq)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(arq $$0, dzk $$1) {
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
