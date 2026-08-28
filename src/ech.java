public enum ech implements bao {
   a("harp", awr.sK, ech.a.a),
   b("basedrum", awr.sE, ech.a.a),
   c("snare", awr.sN, ech.a.a),
   d("hat", awr.sL, ech.a.a),
   e("bass", awr.sF, ech.a.a),
   f("flute", awr.sI, ech.a.a),
   g("bell", awr.sG, ech.a.a),
   h("guitar", awr.sJ, ech.a.a),
   i("chime", awr.sH, ech.a.a),
   j("xylophone", awr.sO, ech.a.a),
   k("iron_xylophone", awr.sP, ech.a.a),
   l("cow_bell", awr.sQ, ech.a.a),
   m("didgeridoo", awr.sR, ech.a.a),
   n("bit", awr.sS, ech.a.a),
   o("banjo", awr.sT, ech.a.a),
   p("pling", awr.sM, ech.a.a),
   q("zombie", awr.sU, ech.a.b),
   r("skeleton", awr.sV, ech.a.b),
   s("creeper", awr.sW, ech.a.b),
   t("dragon", awr.sX, ech.a.b),
   u("wither_skeleton", awr.sY, ech.a.b),
   v("piglin", awr.sZ, ech.a.b),
   w("custom_head", awr.Bv, ech.a.c);

   private final String x;
   private final jg<awq> y;
   private final ech.a z;

   private ech(final String $$0, final jg<awq> $$1, final ech.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jg<awq> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == ech.a.a;
   }

   public boolean d() {
      return this.z == ech.a.c;
   }

   public boolean e() {
      return this.z != ech.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
