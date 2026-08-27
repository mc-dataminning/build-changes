public enum dqz implements ayq {
   a("harp", auz.rK, dqz.a.a),
   b("basedrum", auz.rE, dqz.a.a),
   c("snare", auz.rN, dqz.a.a),
   d("hat", auz.rL, dqz.a.a),
   e("bass", auz.rF, dqz.a.a),
   f("flute", auz.rI, dqz.a.a),
   g("bell", auz.rG, dqz.a.a),
   h("guitar", auz.rJ, dqz.a.a),
   i("chime", auz.rH, dqz.a.a),
   j("xylophone", auz.rO, dqz.a.a),
   k("iron_xylophone", auz.rP, dqz.a.a),
   l("cow_bell", auz.rQ, dqz.a.a),
   m("didgeridoo", auz.rR, dqz.a.a),
   n("bit", auz.rS, dqz.a.a),
   o("banjo", auz.rT, dqz.a.a),
   p("pling", auz.rM, dqz.a.a),
   q("zombie", auz.rU, dqz.a.b),
   r("skeleton", auz.rV, dqz.a.b),
   s("creeper", auz.rW, dqz.a.b),
   t("dragon", auz.rX, dqz.a.b),
   u("wither_skeleton", auz.rY, dqz.a.b),
   v("piglin", auz.rZ, dqz.a.b),
   w("custom_head", auz.Ac, dqz.a.c);

   private final String x;
   private final iv<auy> y;
   private final dqz.a z;

   private dqz(String $$0, iv<auy> $$1, dqz.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public iv<auy> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dqz.a.a;
   }

   public boolean d() {
      return this.z == dqz.a.c;
   }

   public boolean e() {
      return this.z != dqz.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
