import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record buc(cl d) {
   public static final buc a = new buc(cl.a.a().b());
   public static final Codec<buc> b = cl.a.xmap(buc::new, buc::a);
   public static final String c = "lock";

   public boolean a(cyy $$0) {
      return this.d.a($$0);
   }

   public void a(tz $$0, jg.a $$1) {
      if (this != a) {
         DataResult<uw> $$2 = b.encode(this, $$1.a(un.a), new tz());
         $$2.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static buc b(tz $$0, jg.a $$1) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<buc, uw>> $$2 = b.decode($$1.a(un.a), $$0.c("lock"));
         if ($$2.isSuccess()) {
            return (buc)((Pair)$$2.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cl a() {
      return this.d;
   }
}
