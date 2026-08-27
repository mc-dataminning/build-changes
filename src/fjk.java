import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fjk extends fit<fjk.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final foe n;

   public fjk(fgj $$0, int $$1, int $$2, foe $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(fgm<?> $$0) {
      this.b(fjk.b.a(this.c.m, $$0, this.n));
   }

   public void a(fgm<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fgm<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fjk.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fil> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fil $$0, @Nullable fil $$1) {
      this.b(fjk.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fil b(fgm<?> $$0) {
      for (fjk.a $$1 : this.aE_()) {
         if ($$1 instanceof fjk.b $$2) {
            fil $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public Optional<fkj> e(double $$0, double $$1) {
      for (fjk.a $$2 : this.aE_()) {
         for (fkj $$3 : $$2.aE_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fit.a<fjk.a> {
      private final List<fil> a;
      private final fon b;
      private static final int c = 160;

      a(List<fil> $$0, fon $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fjk.a a(List<fil> $$0, fon $$1) {
         return new fjk.a($$0, $$1);
      }

      public static fjk.a a(fil $$0, @Nullable fil $$1, fon $$2) {
         return $$1 == null ? new fjk.a(ImmutableList.of($$0), $$2) : new fjk.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fil $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fkj> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fmh> b() {
         return this.a;
      }
   }

   protected static class b extends fjk.a {
      final Map<fgm<?>, fil> a;

      private b(Map<fgm<?>, fil> $$0, foe $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fjk.b a(fgn $$0, fgm<?> $$1, foe $$2) {
         return new fjk.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fjk.b a(fgn $$0, fgm<?> $$1, @Nullable fgm<?> $$2, foe $$3) {
         fil $$4 = $$1.a($$0);
         return $$2 == null ? new fjk.b(ImmutableMap.of($$1, $$4), $$3) : new fjk.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
