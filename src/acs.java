import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class acs implements zb<abn> {
   public static final ys<wf, acs> a = zb.a(acs::a, acs::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final List<ja> f;
   private final float g;
   private final float h;
   private final float i;
   private final lh j;
   private final lh k;
   private final dbx.a l;
   private final jj<avg> m;

   public acs(double $$0, double $$1, double $$2, float $$3, List<ja> $$4, @Nullable ewf $$5, dbx.a $$6, lh $$7, lh $$8, jj<avg> $$9) {
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

   private acs(wf $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      int $$1 = ayg.a(this.b);
      int $$2 = ayg.a(this.c);
      int $$3 = ayg.a(this.d);
      this.f = $$0.a($$3x -> {
         int $$4 = $$3x.readByte() + $$1;
         int $$5 = $$3x.readByte() + $$2;
         int $$6 = $$3x.readByte() + $$3;
         return new ja($$4, $$5, $$6);
      });
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.i = $$0.readFloat();
      this.l = $$0.b(dbx.a.class);
      this.j = lj.bg.decode($$0);
      this.k = lj.bg.decode($$0);
      this.m = avg.d.decode($$0);
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      int $$1 = ayg.a(this.b);
      int $$2 = ayg.a(this.c);
      int $$3 = ayg.a(this.d);
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
      lj.bg.encode($$0, this.j);
      lj.bg.encode($$0, this.k);
      avg.d.encode($$0, this.m);
   }

   @Override
   public zd<acs> a() {
      return afz.E;
   }

   public void a(abn $$0) {
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

   public List<ja> k() {
      return this.f;
   }

   public dbx.a l() {
      return this.l;
   }

   public lh m() {
      return this.j;
   }

   public lh n() {
      return this.k;
   }

   public jj<avg> o() {
      return this.m;
   }
}
