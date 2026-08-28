public enum dyu implements bba {
   a("harp", axf.sq, dyu.a.a),
   b("basedrum", axf.sk, dyu.a.a),
   c("snare", axf.st, dyu.a.a),
   d("hat", axf.sr, dyu.a.a),
   e("bass", axf.sl, dyu.a.a),
   f("flute", axf.so, dyu.a.a),
   g("bell", axf.sm, dyu.a.a),
   h("guitar", axf.sp, dyu.a.a),
   i("chime", axf.sn, dyu.a.a),
   j("xylophone", axf.su, dyu.a.a),
   k("iron_xylophone", axf.sv, dyu.a.a),
   l("cow_bell", axf.sw, dyu.a.a),
   m("didgeridoo", axf.sx, dyu.a.a),
   n("bit", axf.sy, dyu.a.a),
   o("banjo", axf.sz, dyu.a.a),
   p("pling", axf.ss, dyu.a.a),
   q("zombie", axf.sA, dyu.a.b),
   r("skeleton", axf.sB, dyu.a.b),
   s("creeper", axf.sC, dyu.a.b),
   t("dragon", axf.sD, dyu.a.b),
   u("wither_skeleton", axf.sE, dyu.a.b),
   v("piglin", axf.sF, dyu.a.b),
   w("custom_head", axf.AQ, dyu.a.c);

   private final String x;
   private final jq<axe> y;
   private final dyu.a z;

   private dyu(final String $$0, final jq<axe> $$1, final dyu.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jq<axe> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dyu.a.a;
   }

   public boolean d() {
      return this.z == dyu.a.c;
   }

   public boolean e() {
      return this.z != dyu.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
