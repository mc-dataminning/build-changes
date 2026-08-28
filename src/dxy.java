public enum dxy implements azv {
   a("harp", awa.sw, dxy.a.a),
   b("basedrum", awa.sq, dxy.a.a),
   c("snare", awa.sz, dxy.a.a),
   d("hat", awa.sx, dxy.a.a),
   e("bass", awa.sr, dxy.a.a),
   f("flute", awa.su, dxy.a.a),
   g("bell", awa.ss, dxy.a.a),
   h("guitar", awa.sv, dxy.a.a),
   i("chime", awa.st, dxy.a.a),
   j("xylophone", awa.sA, dxy.a.a),
   k("iron_xylophone", awa.sB, dxy.a.a),
   l("cow_bell", awa.sC, dxy.a.a),
   m("didgeridoo", awa.sD, dxy.a.a),
   n("bit", awa.sE, dxy.a.a),
   o("banjo", awa.sF, dxy.a.a),
   p("pling", awa.sy, dxy.a.a),
   q("zombie", awa.sG, dxy.a.b),
   r("skeleton", awa.sH, dxy.a.b),
   s("creeper", awa.sI, dxy.a.b),
   t("dragon", awa.sJ, dxy.a.b),
   u("wither_skeleton", awa.sK, dxy.a.b),
   v("piglin", awa.sL, dxy.a.b),
   w("custom_head", awa.Bf, dxy.a.c);

   private final String x;
   private final jr<avz> y;
   private final dxy.a z;

   private dxy(final String $$0, final jr<avz> $$1, final dxy.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jr<avz> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dxy.a.a;
   }

   public boolean d() {
      return this.z == dxy.a.c;
   }

   public boolean e() {
      return this.z != dxy.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
