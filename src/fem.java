import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fem extends fdv<fem.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fjg n;

   public fem(fbp $$0, int $$1, int $$2, fjg $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(fbs<?> $$0) {
      this.b(fem.a.a(this.c.m, $$0, this.n));
   }

   public void a(fbs<?> $$0, @Nullable fbs<?> $$1) {
      this.b(fem.a.a(this.c.m, $$0, $$1, this.n));
   }

   public void a(fbs<?>[] $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         this.a($$0[$$1], $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null);
      }
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fdn b(fbs<?> $$0) {
      for (fem.a $$1 : this.aF_()) {
         fdn $$2 = $$1.a.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   public Optional<fdn> e(double $$0, double $$1) {
      for (fem.a $$2 : this.aF_()) {
         for (fdn $$3 : $$2.b) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fdv.a<fem.a> {
      final Map<fbs<?>, fdn> a;
      final List<fdn> b;
      private static final int c = 160;
      private final fjg d;

      private a(Map<fbs<?>, fdn> $$0, fjg $$1) {
         this.a = $$0;
         this.b = ImmutableList.copyOf($$0.values());
         this.d = $$1;
      }

      public static fem.a a(fbt $$0, fbs<?> $$1, fjg $$2) {
         return new fem.a(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fem.a a(fbt $$0, fbs<?> $$1, @Nullable fbs<?> $$2, fjg $$3) {
         fdn $$4 = $$1.a($$0);
         return $$2 == null ? new fem.a(ImmutableMap.of($$1, $$4), $$3) : new fem.a(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.d.k / 2 - 155;

         for (fdn $$12 : this.b) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends ffl> aF_() {
         return this.b;
      }

      @Override
      public List<? extends fhj> b() {
         return this.b;
      }
   }
}
