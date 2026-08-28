import javax.annotation.Nullable;

public record acc(ali b, @Nullable byte[] c) implements zp<acb> {
   public static final zg<wf, acc> a = zp.a(acc::a, acc::new);

   private acc(wf $$0) {
      this($$0.q(), $$0.c(aae.b));
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aae.b);
   }

   @Override
   public zr<acc> a() {
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
