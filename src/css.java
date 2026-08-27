import com.mojang.serialization.Codec;

public interface css<C extends bme> {
   Codec<css<?>> h = kh.t.q().dispatch(css::as_, csw::a);
   xq<vd, css<?>> i = xo.a(ki.Y).b(css::as_, csw::b);

   boolean a(C var1, cwe var2);

   cpq a(C var1, iy var2);

   boolean a(int var1, int var2);

   cpq a(iy var1);

   default iu<cpq> a(C $$0) {
      iu<cpq> $$1 = iu.a($$0.b(), cpq.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cpl $$3 = $$0.a($$2).d();
         if ($$3.u()) {
            $$1.set($$2, new cpq($$3.t()));
         }
      }

      return $$1;
   }

   default iu<csp> a() {
      return iu.a();
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

   default cpq g() {
      return new cpq(czh.cA);
   }

   csw<?> as_();

   csx<?> e();

   default boolean i() {
      iu<csp> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
