import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkz extends dky {
   public static final MapCodec<dkz> h = b(dkz::new);
   public static final dsr i = diq.aE;
   public static final dso j = dky.d;

   @Override
   public MapCodec<dkz> a() {
      return h;
   }

   protected dkz(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, je.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return dnw.m($$0);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return dnw.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dew.a.n() : $$0;
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = dew.cq.a($$0);
      return $$1 == null ? null : this.n().a(i, $$1.c(i));
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
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
   protected boolean a(dbt $$0, iz $$1, drx $$2) {
      je $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(i, j);
   }
}
