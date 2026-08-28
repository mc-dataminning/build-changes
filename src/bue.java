import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record bue(cl d) {
   public static final bue a = new bue(cl.a.a().b());
   public static final Codec<bue> b = cl.a.xmap(bue::new, bue::a);
   public static final String c = "lock";

   public boolean a(czd $$0) {
      return this.d.a($$0);
   }

   public void a(tz $$0, jg.a $$1) {
      if (this != a) {
         DataResult<uw> $$2 = b.encode(this, $$1.a(un.a), new tz());
         $$2.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static bue b(tz $$0, jg.a $$1) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<bue, uw>> $$2 = b.decode($$1.a(un.a), $$0.c("lock"));
         if ($$2.isSuccess()) {
            return (bue)((Pair)$$2.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cl a() {
      return this.d;
   }
}
