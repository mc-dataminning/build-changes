public enum dqj implements ayg {
   a("harp", auo.rD, dqj.a.a),
   b("basedrum", auo.rx, dqj.a.a),
   c("snare", auo.rG, dqj.a.a),
   d("hat", auo.rE, dqj.a.a),
   e("bass", auo.ry, dqj.a.a),
   f("flute", auo.rB, dqj.a.a),
   g("bell", auo.rz, dqj.a.a),
   h("guitar", auo.rC, dqj.a.a),
   i("chime", auo.rA, dqj.a.a),
   j("xylophone", auo.rH, dqj.a.a),
   k("iron_xylophone", auo.rI, dqj.a.a),
   l("cow_bell", auo.rJ, dqj.a.a),
   m("didgeridoo", auo.rK, dqj.a.a),
   n("bit", auo.rL, dqj.a.a),
   o("banjo", auo.rM, dqj.a.a),
   p("pling", auo.rF, dqj.a.a),
   q("zombie", auo.rN, dqj.a.b),
   r("skeleton", auo.rO, dqj.a.b),
   s("creeper", auo.rP, dqj.a.b),
   t("dragon", auo.rQ, dqj.a.b),
   u("wither_skeleton", auo.rR, dqj.a.b),
   v("piglin", auo.rS, dqj.a.b),
   w("custom_head", auo.zV, dqj.a.c);

   private final String x;
   private final in<aun> y;
   private final dqj.a z;

   private dqj(String $$0, in<aun> $$1, dqj.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public in<aun> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dqj.a.a;
   }

   public boolean d() {
      return this.z == dqj.a.c;
   }

   public boolean e() {
      return this.z != dqj.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
