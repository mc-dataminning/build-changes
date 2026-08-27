public enum dgb implements ash {
   a("harp", aow.qp, dgb.a.a),
   b("basedrum", aow.qj, dgb.a.a),
   c("snare", aow.qs, dgb.a.a),
   d("hat", aow.qq, dgb.a.a),
   e("bass", aow.qk, dgb.a.a),
   f("flute", aow.qn, dgb.a.a),
   g("bell", aow.ql, dgb.a.a),
   h("guitar", aow.qo, dgb.a.a),
   i("chime", aow.qm, dgb.a.a),
   j("xylophone", aow.qt, dgb.a.a),
   k("iron_xylophone", aow.qu, dgb.a.a),
   l("cow_bell", aow.qv, dgb.a.a),
   m("didgeridoo", aow.qw, dgb.a.a),
   n("bit", aow.qx, dgb.a.a),
   o("banjo", aow.qy, dgb.a.a),
   p("pling", aow.qr, dgb.a.a),
   q("zombie", aow.qz, dgb.a.b),
   r("skeleton", aow.qA, dgb.a.b),
   s("creeper", aow.qB, dgb.a.b),
   t("dragon", aow.qC, dgb.a.b),
   u("wither_skeleton", aow.qD, dgb.a.b),
   v("piglin", aow.qE, dgb.a.b),
   w("custom_head", aow.yp, dgb.a.c);

   private final String x;
   private final he<aov> y;
   private final dgb.a z;

   private dgb(String $$0, he<aov> $$1, dgb.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public he<aov> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dgb.a.a;
   }

   public boolean d() {
      return this.z == dgb.a.c;
   }

   public boolean e() {
      return this.z != dgb.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
