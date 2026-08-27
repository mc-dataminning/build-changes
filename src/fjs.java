import java.util.Locale;

public enum fjs {
   a("generic"),
   b("hate_speech"),
   c("harassment_or_bullying"),
   d("self_harm_or_suicide"),
   e("imminent_harm"),
   f("defamation_impersonation_false_information"),
   g("alcohol_tobacco_drugs"),
   h("child_sexual_exploitation_or_abuse"),
   i("terrorism_or_violent_extremism"),
   j("non_consensual_intimate_imagery");

   private final String k;
   private final ti l;
   private final ti m;

   private fjs(String $$0) {
      this.k = $$0.toUpperCase(Locale.ROOT);
      String $$1 = "gui.abuseReport.reason." + $$0;
      this.l = ti.c($$1);
      this.m = ti.c($$1 + ".description");
   }

   public String a() {
      return this.k;
   }

   public ti b() {
      return this.l;
   }

   public ti c() {
      return this.m;
   }
}
