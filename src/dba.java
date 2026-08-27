import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dba extends cwk {
   public static final MapCodec<dba> a = b(dba::new);
   public static final dkg b = dkf.n;

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   protected dba(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      so $$5 = cla.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof die $$5) {
         $$5.k();
         return bkc.a($$1.B);
      } else {
         return bkc.d;
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof die $$5) {
            $$5.k();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new die($$0, $$1);
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      if ($$1.c_($$2) instanceof die $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      if ($$1.c_($$2) instanceof die $$3 && $$3.x().d() instanceof cny $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$1.c(b) ? a($$2, dhf.e, die::a) : null;
   }
}
