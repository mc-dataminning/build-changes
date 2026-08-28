import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record flv(int i, int j, flv.a k, flv.b l, int m) {
   public static final int a = 32;
   private static final flv[] n = new flv[32];
   private static final List<flv> o = new ArrayList<>(32);
   public static final flv b = a(0, 0, flv.a.a, flv.b.a, 3);
   public static final flv c = a(1, 0, flv.a.b, flv.b.c, 4);
   public static final flv d = a(2, 0, flv.a.a, flv.b.d, 2);
   public static final flv e = d;
   public static final flv f = a(3, 1, flv.a.e, flv.b.d, 2);
   public static final flv g = a(4, 2, flv.a.e, flv.b.d, 2);
   public static final flv h = a(5, 0, flv.a.c, flv.b.b, 3);

   public flv(int i, int j, flv.a k, flv.b l, int m) {
      if (i < 0 || i >= n.length) {
         throw new IllegalArgumentException("Element ID must be in range [0; " + n.length + ")");
      } else if (!this.a(j, l)) {
         throw new IllegalStateException("Multiple vertex elements of the same type other than UVs are not supported");
      } else {
         this.i = i;
         this.j = j;
         this.k = k;
         this.l = l;
         this.m = m;
      }
   }

   public static flv a(int $$0, int $$1, flv.a $$2, flv.b $$3, int $$4) {
      flv $$5 = new flv($$0, $$1, $$2, $$3, $$4);
      if (n[$$0] != null) {
         throw new IllegalArgumentException("Duplicate element registration for: " + $$0);
      } else {
         n[$$0] = $$5;
         o.add($$5);
         return $$5;
      }
   }

   private boolean a(int $$0, flv.b $$1) {
      return $$0 == 0 || $$1 == flv.b.d;
   }

   @Override
   public String toString() {
      return this.m + "," + this.l + "," + this.k + " (" + this.i + ")";
   }

   public int a() {
      return 1 << this.i;
   }

   public int b() {
      return this.k.a() * this.m;
   }

   @Nullable
   public static flv a(int $$0) {
      return n[$$0];
   }

   public static Stream<flv> b(int $$0) {
      return o.stream().filter($$1 -> $$1 != null && ($$0 & $$1.a()) != 0);
   }

   public int c() {
      return this.i;
   }

   public int d() {
      return this.j;
   }

   public flv.a e() {
      return this.k;
   }

   public flv.b f() {
      return this.l;
   }

   public int g() {
      return this.m;
   }

   public static enum a {
      a(4, "Float"),
      b(1, "Unsigned Byte"),
      c(1, "Byte"),
      d(2, "Unsigned Short"),
      e(2, "Short"),
      f(4, "Unsigned Int"),
      g(4, "Int");

      private final int h;
      private final String i;

      private a(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      @Override
      public String toString() {
         return this.i;
      }
   }

   public static enum b {
      a("Position"),
      b("Normal"),
      c("Vertex Color"),
      d("UV"),
      e("Generic");

      private final String f;

      private b(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String toString() {
         return this.f;
      }
   }
}
