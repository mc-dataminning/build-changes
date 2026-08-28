import com.mojang.serialization.Codec;

public interface daj<T extends dam> {
   Codec<daj<?>> h = lx.r.q().dispatch(daj::ar_, dao::a);
   zf<ws, daj<?>> i = zd.a(ly.ae).b(daj::ar_, dao::b);

   boolean a(T var1, dev var2);

   cvx a(T var1, jr.a var2);

   boolean a(int var1, int var2);

   cvx a(jr.a var1);

   default jy<cvx> a(T $$0) {
      jy<cvx> $$1 = jy.a($$0.a(), cvx.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvt $$3 = $$0.a($$2).h();
         if ($$3.l()) {
            $$1.set($$2, new cvx($$3.k()));
         }
      }

      return $$1;
   }

   default boolean aq_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cvx g() {
      return new cvx(dia.cA);
   }

   dao<?> ar_();

   dap<?> e();

   dai a();
}
