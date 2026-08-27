public enum cws implements ayt {
   a("food"),
   b("blocks"),
   c("misc");

   public static final ayt.a<cws> d = ayt.a(cws::values);
   private final String e;

   private cws(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
