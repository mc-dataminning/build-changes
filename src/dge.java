import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dge extends dgd {
   public static final MapCodec<dge> h = b(dge::new);
   public static final dnt i = ddv.aE;
   public static final dnq j = dgd.d;

   @Override
   public MapCodec<dge> a() {
      return h;
   }

   protected dge(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ih.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return djb.m($$0);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return djb.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dac.a.o() : $$0;
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = dac.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$0.c(j)) {
         ih $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jw.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cwz $$0, ib $$1, dmz $$2) {
      ih $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(i, j);
   }
}
