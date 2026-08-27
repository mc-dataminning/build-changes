public enum dqa implements aye {
   a("harp", aum.rD, dqa.a.a),
   b("basedrum", aum.rx, dqa.a.a),
   c("snare", aum.rG, dqa.a.a),
   d("hat", aum.rE, dqa.a.a),
   e("bass", aum.ry, dqa.a.a),
   f("flute", aum.rB, dqa.a.a),
   g("bell", aum.rz, dqa.a.a),
   h("guitar", aum.rC, dqa.a.a),
   i("chime", aum.rA, dqa.a.a),
   j("xylophone", aum.rH, dqa.a.a),
   k("iron_xylophone", aum.rI, dqa.a.a),
   l("cow_bell", aum.rJ, dqa.a.a),
   m("didgeridoo", aum.rK, dqa.a.a),
   n("bit", aum.rL, dqa.a.a),
   o("banjo", aum.rM, dqa.a.a),
   p("pling", aum.rF, dqa.a.a),
   q("zombie", aum.rN, dqa.a.b),
   r("skeleton", aum.rO, dqa.a.b),
   s("creeper", aum.rP, dqa.a.b),
   t("dragon", aum.rQ, dqa.a.b),
   u("wither_skeleton", aum.rR, dqa.a.b),
   v("piglin", aum.rS, dqa.a.b),
   w("custom_head", aum.zV, dqa.a.c);

   private final String x;
   private final il<aul> y;
   private final dqa.a z;

   private dqa(String $$0, il<aul> $$1, dqa.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public il<aul> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dqa.a.a;
   }

   public boolean d() {
      return this.z == dqa.a.c;
   }

   public boolean e() {
      return this.z != dqa.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
