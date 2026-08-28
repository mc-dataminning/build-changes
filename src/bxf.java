import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum bxf implements bao {
   a(bxf.a.a, 0, 0, "mainhand"),
   b(bxf.a.a, 1, 5, "offhand"),
   c(bxf.a.b, 0, 1, 1, "feet"),
   d(bxf.a.b, 1, 1, 2, "legs"),
   e(bxf.a.b, 2, 1, 3, "chest"),
   f(bxf.a.b, 3, 1, 4, "head"),
   g(bxf.a.c, 0, 1, 6, "body"),
   h(bxf.a.d, 0, 1, 7, "saddle");

   public static final int i = 0;
   public static final List<bxf> j = List.of(values());
   public static final IntFunction<bxf> k = ayg.a($$0 -> $$0.q, values(), ayg.a.a);
   public static final bao.a<bxf> l = bao.a(bxf::values);
   public static final za<ByteBuf, bxf> m = yy.a(k, $$0 -> $$0.q);
   private final bxf.a n;
   private final int o;
   private final int p;
   private final int q;
   private final String r;

   private bxf(final bxf.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   private bxf(final bxf.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public bxf.a a() {
      return this.n;
   }

   public int b() {
      return this.o;
   }

   public int a(int $$0) {
      return $$0 + this.o;
   }

   public daa a(daa $$0) {
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
      return this.n == bxf.a.b || this.n == bxf.a.c;
   }

   @Override
   public String c() {
      return this.r;
   }

   public boolean g() {
      return this.n != bxf.a.d;
   }

   public static bxf a(String $$0) {
      bxf $$1 = l.a($$0);
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
