public enum dti implements ayz {
   a("harp", avf.rY, dti.a.a),
   b("basedrum", avf.rS, dti.a.a),
   c("snare", avf.sb, dti.a.a),
   d("hat", avf.rZ, dti.a.a),
   e("bass", avf.rT, dti.a.a),
   f("flute", avf.rW, dti.a.a),
   g("bell", avf.rU, dti.a.a),
   h("guitar", avf.rX, dti.a.a),
   i("chime", avf.rV, dti.a.a),
   j("xylophone", avf.sc, dti.a.a),
   k("iron_xylophone", avf.sd, dti.a.a),
   l("cow_bell", avf.se, dti.a.a),
   m("didgeridoo", avf.sf, dti.a.a),
   n("bit", avf.sg, dti.a.a),
   o("banjo", avf.sh, dti.a.a),
   p("pling", avf.sa, dti.a.a),
   q("zombie", avf.si, dti.a.b),
   r("skeleton", avf.sj, dti.a.b),
   s("creeper", avf.sk, dti.a.b),
   t("dragon", avf.sl, dti.a.b),
   u("wither_skeleton", avf.sm, dti.a.b),
   v("piglin", avf.sn, dti.a.b),
   w("custom_head", avf.Ar, dti.a.c);

   private final String x;
   private final jj<ave> y;
   private final dti.a z;

   private dti(final String $$0, final jj<ave> $$1, final dti.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jj<ave> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dti.a.a;
   }

   public boolean d() {
      return this.z == dti.a.c;
   }

   public boolean e() {
      return this.z != dti.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
