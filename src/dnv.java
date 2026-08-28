import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnv extends dlm {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final eax<ja.a> b = eap.K;
   public static final eax<eat> c = eap.bD;
   public static final eaq d = eap.w;

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   protected dnv(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(b, ja.a.b).b(c, eat.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != eat.a ? a($$2, dwz.k, dxn::a) : null;
      }
   }

   public static boolean a(div $$0) {
      return $$0.X();
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if (a($$1)) {
         if ($$0.c(c) != eat.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.gB, awo.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      dzz $$4 = d($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static dzz d(dzz $$0, div $$1, iu $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == eat.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? eat.c : eat.b) : $$0;
   }

   public static boolean b(dzz $$0, diy $$1, iu $$2) {
      ja.a $$3 = $$0.c(b);

      for (ja $$4 : $$3.g()) {
         dzz $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axc.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(diw $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         iu $$3 = $$1.a($$2);
         dzz $$4 = $$0.a_($$3);
         if (!$$4.a(axc.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      return d(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return dss.b($$0, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, dio $$3, BiConsumer<cyy, iu> $$4) {
      if ($$1.c_($$2) instanceof dxn $$5 && $$3 instanceof djl $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof cqy $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      if ($$0.c_($$1) instanceof dxn $$4) {
         $$4.a($$3.dW().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cqy $$0, dzz $$1, div $$2, iu $$3) {
      if (!$$0.gk() && !$$0.U_() && $$1.c(d) && $$2 instanceof arq $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      if ($$0.c(c) == eat.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dxn $$3 ? $$3.d() : 0;
      }
   }
}
