public enum ecg implements bak {
   a("none"),
   b("low"),
   c("tall");

   private final String d;

   private ecg(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String toString() {
      return this.c();
   }

   @Override
   public String c() {
      return this.d;
   }
}
