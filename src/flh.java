import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class flh extends fkq<flh.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final ftg n;

   public flh(fil $$0, int $$1, ftg $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fio<?> $$0) {
      this.b(flh.b.a(this.c.n, $$0, this.n));
   }

   public void a(fio<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fio<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(flh.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fki> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fki $$0, @Nullable fki $$1) {
      this.b(flh.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fki b(fio<?> $$0) {
      for (flh.a $$1 : this.aI_()) {
         if ($$1 instanceof flh.b $$2) {
            fki $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (flh.a $$0 : this.aI_()) {
         if ($$0 instanceof flh.b) {
            flh.b $$1 = (flh.b)$$0;

            for (fki $$2 : $$1.a.values()) {
               if ($$2 instanceof fio.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fmh> e(double $$0, double $$1) {
      for (flh.a $$2 : this.aI_()) {
         for (fmh $$3 : $$2.aI_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fkq.a<flh.a> {
      private final List<fki> a;
      private final fqd b;
      private static final int c = 160;

      a(List<fki> $$0, fqd $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static flh.a a(List<fki> $$0, fqd $$1) {
         return new flh.a($$0, $$1);
      }

      public static flh.a a(fki $$0, @Nullable fki $$1, fqd $$2) {
         return $$1 == null ? new flh.a(ImmutableList.of($$0), $$2) : new flh.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fki $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fmh> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fof> b() {
         return this.a;
      }
   }

   protected static class b extends flh.a {
      final Map<fio<?>, fki> a;

      private b(Map<fio<?>, fki> $$0, ftg $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static flh.b a(fip $$0, fio<?> $$1, ftg $$2) {
         return new flh.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static flh.b a(fip $$0, fio<?> $$1, @Nullable fio<?> $$2, ftg $$3) {
         fki $$4 = $$1.a($$0);
         return $$2 == null ? new flh.b(ImmutableMap.of($$1, $$4), $$3) : new flh.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
