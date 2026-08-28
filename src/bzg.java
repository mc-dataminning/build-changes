import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bzg extends bxq<cjo> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cjo, bsl> e;
   private final cgo f;
   private final float g;
   private final ToDoubleFunction<cjo> h;
   private fbr i;
   private final Function<cjo, awu> j;
   private final Function<cjo, awu> k;

   public bzg(Function<cjo, bsl> $$0, cgo $$1, float $$2, ToDoubleFunction<cjo> $$3, Function<cjo, awu> $$4, Function<cjo, awu> $$5) {
      super(ImmutableMap.of(cfb.V, cfc.b, cfb.W, cfc.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fbr.c;
   }

   protected boolean a(arx $$0, cjo $$1) {
      return $$1.ec().a(cfb.W);
   }

   protected boolean a(arx $$0, cjo $$1, long $$2) {
      return $$1.ec().a(cfb.W);
   }

   protected void b(arx $$0, cjo $$1, long $$2) {
      jh $$3 = $$1.dw();
      bwz<?> $$4 = $$1.ec();
      fbr $$5 = $$4.c(cfb.W).get();
      this.i = new fbr((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cfb.m, new cfe($$5, this.g, 0));
   }

   protected void c(arx $$0, cjo $$1, long $$2) {
      List<bvx> $$3 = $$0.a(bvx.class, this.f, $$1, $$1.cR());
      bwz<?> $$4 = $$1.ec();
      if (!$$3.isEmpty()) {
         bvx $$5 = $$3.get(0);
         btr $$6 = $$0.ak().c((bvx)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bxf.c))) {
            dds.a($$0, (bvb)$$5, $$6);
         }

         int $$7 = $$1.b(bui.a) ? $$1.c(bui.a).e() + 1 : 0;
         int $$8 = $$1.b(bui.b) ? $$1.c(bui.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = azu.a($$1.fp() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.g($$0.ak().b((bvx)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aww.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aww.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gq();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), aww.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cfe> $$13 = $$4.c(cfb.m);
         Optional<fbr> $$14 = $$4.c(cfb.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arx $$0, cjo $$1) {
      fbr $$2 = $$1.dz().d(1.0, 0.0, 1.0).d();
      jh $$3 = jh.a((ka)$$1.du().e($$2));
      return $$0.a_($$3).a(axk.cp) || $$0.a_($$3.d()).a(axk.cp);
   }

   protected void b(arx $$0, cjo $$1) {
      $$0.a($$1, (byte)59);
      $$1.ec().a(cfb.V, this.e.apply($$1).a($$0.A));
      $$1.ec().b(cfb.W);
   }
}
