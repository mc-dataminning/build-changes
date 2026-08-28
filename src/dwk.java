public enum dwk implements bag {
   a("harp", awl.rX, dwk.a.a),
   b("basedrum", awl.rR, dwk.a.a),
   c("snare", awl.sa, dwk.a.a),
   d("hat", awl.rY, dwk.a.a),
   e("bass", awl.rS, dwk.a.a),
   f("flute", awl.rV, dwk.a.a),
   g("bell", awl.rT, dwk.a.a),
   h("guitar", awl.rW, dwk.a.a),
   i("chime", awl.rU, dwk.a.a),
   j("xylophone", awl.sb, dwk.a.a),
   k("iron_xylophone", awl.sc, dwk.a.a),
   l("cow_bell", awl.sd, dwk.a.a),
   m("didgeridoo", awl.se, dwk.a.a),
   n("bit", awl.sf, dwk.a.a),
   o("banjo", awl.sg, dwk.a.a),
   p("pling", awl.rZ, dwk.a.a),
   q("zombie", awl.sh, dwk.a.b),
   r("skeleton", awl.si, dwk.a.b),
   s("creeper", awl.sj, dwk.a.b),
   t("dragon", awl.sk, dwk.a.b),
   u("wither_skeleton", awl.sl, dwk.a.b),
   v("piglin", awl.sm, dwk.a.b),
   w("custom_head", awl.Av, dwk.a.c);

   private final String x;
   private final jq<awk> y;
   private final dwk.a z;

   private dwk(final String $$0, final jq<awk> $$1, final dwk.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jq<awk> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dwk.a.a;
   }

   public boolean d() {
      return this.z == dwk.a.c;
   }

   public boolean e() {
      return this.z != dwk.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
