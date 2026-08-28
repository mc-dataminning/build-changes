public class aid implements zp<agv> {
   public static final zg<wf, aid> a = zp.a(aid::a, aid::new);
   private final cte b;
   private final boolean c;
   private final boolean d;

   public aid(cte $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aid(wf $$0) {
      this.b = $$0.b(cte.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zr<aid> a() {
      return agt.bQ;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public cte b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
