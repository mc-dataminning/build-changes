import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum bxo implements bax {
   a(bxo.a.a, 0, 0, "mainhand"),
   b(bxo.a.a, 1, 5, "offhand"),
   c(bxo.a.b, 0, 1, 1, "feet"),
   d(bxo.a.b, 1, 1, 2, "legs"),
   e(bxo.a.b, 2, 1, 3, "chest"),
   f(bxo.a.b, 3, 1, 4, "head"),
   g(bxo.a.c, 0, 1, 6, "body"),
   h(bxo.a.d, 0, 1, 7, "saddle");

   public static final int i = 0;
   public static final List<bxo> j = List.of(values());
   public static final IntFunction<bxo> k = ayo.a($$0 -> $$0.q, values(), ayo.a.a);
   public static final bax.a<bxo> l = bax.a(bxo::values);
   public static final ze<ByteBuf, bxo> m = zc.a(k, $$0 -> $$0.q);
   private final bxo.a n;
   private final int o;
   private final int p;
   private final int q;
   private final String r;

   private bxo(final bxo.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   private bxo(final bxo.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public bxo.a a() {
      return this.n;
   }

   public int b() {
      return this.o;
   }

   public int a(int $$0) {
      return $$0 + this.o;
   }

   public dak a(dak $$0) {
      return this.p > 0 ? $$0.a(this.p) : $$0;
   }

   public int d() {
      return this.q;
   }

   public int b(int $$0) {
      return this.q + $$0;
   }

   public String e() {
      return this.r;
   }

   public boolean f() {
      return this.n == bxo.a.b || this.n == bxo.a.c;
   }

   @Override
   public String c() {
      return this.r;
   }

   public boolean g() {
      return this.n != bxo.a.d;
   }

   public static bxo a(String $$0) {
      bxo $$1 = l.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
