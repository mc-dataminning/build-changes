import com.mojang.serialization.Codec;

public interface cyx<T extends cza> {
   Codec<cyx<?>> h = lt.r.r().dispatch(cyx::ap_, czc::a);
   yw<wj, cyx<?>> i = yu.a(lu.ae).b(cyx::ap_, czc::b);

   boolean a(T var1, dcu var2);

   cuo a(T var1, jo.a var2);

   boolean a(int var1, int var2);

   cuo a(jo.a var1);

   default jv<cuo> a(T $$0) {
      jv<cuo> $$1 = jv.a($$0.a(), cuo.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuj $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cuo($$3.u()));
         }
      }

      return $$1;
   }

   default jv<cyu> a() {
      return jv.a();
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

   default cuo g() {
      return new cuo(dfy.cA);
   }

   czc<?> ap_();

   czd<?> e();

   default boolean i() {
      jv<cyu> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
