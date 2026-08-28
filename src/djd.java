import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends dem {
   public static final MapCodec<djd> a = b(djd::new);
   public static final dsu b = dst.n;

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   protected djd(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, @Nullable btq $$3, cuq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxf $$5 = $$4.a(km.O, cxf.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dqj $$5) {
         $$5.l();
         return bqv.a($$1.B);
      } else {
         return bqv.e;
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqj $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqj($$0, $$1);
   }

   @Override
   public boolean e_(dsd $$0) {
      return true;
   }

   @Override
   public int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      if ($$1.c_($$2) instanceof dqj $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqj $$3 && $$3.f().g() instanceof cvl $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$1.c(b) ? a($$2, dpk.e, dqj::a) : null;
   }
}
