import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsa extends doo implements dmi {
   public static final MapCodec<dsa> c = b(dsa::new);
   public static final int d = 4;
   public static final ebh e = eax.aw;
   public static final ebf<ebd> f = doo.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final ffk i = dmf.b(6.0, -1.0, 3.0);
   private static final ffk D = dmf.b(10.0, -1.0, 5.0);
   private final Function<eah, ffk> R = this.b();

   @Override
   public MapCodec<dsa> a() {
      return c;
   }

   public dsa(eag.d $$0) {
      super($$0);
   }

   private Function<eah, ffk> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((ebd)$$1.c(f)) {
            case b -> dmf.b((double)$$3, -1.0, (double)Math.min(16, -1 + $$2));
            case a -> dmf.b((double)$$3, 0.0, (double)Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      return this.m();
   }

   @Override
   public ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.R.apply($$0);
   }

   @Override
   public ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      if ($$0.c(f) == ebd.b) {
         return $$0.c(e) == 0 ? i : D;
      } else {
         return ffh.a();
      }
   }

   @Override
   public eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dmh.a.m();
      }
   }

   @Override
   public boolean a(eah $$0, djd $$1, iu $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(dmh.cN);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if ($$1 instanceof arq $$4 && $$3 instanceof coi && $$4.O().c(diw.d)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(eah $$0, dcw $$1) {
      return false;
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bxe $$3, czd $$4) {
   }

   @Override
   public boolean f(eah $$0) {
      return $$0.c(f) == ebd.b && !this.q($$0);
   }

   @Override
   public void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      float $$4 = doc.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arq $$0, eah $$1, iu $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         eah $$5 = $$1.b(e, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, ebd.a), 3);
         }
      }
   }

   private static boolean a(djd $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dmh.lh);
   }

   private static boolean b(djd $$0, iu $$1) {
      return doc.a($$0, $$1);
   }

   private static boolean o(eah $$0) {
      return $$0.a(dmh.lh) && $$0.c(f) == ebd.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(djd $$0, iu $$1, eah $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(eah $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private dsa.a c(djd $$0, iu $$1, eah $$2) {
      if (o($$2)) {
         return new dsa.a($$1, $$2);
      } else {
         iu $$3 = $$1.e();
         eah $$4 = $$0.a_($$3);
         return o($$4) ? new dsa.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      dsa.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      dsa.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iu a, eah b) {
   }
}
