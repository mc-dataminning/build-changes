import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fmt extends fmc<fmt.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fus n;

   public fmt(fjx $$0, int $$1, fus $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fka<?> $$0) {
      this.b(fmt.b.a(this.c.n, $$0, this.n));
   }

   public void a(fka<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fka<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fmt.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<flu> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(flu $$0, @Nullable flu $$1) {
      this.b(fmt.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public flu b(fka<?> $$0) {
      for (fmt.a $$1 : this.aI_()) {
         if ($$1 instanceof fmt.b $$2) {
            flu $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fmt.a $$0 : this.aI_()) {
         if ($$0 instanceof fmt.b) {
            fmt.b $$1 = (fmt.b)$$0;

            for (flu $$2 : $$1.a.values()) {
               if ($$2 instanceof fka.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fnt> e(double $$0, double $$1) {
      for (fmt.a $$2 : this.aI_()) {
         for (fnt $$3 : $$2.aI_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fmc.a<fmt.a> {
      private final List<flu> a;
      private final frp b;
      private static final int c = 160;

      a(List<flu> $$0, frp $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fmt.a a(List<flu> $$0, frp $$1) {
         return new fmt.a($$0, $$1);
      }

      public static fmt.a a(flu $$0, @Nullable flu $$1, frp $$2) {
         return $$1 == null ? new fmt.a(ImmutableList.of($$0), $$2) : new fmt.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (flu $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fnt> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fps> b() {
         return this.a;
      }
   }

   protected static class b extends fmt.a {
      final Map<fka<?>, flu> a;

      private b(Map<fka<?>, flu> $$0, fus $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fmt.b a(fkb $$0, fka<?> $$1, fus $$2) {
         return new fmt.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fmt.b a(fkb $$0, fka<?> $$1, @Nullable fka<?> $$2, fus $$3) {
         flu $$4 = $$1.a($$0);
         return $$2 == null ? new fmt.b(ImmutableMap.of($$1, $$4), $$3) : new fmt.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
