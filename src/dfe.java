import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfe extends dem {
   public static final MapCodec<dfe> a = b(dfe::new);
   public static final dsu[] b = new dsu[]{dst.k, dst.l, dst.m};
   protected static final ewl c = ewi.a(dfa.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dfa.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0.B ? null : a($$2, dpk.l, dpl::a);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         dpi $$5 = $$1.c_($$2);
         if ($$5 instanceof dpl) {
            $$3.a((dpl)$$5);
            $$3.a(awk.aa);
         }

         return bqv.c;
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      bqr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return cpv.a($$1.c_($$2));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
