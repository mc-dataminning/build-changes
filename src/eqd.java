import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class eqd extends epo<eqd.a> {
   public eqd(enn $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public int a(enq<?> $$0) {
      return this.b(eqd.a.a(this.b.m, this.d, $$0));
   }

   public void a(enq<?> $$0, @Nullable enq<?> $$1) {
      this.b(eqd.a.a(this.b.m, this.d, $$0, $$1));
   }

   public void a(enq<?>[] $$0) {
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
   public epf b(enq<?> $$0) {
      for (eqd.a $$1 : this.i()) {
         epf $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<epf> c(double $$0, double $$1) {
      for (eqd.a $$2 : this.i()) {
         for (epf $$3 : $$2.b) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends epo.a<eqd.a> {
      final Map<enq<?>, epf> a;
      final List<epf> b;

      private a(Map<enq<?>, epf> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static eqd.a a(enr $$0, int $$1, enq<?> $$2) {
         return new eqd.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static eqd.a a(enr $$0, int $$1, enq<?> $$2, @Nullable enq<?> $$3) {
         epf $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new eqd.a(ImmutableMap.of($$2, $$4)) : new eqd.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.f($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends eqt> i() {
         return this.b;
      }

      @Override
      public List<? extends esn> b() {
         return this.b;
      }
   }
}
