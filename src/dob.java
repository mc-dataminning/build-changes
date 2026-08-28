import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dob extends dlr {
   public static final MapCodec<dob> a = b(dob::new);
   public static final ebf<ja.a> b = eax.K;
   public static final ebf<ebb> c = eax.bD;
   public static final eay d = eax.w;

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   protected dob(eag.d $$0) {
      super($$0);
      this.l(this.m().b(b, ja.a.b).b(c, ebb.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != ebb.a ? a($$2, dxh.k, dxv::a) : null;
      }
   }

   public static boolean a(dja $$0) {
      return $$0.X();
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if (a($$1)) {
         if ($$0.c(c) != ebb.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.gD, awo.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      eah $$4 = d($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static eah d(eah $$0, dja $$1, iu $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == ebb.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? ebb.c : ebb.b) : $$0;
   }

   public static boolean b(eah $$0, djd $$1, iu $$2) {
      ja.a $$3 = $$0.c(b);

      for (ja $$4 : $$3.g()) {
         eah $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axc.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(djb $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         iu $$3 = $$1.a($$2);
         eah $$4 = $$0.a_($$3);
         if (!$$4.a(axc.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      return d(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return dsy.b($$0, $$1);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, dit $$3, BiConsumer<czd, iu> $$4) {
      if ($$1.c_($$2) instanceof dxv $$5 && $$3 instanceof djq $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof crc $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      if ($$0.c_($$1) instanceof dxv $$4) {
         $$4.a($$3.dW().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(crc $$0, eah $$1, dja $$2, iu $$3) {
      if (!$$0.gl() && !$$0.V_() && $$1.c(d) && $$2 instanceof arq $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      if ($$0.c(c) == ebb.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dxv $$3 ? $$3.d() : 0;
      }
   }
}
