import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class dxt {
   private final List<dxr> a;
   private dxr[] b = new dxr[0];
   private dxr[] c = new dxr[0];
   @Nullable
   private Set<dxx> d;
   private int e;
   private final gu f;
   private final float g;
   private final boolean h;

   public dxt(List<dxr> $$0, gu $$1, boolean $$2) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$0.isEmpty() ? Float.MAX_VALUE : this.a.get(this.a.size() - 1).c(this.f);
      this.h = $$2;
   }

   public void a() {
      this.e++;
   }

   public boolean b() {
      return this.e <= 0;
   }

   public boolean c() {
      return this.e >= this.a.size();
   }

   @Nullable
   public dxr d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public dxr a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, dxr $$1) {
      this.a.set($$0, $$1);
   }

   public int e() {
      return this.a.size();
   }

   public int f() {
      return this.e;
   }

   public void c(int $$0) {
      this.e = $$0;
   }

   public eei a(bfj $$0, int $$1) {
      dxr $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dd() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dd() + 1.0F)) * 0.5;
      return new eei($$3, $$4, $$5);
   }

   public gu d(int $$0) {
      return this.a.get($$0).a();
   }

   public eei a(bfj $$0) {
      return this.a($$0, this.e);
   }

   public gu g() {
      return this.a.get(this.e).a();
   }

   public dxr h() {
      return this.a.get(this.e);
   }

   @Nullable
   public dxr i() {
      return this.e > 0 ? this.a.get(this.e - 1) : null;
   }

   public boolean a(@Nullable dxt $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            dxr $$2 = this.a.get($$1);
            dxr $$3 = $$0.a.get($$1);
            if ($$2.a != $$3.a || $$2.b != $$3.b || $$2.c != $$3.c) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean j() {
      return this.h;
   }

   @aqa
   void a(dxr[] $$0, dxr[] $$1, Set<dxx> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @aqa
   public dxr[] k() {
      return this.b;
   }

   @aqa
   public dxr[] l() {
      return this.c;
   }

   public void a(sf $$0) {
      if (this.d != null && !this.d.isEmpty()) {
         $$0.writeBoolean(this.h);
         $$0.writeInt(this.e);
         $$0.writeInt(this.d.size());
         this.d.forEach($$1x -> $$1x.a($$0));
         $$0.writeInt(this.f.u());
         $$0.writeInt(this.f.v());
         $$0.writeInt(this.f.w());
         $$0.writeInt(this.a.size());

         for (dxr $$1 : this.a) {
            $$1.a($$0);
         }

         $$0.writeInt(this.b.length);

         for (dxr $$2 : this.b) {
            $$2.a($$0);
         }

         $$0.writeInt(this.c.length);

         for (dxr $$3 : this.c) {
            $$3.a($$0);
         }
      }
   }

   public static dxt b(sf $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      int $$3 = $$0.readInt();
      Set<dxx> $$4 = Sets.newHashSet();

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(dxx.c($$0));
      }

      gu $$6 = new gu($$0.readInt(), $$0.readInt(), $$0.readInt());
      List<dxr> $$7 = Lists.newArrayList();
      int $$8 = $$0.readInt();

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         $$7.add(dxr.b($$0));
      }

      dxr[] $$10 = new dxr[$$0.readInt()];

      for (int $$11 = 0; $$11 < $$10.length; $$11++) {
         $$10[$$11] = dxr.b($$0);
      }

      dxr[] $$12 = new dxr[$$0.readInt()];

      for (int $$13 = 0; $$13 < $$12.length; $$13++) {
         $$12[$$13] = dxr.b($$0);
      }

      dxt $$14 = new dxt($$7, $$6, $$1);
      $$14.b = $$10;
      $$14.c = $$12;
      $$14.d = $$4;
      $$14.e = $$2;
      return $$14;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public gu m() {
      return this.f;
   }

   public float n() {
      return this.g;
   }
}
