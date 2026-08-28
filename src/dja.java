import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dja extends dej {
   public static final MapCodec<dja> a = b(dja::new);
   public static final dsr b = dsq.n;

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   protected dja(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, @Nullable btn $$3, cun $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxc $$5 = $$4.a(km.N, cxc.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dqg $$5) {
         $$5.l();
         return bqs.a($$1.B);
      } else {
         return bqs.e;
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqg $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqg($$0, $$1);
   }

   @Override
   public boolean e_(dsa $$0) {
      return true;
   }

   @Override
   public int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      if ($$1.c_($$2) instanceof dqg $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqg $$3 && $$3.f().g() instanceof cvi $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$1.c(b) ? a($$2, dph.e, dqg::a) : null;
   }
}
