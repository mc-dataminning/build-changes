public enum doc implements axq {
   a("harp", aty.rA, doc.a.a),
   b("basedrum", aty.ru, doc.a.a),
   c("snare", aty.rD, doc.a.a),
   d("hat", aty.rB, doc.a.a),
   e("bass", aty.rv, doc.a.a),
   f("flute", aty.ry, doc.a.a),
   g("bell", aty.rw, doc.a.a),
   h("guitar", aty.rz, doc.a.a),
   i("chime", aty.rx, doc.a.a),
   j("xylophone", aty.rE, doc.a.a),
   k("iron_xylophone", aty.rF, doc.a.a),
   l("cow_bell", aty.rG, doc.a.a),
   m("didgeridoo", aty.rH, doc.a.a),
   n("bit", aty.rI, doc.a.a),
   o("banjo", aty.rJ, doc.a.a),
   p("pling", aty.rC, doc.a.a),
   q("zombie", aty.rK, doc.a.b),
   r("skeleton", aty.rL, doc.a.b),
   s("creeper", aty.rM, doc.a.b),
   t("dragon", aty.rN, doc.a.b),
   u("wither_skeleton", aty.rO, doc.a.b),
   v("piglin", aty.rP, doc.a.b),
   w("custom_head", aty.zS, doc.a.c);

   private final String x;
   private final il<atx> y;
   private final doc.a z;

   private doc(String $$0, il<atx> $$1, doc.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public il<atx> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == doc.a.a;
   }

   public boolean d() {
      return this.z == doc.a.c;
   }

   public boolean e() {
      return this.z != doc.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
