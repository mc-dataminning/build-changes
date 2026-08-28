import com.mojang.serialization.MapCodec;

public class drs extends dju implements djn {
   public static final MapCodec<drs> a = b(drs::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dxu c = dxl.av;
   private static final fbs e = djk.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fbs f = djk.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<drs> a() {
      return a;
   }

   public drs(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn(cwr.xv);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dwv $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dwv $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ebr.c, $$2, ebr.a.a($$5));
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if ($$3 instanceof bvf && $$3.aq() != buq.aa && $$3.aq() != buq.l) {
         $$3.a($$0, new fay(0.8F, 0.75, 0.8F));
         if ($$1 instanceof arc $$4 && $$0.c(c) != 0) {
            fay $$6 = $$3.dj() ? $$3.ah() : $$3.bC().d($$3.du());
            if ($$6.j() > 0.0) {
               double $$7 = Math.abs($$6.a());
               double $$8 = Math.abs($$6.c());
               if ($$7 >= 0.003F || $$8 >= 0.003F) {
                  $$3.a($$4, $$1.ak().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bsi)(!$$8 && $$0.a(cwr.sv) ? bsi.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cwn(cwr.xv, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avz.Ag, awa.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dwv $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ebr.c, $$2, ebr.a.a($$3, $$8));
         return bsi.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
