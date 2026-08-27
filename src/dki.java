public enum dki implements avk {
   a("harp", ars.rd, dki.a.a),
   b("basedrum", ars.qX, dki.a.a),
   c("snare", ars.rg, dki.a.a),
   d("hat", ars.re, dki.a.a),
   e("bass", ars.qY, dki.a.a),
   f("flute", ars.rb, dki.a.a),
   g("bell", ars.qZ, dki.a.a),
   h("guitar", ars.rc, dki.a.a),
   i("chime", ars.ra, dki.a.a),
   j("xylophone", ars.rh, dki.a.a),
   k("iron_xylophone", ars.ri, dki.a.a),
   l("cow_bell", ars.rj, dki.a.a),
   m("didgeridoo", ars.rk, dki.a.a),
   n("bit", ars.rl, dki.a.a),
   o("banjo", ars.rm, dki.a.a),
   p("pling", ars.rf, dki.a.a),
   q("zombie", ars.rn, dki.a.b),
   r("skeleton", ars.ro, dki.a.b),
   s("creeper", ars.rp, dki.a.b),
   t("dragon", ars.rq, dki.a.b),
   u("wither_skeleton", ars.rr, dki.a.b),
   v("piglin", ars.rs, dki.a.b),
   w("custom_head", ars.zu, dki.a.c);

   private final String x;
   private final ih<arr> y;
   private final dki.a z;

   private dki(String $$0, ih<arr> $$1, dki.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ih<arr> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dki.a.a;
   }

   public boolean d() {
      return this.z == dki.a.c;
   }

   public boolean e() {
      return this.z != dki.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
