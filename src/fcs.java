import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fcs implements fct {
   private static final ajc a = new ajc("toast/system");
   private static final int d = 200;
   private static final int e = 12;
   private static final int f = 10;
   private final fcs.a g;
   private vs h;
   private List<avy> i;
   private long j;
   private boolean k;
   private final int l;
   private boolean m;

   public fcs(fcs.a $$0, vs $$1, @Nullable vs $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(eyk.P().h.a($$1), $$2 == null ? 0 : eyk.P().h.a($$2))));
   }

   public static fcs a(eyk $$0, fcs.a $$1, vs $$2, vs $$3) {
      ezv $$4 = $$0.h;
      List<avy> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fcs($$1, $$2, $$5, $$6 + 30);
   }

   private fcs(fcs.a $$0, vs $$1, List<avy> $$2, int $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.l = $$3;
   }

   private static ImmutableList<avy> a(@Nullable vs $$0) {
      return $$0 == null ? ImmutableList.of() : ImmutableList.of($$0.g());
   }

   @Override
   public int a() {
      return this.l;
   }

   @Override
   public int b() {
      return 20 + Math.max(this.i.size(), 1) * 12;
   }

   public void c() {
      this.m = true;
   }

   @Override
   public fct.a a(ezx $$0, fcu $$1, long $$2) {
      if (this.k) {
         this.j = $$2;
         this.k = false;
      }

      int $$3 = this.a();
      if ($$3 == 160 && this.i.size() <= 1) {
         $$0.a(a, 0, 0, $$3, this.b());
      } else {
         int $$4 = this.b();
         int $$5 = 28;
         int $$6 = Math.min(4, $$4 - 28);
         this.a($$0, $$3, 0, 0, 28);

         for (int $$7 = 28; $$7 < $$4 - $$6; $$7 += 10) {
            this.a($$0, $$3, 16, $$7, Math.min(16, $$4 - $$7 - $$6));
         }

         this.a($$0, $$3, 32 - $$6, $$4 - $$6, $$6);
      }

      if (this.i.isEmpty()) {
         $$0.a($$1.b().h, this.h, 18, 12, -256, false);
      } else {
         $$0.a($$1.b().h, this.h, 18, 7, -256, false);

         for (int $$8 = 0; $$8 < this.i.size(); $$8++) {
            $$0.a($$1.b().h, this.i.get($$8), 18, 18 + $$8 * 12, -1, false);
         }
      }

      double $$9 = (double)this.g.h * $$1.c();
      long $$10 = $$2 - this.j;
      return !this.m && (double)$$10 < $$9 ? fct.a.a : fct.a.b;
   }

   private void a(ezx $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      ajc $$7 = a;
      $$0.a($$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a($$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a($$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(vs $$0, @Nullable vs $$1) {
      this.h = $$0;
      this.i = a($$1);
      this.k = true;
   }

   public fcs.a d() {
      return this.g;
   }

   public static void a(fcu $$0, fcs.a $$1, vs $$2, @Nullable vs $$3) {
      $$0.a(new fcs($$1, $$2, $$3));
   }

   public static void b(fcu $$0, fcs.a $$1, vs $$2, @Nullable vs $$3) {
      fcs $$4 = $$0.a(fcs.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fcu $$0, fcs.a $$1) {
      fcs $$2 = $$0.a(fcs.class, $$1);
      if ($$2 != null) {
         $$2.c();
      }
   }

   public static void a(eyk $$0, String $$1) {
      a($$0.ax(), fcs.a.d, vs.c("selectWorld.access_failure"), vs.b($$1));
   }

   public static void b(eyk $$0, String $$1) {
      a($$0.ax(), fcs.a.d, vs.c("selectWorld.delete_failure"), vs.b($$1));
   }

   public static void c(eyk $$0, String $$1) {
      a($$0.ax(), fcs.a.e, vs.c("pack.copyFailure"), vs.b($$1));
   }

   public static class a {
      public static final fcs.a a = new fcs.a();
      public static final fcs.a b = new fcs.a();
      public static final fcs.a c = new fcs.a();
      public static final fcs.a d = new fcs.a();
      public static final fcs.a e = new fcs.a();
      public static final fcs.a f = new fcs.a();
      public static final fcs.a g = new fcs.a(10000L);
      final long h;

      public a(long $$0) {
         this.h = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
