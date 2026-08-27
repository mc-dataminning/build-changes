import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dku extends ddm implements dlb {
   public static final MapCodec<dku> a = b(dku::new);
   public static final dru b = drt.F;
   public static final dru c = drt.C;
   public static final dru d = drt.G;
   protected static final evf e = dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(it.a.b);

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, brw $$3) {
      if ($$0 instanceof aqn $$4) {
         aqo $$5 = dpq.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dok.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if ($$1 instanceof aqn $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dok.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dok.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return e;
   }

   @Override
   protected evf f(drd $$0, daf $$1, io $$2) {
      return e;
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dpq($$0, $$1);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      return this.n().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == emx.c));
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, ctq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, boy.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return !$$0.B ? ddm.a($$2, dok.L, ($$0x, $$1x, $$2x, $$3) -> dwf.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }
}
