import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum bxd implements bam {
   a(bxd.a.a, 0, 0, "mainhand"),
   b(bxd.a.a, 1, 5, "offhand"),
   c(bxd.a.b, 0, 1, 1, "feet"),
   d(bxd.a.b, 1, 1, 2, "legs"),
   e(bxd.a.b, 2, 1, 3, "chest"),
   f(bxd.a.b, 3, 1, 4, "head"),
   g(bxd.a.c, 0, 1, 6, "body"),
   h(bxd.a.d, 0, 1, 7, "saddle");

   public static final int i = 0;
   public static final List<bxd> j = List.of(values());
   public static final IntFunction<bxd> k = aye.a($$0 -> $$0.q, values(), aye.a.a);
   public static final bam.a<bxd> l = bam.a(bxd::values);
   public static final yy<ByteBuf, bxd> m = yw.a(k, $$0 -> $$0.q);
   private final bxd.a n;
   private final int o;
   private final int p;
   private final int q;
   private final String r;

   private bxd(final bxd.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   private bxd(final bxd.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public bxd.a a() {
      return this.n;
   }

   public int b() {
      return this.o;
   }

   public int a(int $$0) {
      return $$0 + this.o;
   }

   public czy a(czy $$0) {
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
      return this.n == bxd.a.b || this.n == bxd.a.c;
   }

   @Override
   public String c() {
      return this.r;
   }

   public boolean g() {
      return this.n != bxd.a.d;
   }

   public static bxd a(String $$0) {
      bxd $$1 = l.a($$0);
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
