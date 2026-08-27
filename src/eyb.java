import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class eyb extends exk<eyb.a> {
   public eyb(evg $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.e = false;
   }

   public int a(evj<?> $$0) {
      return this.b(eyb.a.a(this.c.m, this.g, $$0));
   }

   public void a(evj<?> $$0, @Nullable evj<?> $$1) {
      this.b(eyb.a.a(this.c.m, this.g, $$0, $$1));
   }

   public void a(evj<?>[] $$0) {
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
   public exc b(evj<?> $$0) {
      for (eyb.a $$1 : this.l()) {
         exc $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<exc> e(double $$0, double $$1) {
      for (eyb.a $$2 : this.l()) {
         for (exc $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends exk.a<eyb.a> {
      final Map<evj<?>, exc> a;
      final List<exc> b;

      private a(Map<evj<?>, exc> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static eyb.a a(evk $$0, int $$1, evj<?> $$2) {
         return new eyb.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static eyb.a a(evk $$0, int $$1, evj<?> $$2, @Nullable evj<?> $$3) {
         exc $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new eyb.a(ImmutableMap.of($$2, $$4)) : new eyb.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.o($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends eyz> l() {
         return this.b;
      }

      @Override
      public List<? extends fav> a() {
         return this.b;
      }
   }
}
