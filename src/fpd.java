import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fpd extends fol<fpd.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fxc n;

   public fpd(fmg $$0, int $$1, fxc $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fmj<?> $$0) {
      this.b(fpd.b.a(this.c.n, $$0, this.n));
   }

   public void a(fmj<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fmj<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fpd.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fod> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fod $$0, @Nullable fod $$1) {
      this.b(fpd.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fod b(fmj<?> $$0) {
      for (fpd.a $$1 : this.aI_()) {
         if ($$1 instanceof fpd.b $$2) {
            fod $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fpd.a $$0 : this.aI_()) {
         if ($$0 instanceof fpd.b) {
            fpd.b $$1 = (fpd.b)$$0;

            for (fod $$2 : $$1.a.values()) {
               if ($$2 instanceof fmj.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fqd> e(double $$0, double $$1) {
      for (fpd.a $$2 : this.aI_()) {
         for (fqd $$3 : $$2.aI_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fol.a<fpd.a> {
      private final List<fod> a;
      private final fty b;
      private static final int c = 160;

      a(List<fod> $$0, fty $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fpd.a a(List<fod> $$0, fty $$1) {
         return new fpd.a($$0, $$1);
      }

      public static fpd.a a(fod $$0, @Nullable fod $$1, fty $$2) {
         return $$1 == null ? new fpd.a(ImmutableList.of($$0), $$2) : new fpd.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fod $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fqd> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fsb> b() {
         return this.a;
      }
   }

   protected static class b extends fpd.a {
      final Map<fmj<?>, fod> a;

      private b(Map<fmj<?>, fod> $$0, fxc $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fpd.b a(fmk $$0, fmj<?> $$1, fxc $$2) {
         return new fpd.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fpd.b a(fmk $$0, fmj<?> $$1, @Nullable fmj<?> $$2, fxc $$3) {
         fod $$4 = $$1.a($$0);
         return $$2 == null ? new fpd.b(ImmutableMap.of($$1, $$4), $$3) : new fpd.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
