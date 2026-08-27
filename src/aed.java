import javax.annotation.Nullable;

public record aed(String b, @Nullable String c) implements ze<abq> {
   public static final yv<vx, aed> a = ze.a(aed::a, aed::new);

   private aed(vx $$0) {
      this($$0.p(), $$0.c(vx::p));
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vx::a);
   }

   @Override
   public zg<aed> a() {
      return agc.ce;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
