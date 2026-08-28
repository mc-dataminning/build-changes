import javax.annotation.Nullable;

public record acf(all b, @Nullable byte[] c) implements zs<ace> {
   public static final zj<wi, acf> a = zs.a(acf::a, acf::new);

   private acf(wi $$0) {
      this($$0.q(), $$0.c(aah.b));
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aah.b);
   }

   @Override
   public zu<acf> a() {
      return acd.b;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
