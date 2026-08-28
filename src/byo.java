import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class byo extends bwy<ciw> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<ciw, brt> e;
   private final cfw f;
   private final float g;
   private final ToDoubleFunction<ciw> h;
   private fay i;
   private final Function<ciw, avy> j;
   private final Function<ciw, avy> k;

   public byo(Function<ciw, brt> $$0, cfw $$1, float $$2, ToDoubleFunction<ciw> $$3, Function<ciw, avy> $$4, Function<ciw, avy> $$5) {
      super(ImmutableMap.of(cej.V, cek.b, cej.W, cek.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fay.c;
   }

   protected boolean a(arc $$0, ciw $$1) {
      return $$1.ec().a(cej.W);
   }

   protected boolean a(arc $$0, ciw $$1, long $$2) {
      return $$1.ec().a(cej.W);
   }

   protected void b(arc $$0, ciw $$1, long $$2) {
      ji $$3 = $$1.dw();
      bwh<?> $$4 = $$1.ec();
      fay $$5 = $$4.c(cej.W).get();
      this.i = new fay((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cej.m, new cem($$5, this.g, 0));
   }

   protected void c(arc $$0, ciw $$1, long $$2) {
      List<bvf> $$3 = $$0.a(bvf.class, this.f, $$1, $$1.cR());
      bwh<?> $$4 = $$1.ec();
      if (!$$3.isEmpty()) {
         bvf $$5 = $$3.get(0);
         bsz $$6 = $$0.ak().c((bvf)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bwn.c))) {
            dcz.a($$0, (buj)$$5, $$6);
         }

         int $$7 = $$1.b(btq.a) ? $$1.c(btq.a).e() + 1 : 0;
         int $$8 = $$1.b(btq.b) ? $$1.c(btq.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = ayy.a($$1.fp() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.i($$0.ak().b((bvf)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awa.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awa.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gr();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awa.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cem> $$13 = $$4.c(cej.m);
         Optional<fay> $$14 = $$4.c(cej.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arc $$0, ciw $$1) {
      fay $$2 = $$1.dz().d(1.0, 0.0, 1.0).d();
      ji $$3 = ji.a((kb)$$1.du().e($$2));
      return $$0.a_($$3).a(awo.cp) || $$0.a_($$3.d()).a(awo.cp);
   }

   protected void b(arc $$0, ciw $$1) {
      $$0.a($$1, (byte)59);
      $$1.ec().a(cej.V, this.e.apply($$1).a($$0.A));
      $$1.ec().b(cej.W);
   }
}
