import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhq extends dgz implements dfo {
   public static final MapCodec<dhq> a = b(dhq::new);
   public static final dlw c = dlv.C;

   @Override
   protected MapCodec<? extends dhq> a() {
      return a;
   }

   protected dhq(dle.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(egq.c)));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(c) ? egq.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }
}
