public enum doa implements axq {
   a("harp", aty.rw, doa.a.a),
   b("basedrum", aty.rq, doa.a.a),
   c("snare", aty.rz, doa.a.a),
   d("hat", aty.rx, doa.a.a),
   e("bass", aty.rr, doa.a.a),
   f("flute", aty.ru, doa.a.a),
   g("bell", aty.rs, doa.a.a),
   h("guitar", aty.rv, doa.a.a),
   i("chime", aty.rt, doa.a.a),
   j("xylophone", aty.rA, doa.a.a),
   k("iron_xylophone", aty.rB, doa.a.a),
   l("cow_bell", aty.rC, doa.a.a),
   m("didgeridoo", aty.rD, doa.a.a),
   n("bit", aty.rE, doa.a.a),
   o("banjo", aty.rF, doa.a.a),
   p("pling", aty.ry, doa.a.a),
   q("zombie", aty.rG, doa.a.b),
   r("skeleton", aty.rH, doa.a.b),
   s("creeper", aty.rI, doa.a.b),
   t("dragon", aty.rJ, doa.a.b),
   u("wither_skeleton", aty.rK, doa.a.b),
   v("piglin", aty.rL, doa.a.b),
   w("custom_head", aty.zN, doa.a.c);

   private final String x;
   private final il<atx> y;
   private final doa.a z;

   private doa(String $$0, il<atx> $$1, doa.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public il<atx> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == doa.a.a;
   }

   public boolean d() {
      return this.z == doa.a.c;
   }

   public boolean e() {
      return this.z != doa.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
