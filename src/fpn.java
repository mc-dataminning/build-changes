import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fpn extends fow<fpn.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fxm n;

   public fpn(flh $$0, int $$1, fxm $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(flk<?> $$0) {
      this.b(fpn.b.a(this.c.n, $$0, this.n));
   }

   public void a(flk<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         flk<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fpn.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fon> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fon $$0, @Nullable fon $$1) {
      this.b(fpn.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fon b(flk<?> $$0) {
      for (fpn.a $$1 : this.aH_()) {
         if ($$1 instanceof fpn.b $$2) {
            fon $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fpn.a $$0 : this.aH_()) {
         if ($$0 instanceof fpn.b) {
            fpn.b $$1 = (fpn.b)$$0;

            for (fon $$2 : $$1.a.values()) {
               if ($$2 instanceof flk.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fqn> e(double $$0, double $$1) {
      for (fpn.a $$2 : this.aH_()) {
         for (fqn $$3 : $$2.aH_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fow.a<fpn.a> {
      private final List<fon> a;
      private final fui b;
      private static final int c = 160;

      a(List<fon> $$0, fui $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fpn.a a(List<fon> $$0, fui $$1) {
         return new fpn.a($$0, $$1);
      }

      public static fpn.a a(fon $$0, @Nullable fon $$1, fui $$2) {
         return $$1 == null ? new fpn.a(ImmutableList.of($$0), $$2) : new fpn.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fon $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fqn> aH_() {
         return this.a;
      }

      @Override
      public List<? extends fsl> b() {
         return this.a;
      }
   }

   protected static class b extends fpn.a {
      final Map<flk<?>, fon> a;

      private b(Map<flk<?>, fon> $$0, fxm $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fpn.b a(fll $$0, flk<?> $$1, fxm $$2) {
         return new fpn.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fpn.b a(fll $$0, flk<?> $$1, @Nullable flk<?> $$2, fxm $$3) {
         fon $$4 = $$1.a($$0);
         return $$2 == null ? new fpn.b(ImmutableMap.of($$1, $$4), $$3) : new fpn.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
