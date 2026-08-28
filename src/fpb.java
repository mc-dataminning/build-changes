import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fpb extends foj<fpb.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fxa n;

   public fpb(fme $$0, int $$1, fxa $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fmh<?> $$0) {
      this.b(fpb.b.a(this.c.n, $$0, this.n));
   }

   public void a(fmh<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fmh<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fpb.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fob> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fob $$0, @Nullable fob $$1) {
      this.b(fpb.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fob b(fmh<?> $$0) {
      for (fpb.a $$1 : this.aI_()) {
         if ($$1 instanceof fpb.b $$2) {
            fob $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fpb.a $$0 : this.aI_()) {
         if ($$0 instanceof fpb.b) {
            fpb.b $$1 = (fpb.b)$$0;

            for (fob $$2 : $$1.a.values()) {
               if ($$2 instanceof fmh.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fqb> e(double $$0, double $$1) {
      for (fpb.a $$2 : this.aI_()) {
         for (fqb $$3 : $$2.aI_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends foj.a<fpb.a> {
      private final List<fob> a;
      private final ftw b;
      private static final int c = 160;

      a(List<fob> $$0, ftw $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fpb.a a(List<fob> $$0, ftw $$1) {
         return new fpb.a($$0, $$1);
      }

      public static fpb.a a(fob $$0, @Nullable fob $$1, ftw $$2) {
         return $$1 == null ? new fpb.a(ImmutableList.of($$0), $$2) : new fpb.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fob $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fqb> aI_() {
         return this.a;
      }

      @Override
      public List<? extends frz> b() {
         return this.a;
      }
   }

   protected static class b extends fpb.a {
      final Map<fmh<?>, fob> a;

      private b(Map<fmh<?>, fob> $$0, fxa $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fpb.b a(fmi $$0, fmh<?> $$1, fxa $$2) {
         return new fpb.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fpb.b a(fmi $$0, fmh<?> $$1, @Nullable fmh<?> $$2, fxa $$3) {
         fob $$4 = $$1.a($$0);
         return $$2 == null ? new fpb.b(ImmutableMap.of($$1, $$4), $$3) : new fpb.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
