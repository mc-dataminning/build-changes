import javax.annotation.Nullable;

public record acc(alb b, @Nullable byte[] c) implements zs<acb> {
   public static final zj<wl, acc> a = zs.a(acc::a, acc::new);

   private acc(wl $$0) {
      this($$0.q(), $$0.c(aaf.b));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aaf.b);
   }

   @Override
   public zu<acc> a() {
      return aca.b;
   }

   public void a(acb $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
