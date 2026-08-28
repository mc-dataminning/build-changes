import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fsn extends frw<fsn.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final gao n;

   public fsn(fof $$0, int $$1, gao $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(foi<?> $$0) {
      this.b(fsn.b.a(this.c.n, $$0, this.n));
   }

   public void a(foi<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         foi<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fsn.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fro> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fro $$0, @Nullable fro $$1) {
      this.b(fsn.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fro b(foi<?> $$0) {
      for (fsn.a $$1 : this.aD_()) {
         if ($$1 instanceof fsn.b $$2) {
            fro $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fsn.a $$0 : this.aD_()) {
         if ($$0 instanceof fsn.b) {
            fsn.b $$1 = (fsn.b)$$0;

            for (fro $$2 : $$1.a.values()) {
               if ($$2 instanceof foi.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<ftn> e(double $$0, double $$1) {
      for (fsn.a $$2 : this.aD_()) {
         for (ftn $$3 : $$2.aD_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends frw.a<fsn.a> {
      private final List<fro> a;
      private final fxi b;
      private static final int c = 160;

      a(List<fro> $$0, fxi $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fsn.a a(List<fro> $$0, fxi $$1) {
         return new fsn.a($$0, $$1);
      }

      public static fsn.a a(fro $$0, @Nullable fro $$1, fxi $$2) {
         return $$1 == null ? new fsn.a(ImmutableList.of($$0), $$2) : new fsn.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fro $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends ftn> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fvl> b() {
         return this.a;
      }
   }

   protected static class b extends fsn.a {
      final Map<foi<?>, fro> a;

      private b(Map<foi<?>, fro> $$0, gao $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fsn.b a(foj $$0, foi<?> $$1, gao $$2) {
         return new fsn.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fsn.b a(foj $$0, foi<?> $$1, @Nullable foi<?> $$2, gao $$3) {
         fro $$4 = $$1.a($$0);
         return $$2 == null ? new fsn.b(ImmutableMap.of($$1, $$4), $$3) : new fsn.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
