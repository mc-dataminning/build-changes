import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class drl extends dpv implements bqm, cqy, crj {
   protected static final int b = 0;
   protected static final int c = 2;
   protected static final int d = 1;
   protected static final int e = 3;
   public static final int f = 0;
   private static final int[] r = new int[]{0};
   private static final int[] s = new int[]{3, 1};
   private static final int[] t = new int[]{1, 2};
   public static final int g = 1;
   public static final int h = 2;
   public static final int i = 3;
   public static final int j = 4;
   public static final int k = 200;
   public static final int l = 2;
   protected jj<cuh> m = jj.a(4, cuh.i);
   int u;
   int v;
   int w;
   int x;
   protected final cpq q = new cpq() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return drl.this.u;
            case 1:
               return drl.this.v;
            case 2:
               return drl.this.w;
            case 3:
               return drl.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               drl.this.u = $$1;
               break;
            case 1:
               drl.this.v = $$1;
               break;
            case 2:
               drl.this.w = $$1;
               break;
            case 3:
               drl.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akt> y = new Object2IntOpenHashMap();
   private float z;
   private final azb<drl.c, drl.d> A;

   @Override
   protected xe k() {
      return xe.c("container.potato_refinery");
   }

   @Override
   protected cpg a(int $$0, clx $$1) {
      return new cqv($$0, $$1, this, this.q);
   }

   public drl(ir $$0, dtc $$1) {
      super(dqe.U, $$0, $$1);
      czd.a<bpt, cyz> $$2 = czd.b(czf.i);
      this.A = ad.a($$1x -> {
         boolean $$2x = !$$1x.b.d() && !$$1x.c.d();
         if ($$2x) {
            cuh $$3 = $$1x.c;
            if ($$1x.b.a(cuk.vQ) && !$$3.d()) {
               cuh $$4 = $$3.c(1);
               dri.a($$4);
               return new drl.a($$3.c(1), $$4);
            }

            czc<cyz> $$5 = $$2.a(this, $$1x.a).orElse(null);
            if ($$5 != null) {
               return new drl.b($$5);
            }
         }

         return null;
      });
   }

   private drl.d b(dca $$0) {
      return this.A.a(new drl.c($$0, this.m.get(0), this.m.get(2)));
   }

   public static Map<cuc, Integer> f() {
      return dqz.g();
   }

   public float l() {
      float $$0 = this.z;
      this.z = 0.0F;
      return $$0;
   }

   private boolean t() {
      return this.u > 0;
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.m = jj.a(this.b(), cuh.i);
      bpu.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.b(this.m.get(1));
      uk $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new akt($$3), $$2.h($$3));
      }

      this.z = $$0.e("StoredExperience") ? $$0.j("StoredExperience") : 0.0F;
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bpu.a($$0, this.m, $$1);
      uk $$2 = new uk();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
      $$0.a("StoredExperience", this.z);
   }

   public static void a(dca $$0, ir $$1, dtc $$2, drl $$3) {
      boolean $$4 = $$3.t();
      boolean $$5 = false;
      if ($$3.t()) {
         $$3.u--;
      }

      cuh $$6 = $$3.m.get(1);
      boolean $$7 = $$3.u();
      boolean $$8 = !$$6.d();
      if ($$3.t() || $$8 && $$7) {
         drl.d $$9 = $$3.b($$0);
         int $$10 = $$3.ai_();
         if (!$$3.t() && a($$0.I_(), $$9, $$3.m, $$10)) {
            $$3.u = $$3.b($$6);
            $$3.v = $$3.u;
            if ($$3.t()) {
               $$5 = true;
               if ($$8) {
                  cuc $$11 = $$6.f();
                  $$6.h(1);
                  if ($$6.d()) {
                     cuc $$12 = $$11.t();
                     $$3.m.set(1, $$12 == null ? cuh.i : new cuh($$12));
                  }
               }
            }
         }

         if ($$3.t() && a($$0.I_(), $$9, $$3.m, $$10)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.I_(), $$9, $$3.m, $$10) && $$9 instanceof drl.b $$13) {
                  $$3.a($$13.a);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.t() && $$3.w > 0) {
         $$3.w = aym.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.t()) {
         $$5 = true;
         $$2 = $$2.a(dlg.b, Boolean.valueOf($$3.t()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private boolean u() {
      return !this.m.get(0).d() && !this.m.get(2).d();
   }

   private static boolean a(jo $$0, @Nullable drl.d $$1, jj<cuh> $$2, int $$3) {
      if (!$$2.get(0).d() && !$$2.get(2).d() && $$1 != null) {
         cuh $$4 = $$1.a($$0);
         if ($$4.d()) {
            return false;
         } else {
            cuh $$5 = $$2.get(3);
            if ($$5.d()) {
               return true;
            } else if (!cuh.c($$5, $$4)) {
               return false;
            } else {
               return $$5.G() < $$3 && $$5.G() < $$5.i() ? true : $$5.G() < $$4.i();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jo $$0, @Nullable drl.d $$1, jj<cuh> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cuh $$4 = $$2.get(0);
         cuh $$5 = $$2.get(2);
         cuh $$6 = $$1.a($$0);
         cuh $$7 = $$2.get(3);
         if ($$7.d()) {
            $$2.set(3, $$6.r());
         } else if (cuh.c($$7, $$6)) {
            $$7.g(1);
         }

         $$4.h(1);
         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cuh $$0) {
      if ($$0.d()) {
         return 0;
      } else {
         cuc $$1 = $$0.f();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(dca $$0, drl $$1) {
      drl.d $$2 = $$1.b($$0);
      return $$2 != null ? $$2.a() : 20;
   }

   public static boolean c(cuh $$0) {
      return f().containsKey($$0.f());
   }

   @Override
   public int[] a(iw $$0) {
      if ($$0 == iw.a) {
         return s;
      } else {
         return $$0 == iw.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cuh $$1, @Nullable iw $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuh $$1, iw $$2) {
      return $$2 == iw.a && $$0 == 1 ? $$1.a(cuk.rW) || $$1.a(cuk.rV) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected jj<cuh> j() {
      return this.m;
   }

   @Override
   protected void a(jj<cuh> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, cuh $$1) {
      cuh $$2 = this.m.get($$0);
      boolean $$3 = $$1.d() || !cuh.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.G() > this.ai_()) {
         $$1.e(this.ai_());
      }

      if (($$0 == 0 || $$0 == 2) && $$3) {
         this.x = a(this.n, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cuh $$1) {
      if ($$0 == 3) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cuh $$2 = this.m.get(1);
         return c($$1) || $$1.a(cuk.rV) && !$$2.a(cuk.rV);
      }
   }

   @Override
   public void a(@Nullable czc<?> $$0) {
      if ($$0 != null) {
         akt $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public czc<?> d() {
      return null;
   }

   @Override
   public void a(cly $$0, List<cuh> $$1) {
   }

   @Override
   public void a(cmc $$0) {
      for (cuh $$1 : this.m) {
         $$0.b($$1);
      }
   }

   static record a(cuh a, cuh b) implements drl.d {
      @Override
      public cuh a(jo $$0) {
         return this.b;
      }

      @Override
      public int a() {
         return 20;
      }

      public cuh b() {
         return this.a;
      }

      public cuh c() {
         return this.b;
      }
   }

   static record b(czc<cyz> a) implements drl.d {

      @Override
      public cuh a(jo $$0) {
         return this.a.b().a($$0);
      }

      @Override
      public int a() {
         return this.a.b().d();
      }

      public czc<cyz> b() {
         return this.a;
      }
   }

   static record c(dca a, cuh b, cuh c) {
   }

   interface d {
      cuh a(jo var1);

      int a();
   }
}
