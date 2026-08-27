public enum dij implements aug {
   a("harp", aqr.qJ, dij.a.a),
   b("basedrum", aqr.qD, dij.a.a),
   c("snare", aqr.qM, dij.a.a),
   d("hat", aqr.qK, dij.a.a),
   e("bass", aqr.qE, dij.a.a),
   f("flute", aqr.qH, dij.a.a),
   g("bell", aqr.qF, dij.a.a),
   h("guitar", aqr.qI, dij.a.a),
   i("chime", aqr.qG, dij.a.a),
   j("xylophone", aqr.qN, dij.a.a),
   k("iron_xylophone", aqr.qO, dij.a.a),
   l("cow_bell", aqr.qP, dij.a.a),
   m("didgeridoo", aqr.qQ, dij.a.a),
   n("bit", aqr.qR, dij.a.a),
   o("banjo", aqr.qS, dij.a.a),
   p("pling", aqr.qL, dij.a.a),
   q("zombie", aqr.qT, dij.a.b),
   r("skeleton", aqr.qU, dij.a.b),
   s("creeper", aqr.qV, dij.a.b),
   t("dragon", aqr.qW, dij.a.b),
   u("wither_skeleton", aqr.qX, dij.a.b),
   v("piglin", aqr.qY, dij.a.b),
   w("custom_head", aqr.yZ, dij.a.c);

   private final String x;
   private final ib<aqq> y;
   private final dij.a z;

   private dij(String $$0, ib<aqq> $$1, dij.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ib<aqq> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dij.a.a;
   }

   public boolean d() {
      return this.z == dij.a.c;
   }

   public boolean e() {
      return this.z != dij.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
