import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum bwn implements bak {
   a(bwn.a.a, 0, 0, "mainhand"),
   b(bwn.a.a, 1, 5, "offhand"),
   c(bwn.a.b, 0, 1, 1, "feet"),
   d(bwn.a.b, 1, 1, 2, "legs"),
   e(bwn.a.b, 2, 1, 3, "chest"),
   f(bwn.a.b, 3, 1, 4, "head"),
   g(bwn.a.c, 0, 1, 6, "body"),
   h(bwn.a.d, 0, 1, 7, "saddle");

   public static final int i = 0;
   public static final List<bwn> j = List.of(values());
   public static final IntFunction<bwn> k = ayc.a($$0 -> $$0.q, values(), ayc.a.a);
   public static final bak.a<bwn> l = bak.a(bwn::values);
   public static final yw<ByteBuf, bwn> m = yu.a(k, $$0 -> $$0.q);
   private final bwn.a n;
   private final int o;
   private final int p;
   private final int q;
   private final String r;

   private bwn(final bwn.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   private bwn(final bwn.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public bwn.a a() {
      return this.n;
   }

   public int b() {
      return this.o;
   }

   public int a(int $$0) {
      return $$0 + this.o;
   }

   public cyy a(cyy $$0) {
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
      return this.n == bwn.a.b || this.n == bwn.a.c;
   }

   @Override
   public String c() {
      return this.r;
   }

   public boolean g() {
      return this.n != bwn.a.d;
   }

   public static bwn a(String $$0) {
      bwn $$1 = l.a($$0);
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
