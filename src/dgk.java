public enum dgk implements asp {
   a("harp", apd.qp, dgk.a.a),
   b("basedrum", apd.qj, dgk.a.a),
   c("snare", apd.qs, dgk.a.a),
   d("hat", apd.qq, dgk.a.a),
   e("bass", apd.qk, dgk.a.a),
   f("flute", apd.qn, dgk.a.a),
   g("bell", apd.ql, dgk.a.a),
   h("guitar", apd.qo, dgk.a.a),
   i("chime", apd.qm, dgk.a.a),
   j("xylophone", apd.qt, dgk.a.a),
   k("iron_xylophone", apd.qu, dgk.a.a),
   l("cow_bell", apd.qv, dgk.a.a),
   m("didgeridoo", apd.qw, dgk.a.a),
   n("bit", apd.qx, dgk.a.a),
   o("banjo", apd.qy, dgk.a.a),
   p("pling", apd.qr, dgk.a.a),
   q("zombie", apd.qz, dgk.a.b),
   r("skeleton", apd.qA, dgk.a.b),
   s("creeper", apd.qB, dgk.a.b),
   t("dragon", apd.qC, dgk.a.b),
   u("wither_skeleton", apd.qD, dgk.a.b),
   v("piglin", apd.qE, dgk.a.b),
   w("custom_head", apd.yu, dgk.a.c);

   private final String x;
   private final he<apc> y;
   private final dgk.a z;

   private dgk(String $$0, he<apc> $$1, dgk.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public he<apc> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dgk.a.a;
   }

   public boolean d() {
      return this.z == dgk.a.c;
   }

   public boolean e() {
      return this.z != dgk.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
