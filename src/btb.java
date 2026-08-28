import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record btb(cu d) {
   public static final btb a = new btb(cu.a.a().b());
   public static final Codec<btb> b = cu.a.xmap(btb::new, btb::a);
   public static final String c = "lock";

   public boolean a(cxg $$0) {
      return this.d.a($$0);
   }

   public void a(um $$0, js.a $$1) {
      if (this != a) {
         DataResult<vj> $$2 = b.encode(this, $$1.a(va.a), new um());
         $$2.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static btb b(um $$0, js.a $$1) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<btb, vj>> $$2 = b.decode($$1.a(va.a), $$0.c("lock"));
         if ($$2.isSuccess()) {
            return (btb)((Pair)$$2.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cu a() {
      return this.d;
   }
}
