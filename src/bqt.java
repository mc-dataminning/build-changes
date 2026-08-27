import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bqt implements ayq {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bqs.a),
   c(2, "offhand", bqs.b),
   d(3, "hand", $$0 -> $$0.a() == bqs.a.a),
   e(4, "feet", bqs.c),
   f(5, "legs", bqs.d),
   g(6, "chest", bqs.e),
   h(7, "head", bqs.f),
   i(8, "armor", bqs::f);

   public static final IntFunction<bqt> j = awn.a($$0 -> $$0.m, values(), awn.a.a);
   public static final Codec<bqt> k = ayq.a(bqt::values);
   public static final yq<ByteBuf, bqt> l = yo.a(j, $$0 -> $$0.m);
   private final int m;
   private final String n;
   private final Predicate<bqs> o;

   private bqt(int $$0, String $$1, Predicate<bqs> $$2) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
   }

   private bqt(int $$0, String $$1, bqs $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   @Override
   public String c() {
      return this.n;
   }

   public boolean a(bqs $$0) {
      return this.o.test($$0);
   }
}
