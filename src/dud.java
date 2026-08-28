public enum dud implements azk {
   a("harp", avp.rY, dud.a.a),
   b("basedrum", avp.rS, dud.a.a),
   c("snare", avp.sb, dud.a.a),
   d("hat", avp.rZ, dud.a.a),
   e("bass", avp.rT, dud.a.a),
   f("flute", avp.rW, dud.a.a),
   g("bell", avp.rU, dud.a.a),
   h("guitar", avp.rX, dud.a.a),
   i("chime", avp.rV, dud.a.a),
   j("xylophone", avp.sc, dud.a.a),
   k("iron_xylophone", avp.sd, dud.a.a),
   l("cow_bell", avp.se, dud.a.a),
   m("didgeridoo", avp.sf, dud.a.a),
   n("bit", avp.sg, dud.a.a),
   o("banjo", avp.sh, dud.a.a),
   p("pling", avp.sa, dud.a.a),
   q("zombie", avp.si, dud.a.b),
   r("skeleton", avp.sj, dud.a.b),
   s("creeper", avp.sk, dud.a.b),
   t("dragon", avp.sl, dud.a.b),
   u("wither_skeleton", avp.sm, dud.a.b),
   v("piglin", avp.sn, dud.a.b),
   w("custom_head", avp.Ar, dud.a.c);

   private final String x;
   private final jm<avo> y;
   private final dud.a z;

   private dud(final String $$0, final jm<avo> $$1, final dud.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jm<avo> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dud.a.a;
   }

   public boolean d() {
      return this.z == dud.a.c;
   }

   public boolean e() {
      return this.z != dud.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
