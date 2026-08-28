import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends doc {
   public static final MapCodec<dod> h = b(dod::new);
   public static final dvx i = dlt.aF;
   public static final dvu j = doc.d;

   @Override
   public MapCodec<dod> a() {
      return h;
   }

   protected dod(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jl.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return dra.o($$0);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return dra.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dia.a.m() : $$0;
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = dia.cq.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(j)) {
         jl $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ll.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dev $$0, jg $$1, dvd $$2) {
      jl $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected esm a(dev $$0, dvd $$1) {
      return esi.a($$0, $$1.c(i).g(), jl.b);
   }
}
