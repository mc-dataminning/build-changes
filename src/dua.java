import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dua extends dtz {
   public static final MapCodec<dua> f = b(dua::new);
   public static final eco<jc> g = drp.e;
   public static final ech h = dtz.b;

   @Override
   public MapCodec<dua> a() {
      return f;
   }

   protected dua(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(g, jc.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return dxh.o($$0);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return dxh.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dnq.a.m() : $$0;
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = dnq.cA.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$0.c(h)) {
         jc $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lu.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dkj $$0, iw $$1, ebq $$2) {
      jc $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected ezi a(dkj $$0, ebq $$1) {
      return eze.a($$0, $$1.c(g).g(), jc.b);
   }
}
