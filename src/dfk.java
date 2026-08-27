import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfk extends dac {
   public static final MapCodec<dfk> a = b(dfk::new);
   public static final dnz<doc> b = dnr.bf;
   public static final dns c = dnr.w;
   public static final dob d = dnr.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public dfk(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, doc.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dnb b(cxc $$0, ib $$1, dnb $$2) {
      doc $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         doc $$4 = $$0.a_($$1.d()).A();
         doc $$5 = $$4.e() ? doc.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dnb a(csu $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      boolean $$6 = $$1.o() == ih.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable box $$0, dnb $$1, cxb $$2, ib $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, drp.H, $$3);
      }
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      return $$0.a(auv.aG) && $$6.b() == ih.b ? bnf.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(aui.ag);
         return bnd.b;
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, ciu $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(aui.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dnb $$0, cxb $$1, ib $$2, int $$3, int $$4) {
      doc $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(kc.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      il<atx> $$10;
      if ($$5.d()) {
         ajh $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = il.a(atx.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, atz.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ajh a(cxb $$0, ib $$1) {
      return $$0.c_($$1.c()) instanceof dlt $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d);
   }
}
