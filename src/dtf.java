public enum dtf implements azu {
   a("harp", awa.rV, dtf.a.a),
   b("basedrum", awa.rP, dtf.a.a),
   c("snare", awa.rY, dtf.a.a),
   d("hat", awa.rW, dtf.a.a),
   e("bass", awa.rQ, dtf.a.a),
   f("flute", awa.rT, dtf.a.a),
   g("bell", awa.rR, dtf.a.a),
   h("guitar", awa.rU, dtf.a.a),
   i("chime", awa.rS, dtf.a.a),
   j("xylophone", awa.rZ, dtf.a.a),
   k("iron_xylophone", awa.sa, dtf.a.a),
   l("cow_bell", awa.sb, dtf.a.a),
   m("didgeridoo", awa.sc, dtf.a.a),
   n("bit", awa.sd, dtf.a.a),
   o("banjo", awa.se, dtf.a.a),
   p("pling", awa.rX, dtf.a.a),
   q("zombie", awa.sf, dtf.a.b),
   r("skeleton", awa.sg, dtf.a.b),
   s("creeper", awa.sh, dtf.a.b),
   t("dragon", awa.si, dtf.a.b),
   u("wither_skeleton", awa.sj, dtf.a.b),
   v("piglin", awa.sk, dtf.a.b),
   w("custom_head", awa.Ao, dtf.a.c);

   private final String x;
   private final ji<avz> y;
   private final dtf.a z;

   private dtf(final String $$0, final ji<avz> $$1, final dtf.a $$2) {
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
      return this.z == dtf.a.a;
   }

   public boolean d() {
      return this.z == dtf.a.c;
   }

   public boolean e() {
      return this.z != dtf.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
