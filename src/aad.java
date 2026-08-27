import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class aad implements xf<za> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final List<hx> e;
   private final float f;
   private final float g;
   private final float h;
   private final jv i;
   private final jv j;
   private final cth.a k;
   private final arr l;

   public aad(double $$0, double $$1, double $$2, float $$3, List<hx> $$4, @Nullable elt $$5, cth.a $$6, jv $$7, jv $$8, arr $$9) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = Lists.newArrayList($$4);
      this.l = $$9;
      if ($$5 != null) {
         this.f = (float)$$5.c;
         this.g = (float)$$5.d;
         this.h = (float)$$5.e;
      } else {
         this.f = 0.0F;
         this.g = 0.0F;
         this.h = 0.0F;
      }

      this.k = $$6;
      this.i = $$7;
      this.j = $$8;
   }

   public aad(ui $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      int $$1 = auo.a(this.a);
      int $$2 = auo.a(this.b);
      int $$3 = auo.a(this.c);
      this.e = $$0.a((ui.a<hx>)($$3x -> {
         int $$4 = $$3x.readByte() + $$1;
         int $$5 = $$3x.readByte() + $$2;
         int $$6 = $$3x.readByte() + $$3;
         return new hx($$4, $$5, $$6);
      }));
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.k = $$0.b(cth.a.class);
      this.i = a($$0, $$0.a(kd.j));
      this.j = a($$0, $$0.a(kd.j));
      this.l = arr.b($$0);
   }

   private static <T extends jv> T a(ui $$0, jw<T> $$1) {
      return $$1.d().b($$1, $$0);
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      int $$1 = auo.a(this.a);
      int $$2 = auo.a(this.b);
      int $$3 = auo.a(this.c);
      $$0.a(this.e, ($$3x, $$4) -> {
         int $$5 = $$4.u() - $$1;
         int $$6 = $$4.v() - $$2;
         int $$7 = $$4.w() - $$3;
         $$3x.k($$5);
         $$3x.k($$6);
         $$3x.k($$7);
      });
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.k);
      $$0.a(kd.j, this.i.b());
      $$0.a(kd.j, this.j.b());
      this.l.a($$0);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public float a() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public float e() {
      return this.h;
   }

   public double f() {
      return this.a;
   }

   public double g() {
      return this.b;
   }

   public double h() {
      return this.c;
   }

   public float i() {
      return this.d;
   }

   public List<hx> j() {
      return this.e;
   }

   public cth.a k() {
      return this.k;
   }

   public jv l() {
      return this.i;
   }

   public jv m() {
      return this.j;
   }

   public arr n() {
      return this.l;
   }
}
