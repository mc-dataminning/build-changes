import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bqi implements ayg {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bqh.a),
   c(2, "offhand", bqh.b),
   d(3, "hand", $$0 -> $$0.a() == bqh.a.a),
   e(4, "feet", bqh.c),
   f(5, "legs", bqh.d),
   g(6, "chest", bqh.e),
   h(7, "head", bqh.f),
   i(8, "armor", bqh::f);

   public static final IntFunction<bqi> j = awd.a($$0 -> $$0.m, values(), awd.a.a);
   public static final Codec<bqi> k = ayg.a(bqi::values);
   public static final yg<ByteBuf, bqi> l = ye.a(j, $$0 -> $$0.m);
   private final int m;
   private final String n;
   private final Predicate<bqh> o;

   private bqi(int $$0, String $$1, Predicate<bqh> $$2) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
   }

   private bqi(int $$0, String $$1, bqh $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   @Override
   public String c() {
      return this.n;
   }

   public boolean a(bqh $$0) {
      return this.o.test($$0);
   }
}
