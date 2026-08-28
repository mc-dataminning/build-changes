import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwl extends dne {
   public static final MapCodec<dwl> a = b(dwl::new);
   public static final ecg b = ebw.aH;
   public static final ecg c = ebw.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final fgm g = dne.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fgm h = dne.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<dwl> a() {
      return a;
   }

   public dwl(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Integer.valueOf(1)));
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bwv $$3) {
      if (!$$3.cd()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djz $$0, ebg $$1, iw $$2, bwv $$3, double $$4) {
      if (!($$3 instanceof cpu)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(djz $$0, ebg $$1, iw $$2, bwv $$3, int $$4) {
      if ($$1.a(dng.mL) && $$0 instanceof aru $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(djz $$0, iw $$1, ebg $$2) {
      $$0.a(null, $$1, awr.Bm, aws.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, Integer.valueOf($$3 - 1)), 2);
         $$0.a(egg.f, $$1, egg.a.a($$2));
         $$0.c(2001, $$1, dne.j($$2));
      }
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, awr.Bn, aws.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 + 1)), 2);
            $$1.a(egg.c, $$2, egg.a.a($$0));
         } else {
            $$1.a(null, $$2, awr.Bo, aws.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(egg.f, $$2, egg.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dne.j($$0));
               ckt $$6 = bxe.bC.a($$1, bxd.e);
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

   public static boolean a(djd $$0, iw $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(djd $$0, iw $$1) {
      return $$0.a_($$1).a(axg.J);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(djz $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(djz $$0, crz $$1, iw $$2, ebg $$3, @Nullable dye $$4, daa $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(ebg $$0, ddt $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1))) : super.a($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   private boolean a(aru $$0, bwv $$1) {
      if ($$1 instanceof ckt || $$1 instanceof cjf) {
         return false;
      } else {
         return !($$1 instanceof bxw) ? false : $$1 instanceof crz || $$0.O().c(djv.d);
      }
   }
}
