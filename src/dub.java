public enum dub implements azj {
   a("harp", avo.rY, dub.a.a),
   b("basedrum", avo.rS, dub.a.a),
   c("snare", avo.sb, dub.a.a),
   d("hat", avo.rZ, dub.a.a),
   e("bass", avo.rT, dub.a.a),
   f("flute", avo.rW, dub.a.a),
   g("bell", avo.rU, dub.a.a),
   h("guitar", avo.rX, dub.a.a),
   i("chime", avo.rV, dub.a.a),
   j("xylophone", avo.sc, dub.a.a),
   k("iron_xylophone", avo.sd, dub.a.a),
   l("cow_bell", avo.se, dub.a.a),
   m("didgeridoo", avo.sf, dub.a.a),
   n("bit", avo.sg, dub.a.a),
   o("banjo", avo.sh, dub.a.a),
   p("pling", avo.sa, dub.a.a),
   q("zombie", avo.si, dub.a.b),
   r("skeleton", avo.sj, dub.a.b),
   s("creeper", avo.sk, dub.a.b),
   t("dragon", avo.sl, dub.a.b),
   u("wither_skeleton", avo.sm, dub.a.b),
   v("piglin", avo.sn, dub.a.b),
   w("custom_head", avo.Ar, dub.a.c);

   private final String x;
   private final jm<avn> y;
   private final dub.a z;

   private dub(final String $$0, final jm<avn> $$1, final dub.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jm<avn> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dub.a.a;
   }

   public boolean d() {
      return this.z == dub.a.c;
   }

   public boolean e() {
      return this.z != dub.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
