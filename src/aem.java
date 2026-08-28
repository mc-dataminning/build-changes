import java.util.Set;

public class aem implements zs<ace> {
   public static final zj<wl, aem> a = zs.a(aem::a, aem::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;
   private final Set<bty> g;
   private final int h;

   public aem(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bty> $$5, int $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   private aem(wl $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = bty.a($$0.readUnsignedByte());
      this.h = $$0.l();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.k(bty.a(this.g));
      $$0.c(this.h);
   }

   @Override
   public zu<aem> a() {
      return agq.ah;
   }

   public void a(ace $$0) {
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

   public Set<bty> j() {
      return this.g;
   }
}
