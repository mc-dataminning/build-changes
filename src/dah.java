import com.mojang.serialization.Codec;

public interface dah<T extends dak> {
   Codec<dah<?>> h = lu.r.q().dispatch(dah::aq_, dam::a);
   zb<wo, dah<?>> i = yz.a(lv.ae).b(dah::aq_, dam::b);

   boolean a(T var1, deg var2);

   cvp a(T var1, jp.a var2);

   boolean a(int var1, int var2);

   cvp a(jp.a var1);

   default jw<cvp> a(T $$0) {
      jw<cvp> $$1 = jw.a($$0.a(), cvp.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvk $$3 = $$0.a($$2).h();
         if ($$3.u()) {
            $$1.set($$2, new cvp($$3.t()));
         }
      }

      return $$1;
   }

   default boolean ap_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cvp g() {
      return new cvp(dhl.cA);
   }

   dam<?> aq_();

   dan<?> e();

   dag a();
}
