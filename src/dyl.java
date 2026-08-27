import java.util.Objects;
import javax.annotation.Nullable;

public class dyl {
   private final dyl.a a;
   private final byte b;
   private final byte c;
   private final byte d;
   @Nullable
   private final sw e;

   public dyl(dyl.a $$0, byte $$1, byte $$2, byte $$3, @Nullable sw $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public byte a() {
      return this.a.a();
   }

   public dyl.a b() {
      return this.a;
   }

   public byte c() {
      return this.b;
   }

   public byte d() {
      return this.c;
   }

   public byte e() {
      return this.d;
   }

   public boolean f() {
      return this.a.b();
   }

   @Nullable
   public sw g() {
      return this.e;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof dyl $$1) ? false : this.a == $$1.a && this.d == $$1.d && this.b == $$1.b && this.c == $$1.c && Objects.equals(this.e, $$1.e);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.a();
      $$0 = 31 * $$0 + this.b;
      $$0 = 31 * $$0 + this.c;
      $$0 = 31 * $$0 + this.d;
      return 31 * $$0 + Objects.hashCode(this.e);
   }

   public static enum a {
      a(false, true),
      b(true, true),
      c(false, true),
      d(false, true),
      e(true, false),
      f(true, false),
      g(false, true),
      h(false, true),
      i(true, 5393476, false),
      j(true, 3830373, false),
      k(true, true),
      l(true, true),
      m(true, true),
      n(true, true),
      o(true, true),
      p(true, true),
      q(true, true),
      r(true, true),
      s(true, true),
      t(true, true),
      u(true, true),
      v(true, true),
      w(true, true),
      x(true, true),
      y(true, true),
      z(true, true),
      A(true, false);

      private final byte B;
      private final boolean C;
      private final int D;
      private final boolean E;

      private a(boolean $$0, boolean $$1) {
         this($$0, -1, $$1);
      }

      private a(boolean $$0, int $$1, boolean $$2) {
         this.E = $$2;
         this.B = (byte)this.ordinal();
         this.C = $$0;
         this.D = $$1;
      }

      public byte a() {
         return this.B;
      }

      public boolean b() {
         return this.C;
      }

      public boolean c() {
         return this.D >= 0;
      }

      public int d() {
         return this.D;
      }

      public static dyl.a a(byte $$0) {
         return values()[apa.a($$0, 0, values().length - 1)];
      }

      public boolean e() {
         return this.E;
      }
   }
}
