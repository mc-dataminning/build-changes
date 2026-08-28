import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dki extends dez {
   public static final MapCodec<dki> a = b(dki::new);
   public static final dta<dtd> b = dss.bf;
   public static final dst c = dss.w;
   public static final dtc d = dss.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtd.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dsc b(dbz $$0, iz $$1, dsc $$2) {
      dtd $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dtd $$4 = $$0.a_($$1.d()).A();
         dtd $$5 = $$4.e() ? dtd.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dsc a(cya $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      boolean $$6 = $$1.o() == je.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bsu $$0, dsc $$1, dby $$2, iz $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dwv.H, $$3);
      }
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      return $$0.a(awy.bg) && $$6.b() == je.b ? bqw.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.ag);
         return bqu.c;
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, cmx $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dsc $$0, dby $$1, iz $$2, int $$3, int $$4) {
      dtd $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(li.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ji<avz> $$10;
      if ($$5.d()) {
         alf $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ji.a(avz.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awb.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private alf a(dby $$0, iz $$1) {
      return $$0.c_($$1.c()) instanceof dqt $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c, d);
   }
}
