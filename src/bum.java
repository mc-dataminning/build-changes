import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum bum implements bag {
   a(bum.a.a, 0, 0, "mainhand"),
   b(bum.a.a, 1, 5, "offhand"),
   c(bum.a.b, 0, 1, 1, "feet"),
   d(bum.a.b, 1, 1, 2, "legs"),
   e(bum.a.b, 2, 1, 3, "chest"),
   f(bum.a.b, 3, 1, 4, "head"),
   g(bum.a.c, 0, 1, 6, "body");

   public static final int h = 0;
   public static final List<bum> i = List.of(values());
   public static final IntFunction<bum> j = ayb.a($$0 -> $$0.p, values(), ayb.a.a);
   public static final bag.a<bum> k = bag.a(bum::values);
   public static final zg<ByteBuf, bum> l = ze.a(j, $$0 -> $$0.p);
   private final bum.a m;
   private final int n;
   private final int o;
   private final int p;
   private final String q;

   private bum(final bum.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
   }

   private bum(final bum.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public bum.a a() {
      return this.m;
   }

   public int b() {
      return this.n;
   }

   public int a(int $$0) {
      return $$0 + this.n;
   }

   public cwb a(cwb $$0) {
      return this.o > 0 ? $$0.a(this.o) : $$0;
   }

   public int d() {
      return this.p;
   }

   public int b(int $$0) {
      return this.p + $$0;
   }

   public String e() {
      return this.q;
   }

   public boolean f() {
      return this.m == bum.a.b || this.m == bum.a.c;
   }

   @Override
   public String c() {
      return this.q;
   }

   public static bum a(String $$0) {
      bum $$1 = k.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static enum a {
      a,
      b,
      c;
   }
}
