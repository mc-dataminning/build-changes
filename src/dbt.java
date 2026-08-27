import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbt extends cum implements dca {
   public static final MapCodec<dbt> a = b(dbt::new);
   public static final dhz b = dhy.F;
   public static final dhz c = dhy.C;
   public static final dhz d = dhy.G;
   protected static final ekn e = cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(hx.a.b);

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   public dbt(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, bkq $$3) {
      if ($$0 instanceof ame $$4) {
         amf $$5 = dgk.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dff.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if ($$1 instanceof ame $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dff.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dff.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return e;
   }

   @Override
   public ekn f(dhi $$0, crg $$1, ht $$2) {
      return e;
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgk($$0, $$1);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ect.c));
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(c) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, clj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bhz.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return !$$0.B ? cum.a($$2, dff.L, ($$0x, $$1x, $$2x, $$3) -> dmb.c.a($$0x, $$3.gh(), $$3.gi())) : null;
   }
}
