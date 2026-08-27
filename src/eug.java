import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class eug extends etp<eug.a> {
   public eug(ero $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.k = false;
   }

   public int a(err<?> $$0) {
      return this.b(eug.a.a(this.c.m, this.e, $$0));
   }

   public void a(err<?> $$0, @Nullable err<?> $$1) {
      this.b(eug.a.a(this.c.m, this.e, $$0, $$1));
   }

   public void a(err<?>[] $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         this.a($$0[$$1], $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null);
      }
   }

   @Override
   public int b() {
      return 400;
   }

   @Override
   protected int c() {
      return super.c() + 32;
   }

   @Nullable
   public eth b(err<?> $$0) {
      for (eug.a $$1 : this.i()) {
         eth $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<eth> c(double $$0, double $$1) {
      for (eug.a $$2 : this.i()) {
         for (eth $$3 : $$2.b) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends etp.a<eug.a> {
      final Map<err<?>, eth> a;
      final List<eth> b;

      private a(Map<err<?>, eth> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static eug.a a(ers $$0, int $$1, err<?> $$2) {
         return new eug.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static eug.a a(ers $$0, int $$1, err<?> $$2, @Nullable err<?> $$3) {
         eth $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new eug.a(ImmutableMap.of($$2, $$4)) : new eug.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.g($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends eve> i() {
         return this.b;
      }

      @Override
      public List<? extends exa> b() {
         return this.b;
      }
   }
}
