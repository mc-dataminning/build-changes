import com.mojang.serialization.MapCodec;

public class doz extends dhe implements dgy {
   public static final MapCodec<doz> a = b(doz::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dva c = duq.as;
   private static final eyx e = dgv.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eyx f = dgv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   public doz(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(cvo.wx);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dua $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dua $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dyx.c, $$2, dyx.a.a($$5));
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if ($$3 instanceof buf && $$3.ao() != btq.Q && $$3.ao() != btq.h) {
         $$3.a($$0, new eye(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ab != $$3.dx() || $$3.ad != $$3.dD())) {
            double $$4 = Math.abs($$3.dx() - $$3.ab);
            double $$5 = Math.abs($$3.dD() - $$3.ad);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ak().u(), 1.0F);
            }
         }
      }
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (brk)(!$$8 && $$0.a(cvo.rz) ? brk.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cvl(cvo.wx, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awd.zy, awe.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dua $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dyx.c, $$2, dyx.a.a($$3, $$8));
         return brk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
