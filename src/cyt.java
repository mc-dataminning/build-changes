import com.mojang.serialization.Codec;

public interface cyt<C extends bql> {
   Codec<cyt<?>> h = lp.t.q().dispatch(cyt::ap_, cyx::a);
   zm<wz, cyt<?>> i = zk.a(lq.Z).b(cyt::ap_, cyx::b);

   boolean a(C var1, dbw var2);

   cun a(C var1, jk.a var2);

   boolean a(int var1, int var2);

   cun a(jk.a var1);

   default jr<cun> a(C $$0) {
      jr<cun> $$1 = jr.a($$0.b(), cun.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cui $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cun($$3.u()));
         }
      }

      return $$1;
   }

   default jr<cyq> a() {
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

   default cun g() {
      return new cun(dez.cA);
   }

   cyx<?> ap_();

   cyy<?> e();

   default boolean i() {
      jr<cyq> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
