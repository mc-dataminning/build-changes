public enum dyv implements bba {
   a("harp", axf.sq, dyv.a.a),
   b("basedrum", axf.sk, dyv.a.a),
   c("snare", axf.st, dyv.a.a),
   d("hat", axf.sr, dyv.a.a),
   e("bass", axf.sl, dyv.a.a),
   f("flute", axf.so, dyv.a.a),
   g("bell", axf.sm, dyv.a.a),
   h("guitar", axf.sp, dyv.a.a),
   i("chime", axf.sn, dyv.a.a),
   j("xylophone", axf.su, dyv.a.a),
   k("iron_xylophone", axf.sv, dyv.a.a),
   l("cow_bell", axf.sw, dyv.a.a),
   m("didgeridoo", axf.sx, dyv.a.a),
   n("bit", axf.sy, dyv.a.a),
   o("banjo", axf.sz, dyv.a.a),
   p("pling", axf.ss, dyv.a.a),
   q("zombie", axf.sA, dyv.a.b),
   r("skeleton", axf.sB, dyv.a.b),
   s("creeper", axf.sC, dyv.a.b),
   t("dragon", axf.sD, dyv.a.b),
   u("wither_skeleton", axf.sE, dyv.a.b),
   v("piglin", axf.sF, dyv.a.b),
   w("custom_head", axf.AQ, dyv.a.c);

   private final String x;
   private final jq<axe> y;
   private final dyv.a z;

   private dyv(final String $$0, final jq<axe> $$1, final dyv.a $$2) {
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
      return this.z == dyv.a.a;
   }

   public boolean d() {
      return this.z == dyv.a.c;
   }

   public boolean e() {
      return this.z != dyv.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
