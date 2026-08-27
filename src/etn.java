import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class etn extends esw<etn.a> {
   public etn(eqv $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.k = false;
   }

   public int a(eqy<?> $$0) {
      return this.b(etn.a.a(this.c.m, this.e, $$0));
   }

   public void a(eqy<?> $$0, @Nullable eqy<?> $$1) {
      this.b(etn.a.a(this.c.m, this.e, $$0, $$1));
   }

   public void a(eqy<?>[] $$0) {
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
   public eso b(eqy<?> $$0) {
      for (etn.a $$1 : this.i()) {
         eso $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<eso> c(double $$0, double $$1) {
      for (etn.a $$2 : this.i()) {
         for (eso $$3 : $$2.b) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends esw.a<etn.a> {
      final Map<eqy<?>, eso> a;
      final List<eso> b;

      private a(Map<eqy<?>, eso> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static etn.a a(eqz $$0, int $$1, eqy<?> $$2) {
         return new etn.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static etn.a a(eqz $$0, int $$1, eqy<?> $$2, @Nullable eqy<?> $$3) {
         eso $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new etn.a(ImmutableMap.of($$2, $$4)) : new etn.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.g($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends euk> i() {
         return this.b;
      }

      @Override
      public List<? extends ewg> b() {
         return this.b;
      }
   }
}
