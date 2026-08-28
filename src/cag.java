import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class cag extends byq<ckt> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<ckt, btj> e;
   private final cho f;
   private final float g;
   private final ToDoubleFunction<ckt> h;
   private fdw i;
   private final Function<ckt, awk> j;
   private final Function<ckt, awk> k;

   public cag(Function<ckt, btj> $$0, cho $$1, float $$2, ToDoubleFunction<ckt> $$3, Function<ckt, awk> $$4, Function<ckt, awk> $$5) {
      super(ImmutableMap.of(cgb.W, cgc.b, cgb.X, cgc.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fdw.c;
   }

   protected boolean a(aro $$0, ckt $$1) {
      return $$1.eb().a(cgb.X);
   }

   protected boolean a(aro $$0, ckt $$1, long $$2) {
      return $$1.eb().a(cgb.X);
   }

   protected void b(aro $$0, ckt $$1, long $$2) {
      iu $$3 = $$1.dv();
      bxz<?> $$4 = $$1.eb();
      fdw $$5 = $$4.c(cgb.X).get();
      this.i = new fdw((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cgb.n, new cge($$5, this.g, 0));
   }

   protected void c(aro $$0, ckt $$1, long $$2) {
      List<bwz> $$3 = $$0.a(bwz.class, this.f, $$1, $$1.cR());
      bxz<?> $$4 = $$1.eb();
      if (!$$3.isEmpty()) {
         bwz $$5 = $$3.get(0);
         bup $$6 = $$0.al().c((bwz)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(byf.c))) {
            dfh.a($$0, (bwa)$$5, $$6);
         }

         int $$7 = $$1.b(bvg.a) ? $$1.c(bvg.a).e() + 1 : 0;
         int $$8 = $$1.b(bvg.b) ? $$1.c(bvg.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = azk.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.i($$0.al().b((bwz)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awm.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awm.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gs();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awm.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cge> $$13 = $$4.c(cgb.n);
         Optional<fdw> $$14 = $$4.c(cgb.X);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aro $$0, ckt $$1) {
      fdw $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      iu $$3 = iu.a((jo)$$1.dt().e($$2));
      return $$0.a_($$3).a(axa.cq) || $$0.a_($$3.d()).a(axa.cq);
   }

   protected void b(aro $$0, ckt $$1) {
      $$0.a($$1, (byte)59);
      $$1.eb().a(cgb.W, this.e.apply($$1).a($$0.A));
      $$1.eb().b(cgb.X);
   }
}
