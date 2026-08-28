import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dov extends dou {
   public static final MapCodec<dov> h = b(dov::new);
   public static final dws<jm> i = dml.aF;
   public static final dwm j = dou.d;

   @Override
   public MapCodec<dov> a() {
      return h;
   }

   protected dov(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return drs.o($$0);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return drs.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4.g() == $$0.c(i) && !$$0.a($$1, $$3) ? dis.a.m() : $$0;
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = dis.cq.a($$0);
      return $$1 == null ? null : this.m().b(i, $$1.c(i));
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(j)) {
         jm $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ln.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dfm $$0, jh $$1, dvv $$2) {
      jm $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected etd a(dfm $$0, dvv $$1) {
      return esz.a($$0, $$1.c(i).g(), jm.b);
   }
}
