public enum dwv implements bai {
   a("harp", awn.rX, dwv.a.a),
   b("basedrum", awn.rR, dwv.a.a),
   c("snare", awn.sa, dwv.a.a),
   d("hat", awn.rY, dwv.a.a),
   e("bass", awn.rS, dwv.a.a),
   f("flute", awn.rV, dwv.a.a),
   g("bell", awn.rT, dwv.a.a),
   h("guitar", awn.rW, dwv.a.a),
   i("chime", awn.rU, dwv.a.a),
   j("xylophone", awn.sb, dwv.a.a),
   k("iron_xylophone", awn.sc, dwv.a.a),
   l("cow_bell", awn.sd, dwv.a.a),
   m("didgeridoo", awn.se, dwv.a.a),
   n("bit", awn.sf, dwv.a.a),
   o("banjo", awn.sg, dwv.a.a),
   p("pling", awn.rZ, dwv.a.a),
   q("zombie", awn.sh, dwv.a.b),
   r("skeleton", awn.si, dwv.a.b),
   s("creeper", awn.sj, dwv.a.b),
   t("dragon", awn.sk, dwv.a.b),
   u("wither_skeleton", awn.sl, dwv.a.b),
   v("piglin", awn.sm, dwv.a.b),
   w("custom_head", awn.Av, dwv.a.c);

   private final String x;
   private final jq<awm> y;
   private final dwv.a z;

   private dwv(final String $$0, final jq<awm> $$1, final dwv.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jq<awm> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dwv.a.a;
   }

   public boolean d() {
      return this.z == dwv.a.c;
   }

   public boolean e() {
      return this.z != dwv.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
