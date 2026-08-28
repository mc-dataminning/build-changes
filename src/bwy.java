import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bwy extends bvi<chf> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<chf, bqf> e;
   private final ceg f;
   private final float g;
   private final ToDoubleFunction<chf> h;
   private evr i;
   private final Function<chf, avz> j;
   private final Function<chf, avz> k;

   public bwy(Function<chf, bqf> $$0, ceg $$1, float $$2, ToDoubleFunction<chf> $$3, Function<chf, avz> $$4, Function<chf, avz> $$5) {
      super(ImmutableMap.of(cct.V, ccu.b, cct.W, ccu.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = evr.b;
   }

   protected boolean a(arf $$0, chf $$1) {
      return $$1.dS().a(cct.W);
   }

   protected boolean a(arf $$0, chf $$1, long $$2) {
      return $$1.dS().a(cct.W);
   }

   protected void b(arf $$0, chf $$1, long $$2) {
      iz $$3 = $$1.dp();
      bur<?> $$4 = $$1.dS();
      evr $$5 = $$4.c(cct.W).get();
      this.i = new evr((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cct.m, new ccw($$5, this.g, 0));
   }

   protected void c(arf $$0, chf $$1, long $$2) {
      List<btp> $$3 = $$0.a(btp.class, this.f, $$1, $$1.cK());
      bur<?> $$4 = $$1.dS();
      if (!$$3.isEmpty()) {
         btp $$5 = $$3.get(0);
         $$5.a($$0.aj().c((btp)$$1), (float)$$1.g(bux.c));
         int $$6 = $$1.b(bse.a) ? $$1.c(bse.a).e() + 1 : 0;
         int $$7 = $$1.b(bse.b) ? $$1.c(bse.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ayz.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.aj().b((btp)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gx();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), awb.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<ccw> $$12 = $$4.c(cct.m);
         Optional<evr> $$13 = $$4.c(cct.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arf $$0, chf $$1) {
      evr $$2 = $$1.ds().d(1.0, 0.0, 1.0).d();
      iz $$3 = iz.a($$1.dn().e($$2));
      return $$0.a_($$3).a(awp.cm) || $$0.a_($$3.c()).a(awp.cm);
   }

   protected void b(arf $$0, chf $$1) {
      $$0.a($$1, (byte)59);
      $$1.dS().a(cct.V, this.e.apply($$1).a($$0.z));
      $$1.dS().b(cct.W);
   }
}
