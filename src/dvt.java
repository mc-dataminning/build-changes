public enum dvt implements bab {
   a("harp", awg.rZ, dvt.a.a),
   b("basedrum", awg.rT, dvt.a.a),
   c("snare", awg.sc, dvt.a.a),
   d("hat", awg.sa, dvt.a.a),
   e("bass", awg.rU, dvt.a.a),
   f("flute", awg.rX, dvt.a.a),
   g("bell", awg.rV, dvt.a.a),
   h("guitar", awg.rY, dvt.a.a),
   i("chime", awg.rW, dvt.a.a),
   j("xylophone", awg.sd, dvt.a.a),
   k("iron_xylophone", awg.se, dvt.a.a),
   l("cow_bell", awg.sf, dvt.a.a),
   m("didgeridoo", awg.sg, dvt.a.a),
   n("bit", awg.sh, dvt.a.a),
   o("banjo", awg.si, dvt.a.a),
   p("pling", awg.sb, dvt.a.a),
   q("zombie", awg.sj, dvt.a.b),
   r("skeleton", awg.sk, dvt.a.b),
   s("creeper", awg.sl, dvt.a.b),
   t("dragon", awg.sm, dvt.a.b),
   u("wither_skeleton", awg.sn, dvt.a.b),
   v("piglin", awg.so, dvt.a.b),
   w("custom_head", awg.Ax, dvt.a.c);

   private final String x;
   private final jo<awf> y;
   private final dvt.a z;

   private dvt(final String $$0, final jo<awf> $$1, final dvt.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jo<awf> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dvt.a.a;
   }

   public boolean d() {
      return this.z == dvt.a.c;
   }

   public boolean e() {
      return this.z != dvt.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
