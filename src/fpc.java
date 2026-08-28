import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fpc extends fok<fpc.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fxb n;

   public fpc(fmf $$0, int $$1, fxb $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fmi<?> $$0) {
      this.b(fpc.b.a(this.c.n, $$0, this.n));
   }

   public void a(fmi<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fmi<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fpc.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<foc> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(foc $$0, @Nullable foc $$1) {
      this.b(fpc.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public foc b(fmi<?> $$0) {
      for (fpc.a $$1 : this.aI_()) {
         if ($$1 instanceof fpc.b $$2) {
            foc $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fpc.a $$0 : this.aI_()) {
         if ($$0 instanceof fpc.b) {
            fpc.b $$1 = (fpc.b)$$0;

            for (foc $$2 : $$1.a.values()) {
               if ($$2 instanceof fmi.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fqc> e(double $$0, double $$1) {
      for (fpc.a $$2 : this.aI_()) {
         for (fqc $$3 : $$2.aI_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fok.a<fpc.a> {
      private final List<foc> a;
      private final ftx b;
      private static final int c = 160;

      a(List<foc> $$0, ftx $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fpc.a a(List<foc> $$0, ftx $$1) {
         return new fpc.a($$0, $$1);
      }

      public static fpc.a a(foc $$0, @Nullable foc $$1, ftx $$2) {
         return $$1 == null ? new fpc.a(ImmutableList.of($$0), $$2) : new fpc.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (foc $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fqc> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fsa> b() {
         return this.a;
      }
   }

   protected static class b extends fpc.a {
      final Map<fmi<?>, foc> a;

      private b(Map<fmi<?>, foc> $$0, fxb $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fpc.b a(fmj $$0, fmi<?> $$1, fxb $$2) {
         return new fpc.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fpc.b a(fmj $$0, fmi<?> $$1, @Nullable fmi<?> $$2, fxb $$3) {
         foc $$4 = $$1.a($$0);
         return $$2 == null ? new fpc.b(ImmutableMap.of($$1, $$4), $$3) : new fpc.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
