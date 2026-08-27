import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class exv extends exe<exv.a> {
   public exv(eva $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.e = false;
   }

   public int a(evd<?> $$0) {
      return this.b(exv.a.a(this.c.m, this.g, $$0));
   }

   public void a(evd<?> $$0, @Nullable evd<?> $$1) {
      this.b(exv.a.a(this.c.m, this.g, $$0, $$1));
   }

   public void a(evd<?>[] $$0) {
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
   public eww b(evd<?> $$0) {
      for (exv.a $$1 : this.l()) {
         eww $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<eww> e(double $$0, double $$1) {
      for (exv.a $$2 : this.l()) {
         for (eww $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends exe.a<exv.a> {
      final Map<evd<?>, eww> a;
      final List<eww> b;

      private a(Map<evd<?>, eww> $$0) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
      }

      public static exv.a a(eve $$0, int $$1, evd<?> $$2) {
         return new exv.a(ImmutableMap.of($$2, $$2.a($$0, $$1 / 2 - 155, 0, 310)));
      }

      public static exv.a a(eve $$0, int $$1, evd<?> $$2, @Nullable evd<?> $$3) {
         eww $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
         return $$3 == null ? new exv.a(ImmutableMap.of($$2, $$4)) : new exv.a(ImmutableMap.of($$2, $$4, $$3, $$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.b.forEach($$5x -> {
            $$5x.o($$2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      @Override
      public List<? extends eyt> l() {
         return this.b;
      }

      @Override
      public List<? extends fap> a() {
         return this.b;
      }
   }
}
