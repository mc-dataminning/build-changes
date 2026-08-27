import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fgb extends ffk<fgb.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fkv n;

   public fgb(fde $$0, int $$1, int $$2, fkv $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(fdh<?> $$0) {
      this.b(fgb.b.a(this.c.m, $$0, this.n));
   }

   public void a(fdh<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fdh<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fgb.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<ffc> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(ffc $$0, @Nullable ffc $$1) {
      this.b(fgb.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public ffc b(fdh<?> $$0) {
      for (fgb.a $$1 : this.aE_()) {
         if ($$1 instanceof fgb.b $$2) {
            ffc $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public Optional<fha> e(double $$0, double $$1) {
      for (fgb.a $$2 : this.aE_()) {
         for (fha $$3 : $$2.aE_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends ffk.a<fgb.a> {
      private final List<ffc> a;
      private final fld b;
      private static final int c = 160;

      a(List<ffc> $$0, fld $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fgb.a a(List<ffc> $$0, fld $$1) {
         return new fgb.a($$0, $$1);
      }

      public static fgb.a a(ffc $$0, @Nullable ffc $$1, fld $$2) {
         return $$1 == null ? new fgb.a(ImmutableList.of($$0), $$2) : new fgb.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (ffc $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fha> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fiy> b() {
         return this.a;
      }
   }

   protected static class b extends fgb.a {
      final Map<fdh<?>, ffc> a;

      private b(Map<fdh<?>, ffc> $$0, fkv $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fgb.b a(fdi $$0, fdh<?> $$1, fkv $$2) {
         return new fgb.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fgb.b a(fdi $$0, fdh<?> $$1, @Nullable fdh<?> $$2, fkv $$3) {
         ffc $$4 = $$1.a($$0);
         return $$2 == null ? new fgb.b(ImmutableMap.of($$1, $$4), $$3) : new fgb.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
