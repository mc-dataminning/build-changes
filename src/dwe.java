public enum dwe implements baf {
   a("harp", awk.rX, dwe.a.a),
   b("basedrum", awk.rR, dwe.a.a),
   c("snare", awk.sa, dwe.a.a),
   d("hat", awk.rY, dwe.a.a),
   e("bass", awk.rS, dwe.a.a),
   f("flute", awk.rV, dwe.a.a),
   g("bell", awk.rT, dwe.a.a),
   h("guitar", awk.rW, dwe.a.a),
   i("chime", awk.rU, dwe.a.a),
   j("xylophone", awk.sb, dwe.a.a),
   k("iron_xylophone", awk.sc, dwe.a.a),
   l("cow_bell", awk.sd, dwe.a.a),
   m("didgeridoo", awk.se, dwe.a.a),
   n("bit", awk.sf, dwe.a.a),
   o("banjo", awk.sg, dwe.a.a),
   p("pling", awk.rZ, dwe.a.a),
   q("zombie", awk.sh, dwe.a.b),
   r("skeleton", awk.si, dwe.a.b),
   s("creeper", awk.sj, dwe.a.b),
   t("dragon", awk.sk, dwe.a.b),
   u("wither_skeleton", awk.sl, dwe.a.b),
   v("piglin", awk.sm, dwe.a.b),
   w("custom_head", awk.Av, dwe.a.c);

   private final String x;
   private final jp<awj> y;
   private final dwe.a z;

   private dwe(final String $$0, final jp<awj> $$1, final dwe.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jp<awj> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dwe.a.a;
   }

   public boolean d() {
      return this.z == dwe.a.c;
   }

   public boolean e() {
      return this.z != dwe.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
