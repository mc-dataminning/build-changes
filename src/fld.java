import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface fld {
   fld a = new fld() {
      @Override
      public void a(fjx $$0, int $$1, int $$2) {
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4) {
      }

      @Override
      public void b(fjx $$0, int $$1, int $$2, int $$3, int $$4) {
      }

      @Override
      public int c(fjx $$0, int $$1, int $$2, int $$3, int $$4) {
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

   static fld a(fjv $$0, xd... $$1) {
      return a($$0, Integer.MAX_VALUE, Integer.MAX_VALUE, $$1);
   }

   static fld a(fjv $$0, int $$1, xd... $$2) {
      return a($$0, $$1, Integer.MAX_VALUE, $$2);
   }

   static fld a(fjv $$0, xd $$1, int $$2) {
      return a($$0, $$2, Integer.MAX_VALUE, $$1);
   }

   static fld a(final fjv $$0, final int $$1, final int $$2, final xd... $$3) {
      return $$3.length == 0 ? a : new fld() {
         @Nullable
         private List<fld.a> f;
         @Nullable
         private ua g;

         @Override
         public void a(fjx $$0x, int $$1x, int $$2x) {
            this.a($$0, $$1, $$2, 9, -1);
         }

         @Override
         public void a(fjx $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fld.a $$6 : this.c()) {
               $$0.a($$0, $$6.a, $$1, $$5, $$4);
               $$5 += $$3;
            }
         }

         @Override
         public void b(fjx $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fld.a $$6 : this.c()) {
               $$0.b($$0, $$6.a, $$1, $$5, $$4);
               $$5 += $$3;
            }
         }

         @Override
         public int c(fjx $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fld.a $$6 : this.c()) {
               $$0.a($$0, $$6.a, $$1, $$5, $$4, false);
               $$5 += $$3;
            }

            return $$5;
         }

         private List<fld.a> c() {
            ua $$0 = ua.a();
            if (this.f != null && $$0 == this.g) {
               return this.f;
            } else {
               this.g = $$0;
               List<ayp> $$1 = new ArrayList<>();

               for (xd $$2 : $$3) {
                  $$1.addAll($$0.c($$2, $$1));
               }

               this.f = new ArrayList<>();

               for (ayp $$3 : $$1.subList(0, Math.min($$1.size(), $$2))) {
                  this.f.add(new fld.a($$3, $$0.a($$3)));
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
            return Math.min($$1, this.c().stream().mapToInt(fld.a::b).max().orElse(0));
         }
      };
   }

   void a(fjx var1, int var2, int var3);

   void a(fjx var1, int var2, int var3, int var4, int var5);

   void b(fjx var1, int var2, int var3, int var4, int var5);

   int c(fjx var1, int var2, int var3, int var4, int var5);

   int a();

   int b();

   public static record a(ayp a, int b) {
   }
}
