import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fir extends fia<fir.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fqn n;

   public fir(ffw $$0, int $$1, fqn $$2) {
      super($$0, $$1, $$2.r.d(), $$2.r.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(ffz<?> $$0) {
      this.b(fir.b.a(this.c.m, $$0, this.n));
   }

   public void a(ffz<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         ffz<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fir.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fhs> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fhs $$0, @Nullable fhs $$1) {
      this.b(fir.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fhs b(ffz<?> $$0) {
      for (fir.a $$1 : this.aG_()) {
         if ($$1 instanceof fir.b $$2) {
            fhs $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fir.a $$0 : this.aG_()) {
         if ($$0 instanceof fir.b) {
            fir.b $$1 = (fir.b)$$0;

            for (fhs $$2 : $$1.a.values()) {
               if ($$2 instanceof ffz.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fjq> e(double $$0, double $$1) {
      for (fir.a $$2 : this.aG_()) {
         for (fjq $$3 : $$2.aG_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fia.a<fir.a> {
      private final List<fhs> a;
      private final fnl b;
      private static final int c = 160;

      a(List<fhs> $$0, fnl $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fir.a a(List<fhs> $$0, fnl $$1) {
         return new fir.a($$0, $$1);
      }

      public static fir.a a(fhs $$0, @Nullable fhs $$1, fnl $$2) {
         return $$1 == null ? new fir.a(ImmutableList.of($$0), $$2) : new fir.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.m / 2 - 155;

         for (fhs $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fjq> aG_() {
         return this.a;
      }

      @Override
      public List<? extends flo> b() {
         return this.a;
      }
   }

   protected static class b extends fir.a {
      final Map<ffz<?>, fhs> a;

      private b(Map<ffz<?>, fhs> $$0, fqn $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fir.b a(fga $$0, ffz<?> $$1, fqn $$2) {
         return new fir.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fir.b a(fga $$0, ffz<?> $$1, @Nullable ffz<?> $$2, fqn $$3) {
         fhs $$4 = $$1.a($$0);
         return $$2 == null ? new fir.b(ImmutableMap.of($$1, $$4), $$3) : new fir.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
