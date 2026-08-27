import javax.annotation.Nullable;

public record acl(String a, String b, int c, @Nullable vf d, @Nullable wv e) implements xf<za> {
   public acl(ui $$0) {
      this($$0.s(), $$0.s(), $$0.n(), $$0.c(ui::m), $$0.c(wx::a));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, ui::a);
      $$0.a(this.e, wx::a);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   @Nullable
   public vf f() {
      return this.d;
   }

   @Nullable
   public wv g() {
      return this.e;
   }
}
