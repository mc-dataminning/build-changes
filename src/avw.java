import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public interface avw {
   DecimalFormat a = ad.a(new DecimalFormat("########0.00"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
   avw b = NumberFormat.getIntegerInstance(Locale.US)::format;
   avw c = $$0 -> a.format((double)$$0 * 0.1);
   avw d = $$0 -> {
      double $$1 = (double)$$0 / 100.0;
      double $$2 = $$1 / 1000.0;
      if ($$2 > 0.5) {
         return a.format($$2) + " km";
      } else {
         return $$1 > 0.5 ? a.format($$1) + " m" : $$0 + " cm";
      }
   };
   avw e = $$0 -> {
      double $$1 = (double)$$0 / 20.0;
      double $$2 = $$1 / 60.0;
      double $$3 = $$2 / 60.0;
      double $$4 = $$3 / 24.0;
      double $$5 = $$4 / 365.0;
      if ($$5 > 0.5) {
         return a.format($$5) + " y";
      } else if ($$4 > 0.5) {
         return a.format($$4) + " d";
      } else if ($$3 > 0.5) {
         return a.format($$3) + " h";
      } else {
         return $$2 > 0.5 ? a.format($$2) + " m" : $$1 + " s";
      }
   };

   String format(int var1);
}
