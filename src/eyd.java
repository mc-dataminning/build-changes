import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class eyd extends exm<eyd.a> {
   public eyd(evi $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.e = false;
   }

   public int a(evl<?> $$0) {
      return this.b(eyd.a.a(this.c.m, this.g, $$0));
   }

   public void a(evl<?> $$0, @Nullable evl<?> $$1) {
      this.b(eyd.a.a(this.c.m, this.g, $$0, $$1));
   }

   public void a(evl<?>[] $$0) {
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
   public exe b(evl<?> $$0) {
      for (eyd.a $$1 : this.l()) {
         exe $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<exe> e(double $$0, double $$1) {
      for (eyd.a $$2 : this.l()) {
         for (exe $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends exm.a<eyd.a> {
      final Map<evl<?>, exe> a;
      final List<exe> b;

      private a(Map<evl<?>, exe> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static eyd.a a(evm $$0, int $$1, evl<?> $$2) {
         return new eyd.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static eyd.a a(evm $$0, int $$1, evl<?> $$2, @Nullable evl<?> $$3) {
         exe $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new eyd.a(ImmutableMap.of($$2, $$4)) : new eyd.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.o($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends ezb> l() {
         return this.b;
      }

      @Override
      public List<? extends fax> a() {
         return this.b;
      }
   }
}
