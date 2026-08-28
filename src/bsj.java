import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record bsj(cv d) {
   public static final bsj a = new bsj(cv.a.a().b());
   public static final Codec<bsj> b = cv.a.xmap(bsj::new, bsj::a);
   public static final String c = "lock";

   public boolean a(cwn $$0) {
      return this.d.a($$0);
   }

   public void a(tq $$0, jt.a $$1) {
      if (this != a) {
         DataResult<un> $$2 = b.encode(this, $$1.a(ue.a), new tq());
         $$2.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static bsj b(tq $$0, jt.a $$1) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<bsj, un>> $$2 = b.decode($$1.a(ue.a), $$0.c("lock"));
         if ($$2.isSuccess()) {
            return (bsj)((Pair)$$2.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cv a() {
      return this.d;
   }
}
