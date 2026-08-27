public enum dhc implements atr {
   a("harp", aqd.qr, dhc.a.a),
   b("basedrum", aqd.ql, dhc.a.a),
   c("snare", aqd.qu, dhc.a.a),
   d("hat", aqd.qs, dhc.a.a),
   e("bass", aqd.qm, dhc.a.a),
   f("flute", aqd.qp, dhc.a.a),
   g("bell", aqd.qn, dhc.a.a),
   h("guitar", aqd.qq, dhc.a.a),
   i("chime", aqd.qo, dhc.a.a),
   j("xylophone", aqd.qv, dhc.a.a),
   k("iron_xylophone", aqd.qw, dhc.a.a),
   l("cow_bell", aqd.qx, dhc.a.a),
   m("didgeridoo", aqd.qy, dhc.a.a),
   n("bit", aqd.qz, dhc.a.a),
   o("banjo", aqd.qA, dhc.a.a),
   p("pling", aqd.qt, dhc.a.a),
   q("zombie", aqd.qB, dhc.a.b),
   r("skeleton", aqd.qC, dhc.a.b),
   s("creeper", aqd.qD, dhc.a.b),
   t("dragon", aqd.qE, dhc.a.b),
   u("wither_skeleton", aqd.qF, dhc.a.b),
   v("piglin", aqd.qG, dhc.a.b),
   w("custom_head", aqd.yw, dhc.a.c);

   private final String x;
   private final ib<aqc> y;
   private final dhc.a z;

   private dhc(String $$0, ib<aqc> $$1, dhc.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ib<aqc> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dhc.a.a;
   }

   public boolean d() {
      return this.z == dhc.a.c;
   }

   public boolean e() {
      return this.z != dhc.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
