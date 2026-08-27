public enum dse implements ayz {
   a("harp", avi.rV, dse.a.a),
   b("basedrum", avi.rP, dse.a.a),
   c("snare", avi.rY, dse.a.a),
   d("hat", avi.rW, dse.a.a),
   e("bass", avi.rQ, dse.a.a),
   f("flute", avi.rT, dse.a.a),
   g("bell", avi.rR, dse.a.a),
   h("guitar", avi.rU, dse.a.a),
   i("chime", avi.rS, dse.a.a),
   j("xylophone", avi.rZ, dse.a.a),
   k("iron_xylophone", avi.sa, dse.a.a),
   l("cow_bell", avi.sb, dse.a.a),
   m("didgeridoo", avi.sc, dse.a.a),
   n("bit", avi.sd, dse.a.a),
   o("banjo", avi.se, dse.a.a),
   p("pling", avi.rX, dse.a.a),
   q("zombie", avi.sf, dse.a.b),
   r("skeleton", avi.sg, dse.a.b),
   s("creeper", avi.sh, dse.a.b),
   t("dragon", avi.si, dse.a.b),
   u("wither_skeleton", avi.sj, dse.a.b),
   v("piglin", avi.sk, dse.a.b),
   w("custom_head", avi.Ao, dse.a.c);

   private final String x;
   private final ix<avh> y;
   private final dse.a z;

   private dse(String $$0, ix<avh> $$1, dse.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ix<avh> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dse.a.a;
   }

   public boolean d() {
      return this.z == dse.a.c;
   }

   public boolean e() {
      return this.z != dse.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
