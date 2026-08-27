import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fae extends ezn<fae.a> {
   public fae(exh $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.e = false;
   }

   public int a(exk<?> $$0) {
      return this.b(fae.a.a(this.c.m, this.g, $$0));
   }

   public void a(exk<?> $$0, @Nullable exk<?> $$1) {
      this.b(fae.a.a(this.c.m, this.g, $$0, $$1));
   }

   public void a(exk<?>[] $$0) {
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
   public ezf b(exk<?> $$0) {
      for (fae.a $$1 : this.l()) {
         ezf $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<ezf> e(double $$0, double $$1) {
      for (fae.a $$2 : this.l()) {
         for (ezf $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends ezn.a<fae.a> {
      final Map<exk<?>, ezf> a;
      final List<ezf> b;

      private a(Map<exk<?>, ezf> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static fae.a a(exl $$0, int $$1, exk<?> $$2) {
         return new fae.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static fae.a a(exl $$0, int $$1, exk<?> $$2, @Nullable exk<?> $$3) {
         ezf $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new fae.a(ImmutableMap.of($$2, $$4)) : new fae.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.n($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends fbd> l() {
         return this.b;
      }

      @Override
      public List<? extends fda> a() {
         return this.b;
      }
   }
}
