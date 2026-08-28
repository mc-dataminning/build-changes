public enum dvb implements azy {
   a("harp", awd.rZ, dvb.a.a),
   b("basedrum", awd.rT, dvb.a.a),
   c("snare", awd.sc, dvb.a.a),
   d("hat", awd.sa, dvb.a.a),
   e("bass", awd.rU, dvb.a.a),
   f("flute", awd.rX, dvb.a.a),
   g("bell", awd.rV, dvb.a.a),
   h("guitar", awd.rY, dvb.a.a),
   i("chime", awd.rW, dvb.a.a),
   j("xylophone", awd.sd, dvb.a.a),
   k("iron_xylophone", awd.se, dvb.a.a),
   l("cow_bell", awd.sf, dvb.a.a),
   m("didgeridoo", awd.sg, dvb.a.a),
   n("bit", awd.sh, dvb.a.a),
   o("banjo", awd.si, dvb.a.a),
   p("pling", awd.sb, dvb.a.a),
   q("zombie", awd.sj, dvb.a.b),
   r("skeleton", awd.sk, dvb.a.b),
   s("creeper", awd.sl, dvb.a.b),
   t("dragon", awd.sm, dvb.a.b),
   u("wither_skeleton", awd.sn, dvb.a.b),
   v("piglin", awd.so, dvb.a.b),
   w("custom_head", awd.Ax, dvb.a.c);

   private final String x;
   private final jn<awc> y;
   private final dvb.a z;

   private dvb(final String $$0, final jn<awc> $$1, final dvb.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jn<awc> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dvb.a.a;
   }

   public boolean d() {
      return this.z == dvb.a.c;
   }

   public boolean e() {
      return this.z != dvb.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
