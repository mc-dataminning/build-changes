public enum dri implements ayt {
   a("harp", avc.rL, dri.a.a),
   b("basedrum", avc.rF, dri.a.a),
   c("snare", avc.rO, dri.a.a),
   d("hat", avc.rM, dri.a.a),
   e("bass", avc.rG, dri.a.a),
   f("flute", avc.rJ, dri.a.a),
   g("bell", avc.rH, dri.a.a),
   h("guitar", avc.rK, dri.a.a),
   i("chime", avc.rI, dri.a.a),
   j("xylophone", avc.rP, dri.a.a),
   k("iron_xylophone", avc.rQ, dri.a.a),
   l("cow_bell", avc.rR, dri.a.a),
   m("didgeridoo", avc.rS, dri.a.a),
   n("bit", avc.rT, dri.a.a),
   o("banjo", avc.rU, dri.a.a),
   p("pling", avc.rN, dri.a.a),
   q("zombie", avc.rV, dri.a.b),
   r("skeleton", avc.rW, dri.a.b),
   s("creeper", avc.rX, dri.a.b),
   t("dragon", avc.rY, dri.a.b),
   u("wither_skeleton", avc.rZ, dri.a.b),
   v("piglin", avc.sa, dri.a.b),
   w("custom_head", avc.Ad, dri.a.c);

   private final String x;
   private final iw<avb> y;
   private final dri.a z;

   private dri(String $$0, iw<avb> $$1, dri.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public iw<avb> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dri.a.a;
   }

   public boolean d() {
      return this.z == dri.a.c;
   }

   public boolean e() {
      return this.z != dri.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
