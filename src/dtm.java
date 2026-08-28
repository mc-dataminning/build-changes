public enum dtm implements azc {
   a("harp", avh.rY, dtm.a.a),
   b("basedrum", avh.rS, dtm.a.a),
   c("snare", avh.sb, dtm.a.a),
   d("hat", avh.rZ, dtm.a.a),
   e("bass", avh.rT, dtm.a.a),
   f("flute", avh.rW, dtm.a.a),
   g("bell", avh.rU, dtm.a.a),
   h("guitar", avh.rX, dtm.a.a),
   i("chime", avh.rV, dtm.a.a),
   j("xylophone", avh.sc, dtm.a.a),
   k("iron_xylophone", avh.sd, dtm.a.a),
   l("cow_bell", avh.se, dtm.a.a),
   m("didgeridoo", avh.sf, dtm.a.a),
   n("bit", avh.sg, dtm.a.a),
   o("banjo", avh.sh, dtm.a.a),
   p("pling", avh.sa, dtm.a.a),
   q("zombie", avh.si, dtm.a.b),
   r("skeleton", avh.sj, dtm.a.b),
   s("creeper", avh.sk, dtm.a.b),
   t("dragon", avh.sl, dtm.a.b),
   u("wither_skeleton", avh.sm, dtm.a.b),
   v("piglin", avh.sn, dtm.a.b),
   w("custom_head", avh.Ar, dtm.a.c);

   private final String x;
   private final jj<avg> y;
   private final dtm.a z;

   private dtm(final String $$0, final jj<avg> $$1, final dtm.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jj<avg> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dtm.a.a;
   }

   public boolean d() {
      return this.z == dtm.a.c;
   }

   public boolean e() {
      return this.z != dtm.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
