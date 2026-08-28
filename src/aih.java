import javax.annotation.Nullable;

public class aih implements zk<agq> {
   public static final zb<wa, aih> a = zk.a(aih::a, aih::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aih(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aih(wa $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zm<aih> a() {
      return ago.bY;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   @Nullable
   public ddg a(deg $$0) {
      bto $$1 = $$0.a(this.b);
      return $$1 instanceof cqb ? ((cqb)$$1).F() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
