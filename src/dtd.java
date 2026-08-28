public enum dtd implements azu {
   a("harp", awa.rV, dtd.a.a),
   b("basedrum", awa.rP, dtd.a.a),
   c("snare", awa.rY, dtd.a.a),
   d("hat", awa.rW, dtd.a.a),
   e("bass", awa.rQ, dtd.a.a),
   f("flute", awa.rT, dtd.a.a),
   g("bell", awa.rR, dtd.a.a),
   h("guitar", awa.rU, dtd.a.a),
   i("chime", awa.rS, dtd.a.a),
   j("xylophone", awa.rZ, dtd.a.a),
   k("iron_xylophone", awa.sa, dtd.a.a),
   l("cow_bell", awa.sb, dtd.a.a),
   m("didgeridoo", awa.sc, dtd.a.a),
   n("bit", awa.sd, dtd.a.a),
   o("banjo", awa.se, dtd.a.a),
   p("pling", awa.rX, dtd.a.a),
   q("zombie", awa.sf, dtd.a.b),
   r("skeleton", awa.sg, dtd.a.b),
   s("creeper", awa.sh, dtd.a.b),
   t("dragon", awa.si, dtd.a.b),
   u("wither_skeleton", awa.sj, dtd.a.b),
   v("piglin", awa.sk, dtd.a.b),
   w("custom_head", awa.Ao, dtd.a.c);

   private final String x;
   private final ji<avz> y;
   private final dtd.a z;

   private dtd(final String $$0, final ji<avz> $$1, final dtd.a $$2) {
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
      return this.z == dtd.a.a;
   }

   public boolean d() {
      return this.z == dtd.a.c;
   }

   public boolean e() {
      return this.z != dtd.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
