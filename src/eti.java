import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class eti extends esr<eti.a> {
   public eti(eqq $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.k = false;
   }

   public int a(eqt<?> $$0) {
      return this.b(eti.a.a(this.c.m, this.e, $$0));
   }

   public void a(eqt<?> $$0, @Nullable eqt<?> $$1) {
      this.b(eti.a.a(this.c.m, this.e, $$0, $$1));
   }

   public void a(eqt<?>[] $$0) {
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
   public esj b(eqt<?> $$0) {
      for (eti.a $$1 : this.i()) {
         esj $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<esj> c(double $$0, double $$1) {
      for (eti.a $$2 : this.i()) {
         for (esj $$3 : $$2.b) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends esr.a<eti.a> {
      final Map<eqt<?>, esj> a;
      final List<esj> b;

      private a(Map<eqt<?>, esj> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static eti.a a(equ $$0, int $$1, eqt<?> $$2) {
         return new eti.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static eti.a a(equ $$0, int $$1, eqt<?> $$2, @Nullable eqt<?> $$3) {
         esj $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new eti.a(ImmutableMap.of($$2, $$4)) : new eti.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.g($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends euf> i() {
         return this.b;
      }

      @Override
      public List<? extends ewb> b() {
         return this.b;
      }
   }
}
