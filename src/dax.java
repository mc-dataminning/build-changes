import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dax extends daw {
   public static final MapCodec<dax> h = b(dax::new);
   public static final dhq i = cyo.aE;
   public static final dhn j = daw.d;

   @Override
   public MapCodec<dax> a() {
      return h;
   }

   protected dax(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, hx.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ddr.h($$0);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return cuv.cq.a($$0, $$1, $$2);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return cuv.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = cuv.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(j)) {
         hx $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jm.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(crs $$0, ht $$1, dgw $$2) {
      hx $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return cuv.cq.a($$0, $$1);
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return cuv.cq.a($$0, $$1);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(i, j);
   }
}
