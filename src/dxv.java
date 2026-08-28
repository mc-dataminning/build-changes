public enum dxv implements azu {
   a("harp", avz.sw, dxv.a.a),
   b("basedrum", avz.sq, dxv.a.a),
   c("snare", avz.sz, dxv.a.a),
   d("hat", avz.sx, dxv.a.a),
   e("bass", avz.sr, dxv.a.a),
   f("flute", avz.su, dxv.a.a),
   g("bell", avz.ss, dxv.a.a),
   h("guitar", avz.sv, dxv.a.a),
   i("chime", avz.st, dxv.a.a),
   j("xylophone", avz.sA, dxv.a.a),
   k("iron_xylophone", avz.sB, dxv.a.a),
   l("cow_bell", avz.sC, dxv.a.a),
   m("didgeridoo", avz.sD, dxv.a.a),
   n("bit", avz.sE, dxv.a.a),
   o("banjo", avz.sF, dxv.a.a),
   p("pling", avz.sy, dxv.a.a),
   q("zombie", avz.sG, dxv.a.b),
   r("skeleton", avz.sH, dxv.a.b),
   s("creeper", avz.sI, dxv.a.b),
   t("dragon", avz.sJ, dxv.a.b),
   u("wither_skeleton", avz.sK, dxv.a.b),
   v("piglin", avz.sL, dxv.a.b),
   w("custom_head", avz.Bf, dxv.a.c);

   private final String x;
   private final jr<avy> y;
   private final dxv.a z;

   private dxv(final String $$0, final jr<avy> $$1, final dxv.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jr<avy> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dxv.a.a;
   }

   public boolean d() {
      return this.z == dxv.a.c;
   }

   public boolean e() {
      return this.z != dxv.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
