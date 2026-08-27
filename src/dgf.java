public enum dgf implements ask {
   a("harp", aoz.qp, dgf.a.a),
   b("basedrum", aoz.qj, dgf.a.a),
   c("snare", aoz.qs, dgf.a.a),
   d("hat", aoz.qq, dgf.a.a),
   e("bass", aoz.qk, dgf.a.a),
   f("flute", aoz.qn, dgf.a.a),
   g("bell", aoz.ql, dgf.a.a),
   h("guitar", aoz.qo, dgf.a.a),
   i("chime", aoz.qm, dgf.a.a),
   j("xylophone", aoz.qt, dgf.a.a),
   k("iron_xylophone", aoz.qu, dgf.a.a),
   l("cow_bell", aoz.qv, dgf.a.a),
   m("didgeridoo", aoz.qw, dgf.a.a),
   n("bit", aoz.qx, dgf.a.a),
   o("banjo", aoz.qy, dgf.a.a),
   p("pling", aoz.qr, dgf.a.a),
   q("zombie", aoz.qz, dgf.a.b),
   r("skeleton", aoz.qA, dgf.a.b),
   s("creeper", aoz.qB, dgf.a.b),
   t("dragon", aoz.qC, dgf.a.b),
   u("wither_skeleton", aoz.qD, dgf.a.b),
   v("piglin", aoz.qE, dgf.a.b),
   w("custom_head", aoz.yu, dgf.a.c);

   private final String x;
   private final hg<aoy> y;
   private final dgf.a z;

   private dgf(String $$0, hg<aoy> $$1, dgf.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public hg<aoy> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dgf.a.a;
   }

   public boolean d() {
      return this.z == dgf.a.c;
   }

   public boolean e() {
      return this.z != dgf.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
