import javax.annotation.Nullable;

public class ahq implements zb<agb> {
   public static final ys<vr, ahq> a = zb.a(ahq::a, ahq::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahq(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahq(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<ahq> a() {
      return afz.bV;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   @Nullable
   public dbe a(dcd $$0) {
      bsd $$1 = $$0.a(this.b);
      return $$1 instanceof cok ? ((cok)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
