import com.mojang.blaze3d.platform.GlStateManager;

public class eqg {
   private final eqg.a a;
   private final eqg.b b;
   private final int c;
   private final int d;
   private final int e;

   public eqg(int $$0, eqg.a $$1, eqg.b $$2, int $$3) {
      if (this.a($$0, $$2)) {
         this.b = $$2;
         this.a = $$1;
         this.c = $$0;
         this.d = $$3;
         this.e = $$1.a() * this.d;
      } else {
         throw new IllegalStateException("Multiple vertex elements of the same type other than UVs are not supported");
      }
   }

   private boolean a(int $$0, eqg.b $$1) {
      return $$0 == 0 || $$1 == eqg.b.d;
   }

   public final eqg.a a() {
      return this.a;
   }

   public final eqg.b b() {
      return this.b;
   }

   public final int c() {
      return this.d;
   }

   public final int d() {
      return this.c;
   }

   @Override
   public String toString() {
      return this.d + "," + this.b.a() + "," + this.a.b();
   }

   public final int e() {
      return this.e;
   }

   public final boolean f() {
      return this.b == eqg.b.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         eqg $$1 = (eqg)$$0;
         if (this.d != $$1.d) {
            return false;
         } else if (this.c != $$1.c) {
            return false;
         } else {
            return this.a != $$1.a ? false : this.b == $$1.b;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      $$0 = 31 * $$0 + this.c;
      return 31 * $$0 + this.d;
   }

   public void a(int $$0, long $$1, int $$2) {
      this.b.a(this.d, this.a.c(), $$2, $$1, this.c, $$0);
   }

   public void a(int $$0) {
      this.b.a(this.c, $$0);
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

      private a(int $$0, String $$1, int $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public int a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }

      public int c() {
         return this.j;
      }
   }

   public static enum b {
      a("Position", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         GlStateManager._enableVertexAttribArray($$5);
         GlStateManager._vertexAttribPointer($$5, $$0, $$1, false, $$2, $$3);
      }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1)),
      b("Normal", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         GlStateManager._enableVertexAttribArray($$5);
         GlStateManager._vertexAttribPointer($$5, $$0, $$1, true, $$2, $$3);
      }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1)),
      c("Vertex Color", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         GlStateManager._enableVertexAttribArray($$5);
         GlStateManager._vertexAttribPointer($$5, $$0, $$1, true, $$2, $$3);
      }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1)),
      d("UV", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         GlStateManager._enableVertexAttribArray($$5);
         if ($$1 == 5126) {
            GlStateManager._vertexAttribPointer($$5, $$0, $$1, false, $$2, $$3);
         } else {
            GlStateManager._vertexAttribIPointer($$5, $$0, $$1, $$2, $$3);
         }
      }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1)),
      e("Padding", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      }, ($$0, $$1) -> {
      }),
      f("Generic", ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         GlStateManager._enableVertexAttribArray($$5);
         GlStateManager._vertexAttribPointer($$5, $$0, $$1, false, $$2, $$3);
      }, ($$0, $$1) -> GlStateManager._disableVertexAttribArray($$1));

      private final String g;
      private final eqg.b.b h;
      private final eqg.b.a i;

      private b(String $$0, eqg.b.b $$1, eqg.b.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(int $$0, int $$1, int $$2, long $$3, int $$4, int $$5) {
         this.h.setupBufferState($$0, $$1, $$2, $$3, $$4, $$5);
      }

      public void a(int $$0, int $$1) {
         this.i.clearBufferState($$0, $$1);
      }

      public String a() {
         return this.g;
      }

      @FunctionalInterface
      interface a {
         void clearBufferState(int var1, int var2);
      }

      @FunctionalInterface
      interface b {
         void setupBufferState(int var1, int var2, int var3, long var4, int var6, int var7);
      }
   }
}
