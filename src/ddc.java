public enum ddc implements apr {
   a("harp", amh.qp, ddc.a.a),
   b("basedrum", amh.qj, ddc.a.a),
   c("snare", amh.qs, ddc.a.a),
   d("hat", amh.qq, ddc.a.a),
   e("bass", amh.qk, ddc.a.a),
   f("flute", amh.qn, ddc.a.a),
   g("bell", amh.ql, ddc.a.a),
   h("guitar", amh.qo, ddc.a.a),
   i("chime", amh.qm, ddc.a.a),
   j("xylophone", amh.qt, ddc.a.a),
   k("iron_xylophone", amh.qu, ddc.a.a),
   l("cow_bell", amh.qv, ddc.a.a),
   m("didgeridoo", amh.qw, ddc.a.a),
   n("bit", amh.qx, ddc.a.a),
   o("banjo", amh.qy, ddc.a.a),
   p("pling", amh.qr, ddc.a.a),
   q("zombie", amh.qz, ddc.a.b),
   r("skeleton", amh.qA, ddc.a.b),
   s("creeper", amh.qB, ddc.a.b),
   t("dragon", amh.qC, ddc.a.b),
   u("wither_skeleton", amh.qD, ddc.a.b),
   v("piglin", amh.qE, ddc.a.b),
   w("custom_head", amh.yo, ddc.a.c);

   private final String x;
   private final he<amg> y;
   private final ddc.a z;

   private ddc(String $$0, he<amg> $$1, ddc.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public he<amg> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == ddc.a.a;
   }

   public boolean d() {
      return this.z == ddc.a.c;
   }

   public boolean e() {
      return this.z != ddc.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
