public enum eck implements bao {
   a("north_south"),
   b("east_west"),
   c("ascending_east"),
   d("ascending_west"),
   e("ascending_north"),
   f("ascending_south"),
   g("south_east"),
   h("south_west"),
   i("north_west"),
   j("north_east");

   private final String k;

   private eck(final String $$0) {
      this.k = $$0;
   }

   public String a() {
      return this.k;
   }

   @Override
   public String toString() {
      return this.k;
   }

   public boolean b() {
      return this == e || this == c || this == f || this == d;
   }

   @Override
   public String c() {
      return this.k;
   }
}
