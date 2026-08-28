public enum dyo implements baq {
   a("harp", awv.sw, dyo.a.a),
   b("basedrum", awv.sq, dyo.a.a),
   c("snare", awv.sz, dyo.a.a),
   d("hat", awv.sx, dyo.a.a),
   e("bass", awv.sr, dyo.a.a),
   f("flute", awv.su, dyo.a.a),
   g("bell", awv.ss, dyo.a.a),
   h("guitar", awv.sv, dyo.a.a),
   i("chime", awv.st, dyo.a.a),
   j("xylophone", awv.sA, dyo.a.a),
   k("iron_xylophone", awv.sB, dyo.a.a),
   l("cow_bell", awv.sC, dyo.a.a),
   m("didgeridoo", awv.sD, dyo.a.a),
   n("bit", awv.sE, dyo.a.a),
   o("banjo", awv.sF, dyo.a.a),
   p("pling", awv.sy, dyo.a.a),
   q("zombie", awv.sG, dyo.a.b),
   r("skeleton", awv.sH, dyo.a.b),
   s("creeper", awv.sI, dyo.a.b),
   t("dragon", awv.sJ, dyo.a.b),
   u("wither_skeleton", awv.sK, dyo.a.b),
   v("piglin", awv.sL, dyo.a.b),
   w("custom_head", awv.Bg, dyo.a.c);

   private final String x;
   private final jq<awu> y;
   private final dyo.a z;

   private dyo(final String $$0, final jq<awu> $$1, final dyo.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jq<awu> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dyo.a.a;
   }

   public boolean d() {
      return this.z == dyo.a.c;
   }

   public boolean e() {
      return this.z != dyo.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
