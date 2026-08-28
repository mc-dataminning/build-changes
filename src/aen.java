import javax.annotation.Nullable;

public record aen(String b, @Nullable String c) implements zh<abw> {
   public static final yy<vw, aen> a = zh.a(aen::a, aen::new);

   private aen(vw $$0) {
      this($$0.p(), $$0.c(vw::p));
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vw::a);
   }

   @Override
   public zj<aen> a() {
      return agp.cp;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
