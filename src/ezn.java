import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class ezn implements ezo {
   private static final ahg a = new ahg("toast/system");
   private static final int d = 200;
   private static final int e = 12;
   private static final int f = 10;
   private final ezn.a g;
   private vf h;
   private List<aua> i;
   private long j;
   private boolean k;
   private final int l;
   private boolean m;

   public ezn(ezn.a $$0, vf $$1, @Nullable vf $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(evi.O().h.a($$1), $$2 == null ? 0 : evi.O().h.a($$2))));
   }

   public static ezn a(evi $$0, ezn.a $$1, vf $$2, vf $$3) {
      ews $$4 = $$0.h;
      List<aua> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new ezn($$1, $$2, $$5, $$6 + 30);
   }

   private ezn(ezn.a $$0, vf $$1, List<aua> $$2, int $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.l = $$3;
   }

   private static ImmutableList<aua> a(@Nullable vf $$0) {
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
   public ezo.a a(ewu $$0, ezp $$1, long $$2) {
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
      return !this.m && (double)$$10 < $$9 ? ezo.a.a : ezo.a.b;
   }

   private void a(ewu $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      ahg $$7 = a;
      $$0.a($$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a($$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a($$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(vf $$0, @Nullable vf $$1) {
      this.h = $$0;
      this.i = a($$1);
      this.k = true;
   }

   public ezn.a d() {
      return this.g;
   }

   public static void a(ezp $$0, ezn.a $$1, vf $$2, @Nullable vf $$3) {
      $$0.a(new ezn($$1, $$2, $$3));
   }

   public static void b(ezp $$0, ezn.a $$1, vf $$2, @Nullable vf $$3) {
      ezn $$4 = $$0.a(ezn.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(ezp $$0, ezn.a $$1) {
      ezn $$2 = $$0.a(ezn.class, $$1);
      if ($$2 != null) {
         $$2.c();
      }
   }

   public static void a(evi $$0, String $$1) {
      a($$0.ay(), ezn.a.d, vf.c("selectWorld.access_failure"), vf.b($$1));
   }

   public static void b(evi $$0, String $$1) {
      a($$0.ay(), ezn.a.d, vf.c("selectWorld.delete_failure"), vf.b($$1));
   }

   public static void c(evi $$0, String $$1) {
      a($$0.ay(), ezn.a.e, vf.c("pack.copyFailure"), vf.b($$1));
   }

   public static class a {
      public static final ezn.a a = new ezn.a();
      public static final ezn.a b = new ezn.a();
      public static final ezn.a c = new ezn.a();
      public static final ezn.a d = new ezn.a();
      public static final ezn.a e = new ezn.a();
      public static final ezn.a f = new ezn.a();
      public static final ezn.a g = new ezn.a(10000L);
      final long h;

      public a(long $$0) {
         this.h = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
