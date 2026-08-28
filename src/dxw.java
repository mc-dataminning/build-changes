public enum dxw implements azv {
   a("harp", awa.sw, dxw.a.a),
   b("basedrum", awa.sq, dxw.a.a),
   c("snare", awa.sz, dxw.a.a),
   d("hat", awa.sx, dxw.a.a),
   e("bass", awa.sr, dxw.a.a),
   f("flute", awa.su, dxw.a.a),
   g("bell", awa.ss, dxw.a.a),
   h("guitar", awa.sv, dxw.a.a),
   i("chime", awa.st, dxw.a.a),
   j("xylophone", awa.sA, dxw.a.a),
   k("iron_xylophone", awa.sB, dxw.a.a),
   l("cow_bell", awa.sC, dxw.a.a),
   m("didgeridoo", awa.sD, dxw.a.a),
   n("bit", awa.sE, dxw.a.a),
   o("banjo", awa.sF, dxw.a.a),
   p("pling", awa.sy, dxw.a.a),
   q("zombie", awa.sG, dxw.a.b),
   r("skeleton", awa.sH, dxw.a.b),
   s("creeper", awa.sI, dxw.a.b),
   t("dragon", awa.sJ, dxw.a.b),
   u("wither_skeleton", awa.sK, dxw.a.b),
   v("piglin", awa.sL, dxw.a.b),
   w("custom_head", awa.Bf, dxw.a.c);

   private final String x;
   private final jr<avz> y;
   private final dxw.a z;

   private dxw(final String $$0, final jr<avz> $$1, final dxw.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jr<avz> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dxw.a.a;
   }

   public boolean d() {
      return this.z == dxw.a.c;
   }

   public boolean e() {
      return this.z != dxw.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
