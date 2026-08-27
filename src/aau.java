import java.util.Set;

public class aau implements wu<yo> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;
   private final Set<bmj> f;
   private final int g;

   public aau(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bmj> $$5, int $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public aau(ue $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = bmj.a($$0.readUnsignedByte());
      this.g = $$0.n();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(bmj.a(this.f));
      $$0.c(this.g);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public double a() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public int h() {
      return this.g;
   }

   public Set<bmj> i() {
      return this.f;
   }
}
