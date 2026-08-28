import com.mojang.serialization.Codec;

public interface cyw<C extends bqo> {
   Codec<cyw<?>> h = lp.t.q().dispatch(cyw::ao_, cza::a);
   zn<xa, cyw<?>> i = zl.a(lq.Z).b(cyw::ao_, cza::b);

   boolean a(C var1, dbz var2);

   cuq a(C var1, jk.a var2);

   boolean a(int var1, int var2);

   cuq a(jk.a var1);

   default jr<cuq> a(C $$0) {
      jr<cuq> $$1 = jr.a($$0.b(), cuq.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cul $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cuq($$3.u()));
         }
      }

      return $$1;
   }

   default jr<cyt> a() {
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

   default cuq g() {
      return new cuq(dfc.cA);
   }

   cza<?> ao_();

   czb<?> e();

   default boolean i() {
      jr<cyt> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
