import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class acf implements yp<aba> {
   public static final yg<vt, acf> a = yp.a(acf::a, acf::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final List<id> f;
   private final float g;
   private final float h;
   private final float i;
   private final kl j;
   private final kl k;
   private final cyy.a l;
   private final in<aun> m;

   public acf(double $$0, double $$1, double $$2, float $$3, List<id> $$4, @Nullable esj $$5, cyy.a $$6, kl $$7, kl $$8, in<aun> $$9) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = Lists.newArrayList($$4);
      this.m = $$9;
      if ($$5 != null) {
         this.g = (float)$$5.c;
         this.h = (float)$$5.d;
         this.i = (float)$$5.e;
      } else {
         this.g = 0.0F;
         this.h = 0.0F;
         this.i = 0.0F;
      }

      this.l = $$6;
      this.j = $$7;
      this.k = $$8;
   }

   private acf(vt $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      int $$1 = axm.a(this.b);
      int $$2 = axm.a(this.c);
      int $$3 = axm.a(this.d);
      this.f = $$0.a($$3x -> {
         int $$4 = $$3x.readByte() + $$1;
         int $$5 = $$3x.readByte() + $$2;
         int $$6 = $$3x.readByte() + $$3;
         return new id($$4, $$5, $$6);
      });
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.i = $$0.readFloat();
      this.l = $$0.b(cyy.a.class);
      this.j = kn.aZ.decode($$0);
      this.k = kn.aZ.decode($$0);
      this.m = aun.d.decode($$0);
   }

   private void a(vt $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      int $$1 = axm.a(this.b);
      int $$2 = axm.a(this.c);
      int $$3 = axm.a(this.d);
      $$0.a(this.f, ($$3x, $$4) -> {
         int $$5 = $$4.u() - $$1;
         int $$6 = $$4.v() - $$2;
         int $$7 = $$4.w() - $$3;
         $$3x.k($$5);
         $$3x.k($$6);
         $$3x.k($$7);
      });
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.a(this.l);
      kn.aZ.encode($$0, this.j);
      kn.aZ.encode($$0, this.k);
      aun.d.encode($$0, this.m);
   }

   @Override
   public yr<acf> a() {
      return afl.E;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.g;
   }

   public float e() {
      return this.h;
   }

   public float f() {
      return this.i;
   }

   public double g() {
      return this.b;
   }

   public double h() {
      return this.c;
   }

   public double i() {
      return this.d;
   }

   public float j() {
      return this.e;
   }

   public List<id> k() {
      return this.f;
   }

   public cyy.a l() {
      return this.l;
   }

   public kl m() {
      return this.j;
   }

   public kl n() {
      return this.k;
   }

   public in<aun> o() {
      return this.m;
   }
}
