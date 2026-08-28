import com.mojang.serialization.Codec;

public interface dat<T extends daw> {
   Codec<dat<?>> h = lz.r.q().dispatch(dat::aq_, day::a);
   zj<ww, dat<?>> i = zh.a(ma.ae).b(dat::aq_, day::b);

   boolean a(T var1, dff var2);

   cwf a(T var1, js.a var2);

   boolean a(int var1, int var2);

   cwf a(js.a var1);

   default jz<cwf> a(T $$0) {
      jz<cwf> $$1 = jz.a($$0.a(), cwf.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwb $$3 = $$0.a($$2).h();
         if ($$3.l()) {
            $$1.set($$2, new cwf($$3.k()));
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

   default cwf g() {
      return new cwf(dil.cA);
   }

   day<?> aq_();

   daz<?> e();

   das a();
}
