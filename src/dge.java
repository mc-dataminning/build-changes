public enum dge implements asu {
   a("harp", apg.qp, dge.a.a),
   b("basedrum", apg.qj, dge.a.a),
   c("snare", apg.qs, dge.a.a),
   d("hat", apg.qq, dge.a.a),
   e("bass", apg.qk, dge.a.a),
   f("flute", apg.qn, dge.a.a),
   g("bell", apg.ql, dge.a.a),
   h("guitar", apg.qo, dge.a.a),
   i("chime", apg.qm, dge.a.a),
   j("xylophone", apg.qt, dge.a.a),
   k("iron_xylophone", apg.qu, dge.a.a),
   l("cow_bell", apg.qv, dge.a.a),
   m("didgeridoo", apg.qw, dge.a.a),
   n("bit", apg.qx, dge.a.a),
   o("banjo", apg.qy, dge.a.a),
   p("pling", apg.qr, dge.a.a),
   q("zombie", apg.qz, dge.a.b),
   r("skeleton", apg.qA, dge.a.b),
   s("creeper", apg.qB, dge.a.b),
   t("dragon", apg.qC, dge.a.b),
   u("wither_skeleton", apg.qD, dge.a.b),
   v("piglin", apg.qE, dge.a.b),
   w("custom_head", apg.yu, dge.a.c);

   private final String x;
   private final he<apf> y;
   private final dge.a z;

   private dge(String $$0, he<apf> $$1, dge.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public he<apf> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dge.a.a;
   }

   public boolean d() {
      return this.z == dge.a.c;
   }

   public boolean e() {
      return this.z != dge.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
