import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

public interface fei {
   fei a = new fei() {
      @Override
      public int a(fdc $$0, int $$1, int $$2) {
         return $$2;
      }

      @Override
      public int a(fdc $$0, int $$1, int $$2, int $$3, int $$4) {
         return $$2;
      }

      @Override
      public int b(fdc $$0, int $$1, int $$2, int $$3, int $$4) {
         return $$2;
      }

      @Override
      public int c(fdc $$0, int $$1, int $$2, int $$3, int $$4) {
         return $$2;
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      }

      @Override
      public int a() {
         return 0;
      }

      @Override
      public int b() {
         return 0;
      }
   };

   static fei a(fda $$0, wl $$1, int $$2) {
      return b($$0, $$0.c($$1, $$2).stream().map($$1x -> new fei.a($$1x, $$0.a($$1x))).collect(ImmutableList.toImmutableList()));
   }

   static fei a(fda $$0, wl $$1, int $$2, int $$3) {
      return b($$0, $$0.c($$1, $$2).stream().limit((long)$$3).map($$1x -> new fei.a($$1x, $$0.a($$1x))).collect(ImmutableList.toImmutableList()));
   }

   static fei a(fda $$0, wg... $$1) {
      return b($$0, Arrays.stream($$1).map(wg::g).map($$1x -> new fei.a($$1x, $$0.a($$1x))).collect(ImmutableList.toImmutableList()));
   }

   static fei a(fda $$0, List<wg> $$1) {
      return b($$0, $$1.stream().map(wg::g).map($$1x -> new fei.a($$1x, $$0.a($$1x))).collect(ImmutableList.toImmutableList()));
   }

   static fei b(final fda $$0, final List<fei.a> $$1) {
      return $$1.isEmpty() ? a : new fei() {
         private final int d = $$1.stream().mapToInt($$0x -> $$0x.b).max().orElse(0);

         @Override
         public int a(fdc $$0x, int $$1x, int $$2) {
            return this.a($$0, $$1, $$2, 9, 16777215);
         }

         @Override
         public int a(fdc $$0x, int $$1x, int $$2, int $$3, int $$4) {
            int $$5 = $$2;

            for (fei.a $$6 : $$1) {
               $$0.b($$0, $$6.a, $$1 - $$6.b / 2, $$5, $$4);
               $$5 += $$3;
            }

            return $$5;
         }

         @Override
         public int b(fdc $$0x, int $$1x, int $$2, int $$3, int $$4) {
            int $$5 = $$2;

            for (fei.a $$6 : $$1) {
               $$0.b($$0, $$6.a, $$1, $$5, $$4);
               $$5 += $$3;
            }

            return $$5;
         }

         @Override
         public int c(fdc $$0x, int $$1x, int $$2, int $$3, int $$4) {
            int $$5 = $$2;

            for (fei.a $$6 : $$1) {
               $$0.a($$0, $$6.a, $$1, $$5, $$4, false);
               $$5 += $$3;
            }

            return $$5;
         }

         @Override
         public void a(fdc $$0x, int $$1x, int $$2, int $$3, int $$4, int $$5) {
            int $$6 = $$1.stream().mapToInt($$0xx -> $$0xx.b).max().orElse(0);
            if ($$6 > 0) {
               $$0.a($$1 - $$6 / 2 - $$4, $$2 - $$4, $$1 + $$6 / 2 + $$4, $$2 + $$1.size() * $$3 + $$4, $$5);
            }
         }

         @Override
         public int a() {
            return $$1.size();
         }

         @Override
         public int b() {
            return this.d;
         }
      };
   }

   int a(fdc var1, int var2, int var3);

   int a(fdc var1, int var2, int var3, int var4, int var5);

   int b(fdc var1, int var2, int var3, int var4, int var5);

   int c(fdc var1, int var2, int var3, int var4, int var5);

   void a(fdc var1, int var2, int var3, int var4, int var5, int var6);

   int a();

   int b();

   public static class a {
      final aww a;
      final int b;

      a(aww $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
