import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class den extends czf {
   public static final MapCodec<den> a = b(den::new);
   public static final dnc<dnf> b = dmu.bf;
   public static final dmv c = dmu.w;
   public static final dne d = dmu.aR;
   public static final int e = 3;

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public den(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dnf.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dme b(cwf $$0, ib $$1, dme $$2) {
      dnf $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dnf $$4 = $$0.a_($$1.d()).A();
         dnf $$5 = $$4.e() ? dnf.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dme a(crx $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      boolean $$6 = $$1.o() == ih.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bof $$0, dme $$1, cwe $$2, ib $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dqr.H, $$3);
      }
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      return $$0.a(aum.aG) && $$6.b() == ih.b ? bmn.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(atz.ag);
         return bml.b;
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, cia $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(atz.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dme $$0, cwe $$1, ib $$2, int $$3, int $$4) {
      dnf $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(kb.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      il<ato> $$10;
      if ($$5.d()) {
         ajc $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = il.a(ato.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, atq.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ajc a(cwe $$0, ib $$1) {
      return $$0.c_($$1.c()) instanceof dkw $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c, d);
   }
}
