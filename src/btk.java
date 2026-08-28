import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record btk(cu d) {
   public static final btk a = new btk(cu.a.a().b());
   public static final Codec<btk> b = cu.a.xmap(btk::new, btk::a);
   public static final String c = "lock";

   public boolean a(cxp $$0) {
      return this.d.a($$0);
   }

   public void a(ux $$0, js.a $$1) {
      if (this != a) {
         DataResult<vu> $$2 = b.encode(this, $$1.a(vl.a), new ux());
         $$2.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static btk b(ux $$0, js.a $$1) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<btk, vu>> $$2 = b.decode($$1.a(vl.a), $$0.c("lock"));
         if ($$2.isSuccess()) {
            return (btk)((Pair)$$2.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cu a() {
      return this.d;
   }
}
