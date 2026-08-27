import javax.annotation.Nullable;

public class ect {
   public final int a;
   public final int b;
   public final int c;
   private final int m;
   public int d = -1;
   public float e;
   public float f;
   public float g;
   @Nullable
   public ect h;
   public boolean i;
   public float j;
   public float k;
   public ecr l = ecr.a;

   public ect(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.m = b($$0, $$1, $$2);
   }

   public ect a(int $$0, int $$1, int $$2) {
      ect $$3 = new ect($$0, $$1, $$2);
      $$3.d = this.d;
      $$3.e = this.e;
      $$3.f = this.f;
      $$3.g = this.g;
      $$3.h = this.h;
      $$3.i = this.i;
      $$3.j = this.j;
      $$3.k = this.k;
      $$3.l = this.l;
      return $$3;
   }

   public static int b(int $$0, int $$1, int $$2) {
      return $$1 & 0xFF | ($$0 & 32767) << 8 | ($$2 & 32767) << 24 | ($$0 < 0 ? Integer.MIN_VALUE : 0) | ($$2 < 0 ? 32768 : 0);
   }

   public float a(ect $$0) {
      float $$1 = (float)($$0.a - this.a);
      float $$2 = (float)($$0.b - this.b);
      float $$3 = (float)($$0.c - this.c);
      return ati.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public float b(ect $$0) {
      float $$1 = (float)($$0.a - this.a);
      float $$2 = (float)($$0.c - this.c);
      return ati.c($$1 * $$1 + $$2 * $$2);
   }

   public float a(ht $$0) {
      float $$1 = (float)($$0.u() - this.a);
      float $$2 = (float)($$0.v() - this.b);
      float $$3 = (float)($$0.w() - this.c);
      return ati.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public float c(ect $$0) {
      float $$1 = (float)($$0.a - this.a);
      float $$2 = (float)($$0.b - this.b);
      float $$3 = (float)($$0.c - this.c);
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public float b(ht $$0) {
      float $$1 = (float)($$0.u() - this.a);
      float $$2 = (float)($$0.v() - this.b);
      float $$3 = (float)($$0.w() - this.c);
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public float d(ect $$0) {
      float $$1 = (float)Math.abs($$0.a - this.a);
      float $$2 = (float)Math.abs($$0.b - this.b);
      float $$3 = (float)Math.abs($$0.c - this.c);
      return $$1 + $$2 + $$3;
   }

   public float c(ht $$0) {
      float $$1 = (float)Math.abs($$0.u() - this.a);
      float $$2 = (float)Math.abs($$0.v() - this.b);
      float $$3 = (float)Math.abs($$0.w() - this.c);
      return $$1 + $$2 + $$3;
   }

   public ht a() {
      return new ht(this.a, this.b, this.c);
   }

   public eji b() {
      return new eji((double)this.a, (double)this.b, (double)this.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof ect $$1) ? false : this.m == $$1.m && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
   }

   @Override
   public int hashCode() {
      return this.m;
   }

   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public String toString() {
      return "Node{x=" + this.a + ", y=" + this.b + ", z=" + this.c + "}";
   }

   public void a(tu $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      $$0.p(this.c);
      $$0.a(this.j);
      $$0.a(this.k);
      $$0.a(this.i);
      $$0.a(this.l);
      $$0.a(this.g);
   }

   public static ect b(tu $$0) {
      ect $$1 = new ect($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }

   protected static void a(tu $$0, ect $$1) {
      $$1.j = $$0.readFloat();
      $$1.k = $$0.readFloat();
      $$1.i = $$0.readBoolean();
      $$1.l = $$0.b(ecr.class);
      $$1.g = $$0.readFloat();
   }
}
