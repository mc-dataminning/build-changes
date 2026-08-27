import javax.annotation.Nullable;

public record aec(String b, @Nullable String c) implements ze<abq> {
   public static final yv<vx, aec> a = ze.a(aec::a, aec::new);

   private aec(vx $$0) {
      this($$0.p(), $$0.c(vx::p));
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vx::a);
   }

   @Override
   public zg<aec> a() {
      return agb.cd;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
