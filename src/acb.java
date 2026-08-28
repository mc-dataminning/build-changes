import javax.annotation.Nullable;

public record acb(alh b, @Nullable byte[] c) implements zo<aca> {
   public static final zf<we, acb> a = zo.a(acb::a, acb::new);

   private acb(we $$0) {
      this($$0.q(), $$0.c(aad.b));
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aad.b);
   }

   @Override
   public zq<acb> a() {
      return abz.b;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
