import com.mojang.blaze3d.platform.GlStateManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record fex(int i, int j, fex.a k, fex.b l, int m) {
   public static final int a = 32;
   private static final fex[] n = new fex[32];
   private static final List<fex> o = new ArrayList<>(32);
   public static final fex b = a(0, 0, fex.a.a, fex.b.a, 3);
   public static final fex c = a(1, 0, fex.a.b, fex.b.c, 4);
   public static final fex d = a(2, 0, fex.a.a, fex.b.d, 2);
   public static final fex e = d;
   public static final fex f = a(3, 1, fex.a.e, fex.b.d, 2);
   public static final fex g = a(4, 2, fex.a.e, fex.b.d, 2);
   public static final fex h = a(5, 0, fex.a.c, fex.b.b, 3);

   public fex(int i, int j, fex.a k, fex.b l, int m) {
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

   public static fex a(int $$0, int $$1, fex.a $$2, fex.b $$3, int $$4) {
      fex $$5 = new fex($$0, $$1, $$2, $$3, $$4);
      if (n[$$0] != null) {
         throw new IllegalArgumentException("Duplicate element registration for: " + $$0);
      } else {
         n[$$0] = $$5;
         o.add($$5);
         return $$5;
      }
   }

   private boolean a(int $$0, fex.b $$1) {
      return $$0 == 0 || $$1 == fex.b.d;
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

   public void a(int $$0, long $$1, int $$2) {
      this.l.g.setupBufferState(this.m, this.k.b(), $$2, $$1, $$0);
   }

   @Nullable
   public static fex a(int $$0) {
      return n[$$0];
   }

   public static Stream<fex> b(int $$0) {
      return o.stream().filter($$1 -> $$1 != null && ($$0 & $$1.a()) != 0);
   }

   public int c() {
      return this.i;
   }

   public int d() {
      return this.j;
   }

   public fex.a e() {
      return this.k;
   }

   public fex.b f() {
      return this.l;
   }

   public int g() {
      return this.m;
   }

   public static enum a {
      a(4, "Float", 5126),
      b(1, "Unsigned Byte", 5121),
      c(1, "Byte", 5120),
      d(2, "Unsigned Short", 5123),
      e(2, "Short", 5122),
      f(4, "Unsigned Int", 5125),
      g(4, "Int", 5124);

      private final int h;
      private final String i;
      private final int j;

      private a(final int $$0, final String $$1, final int $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public int a() {
         return this.h;
      }

      public int b() {
         return this.j;
      }

      @Override
      public String toString() {
         return this.i;
      }
   }

   public static enum b {
      a("Position", ($$0, $$1, $$2, $$3, $$4) -> GlStateManager._vertexAttribPointer($$4, $$0, $$1, false, $$2, $$3)),
      b("Normal", ($$0, $$1, $$2, $$3, $$4) -> GlStateManager._vertexAttribPointer($$4, $$0, $$1, true, $$2, $$3)),
      c("Vertex Color", ($$0, $$1, $$2, $$3, $$4) -> GlStateManager._vertexAttribPointer($$4, $$0, $$1, true, $$2, $$3)),
      d("UV", ($$0, $$1, $$2, $$3, $$4) -> {
         if ($$1 == 5126) {
            GlStateManager._vertexAttribPointer($$4, $$0, $$1, false, $$2, $$3);
         } else {
            GlStateManager._vertexAttribIPointer($$4, $$0, $$1, $$2, $$3);
         }
      }),
      e("Generic", ($$0, $$1, $$2, $$3, $$4) -> GlStateManager._vertexAttribPointer($$4, $$0, $$1, false, $$2, $$3));

      private final String f;
      final fex.b.a g;

      private b(final String $$0, final fex.b.a $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String toString() {
         return this.f;
      }

      @FunctionalInterface
      interface a {
         void setupBufferState(int var1, int var2, int var3, long var4, int var6);
      }
   }
}
