import java.util.Locale;

public enum fjb {
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
   private final te k;
   private final te l;

   private fjb(String $$0) {
      this.j = $$0.toUpperCase(Locale.ROOT);
      String $$1 = "gui.abuseReport.reason." + $$0;
      this.k = te.c($$1);
      this.l = te.c($$1 + ".description");
   }

   public String a() {
      return this.j;
   }

   public te b() {
      return this.k;
   }

   public te c() {
      return this.l;
   }
}
