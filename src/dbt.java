import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record dbt(cye<cyw> c) implements dci {
   public static final Codec<dbt> a = cye.a(mg.aU, cyw.c).xmap(dbt::new, dbt::a);
   public static final yw<wj, dbt> b = cye.a(mg.aU, cyw.d).a(dbt::new, dbt::a);

   public dbt(je<cyw> $$0) {
      this(new cye<>($$0));
   }

   @Deprecated
   public dbt(alf<cyw> $$0) {
      this(new cye<>($$0));
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      jg.a $$4 = $$0.a();
      if ($$4 != null) {
         Optional<je<cyw>> $$5 = this.a($$4);
         if ($$5.isPresent()) {
            xm $$6 = $$5.get().a().d().f();
            xb.a($$6, xv.a.a(n.h));
            $$1.accept($$6);
         }
      }
   }

   public Optional<je<cyw>> a(jg.a $$0) {
      return this.c.a($$0);
   }

   public cye<cyw> a() {
      return this.c;
   }
}
