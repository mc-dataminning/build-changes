import com.mojang.serialization.Codec;

public interface cyq<C extends bqi> {
   Codec<cyq<?>> h = lp.t.q().dispatch(cyq::ap_, cyu::a);
   zj<ww, cyq<?>> i = zh.a(lq.Z).b(cyq::ap_, cyu::b);

   boolean a(C var1, dbt var2);

   cuk a(C var1, jk.a var2);

   boolean a(int var1, int var2);

   cuk a(jk.a var1);

   default jr<cuk> a(C $$0) {
      jr<cuk> $$1 = jr.a($$0.b(), cuk.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuf $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cuk($$3.u()));
         }
      }

      return $$1;
   }

   default jr<cyn> a() {
      return jr.a();
   }

   default boolean ao_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cuk g() {
      return new cuk(dew.cA);
   }

   cyu<?> ap_();

   cyv<?> e();

   default boolean i() {
      jr<cyn> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
