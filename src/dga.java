public enum dga implements ash {
   a("harp", aow.qp, dga.a.a),
   b("basedrum", aow.qj, dga.a.a),
   c("snare", aow.qs, dga.a.a),
   d("hat", aow.qq, dga.a.a),
   e("bass", aow.qk, dga.a.a),
   f("flute", aow.qn, dga.a.a),
   g("bell", aow.ql, dga.a.a),
   h("guitar", aow.qo, dga.a.a),
   i("chime", aow.qm, dga.a.a),
   j("xylophone", aow.qt, dga.a.a),
   k("iron_xylophone", aow.qu, dga.a.a),
   l("cow_bell", aow.qv, dga.a.a),
   m("didgeridoo", aow.qw, dga.a.a),
   n("bit", aow.qx, dga.a.a),
   o("banjo", aow.qy, dga.a.a),
   p("pling", aow.qr, dga.a.a),
   q("zombie", aow.qz, dga.a.b),
   r("skeleton", aow.qA, dga.a.b),
   s("creeper", aow.qB, dga.a.b),
   t("dragon", aow.qC, dga.a.b),
   u("wither_skeleton", aow.qD, dga.a.b),
   v("piglin", aow.qE, dga.a.b),
   w("custom_head", aow.yu, dga.a.c);

   private final String x;
   private final he<aov> y;
   private final dga.a z;

   private dga(String $$0, he<aov> $$1, dga.a $$2) {
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
      return this.z == dga.a.a;
   }

   public boolean d() {
      return this.z == dga.a.c;
   }

   public boolean e() {
      return this.z != dga.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
