public enum dkh implements avj {
   a("harp", arr.rd, dkh.a.a),
   b("basedrum", arr.qX, dkh.a.a),
   c("snare", arr.rg, dkh.a.a),
   d("hat", arr.re, dkh.a.a),
   e("bass", arr.qY, dkh.a.a),
   f("flute", arr.rb, dkh.a.a),
   g("bell", arr.qZ, dkh.a.a),
   h("guitar", arr.rc, dkh.a.a),
   i("chime", arr.ra, dkh.a.a),
   j("xylophone", arr.rh, dkh.a.a),
   k("iron_xylophone", arr.ri, dkh.a.a),
   l("cow_bell", arr.rj, dkh.a.a),
   m("didgeridoo", arr.rk, dkh.a.a),
   n("bit", arr.rl, dkh.a.a),
   o("banjo", arr.rm, dkh.a.a),
   p("pling", arr.rf, dkh.a.a),
   q("zombie", arr.rn, dkh.a.b),
   r("skeleton", arr.ro, dkh.a.b),
   s("creeper", arr.rp, dkh.a.b),
   t("dragon", arr.rq, dkh.a.b),
   u("wither_skeleton", arr.rr, dkh.a.b),
   v("piglin", arr.rs, dkh.a.b),
   w("custom_head", arr.zu, dkh.a.c);

   private final String x;
   private final ih<arq> y;
   private final dkh.a z;

   private dkh(String $$0, ih<arq> $$1, dkh.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ih<arq> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dkh.a.a;
   }

   public boolean d() {
      return this.z == dkh.a.c;
   }

   public boolean e() {
      return this.z != dkh.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
