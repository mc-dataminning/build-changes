import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public class flt {
   private static final int a = 105;
   private static final int b = 5;
   private static final int c = 10;
   private final fjl d;
   @Nullable
   private bnx e;
   private String f = "root";
   private int g = 0;

   public flt(fjl $$0) {
      this.d = $$0;
   }

   public void a(@Nullable bnx $$0) {
      this.e = $$0;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public void a(fjn $$0) {
      if (this.e != null) {
         List<boa> $$1 = this.e.a(this.f);
         boa $$2 = $$1.removeFirst();
         int $$3 = $$0.a() - 105 - 10;
         int $$4 = $$3 - 105;
         int $$5 = $$3 + 105;
         int $$6 = $$1.size() * 9;
         int $$7 = $$0.b() - this.g - 5;
         int $$8 = $$7 - $$6;
         int $$9 = 62;
         int $$10 = $$8 - 62 - 5;
         $$0.a($$4 - 5, $$10 - 62 - 5, $$5 + 5, $$7 + 5, -1873784752);
         double $$11 = 0.0;

         for (boa $$12 : $$1) {
            int $$13 = azc.a($$12.a / 4.0) + 1;
            fcy $$14 = $$0.d().getBuffer(ghe.D());
            int $$15 = axn.f($$12.a());
            int $$16 = axn.a($$15, -8355712);
            fcu.a $$17 = $$0.c().c();
            $$14.a($$17, (float)$$3, (float)$$10, 10.0F).a($$15);

            for (int $$18 = $$13; $$18 >= 0; $$18--) {
               float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
               float $$20 = azc.a($$19) * 105.0F;
               float $$21 = azc.b($$19) * 105.0F * 0.5F;
               $$14.a($$17, (float)$$3 + $$20, (float)$$10 - $$21, 10.0F).a($$15);
            }

            $$14 = $$0.d().getBuffer(ghe.C());

            for (int $$22 = $$13; $$22 > 0; $$22--) {
               float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
               float $$24 = azc.a($$23) * 105.0F;
               float $$25 = azc.b($$23) * 105.0F * 0.5F;
               float $$26 = (float)(($$11 + $$12.a * (double)($$22 - 1) / (double)$$13) * (float) (Math.PI * 2) / 100.0);
               float $$27 = azc.a($$26) * 105.0F;
               float $$28 = azc.b($$26) * 105.0F * 0.5F;
               if (!(($$25 + $$28) / 2.0F > 0.0F)) {
                  $$14.a($$17, (float)$$3 + $$24, (float)$$10 - $$25, 10.0F).a($$16);
                  $$14.a($$17, (float)$$3 + $$24, (float)$$10 - $$25 + 10.0F, 10.0F).a($$16);
                  $$14.a($$17, (float)$$3 + $$27, (float)$$10 - $$28 + 10.0F, 10.0F).a($$16);
                  $$14.a($$17, (float)$$3 + $$27, (float)$$10 - $$28, 10.0F).a($$16);
               }
            }

            $$11 += $$12.a;
         }

         DecimalFormat $$29 = new DecimalFormat("##0.00");
         $$29.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
         String $$30 = bnx.b($$2.d);
         String $$31 = "";
         if (!"unspecified".equals($$30)) {
            $$31 = $$31 + "[0] ";
         }

         if ($$30.isEmpty()) {
            $$31 = $$31 + "ROOT ";
         } else {
            $$31 = $$31 + $$30 + " ";
         }

         int $$32 = 16777215;
         int $$33 = $$10 - 62;
         $$0.b(this.d, $$31, $$4, $$33, 16777215);
         $$31 = $$29.format($$2.b) + "%";
         $$0.b(this.d, $$31, $$5 - this.d.b($$31), $$33, 16777215);

         for (int $$34 = 0; $$34 < $$1.size(); $$34++) {
            boa $$35 = $$1.get($$34);
            StringBuilder $$36 = new StringBuilder();
            if ("unspecified".equals($$35.d)) {
               $$36.append("[?] ");
            } else {
               $$36.append("[").append($$34 + 1).append("] ");
            }

            String $$37 = $$36.append($$35.d).toString();
            int $$38 = $$8 + $$34 * 9;
            $$0.b(this.d, $$37, $$4, $$38, $$35.a());
            $$37 = $$29.format($$35.a) + "%";
            $$0.b(this.d, $$37, $$5 - 50 - this.d.b($$37), $$38, $$35.a());
            $$37 = $$29.format($$35.b) + "%";
            $$0.b(this.d, $$37, $$5 - this.d.b($$37), $$38, $$35.a());
         }
      }
   }

   public void b(int $$0) {
      if (this.e != null) {
         List<boa> $$1 = this.e.a(this.f);
         if (!$$1.isEmpty()) {
            boa $$2 = $$1.remove(0);
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
