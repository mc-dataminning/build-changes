import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dal extends cvv {
   public static final MapCodec<dal> a = b(dal::new);
   public static final djr b = djq.n;

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   protected dal(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      sl $$5 = ckk.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dhp $$6) {
         $$6.k();
         return bjv.a($$1.B);
      } else {
         return bjv.d;
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dhp $$5) {
            $$5.k();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhp($$0, $$1);
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      if ($$1.c_($$2) instanceof dhp $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhp $$3 && $$3.x().d() instanceof cnj $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$1.c(b) ? a($$2, dgq.e, dhp::a) : null;
   }
}
