public enum dmk implements axc {
   a("harp", atl.rt, dmk.a.a),
   b("basedrum", atl.rn, dmk.a.a),
   c("snare", atl.rw, dmk.a.a),
   d("hat", atl.ru, dmk.a.a),
   e("bass", atl.ro, dmk.a.a),
   f("flute", atl.rr, dmk.a.a),
   g("bell", atl.rp, dmk.a.a),
   h("guitar", atl.rs, dmk.a.a),
   i("chime", atl.rq, dmk.a.a),
   j("xylophone", atl.rx, dmk.a.a),
   k("iron_xylophone", atl.ry, dmk.a.a),
   l("cow_bell", atl.rz, dmk.a.a),
   m("didgeridoo", atl.rA, dmk.a.a),
   n("bit", atl.rB, dmk.a.a),
   o("banjo", atl.rC, dmk.a.a),
   p("pling", atl.rv, dmk.a.a),
   q("zombie", atl.rD, dmk.a.b),
   r("skeleton", atl.rE, dmk.a.b),
   s("creeper", atl.rF, dmk.a.b),
   t("dragon", atl.rG, dmk.a.b),
   u("wither_skeleton", atl.rH, dmk.a.b),
   v("piglin", atl.rI, dmk.a.b),
   w("custom_head", atl.zK, dmk.a.c);

   private final String x;
   private final ij<atk> y;
   private final dmk.a z;

   private dmk(String $$0, ij<atk> $$1, dmk.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ij<atk> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dmk.a.a;
   }

   public boolean d() {
      return this.z == dmk.a.c;
   }

   public boolean e() {
      return this.z != dmk.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
