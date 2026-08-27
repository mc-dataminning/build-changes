import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxd extends cso {
   public static final MapCodec<cxd> a = b(cxd::new);
   public static final dfu b = dft.n;

   @Override
   public MapCodec<cxd> a() {
      return a;
   }

   protected cxd(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      qw $$5 = che.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$0.c(b) && $$1.c_($$2) instanceof ddz $$6) {
         $$6.v();
         return bhe.a($$1.B);
      } else {
         return bhe.d;
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof ddz $$5) {
            $$5.v();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddz($$0, $$1);
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      if ($$1.c_($$2) instanceof ddz $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      if ($$1.c_($$2) instanceof ddz $$3 && $$3.i().d() instanceof ckd $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return $$1.c(b) ? a($$2, ddb.e, ddz::a) : null;
   }
}
