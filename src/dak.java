import com.mojang.serialization.Codec;

public interface dak<T extends dan> {
   Codec<dak<?>> h = lv.r.q().dispatch(dak::ar_, dap::a);
   zc<wp, dak<?>> i = za.a(lw.ae).b(dak::ar_, dap::b);

   boolean a(T var1, dej var2);

   cvs a(T var1, jq.a var2);

   boolean a(int var1, int var2);

   cvs a(jq.a var1);

   default jx<cvs> a(T $$0) {
      jx<cvs> $$1 = jx.a($$0.a(), cvs.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvn $$3 = $$0.a($$2).h();
         if ($$3.u()) {
            $$1.set($$2, new cvs($$3.t()));
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

   default cvs g() {
      return new cvs(dho.cA);
   }

   dap<?> ar_();

   daq<?> e();

   daj a();
}
