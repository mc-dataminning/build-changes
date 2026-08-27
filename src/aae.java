import javax.annotation.Nullable;

public record aae(aiy b, @Nullable byte[] c) implements xx<aad> {
   public static final xo<uq, aae> a = xx.a(aae::a, aae::new);

   private aae(uq $$0) {
      this($$0.s(), $$0.c((xp<? super uq, byte[]>)($$0x -> $$0x.a(5120))));
   }

   private void a(uq $$0) {
      $$0.a(this.b);
      $$0.a(this.c, uq::a);
   }

   @Override
   public xz<aae> a() {
      return aac.b;
   }

   public void a(aad $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
