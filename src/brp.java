import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum brp implements ayt {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bro.a),
   c(2, "offhand", bro.b),
   d(3, "hand", $$0 -> $$0.a() == bro.a.a),
   e(4, "feet", bro.c),
   f(5, "legs", bro.d),
   g(6, "chest", bro.e),
   h(7, "head", bro.f),
   i(8, "armor", bro::f);

   public static final IntFunction<brp> j = awq.a($$0 -> $$0.m, values(), awq.a.a);
   public static final Codec<brp> k = ayt.a(brp::values);
   public static final ys<ByteBuf, brp> l = yq.a(j, $$0 -> $$0.m);
   private final int m;
   private final String n;
   private final Predicate<bro> o;

   private brp(int $$0, String $$1, Predicate<bro> $$2) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
   }

   private brp(int $$0, String $$1, bro $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   @Override
   public String c() {
      return this.n;
   }

   public boolean a(bro $$0) {
      return this.o.test($$0);
   }
}
