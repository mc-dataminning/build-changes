import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlu extends dem implements dmb {
   public static final MapCodec<dlu> a = b(dlu::new);
   public static final dsu b = dst.F;
   public static final dsu c = dst.C;
   public static final dsu d = dst.G;
   protected static final ewl e = dfa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(je.a.b);

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, bsv $$3) {
      if ($$0 instanceof arf $$4) {
         arg $$5 = dqq.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dpk.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if ($$1 instanceof arf $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dpk.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dpk.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return e;
   }

   @Override
   protected ewl f(dsd $$0, dbf $$1, iz $$2) {
      return e;
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqq($$0, $$1);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == enx.c));
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(c) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpx.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return !$$0.B ? dem.a($$2, dpk.L, ($$0x, $$1x, $$2x, $$3) -> dxf.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }
}
