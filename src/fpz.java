import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public class fpz {
   private static final int a = 105;
   private static final int b = 5;
   private static final int c = 10;
   private final fnq d;
   @Nullable
   private bpr e;
   private String f = "root";
   private int g = 0;

   public fpz(fnq $$0) {
      this.d = $$0;
   }

   public void a(@Nullable bpr $$0) {
      this.e = $$0;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public void a(fns $$0) {
      if (this.e != null) {
         List<bpv> $$1 = this.e.a(this.f);
         bpv $$2 = $$1.removeFirst();
         int $$3 = $$0.a() - 105 - 10;
         int $$4 = $$3 - 105;
         int $$5 = $$3 + 105;
         int $$6 = $$1.size() * 9;
         int $$7 = $$0.b() - this.g - 5;
         int $$8 = $$7 - $$6;
         int $$9 = 62;
         int $$10 = $$8 - 62 - 5;
         $$0.a($$4 - 5, $$10 - 62 - 5, $$5 + 5, $$7 + 5, -1873784752);
         $$0.a($$4x -> {
            double $$5x = 0.0;

            for (bpv $$6x : $$1) {
               int $$7x = bae.a($$6x.a / 4.0) + 1;
               fgw $$8x = $$4x.getBuffer(glv.D());
               int $$9x = ayp.f($$6x.a());
               int $$10x = ayp.a($$9x, -8355712);
               fgs.a $$11x = $$0.c().c();
               $$8x.a($$11x, (float)$$3, (float)$$10, 10.0F).a($$9x);

               for (int $$12x = $$7x; $$12x >= 0; $$12x--) {
                  float $$13x = (float)(($$5x + $$6x.a * (double)$$12x / (double)$$7x) * (float) (Math.PI * 2) / 100.0);
                  float $$14x = bae.a($$13x) * 105.0F;
                  float $$15x = bae.b($$13x) * 105.0F * 0.5F;
                  $$8x.a($$11x, (float)$$3 + $$14x, (float)$$10 - $$15x, 10.0F).a($$9x);
               }

               $$8x = $$4x.getBuffer(glv.C());

               for (int $$16x = $$7x; $$16x > 0; $$16x--) {
                  float $$17x = (float)(($$5x + $$6x.a * (double)$$16x / (double)$$7x) * (float) (Math.PI * 2) / 100.0);
                  float $$18x = bae.a($$17x) * 105.0F;
                  float $$19x = bae.b($$17x) * 105.0F * 0.5F;
                  float $$20x = (float)(($$5x + $$6x.a * (double)($$16x - 1) / (double)$$7x) * (float) (Math.PI * 2) / 100.0);
                  float $$21 = bae.a($$20x) * 105.0F;
                  float $$22 = bae.b($$20x) * 105.0F * 0.5F;
                  if (!(($$19x + $$22) / 2.0F > 0.0F)) {
                     $$8x.a($$11x, (float)$$3 + $$18x, (float)$$10 - $$19x, 10.0F).a($$10x);
                     $$8x.a($$11x, (float)$$3 + $$18x, (float)$$10 - $$19x + 10.0F, 10.0F).a($$10x);
                     $$8x.a($$11x, (float)$$3 + $$21, (float)$$10 - $$22 + 10.0F, 10.0F).a($$10x);
                     $$8x.a($$11x, (float)$$3 + $$21, (float)$$10 - $$22, 10.0F).a($$10x);
                  }
               }

               $$5x += $$6x.a;
            }
         });
         DecimalFormat $$11 = new DecimalFormat("##0.00");
         $$11.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
         String $$12 = bpr.b($$2.d);
         String $$13 = "";
         if (!"unspecified".equals($$12)) {
            $$13 = $$13 + "[0] ";
         }

         if ($$12.isEmpty()) {
            $$13 = $$13 + "ROOT ";
         } else {
            $$13 = $$13 + $$12 + " ";
         }

         int $$14 = 16777215;
         int $$15 = $$10 - 62;
         $$0.b(this.d, $$13, $$4, $$15, 16777215);
         $$13 = $$11.format($$2.b) + "%";
         $$0.b(this.d, $$13, $$5 - this.d.b($$13), $$15, 16777215);

         for (int $$16 = 0; $$16 < $$1.size(); $$16++) {
            bpv $$17 = $$1.get($$16);
            StringBuilder $$18 = new StringBuilder();
            if ("unspecified".equals($$17.d)) {
               $$18.append("[?] ");
            } else {
               $$18.append("[").append($$16 + 1).append("] ");
            }

            String $$19 = $$18.append($$17.d).toString();
            int $$20 = $$8 + $$16 * 9;
            $$0.b(this.d, $$19, $$4, $$20, $$17.a());
            $$19 = $$11.format($$17.a) + "%";
            $$0.b(this.d, $$19, $$5 - 50 - this.d.b($$19), $$20, $$17.a());
            $$19 = $$11.format($$17.b) + "%";
            $$0.b(this.d, $$19, $$5 - this.d.b($$19), $$20, $$17.a());
         }
      }
   }

   public void b(int $$0) {
      if (this.e != null) {
         List<bpv> $$1 = this.e.a(this.f);
         if (!$$1.isEmpty()) {
            bpv $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.f.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.f = this.f.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.f.isEmpty()) {
                     this.f = this.f + "\u001e";
                  }

                  this.f = this.f + $$1.get($$0).d;
               }
            }
         }
      }
   }
}
