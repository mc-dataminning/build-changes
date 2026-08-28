public enum eba implements bak {
   a("harp", awn.sH, eba.a.a),
   b("basedrum", awn.sB, eba.a.a),
   c("snare", awn.sK, eba.a.a),
   d("hat", awn.sI, eba.a.a),
   e("bass", awn.sC, eba.a.a),
   f("flute", awn.sF, eba.a.a),
   g("bell", awn.sD, eba.a.a),
   h("guitar", awn.sG, eba.a.a),
   i("chime", awn.sE, eba.a.a),
   j("xylophone", awn.sL, eba.a.a),
   k("iron_xylophone", awn.sM, eba.a.a),
   l("cow_bell", awn.sN, eba.a.a),
   m("didgeridoo", awn.sO, eba.a.a),
   n("bit", awn.sP, eba.a.a),
   o("banjo", awn.sQ, eba.a.a),
   p("pling", awn.sJ, eba.a.a),
   q("zombie", awn.sR, eba.a.b),
   r("skeleton", awn.sS, eba.a.b),
   s("creeper", awn.sT, eba.a.b),
   t("dragon", awn.sU, eba.a.b),
   u("wither_skeleton", awn.sV, eba.a.b),
   v("piglin", awn.sW, eba.a.b),
   w("custom_head", awn.Bs, eba.a.c);

   private final String x;
   private final je<awm> y;
   private final eba.a z;

   private eba(final String $$0, final je<awm> $$1, final eba.a $$2) {
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
      return this.z == eba.a.a;
   }

   public boolean d() {
      return this.z == eba.a.c;
   }

   public boolean e() {
      return this.z != eba.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
