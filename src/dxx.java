public enum dxx implements azv {
   a("harp", awa.sw, dxx.a.a),
   b("basedrum", awa.sq, dxx.a.a),
   c("snare", awa.sz, dxx.a.a),
   d("hat", awa.sx, dxx.a.a),
   e("bass", awa.sr, dxx.a.a),
   f("flute", awa.su, dxx.a.a),
   g("bell", awa.ss, dxx.a.a),
   h("guitar", awa.sv, dxx.a.a),
   i("chime", awa.st, dxx.a.a),
   j("xylophone", awa.sA, dxx.a.a),
   k("iron_xylophone", awa.sB, dxx.a.a),
   l("cow_bell", awa.sC, dxx.a.a),
   m("didgeridoo", awa.sD, dxx.a.a),
   n("bit", awa.sE, dxx.a.a),
   o("banjo", awa.sF, dxx.a.a),
   p("pling", awa.sy, dxx.a.a),
   q("zombie", awa.sG, dxx.a.b),
   r("skeleton", awa.sH, dxx.a.b),
   s("creeper", awa.sI, dxx.a.b),
   t("dragon", awa.sJ, dxx.a.b),
   u("wither_skeleton", awa.sK, dxx.a.b),
   v("piglin", awa.sL, dxx.a.b),
   w("custom_head", awa.Bg, dxx.a.c);

   private final String x;
   private final jr<avz> y;
   private final dxx.a z;

   private dxx(final String $$0, final jr<avz> $$1, final dxx.a $$2) {
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
      return this.z == dxx.a.a;
   }

   public boolean d() {
      return this.z == dxx.a.c;
   }

   public boolean e() {
      return this.z != dxx.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
