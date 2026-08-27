public enum dkb implements ave {
   a("harp", arm.rd, dkb.a.a),
   b("basedrum", arm.qX, dkb.a.a),
   c("snare", arm.rg, dkb.a.a),
   d("hat", arm.re, dkb.a.a),
   e("bass", arm.qY, dkb.a.a),
   f("flute", arm.rb, dkb.a.a),
   g("bell", arm.qZ, dkb.a.a),
   h("guitar", arm.rc, dkb.a.a),
   i("chime", arm.ra, dkb.a.a),
   j("xylophone", arm.rh, dkb.a.a),
   k("iron_xylophone", arm.ri, dkb.a.a),
   l("cow_bell", arm.rj, dkb.a.a),
   m("didgeridoo", arm.rk, dkb.a.a),
   n("bit", arm.rl, dkb.a.a),
   o("banjo", arm.rm, dkb.a.a),
   p("pling", arm.rf, dkb.a.a),
   q("zombie", arm.rn, dkb.a.b),
   r("skeleton", arm.ro, dkb.a.b),
   s("creeper", arm.rp, dkb.a.b),
   t("dragon", arm.rq, dkb.a.b),
   u("wither_skeleton", arm.rr, dkb.a.b),
   v("piglin", arm.rs, dkb.a.b),
   w("custom_head", arm.zu, dkb.a.c);

   private final String x;
   private final ih<arl> y;
   private final dkb.a z;

   private dkb(String $$0, ih<arl> $$1, dkb.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ih<arl> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dkb.a.a;
   }

   public boolean d() {
      return this.z == dkb.a.c;
   }

   public boolean e() {
      return this.z != dkb.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
