import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class frk extends fqt<frk.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fzl n;

   public frk(fnd $$0, int $$1, fzl $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fng<?> $$0) {
      this.b(frk.b.a(this.c.n, $$0, this.n));
   }

   public void a(fng<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fng<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(frk.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fql> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fql $$0, @Nullable fql $$1) {
      this.b(frk.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fql b(fng<?> $$0) {
      for (frk.a $$1 : this.aD_()) {
         if ($$1 instanceof frk.b $$2) {
            fql $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (frk.a $$0 : this.aD_()) {
         if ($$0 instanceof frk.b) {
            frk.b $$1 = (frk.b)$$0;

            for (fql $$2 : $$1.a.values()) {
               if ($$2 instanceof fng.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fsk> e(double $$0, double $$1) {
      for (frk.a $$2 : this.aD_()) {
         for (fsk $$3 : $$2.aD_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fqt.a<frk.a> {
      private final List<fql> a;
      private final fwf b;
      private static final int c = 160;

      a(List<fql> $$0, fwf $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static frk.a a(List<fql> $$0, fwf $$1) {
         return new frk.a($$0, $$1);
      }

      public static frk.a a(fql $$0, @Nullable fql $$1, fwf $$2) {
         return $$1 == null ? new frk.a(ImmutableList.of($$0), $$2) : new frk.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fql $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fsk> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fui> b() {
         return this.a;
      }
   }

   protected static class b extends frk.a {
      final Map<fng<?>, fql> a;

      private b(Map<fng<?>, fql> $$0, fzl $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static frk.b a(fnh $$0, fng<?> $$1, fzl $$2) {
         return new frk.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static frk.b a(fnh $$0, fng<?> $$1, @Nullable fng<?> $$2, fzl $$3) {
         fql $$4 = $$1.a($$0);
         return $$2 == null ? new frk.b(ImmutableMap.of($$1, $$4), $$3) : new frk.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
