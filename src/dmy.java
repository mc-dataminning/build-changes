import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmy extends dmr implements dmz {
   public static final MapCodec<dmy> a = b(dmy::new);
   public static final ebk b = ebj.h;
   private static final int c = 5;

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      eat $$5 = $$1.a_($$2.d());
      boolean $$6 = $$5.g($$1, $$2).c() && $$5.y().c();
      if ($$6) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected exa b_(eat $$0) {
      return exb.c.a(false);
   }

   public static void b(djn $$0, iv $$1, eat $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(djn $$0, iv $$1, eat $$2, eat $$3) {
      if (o($$2)) {
         eat $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         iv.a $$5 = $$1.k().c(jb.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jb.b);
         }
      }
   }

   private static boolean o(eat $$0) {
      return $$0.a(dmt.nJ) || $$0.a(dmt.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static eat q(eat $$0) {
      if ($$0.a(dmt.nJ)) {
         return $$0;
      } else if ($$0.a(dmt.en)) {
         return dmt.nJ.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dmt.lp) ? dmt.nJ.m().b(b, Boolean.valueOf(true)) : dmt.J.m();
      }
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ly.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.da, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ly.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ly.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.cY, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      $$2.a($$3, exb.c, exb.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jb.a || $$4 == jb.b && !$$6.a(dmt.nJ) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.e());
      return $$3.a(dmt.nJ) || $$3.a(dmt.lp) || $$3.a(dmt.en);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return fft.a();
   }

   @Override
   protected dte a_(eat $$0) {
      return dte.a;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   public czn a(@Nullable bxj $$0, djn $$1, iv $$2, eat $$3) {
      $$1.a($$2, dmt.a.m(), 11);
      return new czn(czr.rp);
   }

   @Override
   public Optional<awm> ap_() {
      return exb.c.j();
   }
}
