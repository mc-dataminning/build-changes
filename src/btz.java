import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record btz(cl d) {
   public static final btz a = new btz(cl.a.a().b());
   public static final Codec<btz> b = cl.a.xmap(btz::new, btz::a);
   public static final String c = "lock";

   public boolean a(cys $$0) {
      return this.d.a($$0);
   }

   public void a(tx $$0, jg.a $$1) {
      if (this != a) {
         DataResult<uu> $$2 = b.encode(this, $$1.a(ul.a), new tx());
         $$2.result().ifPresent($$1x -> $$0.a("lock", $$1x));
      }
   }

   public static btz b(tx $$0, jg.a $$1) {
      if ($$0.b("lock", 10)) {
         DataResult<Pair<btz, uu>> $$2 = b.decode($$1.a(ul.a), $$0.c("lock"));
         if ($$2.isSuccess()) {
            return (btz)((Pair)$$2.getOrThrow()).getFirst();
         }
      }

      return a;
   }

   public cl a() {
      return this.d;
   }
}
