import javax.annotation.Nullable;

public class afg implements zk<abz> {
   public static final zb<wa, afg> a = zk.a(afg::a, afg::new);
   private final int b;
   private final int c;

   public afg(btj $$0, @Nullable btj $$1) {
      this.b = $$0.ap();
      this.c = $$1 != null ? $$1.ap() : 0;
   }

   private afg(wa $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(wa $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zm<afg> a() {
      return ago.aD;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
