import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class djo extends dfa implements dmb {
   public static final MapCodec<djo> a = b(djo::new);
   public static final int b = 15;
   public static final dtd c = dst.aP;
   public static final dsu d = dst.C;
   public static final ToIntFunction<dsd> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   public djo(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqv.a;
      } else {
         return bqv.c;
      }
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return $$3.a(cut.hC) ? ewi.b() : ewi.a();
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.a;
   }

   @Override
   protected float d(dsd $$0, dbf $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(d) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cuq a(cuq $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(km.ab, cxb.a.a(c, $$1));
      }

      return $$0;
   }
}
