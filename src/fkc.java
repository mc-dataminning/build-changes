import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fkc implements fkd {
   private static final akk a = new akk("toast/system");
   private static final int d = 200;
   private static final int e = 12;
   private static final int f = 10;
   private final fkc.a g;
   private wu h;
   private List<axs> i;
   private long j;
   private boolean k;
   private final int l;
   private boolean m;

   public fkc(fkc.a $$0, wu $$1, @Nullable wu $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(ffw.Q().h.a($$1), $$2 == null ? 0 : ffw.Q().h.a($$2))));
   }

   public static fkc a(ffw $$0, fkc.a $$1, wu $$2, wu $$3) {
      fhf $$4 = $$0.h;
      List<axs> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fkc($$1, $$2, $$5, $$6 + 30);
   }

   private fkc(fkc.a $$0, wu $$1, List<axs> $$2, int $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.l = $$3;
   }

   private static ImmutableList<axs> a(@Nullable wu $$0) {
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
   public fkd.a a(fhh $$0, fke $$1, long $$2) {
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

      double $$9 = (double)this.g.k * $$1.c();
      long $$10 = $$2 - this.j;
      return !this.m && (double)$$10 < $$9 ? fkd.a.a : fkd.a.b;
   }

   private void a(fhh $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      akk $$7 = a;
      $$0.a($$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a($$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a($$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(wu $$0, @Nullable wu $$1) {
      this.h = $$0;
      this.i = a($$1);
      this.k = true;
   }

   public fkc.a d() {
      return this.g;
   }

   public static void a(fke $$0, fkc.a $$1, wu $$2, @Nullable wu $$3) {
      $$0.a(new fkc($$1, $$2, $$3));
   }

   public static void b(fke $$0, fkc.a $$1, wu $$2, @Nullable wu $$3) {
      fkc $$4 = $$0.a(fkc.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fke $$0, fkc.a $$1) {
      fkc $$2 = $$0.a(fkc.class, $$1);
      if ($$2 != null) {
         $$2.c();
      }
   }

   public static void a(ffw $$0, String $$1) {
      a($$0.aw(), fkc.a.d, wu.c("selectWorld.access_failure"), wu.b($$1));
   }

   public static void b(ffw $$0, String $$1) {
      a($$0.aw(), fkc.a.d, wu.c("selectWorld.delete_failure"), wu.b($$1));
   }

   public static void c(ffw $$0, String $$1) {
      a($$0.aw(), fkc.a.e, wu.c("pack.copyFailure"), wu.b($$1));
   }

   public static void a(ffw $$0) {
      b($$0.aw(), fkc.a.g, wu.c("chunk.toast.lowDiskSpace"), wu.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(ffw $$0, dbn $$1) {
      b($$0.aw(), fkc.a.h, wu.a("chunk.toast.loadFailure", $$1).a(n.m), wu.c("chunk.toast.checkLog"));
   }

   public static void b(ffw $$0, dbn $$1) {
      b($$0.aw(), fkc.a.i, wu.a("chunk.toast.saveFailure", $$1).a(n.m), wu.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fkc.a a = new fkc.a();
      public static final fkc.a b = new fkc.a();
      public static final fkc.a c = new fkc.a();
      public static final fkc.a d = new fkc.a();
      public static final fkc.a e = new fkc.a();
      public static final fkc.a f = new fkc.a();
      public static final fkc.a g = new fkc.a(10000L);
      public static final fkc.a h = new fkc.a();
      public static final fkc.a i = new fkc.a();
      public static final fkc.a j = new fkc.a(10000L);
      final long k;

      public a(long $$0) {
         this.k = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
