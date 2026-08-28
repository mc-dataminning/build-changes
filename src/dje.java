import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends den {
   public static final MapCodec<dje> a = b(dje::new);
   public static final dsv b = dsu.n;

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   protected dje(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, @Nullable btr $$3, cur $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxg $$5 = $$4.a(km.O, cxg.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dqk $$5) {
         $$5.l();
         return bqw.a($$1.B);
      } else {
         return bqw.e;
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqk $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqk($$0, $$1);
   }

   @Override
   public boolean e_(dse $$0) {
      return true;
   }

   @Override
   public int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      if ($$1.c_($$2) instanceof dqk $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqk $$3 && $$3.f().g() instanceof cvm $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$1.c(b) ? a($$2, dpl.e, dqk::a) : null;
   }
}
