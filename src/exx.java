import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

public interface exx {
   exx a = new exx() {
      @Override
      public int a(ews $$0, int $$1, int $$2) {
         return $$2;
      }

      @Override
      public int a(ews $$0, int $$1, int $$2, int $$3, int $$4) {
         return $$2;
      }

      @Override
      public int b(ews $$0, int $$1, int $$2, int $$3, int $$4) {
         return $$2;
      }

      @Override
      public int c(ews $$0, int $$1, int $$2, int $$3, int $$4) {
         return $$2;
      }

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
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

   static exx a(ewq $$0, vk $$1, int $$2) {
      return b($$0, $$0.c($$1, $$2).stream().map($$1x -> new exx.a($$1x, $$0.a($$1x))).collect(ImmutableList.toImmutableList()));
   }

   static exx a(ewq $$0, vk $$1, int $$2, int $$3) {
      return b($$0, $$0.c($$1, $$2).stream().limit((long)$$3).map($$1x -> new exx.a($$1x, $$0.a($$1x))).collect(ImmutableList.toImmutableList()));
   }

   static exx a(ewq $$0, vf... $$1) {
      return b($$0, Arrays.stream($$1).map(vf::g).map($$1x -> new exx.a($$1x, $$0.a($$1x))).collect(ImmutableList.toImmutableList()));
   }

   static exx a(ewq $$0, List<vf> $$1) {
      return b($$0, $$1.stream().map(vf::g).map($$1x -> new exx.a($$1x, $$0.a($$1x))).collect(ImmutableList.toImmutableList()));
   }

   static exx b(final ewq $$0, final List<exx.a> $$1) {
      return $$1.isEmpty() ? a : new exx() {
         private final int d = $$1.stream().mapToInt($$0x -> $$0x.b).max().orElse(0);

         @Override
         public int a(ews $$0x, int $$1x, int $$2) {
            return this.a($$0, $$1, $$2, 9, 16777215);
         }

         @Override
         public int a(ews $$0x, int $$1x, int $$2, int $$3, int $$4) {
            int $$5 = $$2;

            for (exx.a $$6 : $$1) {
               $$0.b($$0, $$6.a, $$1 - $$6.b / 2, $$5, $$4);
               $$5 += $$3;
            }

            return $$5;
         }

         @Override
         public int b(ews $$0x, int $$1x, int $$2, int $$3, int $$4) {
            int $$5 = $$2;

            for (exx.a $$6 : $$1) {
               $$0.b($$0, $$6.a, $$1, $$5, $$4);
               $$5 += $$3;
            }

            return $$5;
         }

         @Override
         public int c(ews $$0x, int $$1x, int $$2, int $$3, int $$4) {
            int $$5 = $$2;

            for (exx.a $$6 : $$1) {
               $$0.a($$0, $$6.a, $$1, $$5, $$4, false);
               $$5 += $$3;
            }

            return $$5;
         }

         @Override
         public void a(ews $$0x, int $$1x, int $$2, int $$3, int $$4, int $$5) {
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

   int a(ews var1, int var2, int var3);

   int a(ews var1, int var2, int var3, int var4, int var5);

   int b(ews var1, int var2, int var3, int var4, int var5);

   int c(ews var1, int var2, int var3, int var4, int var5);

   void a(ews var1, int var2, int var3, int var4, int var5, int var6);

   int a();

   int b();

   public static class a {
      final atz a;
      final int b;

      a(atz $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
