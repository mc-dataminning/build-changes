public enum dsy implements azp {
   a("harp", avw.rV, dsy.a.a),
   b("basedrum", avw.rP, dsy.a.a),
   c("snare", avw.rY, dsy.a.a),
   d("hat", avw.rW, dsy.a.a),
   e("bass", avw.rQ, dsy.a.a),
   f("flute", avw.rT, dsy.a.a),
   g("bell", avw.rR, dsy.a.a),
   h("guitar", avw.rU, dsy.a.a),
   i("chime", avw.rS, dsy.a.a),
   j("xylophone", avw.rZ, dsy.a.a),
   k("iron_xylophone", avw.sa, dsy.a.a),
   l("cow_bell", avw.sb, dsy.a.a),
   m("didgeridoo", avw.sc, dsy.a.a),
   n("bit", avw.sd, dsy.a.a),
   o("banjo", avw.se, dsy.a.a),
   p("pling", avw.rX, dsy.a.a),
   q("zombie", avw.sf, dsy.a.b),
   r("skeleton", avw.sg, dsy.a.b),
   s("creeper", avw.sh, dsy.a.b),
   t("dragon", avw.si, dsy.a.b),
   u("wither_skeleton", avw.sj, dsy.a.b),
   v("piglin", avw.sk, dsy.a.b),
   w("custom_head", avw.Ao, dsy.a.c);

   private final String x;
   private final ji<avv> y;
   private final dsy.a z;

   private dsy(final String $$0, final ji<avv> $$1, final dsy.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ji<avv> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dsy.a.a;
   }

   public boolean d() {
      return this.z == dsy.a.c;
   }

   public boolean e() {
      return this.z != dsy.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
