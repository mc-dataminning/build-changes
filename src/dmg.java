public enum dmg implements axc {
   a("harp", atk.rs, dmg.a.a),
   b("basedrum", atk.rm, dmg.a.a),
   c("snare", atk.rv, dmg.a.a),
   d("hat", atk.rt, dmg.a.a),
   e("bass", atk.rn, dmg.a.a),
   f("flute", atk.rq, dmg.a.a),
   g("bell", atk.ro, dmg.a.a),
   h("guitar", atk.rr, dmg.a.a),
   i("chime", atk.rp, dmg.a.a),
   j("xylophone", atk.rw, dmg.a.a),
   k("iron_xylophone", atk.rx, dmg.a.a),
   l("cow_bell", atk.ry, dmg.a.a),
   m("didgeridoo", atk.rz, dmg.a.a),
   n("bit", atk.rA, dmg.a.a),
   o("banjo", atk.rB, dmg.a.a),
   p("pling", atk.ru, dmg.a.a),
   q("zombie", atk.rC, dmg.a.b),
   r("skeleton", atk.rD, dmg.a.b),
   s("creeper", atk.rE, dmg.a.b),
   t("dragon", atk.rF, dmg.a.b),
   u("wither_skeleton", atk.rG, dmg.a.b),
   v("piglin", atk.rH, dmg.a.b),
   w("custom_head", atk.zJ, dmg.a.c);

   private final String x;
   private final ij<atj> y;
   private final dmg.a z;

   private dmg(String $$0, ij<atj> $$1, dmg.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ij<atj> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dmg.a.a;
   }

   public boolean d() {
      return this.z == dmg.a.c;
   }

   public boolean e() {
      return this.z != dmg.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
