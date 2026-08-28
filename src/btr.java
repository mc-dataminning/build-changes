import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record btr(cv d) {
   public static final btr a = new btr(cv.a.a().b());
   public static final Codec<btr> b = cv.a.xmap(btr::new, btr::a);
   public static final String c = "lock";

   public boolean a(cxy $$0) {
      return this.d.a($$0);
   }

   public void a(tw $$0, ju.a $$1) {
      if (this != a) {
         DataResult<ut> $$2 = b.encode(this, $$1.a(uk.a), new tw());
         $$2.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static btr b(tw $$0, ju.a $$1) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<btr, ut>> $$2 = b.decode($$1.a(uk.a), $$0.c("lock"));
         if ($$2.isSuccess()) {
            return (btr)((Pair)$$2.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cv a() {
      return this.d;
   }
}
