import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class byq extends bxa<ciy> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<ciy, brv> e;
   private final cfy f;
   private final float g;
   private final ToDoubleFunction<ciy> h;
   private fba i;
   private final Function<ciy, avz> j;
   private final Function<ciy, avz> k;

   public byq(Function<ciy, brv> $$0, cfy $$1, float $$2, ToDoubleFunction<ciy> $$3, Function<ciy, avz> $$4, Function<ciy, avz> $$5) {
      super(ImmutableMap.of(cel.V, cem.b, cel.W, cem.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fba.c;
   }

   protected boolean a(ard $$0, ciy $$1) {
      return $$1.eb().a(cel.W);
   }

   protected boolean a(ard $$0, ciy $$1, long $$2) {
      return $$1.eb().a(cel.W);
   }

   protected void b(ard $$0, ciy $$1, long $$2) {
      ji $$3 = $$1.dv();
      bwj<?> $$4 = $$1.eb();
      fba $$5 = $$4.c(cel.W).get();
      this.i = new fba((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cel.m, new ceo($$5, this.g, 0));
   }

   protected void c(ard $$0, ciy $$1, long $$2) {
      List<bvh> $$3 = $$0.a(bvh.class, this.f, $$1, $$1.cR());
      bwj<?> $$4 = $$1.eb();
      if (!$$3.isEmpty()) {
         bvh $$5 = $$3.get(0);
         btb $$6 = $$0.ak().c((bvh)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bwp.c))) {
            ddb.a($$0, (bul)$$5, $$6);
         }

         int $$7 = $$1.b(bts.a) ? $$1.c(bts.a).e() + 1 : 0;
         int $$8 = $$1.b(bts.b) ? $$1.c(bts.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = ayz.a($$1.fp() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.i($$0.ak().b((bvh)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gu();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awb.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<ceo> $$13 = $$4.c(cel.m);
         Optional<fba> $$14 = $$4.c(cel.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ard $$0, ciy $$1) {
      fba $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      ji $$3 = ji.a((kb)$$1.dt().e($$2));
      return $$0.a_($$3).a(awp.cp) || $$0.a_($$3.d()).a(awp.cp);
   }

   protected void b(ard $$0, ciy $$1) {
      $$0.a($$1, (byte)59);
      $$1.eb().a(cel.V, this.e.apply($$1).a($$0.A));
      $$1.eb().b(cel.W);
   }
}
