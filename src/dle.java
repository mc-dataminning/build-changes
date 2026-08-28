import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dle extends dld {
   public static final MapCodec<dle> h = b(dle::new);
   public static final dsw i = div.aE;
   public static final dst j = dld.d;

   @Override
   public MapCodec<dle> a() {
      return h;
   }

   protected dle(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, je.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return dob.m($$0);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return dob.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dfb.a.o() : $$0;
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = dfb.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$0.c(j)) {
         je $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ld.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dby $$0, iz $$1, dsc $$2) {
      je $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(i, j);
   }
}
