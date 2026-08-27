import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fbh extends faq<fbh.a> {
   public fbh(eyk $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.e = false;
   }

   public int a(eyn<?> $$0) {
      return this.b(fbh.a.a(this.c.m, this.g, $$0));
   }

   public void a(eyn<?> $$0, @Nullable eyn<?> $$1) {
      this.b(fbh.a.a(this.c.m, this.g, $$0, $$1));
   }

   public void a(eyn<?>[] $$0) {
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
   public fai b(eyn<?> $$0) {
      for (fbh.a $$1 : this.l()) {
         fai $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<fai> e(double $$0, double $$1) {
      for (fbh.a $$2 : this.l()) {
         for (fai $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends faq.a<fbh.a> {
      final Map<eyn<?>, fai> a;
      final List<fai> b;

      private a(Map<eyn<?>, fai> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static fbh.a a(eyo $$0, int $$1, eyn<?> $$2) {
         return new fbh.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static fbh.a a(eyo $$0, int $$1, eyn<?> $$2, @Nullable eyn<?> $$3) {
         fai $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new fbh.a(ImmutableMap.of($$2, $$4)) : new fbh.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.n($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends fcg> l() {
         return this.b;
      }

      @Override
      public List<? extends fed> a() {
         return this.b;
      }
   }
}
