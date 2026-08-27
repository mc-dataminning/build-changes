import com.mojang.serialization.Codec;

public interface cza<C extends bpt> {
   Codec<cza<?>> h = lh.t.q().dispatch(cza::ao_, cze::a);
   zc<wp, cza<?>> i = za.a(li.Z).b(cza::ao_, cze::b);

   boolean a(C var1, dca var2);

   cuh a(C var1, jc.a var2);

   boolean a(int var1, int var2);

   cuh a(jc.a var1);

   default jj<cuh> a(C $$0) {
      jj<cuh> $$1 = jj.a($$0.b(), cuh.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuc $$3 = $$0.a($$2).f();
         if ($$3.u()) {
            $$1.set($$2, new cuh($$3.t()));
         }
      }

      return $$1;
   }

   default jj<cyv> a() {
      return jj.a();
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

   default cuh g() {
      return new cuh(dfe.dl);
   }

   cze<?> ao_();

   czf<?> e();

   default boolean i() {
      jj<cyv> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
