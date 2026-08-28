import javax.annotation.Nullable;

public record abx(alb b, @Nullable byte[] c) implements zk<abw> {
   public static final zb<wa, abx> a = zk.a(abx::a, abx::new);

   private abx(wa $$0) {
      this($$0.q(), $$0.c(zz.b));
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zz.b);
   }

   @Override
   public zm<abx> a() {
      return abv.b;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
