import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fqn extends fpw<fqn.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fym n;

   public fqn(fmg $$0, int $$1, fym $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fmj<?> $$0) {
      this.b(fqn.b.a(this.c.n, $$0, this.n));
   }

   public void a(fmj<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fmj<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fqn.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fpo> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fpo $$0, @Nullable fpo $$1) {
      this.b(fqn.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fpo b(fmj<?> $$0) {
      for (fqn.a $$1 : this.aH_()) {
         if ($$1 instanceof fqn.b $$2) {
            fpo $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fqn.a $$0 : this.aH_()) {
         if ($$0 instanceof fqn.b) {
            fqn.b $$1 = (fqn.b)$$0;

            for (fpo $$2 : $$1.a.values()) {
               if ($$2 instanceof fmj.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<frn> e(double $$0, double $$1) {
      for (fqn.a $$2 : this.aH_()) {
         for (frn $$3 : $$2.aH_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fpw.a<fqn.a> {
      private final List<fpo> a;
      private final fvi b;
      private static final int c = 160;

      a(List<fpo> $$0, fvi $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fqn.a a(List<fpo> $$0, fvi $$1) {
         return new fqn.a($$0, $$1);
      }

      public static fqn.a a(fpo $$0, @Nullable fpo $$1, fvi $$2) {
         return $$1 == null ? new fqn.a(ImmutableList.of($$0), $$2) : new fqn.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fpo $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends frn> aH_() {
         return this.a;
      }

      @Override
      public List<? extends ftl> b() {
         return this.a;
      }
   }

   protected static class b extends fqn.a {
      final Map<fmj<?>, fpo> a;

      private b(Map<fmj<?>, fpo> $$0, fym $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fqn.b a(fmk $$0, fmj<?> $$1, fym $$2) {
         return new fqn.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fqn.b a(fmk $$0, fmj<?> $$1, @Nullable fmj<?> $$2, fym $$3) {
         fpo $$4 = $$1.a($$0);
         return $$2 == null ? new fqn.b(ImmutableMap.of($$1, $$4), $$3) : new fqn.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
