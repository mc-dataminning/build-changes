import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class euw implements eux {
   private static final aex a = new aex("toast/system");
   private static final int d = 200;
   private static final int e = 12;
   private static final int f = 10;
   private final euw.a g;
   private tm h;
   private List<ark> i;
   private long j;
   private boolean k;
   private final int l;

   public euw(euw.a $$0, tm $$1, @Nullable tm $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(eqv.O().h.a($$1), $$2 == null ? 0 : eqv.O().h.a($$2))));
   }

   public static euw a(eqv $$0, euw.a $$1, tm $$2, tm $$3) {
      esd $$4 = $$0.h;
      List<ark> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new euw($$1, $$2, $$5, $$6 + 30);
   }

   private euw(euw.a $$0, tm $$1, List<ark> $$2, int $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.l = $$3;
   }

   private static ImmutableList<ark> a(@Nullable tm $$0) {
      return $$0 == null ? ImmutableList.of() : ImmutableList.of($$0.f());
   }

   @Override
   public int a() {
      return this.l;
   }

   @Override
   public int b() {
      return 20 + Math.max(this.i.size(), 1) * 12;
   }

   @Override
   public eux.a a(esf $$0, euy $$1, long $$2) {
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

      if (this.i == null) {
         $$0.a($$1.b().h, this.h, 18, 12, -256, false);
      } else {
         $$0.a($$1.b().h, this.h, 18, 7, -256, false);

         for (int $$8 = 0; $$8 < this.i.size(); $$8++) {
            $$0.a($$1.b().h, this.i.get($$8), 18, 18 + $$8 * 12, -1, false);
         }
      }

      return (double)($$2 - this.j) < (double)this.g.i * $$1.c() ? eux.a.a : eux.a.b;
   }

   private void a(esf $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      aex $$7 = a;
      $$0.a($$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a($$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a($$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(tm $$0, @Nullable tm $$1) {
      this.h = $$0;
      this.i = a($$1);
      this.k = true;
   }

   public euw.a c() {
      return this.g;
   }

   public static void a(euy $$0, euw.a $$1, tm $$2, @Nullable tm $$3) {
      $$0.a(new euw($$1, $$2, $$3));
   }

   public static void b(euy $$0, euw.a $$1, tm $$2, @Nullable tm $$3) {
      euw $$4 = $$0.a(euw.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(eqv $$0, String $$1) {
      a($$0.ay(), euw.a.e, tm.c("selectWorld.access_failure"), tm.b($$1));
   }

   public static void b(eqv $$0, String $$1) {
      a($$0.ay(), euw.a.e, tm.c("selectWorld.delete_failure"), tm.b($$1));
   }

   public static void c(eqv $$0, String $$1) {
      a($$0.ay(), euw.a.f, tm.c("pack.copyFailure"), tm.b($$1));
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h(10000L);

      final long i;

      private a(long $$0) {
         this.i = $$0;
      }

      private a() {
         this(5000L);
      }
   }
}
