import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ffr extends ffa<ffr.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fkl n;

   public ffr(fcu $$0, int $$1, int $$2, fkl $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(fcx<?> $$0) {
      this.b(ffr.b.a(this.c.m, $$0, this.n));
   }

   public void a(fcx<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fcx<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(ffr.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fes> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fes $$0, @Nullable fes $$1) {
      this.b(ffr.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fes b(fcx<?> $$0) {
      for (ffr.a $$1 : this.aE_()) {
         if ($$1 instanceof ffr.b $$2) {
            fes $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public Optional<fgq> e(double $$0, double $$1) {
      for (ffr.a $$2 : this.aE_()) {
         for (fgq $$3 : $$2.aE_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends ffa.a<ffr.a> {
      private final List<fes> a;
      private final fkt b;
      private static final int c = 160;

      a(List<fes> $$0, fkt $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static ffr.a a(List<fes> $$0, fkt $$1) {
         return new ffr.a($$0, $$1);
      }

      public static ffr.a a(fes $$0, @Nullable fes $$1, fkt $$2) {
         return $$1 == null ? new ffr.a(ImmutableList.of($$0), $$2) : new ffr.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fes $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fgq> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fio> b() {
         return this.a;
      }
   }

   protected static class b extends ffr.a {
      final Map<fcx<?>, fes> a;

      private b(Map<fcx<?>, fes> $$0, fkl $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static ffr.b a(fcy $$0, fcx<?> $$1, fkl $$2) {
         return new ffr.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static ffr.b a(fcy $$0, fcx<?> $$1, @Nullable fcx<?> $$2, fkl $$3) {
         fes $$4 = $$1.a($$0);
         return $$2 == null ? new ffr.b(ImmutableMap.of($$1, $$4), $$3) : new ffr.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
