import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fsz extends fsi<fsz.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final gba n;

   public fsz(fos $$0, int $$1, gba $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fov<?> $$0) {
      this.b(fsz.b.a(this.c.n, $$0, this.n));
   }

   public void a(fov<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fov<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fsz.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fsa> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fsa $$0, @Nullable fsa $$1) {
      this.b(fsz.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fsa b(fov<?> $$0) {
      for (fsz.a $$1 : this.aD_()) {
         if ($$1 instanceof fsz.b $$2) {
            fsa $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fsz.a $$0 : this.aD_()) {
         if ($$0 instanceof fsz.b) {
            fsz.b $$1 = (fsz.b)$$0;

            for (fsa $$2 : $$1.a.values()) {
               if ($$2 instanceof fov.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<ftz> e(double $$0, double $$1) {
      for (fsz.a $$2 : this.aD_()) {
         for (ftz $$3 : $$2.aD_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fsi.a<fsz.a> {
      private final List<fsa> a;
      private final fxu b;
      private static final int c = 160;

      a(List<fsa> $$0, fxu $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fsz.a a(List<fsa> $$0, fxu $$1) {
         return new fsz.a($$0, $$1);
      }

      public static fsz.a a(fsa $$0, @Nullable fsa $$1, fxu $$2) {
         return $$1 == null ? new fsz.a(ImmutableList.of($$0), $$2) : new fsz.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fsa $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends ftz> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fvx> b() {
         return this.a;
      }
   }

   protected static class b extends fsz.a {
      final Map<fov<?>, fsa> a;

      private b(Map<fov<?>, fsa> $$0, gba $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fsz.b a(fow $$0, fov<?> $$1, gba $$2) {
         return new fsz.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fsz.b a(fow $$0, fov<?> $$1, @Nullable fov<?> $$2, gba $$3) {
         fsa $$4 = $$1.a($$0);
         return $$2 == null ? new fsz.b(ImmutableMap.of($$1, $$4), $$3) : new fsz.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
