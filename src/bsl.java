import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record bsl(cu d) {
   public static final bsl a = new bsl(cu.a.a().b());
   public static final Codec<bsl> b = cu.a.xmap(bsl::new, bsl::a);
   public static final String c = "lock";

   public boolean a(cwm $$0) {
      return this.d.a($$0);
   }

   public void a(ul $$0) {
      if (this != a) {
         DataResult<vi> $$1 = b.encode(this, uz.a, new ul());
         $$1.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static bsl b(ul $$0) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<bsl, vi>> $$1 = b.decode(uz.a, $$0.c("lock"));
         if ($$1.isSuccess()) {
            return (bsl)((Pair)$$1.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cu a() {
      return this.d;
   }
}
