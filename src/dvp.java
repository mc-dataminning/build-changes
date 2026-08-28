public enum dvp implements azz {
   a("harp", awe.rZ, dvp.a.a),
   b("basedrum", awe.rT, dvp.a.a),
   c("snare", awe.sc, dvp.a.a),
   d("hat", awe.sa, dvp.a.a),
   e("bass", awe.rU, dvp.a.a),
   f("flute", awe.rX, dvp.a.a),
   g("bell", awe.rV, dvp.a.a),
   h("guitar", awe.rY, dvp.a.a),
   i("chime", awe.rW, dvp.a.a),
   j("xylophone", awe.sd, dvp.a.a),
   k("iron_xylophone", awe.se, dvp.a.a),
   l("cow_bell", awe.sf, dvp.a.a),
   m("didgeridoo", awe.sg, dvp.a.a),
   n("bit", awe.sh, dvp.a.a),
   o("banjo", awe.si, dvp.a.a),
   p("pling", awe.sb, dvp.a.a),
   q("zombie", awe.sj, dvp.a.b),
   r("skeleton", awe.sk, dvp.a.b),
   s("creeper", awe.sl, dvp.a.b),
   t("dragon", awe.sm, dvp.a.b),
   u("wither_skeleton", awe.sn, dvp.a.b),
   v("piglin", awe.so, dvp.a.b),
   w("custom_head", awe.Ax, dvp.a.c);

   private final String x;
   private final jn<awd> y;
   private final dvp.a z;

   private dvp(final String $$0, final jn<awd> $$1, final dvp.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jn<awd> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dvp.a.a;
   }

   public boolean d() {
      return this.z == dvp.a.c;
   }

   public boolean e() {
      return this.z != dvp.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
