import javax.annotation.Nullable;

public class afl implements zp<ace> {
   public static final zg<wf, afl> a = zp.a(afl::a, afl::new);
   private final int b;
   private final int c;

   public afl(bue $$0, @Nullable bue $$1) {
      this.b = $$0.as();
      this.c = $$1 != null ? $$1.as() : 0;
   }

   private afl(wf $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(wf $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zr<afl> a() {
      return agt.aD;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
