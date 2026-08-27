import java.util.Locale;

public enum fjg {
   a("hate_speech"),
   b("terrorism_or_violent_extremism"),
   c("child_sexual_exploitation_or_abuse"),
   d("imminent_harm"),
   e("non_consensual_intimate_imagery"),
   f("harassment_or_bullying"),
   g("defamation_impersonation_false_information"),
   h("self_harm_or_suicide"),
   i("alcohol_tobacco_drugs");

   private final String j;
   private final tf k;
   private final tf l;

   private fjg(String $$0) {
      this.j = $$0.toUpperCase(Locale.ROOT);
      String $$1 = "gui.abuseReport.reason." + $$0;
      this.k = tf.c($$1);
      this.l = tf.c($$1 + ".description");
   }

   public String a() {
      return this.j;
   }

   public tf b() {
      return this.k;
   }

   public tf c() {
      return this.l;
   }
}
