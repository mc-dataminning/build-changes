import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ftg extends fsp<ftg.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final gbh n;

   public ftg(foz $$0, int $$1, gbh $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fpc<?> $$0) {
      this.b(ftg.b.a(this.c.n, $$0, this.n));
   }

   public void a(fpc<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fpc<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(ftg.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fsh> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fsh $$0, @Nullable fsh $$1) {
      this.b(ftg.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fsh b(fpc<?> $$0) {
      for (ftg.a $$1 : this.aE_()) {
         if ($$1 instanceof ftg.b $$2) {
            fsh $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (ftg.a $$0 : this.aE_()) {
         if ($$0 instanceof ftg.b) {
            ftg.b $$1 = (ftg.b)$$0;

            for (fsh $$2 : $$1.a.values()) {
               if ($$2 instanceof fpc.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fug> e(double $$0, double $$1) {
      for (ftg.a $$2 : this.aE_()) {
         for (fug $$3 : $$2.aE_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fsp.a<ftg.a> {
      private final List<fsh> a;
      private final fyb b;
      private static final int c = 160;

      a(List<fsh> $$0, fyb $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static ftg.a a(List<fsh> $$0, fyb $$1) {
         return new ftg.a($$0, $$1);
      }

      public static ftg.a a(fsh $$0, @Nullable fsh $$1, fyb $$2) {
         return $$1 == null ? new ftg.a(ImmutableList.of($$0), $$2) : new ftg.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fsh $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fug> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fwe> b() {
         return this.a;
      }
   }

   protected static class b extends ftg.a {
      final Map<fpc<?>, fsh> a;

      private b(Map<fpc<?>, fsh> $$0, gbh $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static ftg.b a(fpd $$0, fpc<?> $$1, gbh $$2) {
         return new ftg.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static ftg.b a(fpd $$0, fpc<?> $$1, @Nullable fpc<?> $$2, gbh $$3) {
         fsh $$4 = $$1.a($$0);
         return $$2 == null ? new ftg.b(ImmutableMap.of($$1, $$4), $$3) : new ftg.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
