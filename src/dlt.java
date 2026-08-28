import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends del implements dma {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final dst b = dss.F;
   public static final dst c = dss.C;
   public static final dst d = dss.G;
   protected static final ewk e = dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(je.a.b);

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, bsu $$3) {
      if ($$0 instanceof arf $$4) {
         arg $$5 = dqp.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dpj.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if ($$1 instanceof arf $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dpj.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dpj.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return e;
   }

   @Override
   protected ewk f(dsc $$0, dbe $$1, iz $$2) {
      return e;
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqp($$0, $$1);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == enw.c));
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(c) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, cup $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpw.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return !$$0.B ? del.a($$2, dpj.L, ($$0x, $$1x, $$2x, $$3) -> dxe.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }
}
