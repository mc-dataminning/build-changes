public enum ebu implements bak {
   a("harp", awn.sK, ebu.a.a),
   b("basedrum", awn.sE, ebu.a.a),
   c("snare", awn.sN, ebu.a.a),
   d("hat", awn.sL, ebu.a.a),
   e("bass", awn.sF, ebu.a.a),
   f("flute", awn.sI, ebu.a.a),
   g("bell", awn.sG, ebu.a.a),
   h("guitar", awn.sJ, ebu.a.a),
   i("chime", awn.sH, ebu.a.a),
   j("xylophone", awn.sO, ebu.a.a),
   k("iron_xylophone", awn.sP, ebu.a.a),
   l("cow_bell", awn.sQ, ebu.a.a),
   m("didgeridoo", awn.sR, ebu.a.a),
   n("bit", awn.sS, ebu.a.a),
   o("banjo", awn.sT, ebu.a.a),
   p("pling", awn.sM, ebu.a.a),
   q("zombie", awn.sU, ebu.a.b),
   r("skeleton", awn.sV, ebu.a.b),
   s("creeper", awn.sW, ebu.a.b),
   t("dragon", awn.sX, ebu.a.b),
   u("wither_skeleton", awn.sY, ebu.a.b),
   v("piglin", awn.sZ, ebu.a.b),
   w("custom_head", awn.Bv, ebu.a.c);

   private final String x;
   private final jf<awm> y;
   private final ebu.a z;

   private ebu(final String $$0, final jf<awm> $$1, final ebu.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jf<awm> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == ebu.a.a;
   }

   public boolean d() {
      return this.z == ebu.a.c;
   }

   public boolean e() {
      return this.z != ebu.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
