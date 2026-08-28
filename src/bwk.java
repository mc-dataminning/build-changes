import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum bwk implements bai {
   a(bwk.a.a, 0, 0, "mainhand"),
   b(bwk.a.a, 1, 5, "offhand"),
   c(bwk.a.b, 0, 1, 1, "feet"),
   d(bwk.a.b, 1, 1, 2, "legs"),
   e(bwk.a.b, 2, 1, 3, "chest"),
   f(bwk.a.b, 3, 1, 4, "head"),
   g(bwk.a.c, 0, 1, 6, "body"),
   h(bwk.a.d, 0, 1, 7, "saddle");

   public static final int i = 0;
   public static final List<bwk> j = List.of(values());
   public static final IntFunction<bwk> k = aya.a($$0 -> $$0.q, values(), aya.a.a);
   public static final bai.a<bwk> l = bai.a(bwk::values);
   public static final yu<ByteBuf, bwk> m = ys.a(k, $$0 -> $$0.q);
   private final bwk.a n;
   private final int o;
   private final int p;
   private final int q;
   private final String r;

   private bwk(final bwk.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   private bwk(final bwk.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public bwk.a a() {
      return this.n;
   }

   public int b() {
      return this.o;
   }

   public int a(int $$0) {
      return $$0 + this.o;
   }

   public cys a(cys $$0) {
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
      return this.n == bwk.a.b || this.n == bwk.a.c;
   }

   @Override
   public String c() {
      return this.r;
   }

   public boolean g() {
      return this.n != bwk.a.d;
   }

   public static bwk a(String $$0) {
      bwk $$1 = l.a($$0);
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
