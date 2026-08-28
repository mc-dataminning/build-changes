import java.util.Set;

public class aeq implements zw<aci> {
   public static final zn<wm, aeq> a = zw.a(aeq::a, aeq::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;
   private final Set<bue> g;
   private final int h;

   public aeq(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bue> $$5, int $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private aeq(wm $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = bue.a($$0.readUnsignedByte());
      this.h = $$0.l();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.k(bue.a(this.g));
      $$0.c(this.h);
   }

   @Override
   public zy<aeq> a() {
      return agu.ah;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public int i() {
      return this.h;
   }

   public Set<bue> j() {
      return this.g;
   }
}
