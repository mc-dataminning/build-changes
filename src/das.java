import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class das extends cwc {
   public static final MapCodec<das> a = b(das::new);
   public static final djy b = djx.n;

   @Override
   public MapCodec<das> a() {
      return a;
   }

   protected das(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      sn $$5 = ckr.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dhw $$6) {
         $$6.k();
         return bkb.a($$1.B);
      } else {
         return bkb.d;
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dhw $$5) {
            $$5.k();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhw($$0, $$1);
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      if ($$1.c_($$2) instanceof dhw $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhw $$3 && $$3.x().d() instanceof cnq $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$1.c(b) ? a($$2, dgx.e, dhw::a) : null;
   }
}
