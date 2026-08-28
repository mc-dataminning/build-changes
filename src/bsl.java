import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record bsl(cv d) {
   public static final bsl a = new bsl(cv.a.a().b());
   public static final Codec<bsl> b = cv.a.xmap(bsl::new, bsl::a);
   public static final String c = "lock";

   public boolean a(cwp $$0) {
      return this.d.a($$0);
   }

   public void a(tq $$0, jt.a $$1) {
      if (this != a) {
         DataResult<un> $$2 = b.encode(this, $$1.a(ue.a), new tq());
         $$2.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static bsl b(tq $$0, jt.a $$1) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<bsl, un>> $$2 = b.decode($$1.a(ue.a), $$0.c("lock"));
         if ($$2.isSuccess()) {
            return (bsl)((Pair)$$2.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cv a() {
      return this.d;
   }
}
