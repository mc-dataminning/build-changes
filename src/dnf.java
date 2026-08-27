public enum dnf implements axg {
   a("harp", atp.rt, dnf.a.a),
   b("basedrum", atp.rn, dnf.a.a),
   c("snare", atp.rw, dnf.a.a),
   d("hat", atp.ru, dnf.a.a),
   e("bass", atp.ro, dnf.a.a),
   f("flute", atp.rr, dnf.a.a),
   g("bell", atp.rp, dnf.a.a),
   h("guitar", atp.rs, dnf.a.a),
   i("chime", atp.rq, dnf.a.a),
   j("xylophone", atp.rx, dnf.a.a),
   k("iron_xylophone", atp.ry, dnf.a.a),
   l("cow_bell", atp.rz, dnf.a.a),
   m("didgeridoo", atp.rA, dnf.a.a),
   n("bit", atp.rB, dnf.a.a),
   o("banjo", atp.rC, dnf.a.a),
   p("pling", atp.rv, dnf.a.a),
   q("zombie", atp.rD, dnf.a.b),
   r("skeleton", atp.rE, dnf.a.b),
   s("creeper", atp.rF, dnf.a.b),
   t("dragon", atp.rG, dnf.a.b),
   u("wither_skeleton", atp.rH, dnf.a.b),
   v("piglin", atp.rI, dnf.a.b),
   w("custom_head", atp.zK, dnf.a.c);

   private final String x;
   private final il<ato> y;
   private final dnf.a z;

   private dnf(String $$0, il<ato> $$1, dnf.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public il<ato> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dnf.a.a;
   }

   public boolean d() {
      return this.z == dnf.a.c;
   }

   public boolean e() {
      return this.z != dnf.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
