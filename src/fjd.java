import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fjd extends fim<fjd.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final frb n;

   public fjd(fgi $$0, int $$1, frb $$2) {
      super($$0, $$1, $$2.r.d(), $$2.r.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fgl<?> $$0) {
      this.b(fjd.b.a(this.c.m, $$0, this.n));
   }

   public void a(fgl<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fgl<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fjd.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fie> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fie $$0, @Nullable fie $$1) {
      this.b(fjd.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fie b(fgl<?> $$0) {
      for (fjd.a $$1 : this.aG_()) {
         if ($$1 instanceof fjd.b $$2) {
            fie $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fjd.a $$0 : this.aG_()) {
         if ($$0 instanceof fjd.b) {
            fjd.b $$1 = (fjd.b)$$0;

            for (fie $$2 : $$1.a.values()) {
               if ($$2 instanceof fgl.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fkc> e(double $$0, double $$1) {
      for (fjd.a $$2 : this.aG_()) {
         for (fkc $$3 : $$2.aG_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fim.a<fjd.a> {
      private final List<fie> a;
      private final fnx b;
      private static final int c = 160;

      a(List<fie> $$0, fnx $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fjd.a a(List<fie> $$0, fnx $$1) {
         return new fjd.a($$0, $$1);
      }

      public static fjd.a a(fie $$0, @Nullable fie $$1, fnx $$2) {
         return $$1 == null ? new fjd.a(ImmutableList.of($$0), $$2) : new fjd.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.m / 2 - 155;

         for (fie $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fkc> aG_() {
         return this.a;
      }

      @Override
      public List<? extends fma> b() {
         return this.a;
      }
   }

   protected static class b extends fjd.a {
      final Map<fgl<?>, fie> a;

      private b(Map<fgl<?>, fie> $$0, frb $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fjd.b a(fgm $$0, fgl<?> $$1, frb $$2) {
         return new fjd.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fjd.b a(fgm $$0, fgl<?> $$1, @Nullable fgl<?> $$2, frb $$3) {
         fie $$4 = $$1.a($$0);
         return $$2 == null ? new fjd.b(ImmutableMap.of($$1, $$4), $$3) : new fjd.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
