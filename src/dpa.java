import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dpa extends dmq {
   public static final MapCodec<dpa> a = b(dpa::new);
   public static final ece<jc.a> b = ebw.K;
   public static final ece<eca> c = ebw.bD;
   public static final ebx d = ebw.w;

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   protected dpa(ebf.d $$0) {
      super($$0);
      this.l(this.m().b(b, jc.a.b).b(c, eca.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != eca.a ? a($$2, dyg.k, dyu::a) : null;
      }
   }

   public static boolean a(djz $$0) {
      return $$0.X();
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if (a($$1)) {
         if ($$0.c(c) != eca.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awr.gD, aws.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      ebg $$4 = d($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static ebg d(ebg $$0, djz $$1, iw $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == eca.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? eca.c : eca.b) : $$0;
   }

   public static boolean b(ebg $$0, dkc $$1, iw $$2) {
      jc.a $$3 = $$0.c(b);

      for (jc $$4 : $$3.g()) {
         ebg $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axg.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dka $$0, iw $$1) {
      for (jc $$2 : jc.values()) {
         iw $$3 = $$1.a($$2);
         ebg $$4 = $$0.a_($$3);
         if (!$$4.a(axg.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      return d(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return dtx.b($$0, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, djs $$3, BiConsumer<daa, iw> $$4) {
      if ($$1.c_($$2) instanceof dyu $$5 && $$3 instanceof dkp $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof crz $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      if ($$0.c_($$1) instanceof dyu $$4) {
         $$4.a($$3.dW().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(crz $$0, ebg $$1, djz $$2, iw $$3) {
      if (!$$0.gl() && !$$0.Z_() && $$1.c(d) && $$2 instanceof aru $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      if ($$0.c(c) == eca.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dyu $$3 ? $$3.d() : 0;
      }
   }
}
