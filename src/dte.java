public enum dte implements azu {
   a("harp", awa.rV, dte.a.a),
   b("basedrum", awa.rP, dte.a.a),
   c("snare", awa.rY, dte.a.a),
   d("hat", awa.rW, dte.a.a),
   e("bass", awa.rQ, dte.a.a),
   f("flute", awa.rT, dte.a.a),
   g("bell", awa.rR, dte.a.a),
   h("guitar", awa.rU, dte.a.a),
   i("chime", awa.rS, dte.a.a),
   j("xylophone", awa.rZ, dte.a.a),
   k("iron_xylophone", awa.sa, dte.a.a),
   l("cow_bell", awa.sb, dte.a.a),
   m("didgeridoo", awa.sc, dte.a.a),
   n("bit", awa.sd, dte.a.a),
   o("banjo", awa.se, dte.a.a),
   p("pling", awa.rX, dte.a.a),
   q("zombie", awa.sf, dte.a.b),
   r("skeleton", awa.sg, dte.a.b),
   s("creeper", awa.sh, dte.a.b),
   t("dragon", awa.si, dte.a.b),
   u("wither_skeleton", awa.sj, dte.a.b),
   v("piglin", awa.sk, dte.a.b),
   w("custom_head", awa.Ao, dte.a.c);

   private final String x;
   private final ji<avz> y;
   private final dte.a z;

   private dte(final String $$0, final ji<avz> $$1, final dte.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ji<avz> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dte.a.a;
   }

   public boolean d() {
      return this.z == dte.a.c;
   }

   public boolean e() {
      return this.z != dte.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
