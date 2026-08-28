public enum dtc implements azt {
   a("harp", avz.rV, dtc.a.a),
   b("basedrum", avz.rP, dtc.a.a),
   c("snare", avz.rY, dtc.a.a),
   d("hat", avz.rW, dtc.a.a),
   e("bass", avz.rQ, dtc.a.a),
   f("flute", avz.rT, dtc.a.a),
   g("bell", avz.rR, dtc.a.a),
   h("guitar", avz.rU, dtc.a.a),
   i("chime", avz.rS, dtc.a.a),
   j("xylophone", avz.rZ, dtc.a.a),
   k("iron_xylophone", avz.sa, dtc.a.a),
   l("cow_bell", avz.sb, dtc.a.a),
   m("didgeridoo", avz.sc, dtc.a.a),
   n("bit", avz.sd, dtc.a.a),
   o("banjo", avz.se, dtc.a.a),
   p("pling", avz.rX, dtc.a.a),
   q("zombie", avz.sf, dtc.a.b),
   r("skeleton", avz.sg, dtc.a.b),
   s("creeper", avz.sh, dtc.a.b),
   t("dragon", avz.si, dtc.a.b),
   u("wither_skeleton", avz.sj, dtc.a.b),
   v("piglin", avz.sk, dtc.a.b),
   w("custom_head", avz.Ao, dtc.a.c);

   private final String x;
   private final ji<avy> y;
   private final dtc.a z;

   private dtc(final String $$0, final ji<avy> $$1, final dtc.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ji<avy> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dtc.a.a;
   }

   public boolean d() {
      return this.z == dtc.a.c;
   }

   public boolean e() {
      return this.z != dtc.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
