public enum dwo implements baj {
   a("harp", awo.rX, dwo.a.a),
   b("basedrum", awo.rR, dwo.a.a),
   c("snare", awo.sa, dwo.a.a),
   d("hat", awo.rY, dwo.a.a),
   e("bass", awo.rS, dwo.a.a),
   f("flute", awo.rV, dwo.a.a),
   g("bell", awo.rT, dwo.a.a),
   h("guitar", awo.rW, dwo.a.a),
   i("chime", awo.rU, dwo.a.a),
   j("xylophone", awo.sb, dwo.a.a),
   k("iron_xylophone", awo.sc, dwo.a.a),
   l("cow_bell", awo.sd, dwo.a.a),
   m("didgeridoo", awo.se, dwo.a.a),
   n("bit", awo.sf, dwo.a.a),
   o("banjo", awo.sg, dwo.a.a),
   p("pling", awo.rZ, dwo.a.a),
   q("zombie", awo.sh, dwo.a.b),
   r("skeleton", awo.si, dwo.a.b),
   s("creeper", awo.sj, dwo.a.b),
   t("dragon", awo.sk, dwo.a.b),
   u("wither_skeleton", awo.sl, dwo.a.b),
   v("piglin", awo.sm, dwo.a.b),
   w("custom_head", awo.Av, dwo.a.c);

   private final String x;
   private final jq<awn> y;
   private final dwo.a z;

   private dwo(final String $$0, final jq<awn> $$1, final dwo.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jq<awn> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dwo.a.a;
   }

   public boolean d() {
      return this.z == dwo.a.c;
   }

   public boolean e() {
      return this.z != dwo.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
