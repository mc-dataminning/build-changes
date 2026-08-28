import javax.annotation.Nullable;

public class agc implements zk<abz> {
   public static final zb<wa, agc> a = zk.a(agc::a, agc::new);
   private final int b;
   @Nullable
   private final uf c;

   public agc(int $$0, @Nullable uf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agc(wa $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.a((vc)this.c);
   }

   @Override
   public zm<agc> a() {
      return ago.aY;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public uf e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
