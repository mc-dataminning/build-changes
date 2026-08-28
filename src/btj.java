import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record btj(cu d) {
   public static final btj a = new btj(cu.a.a().b());
   public static final Codec<btj> b = cu.a.xmap(btj::new, btj::a);
   public static final String c = "lock";

   public boolean a(cxo $$0) {
      return this.d.a($$0);
   }

   public void a(ux $$0, js.a $$1) {
      if (this != a) {
         DataResult<vu> $$2 = b.encode(this, $$1.a(vl.a), new ux());
         $$2.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static btj b(ux $$0, js.a $$1) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<btj, vu>> $$2 = b.decode($$1.a(vl.a), $$0.c("lock"));
         if ($$2.isSuccess()) {
            return (btj)((Pair)$$2.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cu a() {
      return this.d;
   }
}
