public enum dtl implements azc {
   a("harp", avh.rY, dtl.a.a),
   b("basedrum", avh.rS, dtl.a.a),
   c("snare", avh.sb, dtl.a.a),
   d("hat", avh.rZ, dtl.a.a),
   e("bass", avh.rT, dtl.a.a),
   f("flute", avh.rW, dtl.a.a),
   g("bell", avh.rU, dtl.a.a),
   h("guitar", avh.rX, dtl.a.a),
   i("chime", avh.rV, dtl.a.a),
   j("xylophone", avh.sc, dtl.a.a),
   k("iron_xylophone", avh.sd, dtl.a.a),
   l("cow_bell", avh.se, dtl.a.a),
   m("didgeridoo", avh.sf, dtl.a.a),
   n("bit", avh.sg, dtl.a.a),
   o("banjo", avh.sh, dtl.a.a),
   p("pling", avh.sa, dtl.a.a),
   q("zombie", avh.si, dtl.a.b),
   r("skeleton", avh.sj, dtl.a.b),
   s("creeper", avh.sk, dtl.a.b),
   t("dragon", avh.sl, dtl.a.b),
   u("wither_skeleton", avh.sm, dtl.a.b),
   v("piglin", avh.sn, dtl.a.b),
   w("custom_head", avh.Ar, dtl.a.c);

   private final String x;
   private final jj<avg> y;
   private final dtl.a z;

   private dtl(final String $$0, final jj<avg> $$1, final dtl.a $$2) {
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
      return this.z == dtl.a.a;
   }

   public boolean d() {
      return this.z == dtl.a.c;
   }

   public boolean e() {
      return this.z != dtl.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
