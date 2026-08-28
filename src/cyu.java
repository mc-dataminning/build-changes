import com.mojang.serialization.Codec;

public interface cyu<C extends bqm> {
   Codec<cyu<?>> h = lp.t.q().dispatch(cyu::ao_, cyy::a);
   zm<wz, cyu<?>> i = zk.a(lq.Z).b(cyu::ao_, cyy::b);

   boolean a(C var1, dbx var2);

   cuo a(C var1, jk.a var2);

   boolean a(int var1, int var2);

   cuo a(jk.a var1);

   default jr<cuo> a(C $$0) {
      jr<cuo> $$1 = jr.a($$0.b(), cuo.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuj $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cuo($$3.u()));
         }
      }

      return $$1;
   }

   default jr<cyr> a() {
      return jr.a();
   }

   default boolean an_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cuo g() {
      return new cuo(dfa.cA);
   }

   cyy<?> ao_();

   cyz<?> e();

   default boolean i() {
      jr<cyr> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
