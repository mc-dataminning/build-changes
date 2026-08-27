import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcq extends cya {
   public static final MapCodec<dcq> a = b(dcq::new);
   public static final dlw b = dlv.n;

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   protected dcq(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      sw $$5 = cms.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dju $$5) {
         $$5.k();
         return blu.a($$1.B);
      } else {
         return blu.d;
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dju $$5) {
            $$5.k();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dju($$0, $$1);
   }

   @Override
   public boolean f_(dlf $$0) {
      return true;
   }

   @Override
   public int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      if ($$1.c_($$2) instanceof dju $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      if ($$1.c_($$2) instanceof dju $$3 && $$3.x().d() instanceof cpr $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return $$1.c(b) ? a($$2, div.e, dju::a) : null;
   }
}
