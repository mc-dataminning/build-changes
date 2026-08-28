public enum ebp implements bak {
   a("harp", awn.sK, ebp.a.a),
   b("basedrum", awn.sE, ebp.a.a),
   c("snare", awn.sN, ebp.a.a),
   d("hat", awn.sL, ebp.a.a),
   e("bass", awn.sF, ebp.a.a),
   f("flute", awn.sI, ebp.a.a),
   g("bell", awn.sG, ebp.a.a),
   h("guitar", awn.sJ, ebp.a.a),
   i("chime", awn.sH, ebp.a.a),
   j("xylophone", awn.sO, ebp.a.a),
   k("iron_xylophone", awn.sP, ebp.a.a),
   l("cow_bell", awn.sQ, ebp.a.a),
   m("didgeridoo", awn.sR, ebp.a.a),
   n("bit", awn.sS, ebp.a.a),
   o("banjo", awn.sT, ebp.a.a),
   p("pling", awn.sM, ebp.a.a),
   q("zombie", awn.sU, ebp.a.b),
   r("skeleton", awn.sV, ebp.a.b),
   s("creeper", awn.sW, ebp.a.b),
   t("dragon", awn.sX, ebp.a.b),
   u("wither_skeleton", awn.sY, ebp.a.b),
   v("piglin", awn.sZ, ebp.a.b),
   w("custom_head", awn.Bv, ebp.a.c);

   private final String x;
   private final jf<awm> y;
   private final ebp.a z;

   private ebp(final String $$0, final jf<awm> $$1, final ebp.a $$2) {
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
      return this.z == ebp.a.a;
   }

   public boolean d() {
      return this.z == ebp.a.c;
   }

   public boolean e() {
      return this.z != ebp.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
