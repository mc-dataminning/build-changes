import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgn extends dem implements dmb {
   public static final MapCodec<dgn> a = b(dgn::new);
   public static final dsu b = dst.C;
   private static final int d = 3;
   protected static final ewl c = dfa.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public dgn(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.z, $$0.B ? dpu::a : dpu::b);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.b;
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(b) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
