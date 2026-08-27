public enum dud implements azg {
   a("harp", avo.su, dud.a.a),
   b("basedrum", avo.so, dud.a.a),
   c("snare", avo.sx, dud.a.a),
   d("hat", avo.sv, dud.a.a),
   e("bass", avo.sp, dud.a.a),
   f("flute", avo.ss, dud.a.a),
   g("bell", avo.sq, dud.a.a),
   h("guitar", avo.st, dud.a.a),
   i("chime", avo.sr, dud.a.a),
   j("xylophone", avo.sy, dud.a.a),
   k("iron_xylophone", avo.sz, dud.a.a),
   l("cow_bell", avo.sA, dud.a.a),
   m("didgeridoo", avo.sB, dud.a.a),
   n("bit", avo.sC, dud.a.a),
   o("banjo", avo.sD, dud.a.a),
   p("pling", avo.sw, dud.a.a),
   q("zombie", avo.sE, dud.a.b),
   r("skeleton", avo.sF, dud.a.b),
   s("creeper", avo.sG, dud.a.b),
   t("dragon", avo.sH, dud.a.b),
   u("wither_skeleton", avo.sI, dud.a.b),
   v("piglin", avo.sJ, dud.a.b),
   w("custom_head", avo.AM, dud.a.c);

   private final String x;
   private final ja<avn> y;
   private final dud.a z;

   private dud(String $$0, ja<avn> $$1, dud.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ja<avn> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dud.a.a;
   }

   public boolean d() {
      return this.z == dud.a.c;
   }

   public boolean e() {
      return this.z != dud.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
