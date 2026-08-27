import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfi extends daa {
   public static final MapCodec<dfi> a = b(dfi::new);
   public static final dnx<doa> b = dnp.bf;
   public static final dnq c = dnp.w;
   public static final dnz d = dnp.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   public dfi(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, doa.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dmz b(cxa $$0, ib $$1, dmz $$2) {
      doa $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         doa $$4 = $$0.a_($$1.d()).A();
         doa $$5 = $$4.e() ? doa.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dmz a(css $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      boolean $$6 = $$1.o() == ih.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bow $$0, dmz $$1, cwz $$2, ib $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, drn.H, $$3);
      }
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      return $$0.a(auv.aG) && $$6.b() == ih.b ? bne.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(aui.ag);
         return bnc.b;
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, cis $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(aui.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dmz $$0, cwz $$1, ib $$2, int $$3, int $$4) {
      doa $$5 = $$0.c(b);
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
   private ajh a(cwz $$0, ib $$1) {
      return $$0.c_($$1.c()) instanceof dlr $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c, d);
   }
}
