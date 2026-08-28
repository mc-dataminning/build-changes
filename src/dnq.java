import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnq extends dix {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final dxn b = dxm.r;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   protected dnq(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, @Nullable bvg $$3, cwo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cyx $$5 = $$4.a(kv.Y, cyx.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dvc $$5) {
         $$5.s();
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if ($$1.c(b)) {
         return bsj.f;
      } else {
         cwo $$7 = $$4.b($$5);
         bsj $$8 = cwt.a($$2, $$3, $$7, $$4);
         return (bsj)(!$$8.a() ? bsj.f : $$8);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dvc $$5) {
            $$5.s();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvc($$0, $$1);
   }

   @Override
   public boolean f_(dww $$0) {
      return true;
   }

   @Override
   public int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      if ($$1.c_($$2) instanceof dvc $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return $$1.c_($$2) instanceof dvc $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$1.c(b) ? a($$2, dua.e, dvc::a) : null;
   }
}
