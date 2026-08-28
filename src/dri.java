import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dri extends diq {
   public static final MapCodec<dri> a = b(dri::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final fas g = diq.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fas h = diq.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dwu e = dwl.aE;
   public static final dwu f = dwl.aD;

   @Override
   public MapCodec<dri> a() {
      return a;
   }

   public dri(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bul $$3) {
      if (!$$3.ce()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfm $$0, dvv $$1, jh $$2, bul $$3, float $$4) {
      if (!($$3 instanceof cmr)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dfm $$0, dvv $$1, jh $$2, bul $$3, int $$4) {
      if ($$1.a(dis.mf) && $$0 instanceof arp $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dfm $$0, jh $$1, dvv $$2) {
      $$0.a(null, $$1, awn.Am, awo.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(ear.f, $$1, ear.a.a($$2));
         $$0.c(2001, $$1, diq.j($$2));
      }
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awn.An, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(ear.c, $$2, ear.a.a($$0));
         } else {
            $$1.a(null, $$2, awn.Ao, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(ear.f, $$2, ear.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, diq.j($$0));
               chz $$6 = bus.bx.a($$1, bur.e);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(der $$0, jh $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(der $$0, jh $$1) {
      return $$0.a_($$1).a(axc.I);
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dfm $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dfm $$0, cou $$1, jh $$2, dvv $$3, @Nullable dsy $$4, cwm $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dvv $$0, dad $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(e, f);
   }

   private boolean a(arp $$0, bul $$1) {
      if ($$1 instanceof chz || $$1 instanceof cgs) {
         return false;
      } else {
         return !($$1 instanceof bvh) ? false : $$1 instanceof cou || $$0.N().b(dfi.c);
      }
   }
}
