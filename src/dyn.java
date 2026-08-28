public enum dyn implements bba {
   a("harp", axf.sp, dyn.a.a),
   b("basedrum", axf.sj, dyn.a.a),
   c("snare", axf.ss, dyn.a.a),
   d("hat", axf.sq, dyn.a.a),
   e("bass", axf.sk, dyn.a.a),
   f("flute", axf.sn, dyn.a.a),
   g("bell", axf.sl, dyn.a.a),
   h("guitar", axf.so, dyn.a.a),
   i("chime", axf.sm, dyn.a.a),
   j("xylophone", axf.st, dyn.a.a),
   k("iron_xylophone", axf.su, dyn.a.a),
   l("cow_bell", axf.sv, dyn.a.a),
   m("didgeridoo", axf.sw, dyn.a.a),
   n("bit", axf.sx, dyn.a.a),
   o("banjo", axf.sy, dyn.a.a),
   p("pling", axf.sr, dyn.a.a),
   q("zombie", axf.sz, dyn.a.b),
   r("skeleton", axf.sA, dyn.a.b),
   s("creeper", axf.sB, dyn.a.b),
   t("dragon", axf.sC, dyn.a.b),
   u("wither_skeleton", axf.sD, dyn.a.b),
   v("piglin", axf.sE, dyn.a.b),
   w("custom_head", axf.AP, dyn.a.c);

   private final String x;
   private final jq<axe> y;
   private final dyn.a z;

   private dyn(final String $$0, final jq<axe> $$1, final dyn.a $$2) {
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
      return this.z == dyn.a.a;
   }

   public boolean d() {
      return this.z == dyn.a.c;
   }

   public boolean e() {
      return this.z != dyn.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
