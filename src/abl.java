import javax.annotation.Nullable;

public record abl(String a, @Nullable String b) implements xg<zb> {
   public abl(uj $$0) {
      this($$0.s(), $$0.c(uj::s));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b, uj::a);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   @Nullable
   public String d() {
      return this.b;
   }
}
