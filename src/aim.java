import javax.annotation.Nullable;

public class aim implements zp<agv> {
   public static final zg<wf, aim> a = zp.a(aim::a, aim::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aim(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aim(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zr<aim> a() {
      return agt.bY;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   @Nullable
   public deb a(dfb $$0) {
      bue $$1 = $$0.a(this.b);
      return $$1 instanceof cqt ? ((cqt)$$1).E() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
