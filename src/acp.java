import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class acp implements yz<abk> {
   public static final yq<wd, acp> a = yz.a(acp::a, acp::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final List<im> f;
   private final float g;
   private final float h;
   private final float i;
   private final ku j;
   private final ku k;
   private final czm.a l;
   private final iv<auy> m;

   public acp(double $$0, double $$1, double $$2, float $$3, List<im> $$4, @Nullable etf $$5, czm.a $$6, ku $$7, ku $$8, iv<auy> $$9) {
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

   private acp(wd $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      int $$1 = axw.a(this.b);
      int $$2 = axw.a(this.c);
      int $$3 = axw.a(this.d);
      this.f = $$0.a($$3x -> {
         int $$4 = $$3x.readByte() + $$1;
         int $$5 = $$3x.readByte() + $$2;
         int $$6 = $$3x.readByte() + $$3;
         return new im($$4, $$5, $$6);
      });
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.i = $$0.readFloat();
      this.l = $$0.b(czm.a.class);
      this.j = kw.aY.decode($$0);
      this.k = kw.aY.decode($$0);
      this.m = auy.d.decode($$0);
   }

   private void a(wd $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      int $$1 = axw.a(this.b);
      int $$2 = axw.a(this.c);
      int $$3 = axw.a(this.d);
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
      kw.aY.encode($$0, this.j);
      kw.aY.encode($$0, this.k);
      auy.d.encode($$0, this.m);
   }

   @Override
   public zb<acp> a() {
      return afv.E;
   }

   public void a(abk $$0) {
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

   public List<im> k() {
      return this.f;
   }

   public czm.a l() {
      return this.l;
   }

   public ku m() {
      return this.j;
   }

   public ku n() {
      return this.k;
   }

   public iv<auy> o() {
      return this.m;
   }
}
