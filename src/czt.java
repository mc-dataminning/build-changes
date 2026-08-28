import com.mojang.serialization.Codec;

public interface czt<T extends czw> {
   Codec<czt<?>> h = lu.r.q().dispatch(czt::as_, czy::a);
   zb<wo, czt<?>> i = yz.a(lv.ae).b(czt::as_, czy::b);

   boolean a(T var1, dds var2);

   cvl a(T var1, jp.a var2);

   boolean a(int var1, int var2);

   cvl a(jp.a var1);

   default jw<cvl> a(T $$0) {
      jw<cvl> $$1 = jw.a($$0.a(), cvl.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvg $$3 = $$0.a($$2).h();
         if ($$3.v()) {
            $$1.set($$2, new cvl($$3.u()));
         }
      }

      return $$1;
   }

   default boolean ar_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cvl g() {
      return new cvl(dgx.cA);
   }

   czy<?> as_();

   czz<?> e();

   czs a();
}
