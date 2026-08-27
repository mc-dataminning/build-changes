import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fsh implements fsj.a {
   final ero a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private fsh.a d;

   public fsh(ero $$0) {
      this.a = $$0;
   }

   @Override
   public void a(emh $$0, fpb $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         gdz $$6 = this.a.T();
         if ($$6 != null) {
            this.d = new fsh.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<cqg, String> $$7 = this.d.c.getNow(null);
         double $$8 = this.a.j.m().b().d * 0.85;

         for (Entry<cqg, String> $$9 : this.d.b.entrySet()) {
            cqg $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               fsj.a($$0, $$1, $$14, (double)iu.a($$10.e, 8), $$8 + (double)$$13, (double)iu.a($$10.f, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<cqg, String> b;
      final CompletableFuture<Map<cqg, String>> c;

      a(gdz $$0, double $$1, double $$2) {
         fjr $$3 = fsh.this.a.r;
         afv<cqz> $$4 = $$3.ac();
         int $$5 = iu.a($$1);
         int $$6 = iu.a($$2);
         Builder<cqg, String> $$7 = ImmutableMap.builder();
         fjn $$8 = $$3.i();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               cqg $$11 = new cqg($$9, $$10);
               String $$12 = "";
               dii $$13 = $$8.a($$9, $$10, false);
               $$12 = $$12 + "Client: ";
               if ($$13 == null) {
                  $$12 = $$12 + "0n/a\n";
               } else {
                  $$12 = $$12 + ($$13.C() ? " E" : "");
                  $$12 = $$12 + "\n";
               }

               $$7.put($$11, $$12);
            }
         }

         this.b = $$7.build();
         this.c = $$0.a(() -> {
            alq $$4x = $$0.a($$4);
            if ($$4x == null) {
               return ImmutableMap.of();
            } else {
               Builder<cqg, String> $$5x = ImmutableMap.builder();
               alo $$6x = $$4x.k();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     cqg $$9x = new cqg($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
