import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsu extends dne {
   public static final MapCodec<dsu> a = b(dsu::new);
   public static final ece<ech> b = ebw.bi;
   public static final ebx c = ebw.A;
   public static final ecg d = ebw.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dsu> a() {
      return a;
   }

   public dsu(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ech.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private ebg a(dkc $$0, iw $$1, ebg $$2) {
      ech $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         ech $$4 = $$0.a_($$1.e()).E();
         ech $$5 = $$4.e() ? ech.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public ebg a(ddt $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      boolean $$8 = $$4.o() == jc.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bwv $$0, ebg $$1, djz $$2, iw $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, egg.H, $$3);
      }
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      return (but)($$0.a(axo.by) && $$6.c() == jc.b ? but.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axb.ag);
      }

      return but.a;
   }

   @Override
   protected void a_(ebg $$0, djz $$1, iw $$2, crz $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axb.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(ebg $$0, djz $$1, iw $$2, int $$3, int $$4) {
      ech $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lz.ad, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jg<awq> $$10;
      if ($$5.d()) {
         alk $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jg.a(awq.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aws.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private alk a(djz $$0, iw $$1) {
      return $$0.c_($$1.d()) instanceof dzu $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d);
   }
}
