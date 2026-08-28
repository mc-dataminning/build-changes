import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface fkt {
   fkt a = new fkt() {
      @Override
      public void a(fjn $$0, int $$1, int $$2) {
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4) {
      }

      @Override
      public void b(fjn $$0, int $$1, int $$2, int $$3, int $$4) {
      }

      @Override
      public int c(fjn $$0, int $$1, int $$2, int $$3, int $$4) {
         return $$2;
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

   static fkt a(fjl $$0, xd... $$1) {
      return a($$0, Integer.MAX_VALUE, Integer.MAX_VALUE, $$1);
   }

   static fkt a(fjl $$0, int $$1, xd... $$2) {
      return a($$0, $$1, Integer.MAX_VALUE, $$2);
   }

   static fkt a(fjl $$0, xd $$1, int $$2) {
      return a($$0, $$2, Integer.MAX_VALUE, $$1);
   }

   static fkt a(final fjl $$0, final int $$1, final int $$2, final xd... $$3) {
      return $$3.length == 0 ? a : new fkt() {
         @Nullable
         private List<fkt.a> f;
         @Nullable
         private ua g;

         @Override
         public void a(fjn $$0x, int $$1x, int $$2x) {
            this.a($$0, $$1, $$2, 9, -1);
         }

         @Override
         public void a(fjn $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fkt.a $$6 : this.c()) {
               $$0.a($$0, $$6.a, $$1, $$5, $$4);
               $$5 += $$3;
            }
         }

         @Override
         public void b(fjn $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fkt.a $$6 : this.c()) {
               $$0.b($$0, $$6.a, $$1, $$5, $$4);
               $$5 += $$3;
            }
         }

         @Override
         public int c(fjn $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fkt.a $$6 : this.c()) {
               $$0.a($$0, $$6.a, $$1, $$5, $$4, false);
               $$5 += $$3;
            }

            return $$5;
         }

         private List<fkt.a> c() {
            ua $$0 = ua.a();
            if (this.f != null && $$0 == this.g) {
               return this.f;
            } else {
               this.g = $$0;
               List<ayo> $$1 = new ArrayList<>();

               for (xd $$2 : $$3) {
                  $$1.addAll($$0.c($$2, $$1));
               }

               this.f = new ArrayList<>();

               for (ayo $$3 : $$1.subList(0, Math.min($$1.size(), $$2))) {
                  this.f.add(new fkt.a($$3, $$0.a($$3)));
               }

               return this.f;
            }
         }

         @Override
         public int a() {
            return this.c().size();
         }

         @Override
         public int b() {
            return Math.min($$1, this.c().stream().mapToInt(fkt.a::b).max().orElse(0));
         }
      };
   }

   void a(fjn var1, int var2, int var3);

   void a(fjn var1, int var2, int var3, int var4, int var5);

   void b(fjn var1, int var2, int var3, int var4, int var5);

   int c(fjn var1, int var2, int var3, int var4, int var5);

   int a();

   int b();

   public static record a(ayo a, int b) {
   }
}
