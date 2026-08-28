import com.mojang.serialization.Codec;

public interface cyv<C extends bqn> {
   Codec<cyv<?>> h = lp.t.q().dispatch(cyv::ao_, cyz::a);
   zn<xa, cyv<?>> i = zl.a(lq.Z).b(cyv::ao_, cyz::b);

   boolean a(C var1, dby var2);

   cup a(C var1, jk.a var2);

   boolean a(int var1, int var2);

   cup a(jk.a var1);

   default jr<cup> a(C $$0) {
      jr<cup> $$1 = jr.a($$0.b(), cup.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuk $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cup($$3.u()));
         }
      }

      return $$1;
   }

   default jr<cys> a() {
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

   default cup g() {
      return new cup(dfb.cA);
   }

   cyz<?> ao_();

   cza<?> e();

   default boolean i() {
      jr<cys> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
