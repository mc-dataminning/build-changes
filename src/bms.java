import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bms extends bld<bws> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bws, bgp> e;
   private final bty f;
   private final float g;
   private final ToDoubleFunction<bws> h;
   private ehh i;
   private final Function<bws, apf> j;
   private final Function<bws, apf> k;

   public bms(Function<bws, bgp> $$0, bty $$1, float $$2, ToDoubleFunction<bws> $$3, Function<bws, apf> $$4, Function<bws, apf> $$5) {
      super(ImmutableMap.of(bsn.U, bso.b, bsn.V, bso.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ehh.b;
   }

   protected boolean a(akt $$0, bws $$1) {
      return $$1.dN().a(bsn.V);
   }

   protected boolean a(akt $$0, bws $$1, long $$2) {
      return $$1.dN().a(bsn.V);
   }

   protected void b(akt $$0, bws $$1, long $$2) {
      gw $$3 = $$1.dl();
      bkm<?> $$4 = $$1.dN();
      ehh $$5 = $$4.c(bsn.V).get();
      this.i = new ehh((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bsn.m, new bsq($$5, this.g, 0));
   }

   protected void c(akt $$0, bws $$1, long $$2) {
      List<bjm> $$3 = $$0.a(bjm.class, this.f, $$1, $$1.cG());
      bkm<?> $$4 = $$1.dN();
      if (!$$3.isEmpty()) {
         bjm $$5 = $$3.get(0);
         $$5.a($$0.ag().c((bjm)$$1), (float)$$1.b(bks.c));
         int $$6 = $$1.a(bil.a) ? $$1.b(bil.a).e() + 1 : 0;
         int $$7 = $$1.a(bil.b) ? $$1.b(bil.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = asb.a($$1.fe() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ag().b((bjm)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aph.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aph.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gl();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aph.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bsq> $$12 = $$4.c(bsn.m);
         Optional<ehh> $$13 = $$4.c(bsn.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(akt $$0, bws $$1) {
      ehh $$2 = $$1.do().d(1.0, 0.0, 1.0).d();
      gw $$3 = gw.a($$1.dj().e($$2));
      return $$0.a_($$3).a(apv.ce) || $$0.a_($$3.c()).a(apv.ce);
   }

   protected void b(akt $$0, bws $$1) {
      $$0.a($$1, (byte)59);
      $$1.dN().a(bsn.U, this.e.apply($$1).a($$0.z));
      $$1.dN().b(bsn.V);
   }
}
