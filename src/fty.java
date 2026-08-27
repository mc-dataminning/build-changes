import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fty<T extends biy, M extends fet<T>> extends fsw<T> implements fus<T, M> {
   private static final Logger a = LogUtils.getLogger();
   private static final float h = 0.1F;
   protected M f;
   protected final List<fxf<T, M>> g = Lists.newArrayList();

   public fty(fsx.a $$0, M $$1, float $$2) {
      super($$0);
      this.f = $$1;
      this.d = $$2;
   }

   protected final boolean a(fxf<T, M> $$0) {
      return this.g.add($$0);
   }

   @Override
   public M a() {
      return this.f;
   }

   public void a(T $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      $$3.a();
      this.f.c = this.d($$0, $$2);
      this.f.d = $$0.bN();
      this.f.e = $$0.i_();
      float $$6 = arp.j($$2, $$0.aV, $$0.aU);
      float $$7 = arp.j($$2, $$0.aX, $$0.aW);
      float $$8 = $$7 - $$6;
      if ($$0.bN() && $$0.cY() instanceof biy $$9) {
         $$6 = arp.j($$2, $$9.aV, $$9.aU);
         $$8 = $$7 - $$6;
         float $$10 = arp.g($$8);
         if ($$10 < -85.0F) {
            $$10 = -85.0F;
         }

         if ($$10 >= 85.0F) {
            $$10 = 85.0F;
         }

         $$6 = $$7 - $$10;
         if ($$10 * $$10 > 2500.0F) {
            $$6 += $$10 * 0.2F;
         }

         $$8 = $$7 - $$6;
      }

      float $$11 = arp.i($$2, $$0.O, $$0.dC());
      if (e($$0)) {
         $$11 *= -1.0F;
         $$8 *= -1.0F;
      }

      if ($$0.c(bjk.c)) {
         ha $$12 = $$0.fD();
         if ($$12 != null) {
            float $$13 = $$0.d(bjk.a) - 0.1F;
            $$3.a((float)(-$$12.j()) * $$13, 0.0F, (float)(-$$12.l()) * $$13);
         }
      }

      float $$14 = this.a($$0, $$2);
      this.a($$0, $$3, $$14, $$6, $$2);
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$3, $$2);
      $$3.a(0.0F, -1.501F, 0.0F);
      float $$15 = 0.0F;
      float $$16 = 0.0F;
      if (!$$0.bN() && $$0.bv()) {
         $$15 = $$0.aQ.b($$2);
         $$16 = $$0.aQ.c($$2);
         if ($$0.i_()) {
            $$16 *= 3.0F;
         }

         if ($$15 > 1.0F) {
            $$15 = 1.0F;
         }
      }

      this.f.a($$0, $$16, $$15, $$2);
      this.f.a($$0, $$16, $$15, $$14, $$8, $$11);
      eql $$17 = eql.O();
      boolean $$18 = this.d($$0);
      boolean $$19 = !$$18 && !$$0.d($$17.s);
      boolean $$20 = $$17.b($$0);
      foc $$21 = this.a($$0, $$18, $$19, $$20);
      if ($$21 != null) {
         elj $$22 = $$4.getBuffer($$21);
         int $$23 = c($$0, this.b($$0, $$2));
         this.f.a($$3, $$22, $$5, $$23, 1.0F, 1.0F, 1.0F, $$19 ? 0.15F : 1.0F);
      }

      if (!$$0.G_()) {
         for (fxf<T, M> $$24 : this.g) {
            $$24.a($$3, $$4, $$5, $$0, $$16, $$15, $$2, $$14, $$8, $$11);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   protected foc a(T $$0, boolean $$1, boolean $$2, boolean $$3) {
      aer $$4 = this.a($$0);
      if ($$2) {
         return foc.g($$4);
      } else if ($$1) {
         return this.f.a($$4);
      } else {
         return $$3 ? foc.q($$4) : null;
      }
   }

   public static int c(biy $$0, float $$1) {
      return fyl.a(fyl.a($$1), fyl.a($$0.aK > 0 || $$0.aM > 0));
   }

   protected boolean d(T $$0) {
      return !$$0.cd();
   }

   private static float a(ha $$0) {
      switch ($$0) {
         case d:
            return 90.0F;
         case e:
            return 0.0F;
         case c:
            return 270.0F;
         case f:
            return 180.0F;
         default:
            return 0.0F;
      }
   }

   protected boolean a(T $$0) {
      return $$0.ck();
   }

   protected void a(T $$0, elf $$1, float $$2, float $$3, float $$4) {
      if (this.a($$0)) {
         $$3 += (float)(Math.cos((double)$$0.ah * 3.25) * Math.PI * 0.4F);
      }

      if (!$$0.c(bjk.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$3));
      }

      if ($$0.aM > 0) {
         float $$5 = ((float)$$0.aM + $$4 - 1.0F) / 20.0F * 1.6F;
         $$5 = arp.c($$5);
         if ($$5 > 1.0F) {
            $$5 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$5 * this.c($$0)));
      } else if ($$0.fh()) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.dC()));
         $$1.a(a.d.rotationDegrees(((float)$$0.ah + $$4) * -75.0F));
      } else if ($$0.c(bjk.c)) {
         ha $$6 = $$0.fD();
         float $$7 = $$6 != null ? a($$6) : $$3;
         $$1.a(a.d.rotationDegrees($$7));
         $$1.a(a.f.rotationDegrees(this.c($$0)));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if (e($$0)) {
         $$1.a(0.0F, $$0.dg() + 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float d(T $$0, float $$1) {
      return $$0.x($$1);
   }

   protected float a(T $$0, float $$1) {
      return (float)$$0.ah + $$1;
   }

   protected float c(T $$0) {
      return 90.0F;
   }

   protected float b(T $$0, float $$1) {
      return 0.0F;
   }

   protected void a(T $$0, elf $$1, float $$2) {
   }

   protected boolean b(T $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bU() ? 32.0F : 64.0F;
      if ($$1 >= (double)($$2 * $$2)) {
         return false;
      } else {
         eql $$3 = eql.O();
         fmw $$4 = $$3.s;
         boolean $$5 = !$$0.d($$4);
         if ($$0 != $$4) {
            eie $$6 = $$0.cf();
            eie $$7 = $$4.cf();
            if ($$6 != null) {
               eie.b $$8 = $$6.j();
               switch ($$8) {
                  case a:
                     return $$5;
                  case b:
                     return false;
                  case c:
                     return $$7 == null ? $$5 : $$6.a($$7) && ($$6.i() || $$5);
                  case d:
                     return $$7 == null ? $$5 : !$$6.a($$7) && $$5;
                  default:
                     return true;
               }
            }
         }

         return eql.K() && $$0 != $$3.am() && $$5 && !$$0.bO();
      }
   }

   public static boolean e(biy $$0) {
      if ($$0 instanceof cbm || $$0.ac()) {
         String $$1 = n.a($$0.ab().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cbm) || ((cbm)$$0).a(cbn.a);
         }
      }

      return false;
   }
}
