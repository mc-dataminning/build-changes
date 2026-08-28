import javax.annotation.Nullable;

public record abl(akk b, @Nullable byte[] c) implements zb<abk> {
   public static final ys<vr, abl> a = zb.a(abl::a, abl::new);

   private abl(vr $$0) {
      this($$0.q(), $$0.c(zo.b));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zo.b);
   }

   @Override
   public zd<abl> a() {
      return abj.b;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
