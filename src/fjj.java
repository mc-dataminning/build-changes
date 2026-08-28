import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fjj extends fis<fjj.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final frh n;

   public fjj(fgo $$0, int $$1, frh $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fgr<?> $$0) {
      this.b(fjj.b.a(this.c.m, $$0, this.n));
   }

   public void a(fgr<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fgr<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fjj.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fik> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fik $$0, @Nullable fik $$1) {
      this.b(fjj.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fik b(fgr<?> $$0) {
      for (fjj.a $$1 : this.aK_()) {
         if ($$1 instanceof fjj.b $$2) {
            fik $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fjj.a $$0 : this.aK_()) {
         if ($$0 instanceof fjj.b) {
            fjj.b $$1 = (fjj.b)$$0;

            for (fik $$2 : $$1.a.values()) {
               if ($$2 instanceof fgr.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fki> e(double $$0, double $$1) {
      for (fjj.a $$2 : this.aK_()) {
         for (fki $$3 : $$2.aK_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fis.a<fjj.a> {
      private final List<fik> a;
      private final fod b;
      private static final int c = 160;

      a(List<fik> $$0, fod $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fjj.a a(List<fik> $$0, fod $$1) {
         return new fjj.a($$0, $$1);
      }

      public static fjj.a a(fik $$0, @Nullable fik $$1, fod $$2) {
         return $$1 == null ? new fjj.a(ImmutableList.of($$0), $$2) : new fjj.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.m / 2 - 155;

         for (fik $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fki> aK_() {
         return this.a;
      }

      @Override
      public List<? extends fmg> b() {
         return this.a;
      }
   }

   protected static class b extends fjj.a {
      final Map<fgr<?>, fik> a;

      private b(Map<fgr<?>, fik> $$0, frh $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fjj.b a(fgs $$0, fgr<?> $$1, frh $$2) {
         return new fjj.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fjj.b a(fgs $$0, fgr<?> $$1, @Nullable fgr<?> $$2, frh $$3) {
         fik $$4 = $$1.a($$0);
         return $$2 == null ? new fjj.b(ImmutableMap.of($$1, $$4), $$3) : new fjj.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
