import com.mojang.serialization.Codec;

public interface cyx<C extends bqp> {
   Codec<cyx<?>> h = lp.t.q().dispatch(cyx::ao_, czb::a);
   zn<xa, cyx<?>> i = zl.a(lq.Z).b(cyx::ao_, czb::b);

   boolean a(C var1, dca var2);

   cur a(C var1, jk.a var2);

   boolean a(int var1, int var2);

   cur a(jk.a var1);

   default jr<cur> a(C $$0) {
      jr<cur> $$1 = jr.a($$0.b(), cur.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cum $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cur($$3.u()));
         }
      }

      return $$1;
   }

   default jr<cyu> a() {
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

   default cur g() {
      return new cur(dfd.cA);
   }

   czb<?> ao_();

   czc<?> e();

   default boolean i() {
      jr<cyu> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
