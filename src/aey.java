import javax.annotation.Nullable;

public record aey(String b, @Nullable String c) implements zr<acg> {
   public static final zi<wh, aey> a = zr.a(aey::a, aey::new);

   private aey(wh $$0) {
      this($$0.p(), $$0.c(wh::p));
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wh::a);
   }

   @Override
   public zt<aey> a() {
      return agz.cm;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
