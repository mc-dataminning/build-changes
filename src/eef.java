public class eef {
   private final hx a;
   private final int b;
   private final int c;

   public eef(hx $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static eef a(sd $$0) {
      hx $$1 = ss.b($$0.p("Pos"));
      int $$2 = $$0.h("Rotation");
      int $$3 = $$0.h("EntityId");
      return new eef($$1, $$2, $$3);
   }

   public sd a() {
      sd $$0 = new sd();
      $$0.a("Pos", ss.a(this.a));
      $$0.a("Rotation", this.b);
      $$0.a("EntityId", this.c);
      return $$0;
   }

   public hx b() {
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

   public static String a(hx $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
