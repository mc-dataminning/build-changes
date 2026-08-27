public enum dhx implements aub {
   a("harp", aqn.qt, dhx.a.a),
   b("basedrum", aqn.qn, dhx.a.a),
   c("snare", aqn.qw, dhx.a.a),
   d("hat", aqn.qu, dhx.a.a),
   e("bass", aqn.qo, dhx.a.a),
   f("flute", aqn.qr, dhx.a.a),
   g("bell", aqn.qp, dhx.a.a),
   h("guitar", aqn.qs, dhx.a.a),
   i("chime", aqn.qq, dhx.a.a),
   j("xylophone", aqn.qx, dhx.a.a),
   k("iron_xylophone", aqn.qy, dhx.a.a),
   l("cow_bell", aqn.qz, dhx.a.a),
   m("didgeridoo", aqn.qA, dhx.a.a),
   n("bit", aqn.qB, dhx.a.a),
   o("banjo", aqn.qC, dhx.a.a),
   p("pling", aqn.qv, dhx.a.a),
   q("zombie", aqn.qD, dhx.a.b),
   r("skeleton", aqn.qE, dhx.a.b),
   s("creeper", aqn.qF, dhx.a.b),
   t("dragon", aqn.qG, dhx.a.b),
   u("wither_skeleton", aqn.qH, dhx.a.b),
   v("piglin", aqn.qI, dhx.a.b),
   w("custom_head", aqn.yy, dhx.a.c);

   private final String x;
   private final ib<aqm> y;
   private final dhx.a z;

   private dhx(String $$0, ib<aqm> $$1, dhx.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ib<aqm> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dhx.a.a;
   }

   public boolean d() {
      return this.z == dhx.a.c;
   }

   public boolean e() {
      return this.z != dhx.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
