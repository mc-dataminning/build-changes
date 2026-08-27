public enum dkq implements avl {
   a("harp", art.rs, dkq.a.a),
   b("basedrum", art.rm, dkq.a.a),
   c("snare", art.rv, dkq.a.a),
   d("hat", art.rt, dkq.a.a),
   e("bass", art.rn, dkq.a.a),
   f("flute", art.rq, dkq.a.a),
   g("bell", art.ro, dkq.a.a),
   h("guitar", art.rr, dkq.a.a),
   i("chime", art.rp, dkq.a.a),
   j("xylophone", art.rw, dkq.a.a),
   k("iron_xylophone", art.rx, dkq.a.a),
   l("cow_bell", art.ry, dkq.a.a),
   m("didgeridoo", art.rz, dkq.a.a),
   n("bit", art.rA, dkq.a.a),
   o("banjo", art.rB, dkq.a.a),
   p("pling", art.ru, dkq.a.a),
   q("zombie", art.rC, dkq.a.b),
   r("skeleton", art.rD, dkq.a.b),
   s("creeper", art.rE, dkq.a.b),
   t("dragon", art.rF, dkq.a.b),
   u("wither_skeleton", art.rG, dkq.a.b),
   v("piglin", art.rH, dkq.a.b),
   w("custom_head", art.zJ, dkq.a.c);

   private final String x;
   private final ih<ars> y;
   private final dkq.a z;

   private dkq(String $$0, ih<ars> $$1, dkq.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ih<ars> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dkq.a.a;
   }

   public boolean d() {
      return this.z == dkq.a.c;
   }

   public boolean e() {
      return this.z != dkq.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
