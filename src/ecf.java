public enum ecf implements bam {
   a("harp", awp.sK, ecf.a.a),
   b("basedrum", awp.sE, ecf.a.a),
   c("snare", awp.sN, ecf.a.a),
   d("hat", awp.sL, ecf.a.a),
   e("bass", awp.sF, ecf.a.a),
   f("flute", awp.sI, ecf.a.a),
   g("bell", awp.sG, ecf.a.a),
   h("guitar", awp.sJ, ecf.a.a),
   i("chime", awp.sH, ecf.a.a),
   j("xylophone", awp.sO, ecf.a.a),
   k("iron_xylophone", awp.sP, ecf.a.a),
   l("cow_bell", awp.sQ, ecf.a.a),
   m("didgeridoo", awp.sR, ecf.a.a),
   n("bit", awp.sS, ecf.a.a),
   o("banjo", awp.sT, ecf.a.a),
   p("pling", awp.sM, ecf.a.a),
   q("zombie", awp.sU, ecf.a.b),
   r("skeleton", awp.sV, ecf.a.b),
   s("creeper", awp.sW, ecf.a.b),
   t("dragon", awp.sX, ecf.a.b),
   u("wither_skeleton", awp.sY, ecf.a.b),
   v("piglin", awp.sZ, ecf.a.b),
   w("custom_head", awp.Bv, ecf.a.c);

   private final String x;
   private final jf<awo> y;
   private final ecf.a z;

   private ecf(final String $$0, final jf<awo> $$1, final ecf.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jf<awo> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == ecf.a.a;
   }

   public boolean d() {
      return this.z == ecf.a.c;
   }

   public boolean e() {
      return this.z != ecf.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
