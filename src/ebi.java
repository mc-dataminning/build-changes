public enum ebi implements bak {
   a("harp", awn.sK, ebi.a.a),
   b("basedrum", awn.sE, ebi.a.a),
   c("snare", awn.sN, ebi.a.a),
   d("hat", awn.sL, ebi.a.a),
   e("bass", awn.sF, ebi.a.a),
   f("flute", awn.sI, ebi.a.a),
   g("bell", awn.sG, ebi.a.a),
   h("guitar", awn.sJ, ebi.a.a),
   i("chime", awn.sH, ebi.a.a),
   j("xylophone", awn.sO, ebi.a.a),
   k("iron_xylophone", awn.sP, ebi.a.a),
   l("cow_bell", awn.sQ, ebi.a.a),
   m("didgeridoo", awn.sR, ebi.a.a),
   n("bit", awn.sS, ebi.a.a),
   o("banjo", awn.sT, ebi.a.a),
   p("pling", awn.sM, ebi.a.a),
   q("zombie", awn.sU, ebi.a.b),
   r("skeleton", awn.sV, ebi.a.b),
   s("creeper", awn.sW, ebi.a.b),
   t("dragon", awn.sX, ebi.a.b),
   u("wither_skeleton", awn.sY, ebi.a.b),
   v("piglin", awn.sZ, ebi.a.b),
   w("custom_head", awn.Bv, ebi.a.c);

   private final String x;
   private final je<awm> y;
   private final ebi.a z;

   private ebi(final String $$0, final je<awm> $$1, final ebi.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public je<awm> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == ebi.a.a;
   }

   public boolean d() {
      return this.z == ebi.a.c;
   }

   public boolean e() {
      return this.z != ebi.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
