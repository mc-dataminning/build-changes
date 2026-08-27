import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class erf implements erg {
   private static final int a = 200;
   private static final int e = 12;
   private static final int f = 10;
   private final erf.a g;
   private sw h;
   private List<aom> i;
   private long j;
   private boolean k;
   private final int l;

   public erf(erf.a $$0, sw $$1, @Nullable sw $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(enn.N().h.a($$1), $$2 == null ? 0 : enn.N().h.a($$2))));
   }

   public static erf a(enn $$0, erf.a $$1, sw $$2, sw $$3) {
      eov $$4 = $$0.h;
      List<aom> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new erf($$1, $$2, $$5, $$6 + 30);
   }

   private erf(erf.a $$0, sw $$1, List<aom> $$2, int $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.l = $$3;
   }

   private static ImmutableList<aom> a(@Nullable sw $$0) {
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
   public erg.a a(eox $$0, erh $$1, long $$2) {
      if (this.k) {
         this.j = $$2;
         this.k = false;
      }

      int $$3 = this.a();
      if ($$3 == 160 && this.i.size() <= 1) {
         $$0.a(b, 0, 0, 0, 64, $$3, this.b());
      } else {
         int $$4 = this.b();
         int $$5 = 28;
         int $$6 = Math.min(4, $$4 - 28);
         this.a($$0, $$1, $$3, 0, 0, 28);

         for (int $$7 = 28; $$7 < $$4 - $$6; $$7 += 10) {
            this.a($$0, $$1, $$3, 16, $$7, Math.min(16, $$4 - $$7 - $$6));
         }

         this.a($$0, $$1, $$3, 32 - $$6, $$4 - $$6, $$6);
      }

      if (this.i == null) {
         $$0.a($$1.b().h, this.h, 18, 12, -256, false);
      } else {
         $$0.a($$1.b().h, this.h, 18, 7, -256, false);

         for (int $$8 = 0; $$8 < this.i.size(); $$8++) {
            $$0.a($$1.b().h, this.i.get($$8), 18, 18 + $$8 * 12, -1, false);
         }
      }

      return (double)($$2 - this.j) < (double)this.g.i * $$1.c() ? erg.a.a : erg.a.b;
   }

   private void a(eox $$0, erh $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 == 0 ? 20 : 5;
      int $$7 = Math.min(60, $$2 - $$6);
      $$0.a(b, 0, $$4, 0, 64 + $$3, $$6, $$5);

      for (int $$8 = $$6; $$8 < $$2 - $$7; $$8 += 64) {
         $$0.a(b, $$8, $$4, 32, 64 + $$3, Math.min(64, $$2 - $$8 - $$7), $$5);
      }

      $$0.a(b, $$2 - $$7, $$4, 160 - $$7, 64 + $$3, $$7, $$5);
   }

   public void a(sw $$0, @Nullable sw $$1) {
      this.h = $$0;
      this.i = a($$1);
      this.k = true;
   }

   public erf.a c() {
      return this.g;
   }

   public static void a(erh $$0, erf.a $$1, sw $$2, @Nullable sw $$3) {
      $$0.a(new erf($$1, $$2, $$3));
   }

   public static void b(erh $$0, erf.a $$1, sw $$2, @Nullable sw $$3) {
      erf $$4 = $$0.a(erf.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(enn $$0, String $$1) {
      a($$0.az(), erf.a.e, sw.c("selectWorld.access_failure"), sw.b($$1));
   }

   public static void b(enn $$0, String $$1) {
      a($$0.az(), erf.a.e, sw.c("selectWorld.delete_failure"), sw.b($$1));
   }

   public static void c(enn $$0, String $$1) {
      a($$0.az(), erf.a.f, sw.c("pack.copyFailure"), sw.b($$1));
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
