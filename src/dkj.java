import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkj extends dfa {
   public static final MapCodec<dkj> a = b(dkj::new);
   public static final dtb<dte> b = dst.bf;
   public static final dsu c = dst.w;
   public static final dtd d = dst.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   public dkj(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dte.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dsd b(dca $$0, iz $$1, dsd $$2) {
      dte $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dte $$4 = $$0.a_($$1.d()).A();
         dte $$5 = $$4.e() ? dte.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dsd a(cyb $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      boolean $$6 = $$1.o() == je.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bsv $$0, dsd $$1, dbz $$2, iz $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dww.H, $$3);
      }
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      return $$0.a(awy.bg) && $$6.b() == je.b ? bqx.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.ag);
         return bqv.c;
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, cmy $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dsd $$0, dbz $$1, iz $$2, int $$3, int $$4) {
      dte $$5 = $$0.c(b);
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
   private alf a(dbz $$0, iz $$1) {
      return $$0.c_($$1.c()) instanceof dqu $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c, d);
   }
}
