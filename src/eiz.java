public class eiz {
   private final ib a;
   private final int b;
   private final int c;

   public eiz(ib $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static eiz a(sy $$0) {
      ib $$1 = tn.b($$0.p("Pos"));
      int $$2 = $$0.h("Rotation");
      int $$3 = $$0.h("EntityId");
      return new eiz($$1, $$2, $$3);
   }

   public sy a() {
      sy $$0 = new sy();
      $$0.a("Pos", tn.a(this.a));
      $$0.a("Rotation", this.b);
      $$0.a("EntityId", this.c);
      return $$0;
   }

   public ib b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public String e() {
      return a(this.a);
   }

   public static String a(ib $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
