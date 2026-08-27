import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvf extends cvv implements cls {
   public static final djr a = djq.w;
   private final ddk.a b;

   public cvf(ddk.a $$0, diz.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cvf> a();

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cwl.gO) || $$1.a(cwl.gP) || $$1.a(cwl.gQ) || $$1.a(cwl.gR);
         if ($$3) {
            return a($$2, dgq.p, dhz::a);
         }
      }

      return null;
   }

   public ddk.a b() {
      return this.b;
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public blu g() {
      return blu.f;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(a);
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
