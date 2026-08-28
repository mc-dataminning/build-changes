public enum ecr implements bax {
   a("harp", awy.sK, ecr.a.a),
   b("basedrum", awy.sE, ecr.a.a),
   c("snare", awy.sN, ecr.a.a),
   d("hat", awy.sL, ecr.a.a),
   e("bass", awy.sF, ecr.a.a),
   f("flute", awy.sI, ecr.a.a),
   g("bell", awy.sG, ecr.a.a),
   h("guitar", awy.sJ, ecr.a.a),
   i("chime", awy.sH, ecr.a.a),
   j("xylophone", awy.sO, ecr.a.a),
   k("iron_xylophone", awy.sP, ecr.a.a),
   l("cow_bell", awy.sQ, ecr.a.a),
   m("didgeridoo", awy.sR, ecr.a.a),
   n("bit", awy.sS, ecr.a.a),
   o("banjo", awy.sT, ecr.a.a),
   p("pling", awy.sM, ecr.a.a),
   q("zombie", awy.sU, ecr.a.b),
   r("skeleton", awy.sV, ecr.a.b),
   s("creeper", awy.sW, ecr.a.b),
   t("dragon", awy.sX, ecr.a.b),
   u("wither_skeleton", awy.sY, ecr.a.b),
   v("piglin", awy.sZ, ecr.a.b),
   w("custom_head", awy.Bv, ecr.a.c);

   private final String x;
   private final jg<awx> y;
   private final ecr.a z;

   private ecr(final String $$0, final jg<awx> $$1, final ecr.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jg<awx> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == ecr.a.a;
   }

   public boolean d() {
      return this.z == ecr.a.c;
   }

   public boolean e() {
      return this.z != ecr.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
