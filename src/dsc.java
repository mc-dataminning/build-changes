public enum dsc implements ayx {
   a("harp", avh.rV, dsc.a.a),
   b("basedrum", avh.rP, dsc.a.a),
   c("snare", avh.rY, dsc.a.a),
   d("hat", avh.rW, dsc.a.a),
   e("bass", avh.rQ, dsc.a.a),
   f("flute", avh.rT, dsc.a.a),
   g("bell", avh.rR, dsc.a.a),
   h("guitar", avh.rU, dsc.a.a),
   i("chime", avh.rS, dsc.a.a),
   j("xylophone", avh.rZ, dsc.a.a),
   k("iron_xylophone", avh.sa, dsc.a.a),
   l("cow_bell", avh.sb, dsc.a.a),
   m("didgeridoo", avh.sc, dsc.a.a),
   n("bit", avh.sd, dsc.a.a),
   o("banjo", avh.se, dsc.a.a),
   p("pling", avh.rX, dsc.a.a),
   q("zombie", avh.sf, dsc.a.b),
   r("skeleton", avh.sg, dsc.a.b),
   s("creeper", avh.sh, dsc.a.b),
   t("dragon", avh.si, dsc.a.b),
   u("wither_skeleton", avh.sj, dsc.a.b),
   v("piglin", avh.sk, dsc.a.b),
   w("custom_head", avh.Ao, dsc.a.c);

   private final String x;
   private final ix<avg> y;
   private final dsc.a z;

   private dsc(String $$0, ix<avg> $$1, dsc.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ix<avg> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dsc.a.a;
   }

   public boolean d() {
      return this.z == dsc.a.c;
   }

   public boolean e() {
      return this.z != dsc.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
