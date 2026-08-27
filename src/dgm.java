public enum dgm implements asr {
   a("harp", apf.qp, dgm.a.a),
   b("basedrum", apf.qj, dgm.a.a),
   c("snare", apf.qs, dgm.a.a),
   d("hat", apf.qq, dgm.a.a),
   e("bass", apf.qk, dgm.a.a),
   f("flute", apf.qn, dgm.a.a),
   g("bell", apf.ql, dgm.a.a),
   h("guitar", apf.qo, dgm.a.a),
   i("chime", apf.qm, dgm.a.a),
   j("xylophone", apf.qt, dgm.a.a),
   k("iron_xylophone", apf.qu, dgm.a.a),
   l("cow_bell", apf.qv, dgm.a.a),
   m("didgeridoo", apf.qw, dgm.a.a),
   n("bit", apf.qx, dgm.a.a),
   o("banjo", apf.qy, dgm.a.a),
   p("pling", apf.qr, dgm.a.a),
   q("zombie", apf.qz, dgm.a.b),
   r("skeleton", apf.qA, dgm.a.b),
   s("creeper", apf.qB, dgm.a.b),
   t("dragon", apf.qC, dgm.a.b),
   u("wither_skeleton", apf.qD, dgm.a.b),
   v("piglin", apf.qE, dgm.a.b),
   w("custom_head", apf.yu, dgm.a.c);

   private final String x;
   private final hg<ape> y;
   private final dgm.a z;

   private dgm(String $$0, hg<ape> $$1, dgm.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public hg<ape> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dgm.a.a;
   }

   public boolean d() {
      return this.z == dgm.a.c;
   }

   public boolean e() {
      return this.z != dgm.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
