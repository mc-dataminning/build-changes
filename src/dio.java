public enum dio implements auk {
   a("harp", aqv.qJ, dio.a.a),
   b("basedrum", aqv.qD, dio.a.a),
   c("snare", aqv.qM, dio.a.a),
   d("hat", aqv.qK, dio.a.a),
   e("bass", aqv.qE, dio.a.a),
   f("flute", aqv.qH, dio.a.a),
   g("bell", aqv.qF, dio.a.a),
   h("guitar", aqv.qI, dio.a.a),
   i("chime", aqv.qG, dio.a.a),
   j("xylophone", aqv.qN, dio.a.a),
   k("iron_xylophone", aqv.qO, dio.a.a),
   l("cow_bell", aqv.qP, dio.a.a),
   m("didgeridoo", aqv.qQ, dio.a.a),
   n("bit", aqv.qR, dio.a.a),
   o("banjo", aqv.qS, dio.a.a),
   p("pling", aqv.qL, dio.a.a),
   q("zombie", aqv.qT, dio.a.b),
   r("skeleton", aqv.qU, dio.a.b),
   s("creeper", aqv.qV, dio.a.b),
   t("dragon", aqv.qW, dio.a.b),
   u("wither_skeleton", aqv.qX, dio.a.b),
   v("piglin", aqv.qY, dio.a.b),
   w("custom_head", aqv.yZ, dio.a.c);

   private final String x;
   private final ig<aqu> y;
   private final dio.a z;

   private dio(String $$0, ig<aqu> $$1, dio.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ig<aqu> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dio.a.a;
   }

   public boolean d() {
      return this.z == dio.a.c;
   }

   public boolean e() {
      return this.z != dio.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
