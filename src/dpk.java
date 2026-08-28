import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dpk extends dna {
   public static final MapCodec<dpk> a = b(dpk::new);
   public static final eco<jc.a> b = ecg.K;
   public static final eco<eck> c = ecg.bD;
   public static final ech d = ecg.w;

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   protected dpk(ebp.d $$0) {
      super($$0);
      this.l(this.m().b(b, jc.a.b).b(c, eck.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dze($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != eck.a ? a($$2, dyq.k, dze::a) : null;
      }
   }

   public static boolean a(dkj $$0) {
      return $$0.X();
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if (a($$1)) {
         if ($$0.c(c) != eck.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awy.gD, awz.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      ebq $$4 = d($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static ebq d(ebq $$0, dkj $$1, iw $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == eck.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? eck.c : eck.b) : $$0;
   }

   public static boolean b(ebq $$0, dkm $$1, iw $$2) {
      jc.a $$3 = $$0.c(b);

      for (jc $$4 : $$3.g()) {
         ebq $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axn.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dkk $$0, iw $$1) {
      for (jc $$2 : jc.values()) {
         iw $$3 = $$1.a($$2);
         ebq $$4 = $$0.a_($$3);
         if (!$$4.a(axn.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      return d(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return duh.b($$0, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dkc $$3, BiConsumer<dak, iw> $$4) {
      if ($$1.c_($$2) instanceof dze $$5 && $$3 instanceof dkz $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof csi $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      if ($$0.c_($$1) instanceof dze $$4) {
         $$4.a($$3.dW().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(csi $$0, ebq $$1, dkj $$2, iw $$3) {
      if (!$$0.gl() && !$$0.aa_() && $$1.c(d) && $$2 instanceof asb $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      if ($$0.c(c) == eck.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dze $$3 ? $$3.d() : 0;
      }
   }
}
