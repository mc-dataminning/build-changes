public enum djq implements aut {
   a("harp", arc.rd, djq.a.a),
   b("basedrum", arc.qX, djq.a.a),
   c("snare", arc.rg, djq.a.a),
   d("hat", arc.re, djq.a.a),
   e("bass", arc.qY, djq.a.a),
   f("flute", arc.rb, djq.a.a),
   g("bell", arc.qZ, djq.a.a),
   h("guitar", arc.rc, djq.a.a),
   i("chime", arc.ra, djq.a.a),
   j("xylophone", arc.rh, djq.a.a),
   k("iron_xylophone", arc.ri, djq.a.a),
   l("cow_bell", arc.rj, djq.a.a),
   m("didgeridoo", arc.rk, djq.a.a),
   n("bit", arc.rl, djq.a.a),
   o("banjo", arc.rm, djq.a.a),
   p("pling", arc.rf, djq.a.a),
   q("zombie", arc.rn, djq.a.b),
   r("skeleton", arc.ro, djq.a.b),
   s("creeper", arc.rp, djq.a.b),
   t("dragon", arc.rq, djq.a.b),
   u("wither_skeleton", arc.rr, djq.a.b),
   v("piglin", arc.rs, djq.a.b),
   w("custom_head", arc.zu, djq.a.c);

   private final String x;
   private final ie<arb> y;
   private final djq.a z;

   private djq(String $$0, ie<arb> $$1, djq.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ie<arb> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == djq.a.a;
   }

   public boolean d() {
      return this.z == djq.a.c;
   }

   public boolean e() {
      return this.z != djq.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
