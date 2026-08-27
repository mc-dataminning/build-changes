import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class eyc extends exl<eyc.a> {
   public eyc(evh $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.e = false;
   }

   public int a(evk<?> $$0) {
      return this.b(eyc.a.a(this.c.m, this.g, $$0));
   }

   public void a(evk<?> $$0, @Nullable evk<?> $$1) {
      this.b(eyc.a.a(this.c.m, this.g, $$0, $$1));
   }

   public void a(evk<?>[] $$0) {
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
   public exd b(evk<?> $$0) {
      for (eyc.a $$1 : this.l()) {
         exd $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<exd> e(double $$0, double $$1) {
      for (eyc.a $$2 : this.l()) {
         for (exd $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends exl.a<eyc.a> {
      final Map<evk<?>, exd> a;
      final List<exd> b;

      private a(Map<evk<?>, exd> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static eyc.a a(evl $$0, int $$1, evk<?> $$2) {
         return new eyc.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static eyc.a a(evl $$0, int $$1, evk<?> $$2, @Nullable evk<?> $$3) {
         exd $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new eyc.a(ImmutableMap.of($$2, $$4)) : new eyc.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.o($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends eza> l() {
         return this.b;
      }

      @Override
      public List<? extends faw> a() {
         return this.b;
      }
   }
}
