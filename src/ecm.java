public class ecm {
   private final ht a;
   private final int b;
   private final int c;

   public ecm(ht $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static ecm a(rt $$0) {
      ht $$1 = sg.b($$0.p("Pos"));
      int $$2 = $$0.h("Rotation");
      int $$3 = $$0.h("EntityId");
      return new ecm($$1, $$2, $$3);
   }

   public rt a() {
      rt $$0 = new rt();
      $$0.a("Pos", sg.a(this.a));
      $$0.a("Rotation", this.b);
      $$0.a("EntityId", this.c);
      return $$0;
   }

   public ht b() {
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

   public static String a(ht $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
