import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fia extends fhj<fia.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final fmu n;

   public fia(ffe $$0, int $$1, int $$2, fmu $$3) {
      super($$0, $$1, $$3.d.d(), $$3.d.c(), 25);
      this.e = false;
      this.n = $$3;
   }

   public void a(ffh<?> $$0) {
      this.b(fia.b.a(this.c.m, $$0, this.n));
   }

   public void a(ffh<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         ffh<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fia.b.a(this.c.m, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fhb> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fhb $$0, @Nullable fhb $$1) {
      this.b(fia.a.a($$0, $$1, this.n));
   }

   @Override
   public int b() {
      return 310;
   }

   @Nullable
   public fhb b(ffh<?> $$0) {
      for (fia.a $$1 : this.aD_()) {
         if ($$1 instanceof fia.b $$2) {
            fhb $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void c() {
      for (fia.a $$0 : this.aD_()) {
         if ($$0 instanceof fia.b) {
            fia.b $$1 = (fia.b)$$0;

            for (fhb $$2 : $$1.a.values()) {
               if ($$2 instanceof ffh.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fiz> e(double $$0, double $$1) {
      for (fia.a $$2 : this.aD_()) {
         for (fiz $$3 : $$2.aD_()) {
            if ($$3.c($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fhj.a<fia.a> {
      private final List<fhb> a;
      private final fnc b;
      private static final int c = 160;

      a(List<fhb> $$0, fnc $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fia.a a(List<fhb> $$0, fnc $$1) {
         return new fia.a($$0, $$1);
      }

      public static fia.a a(fhb $$0, @Nullable fhb $$1, fnc $$2) {
         return $$1 == null ? new fia.a(ImmutableList.of($$0), $$2) : new fia.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fhb $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fiz> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fkx> b() {
         return this.a;
      }
   }

   protected static class b extends fia.a {
      final Map<ffh<?>, fhb> a;

      private b(Map<ffh<?>, fhb> $$0, fmu $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fia.b a(ffi $$0, ffh<?> $$1, fmu $$2) {
         return new fia.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fia.b a(ffi $$0, ffh<?> $$1, @Nullable ffh<?> $$2, fmu $$3) {
         fhb $$4 = $$1.a($$0);
         return $$2 == null ? new fia.b(ImmutableMap.of($$1, $$4), $$3) : new fia.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}
