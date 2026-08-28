import javax.annotation.Nullable;

public record ael(String b, @Nullable String c) implements zf<abu> {
   public static final yw<vu, ael> a = zf.a(ael::a, ael::new);

   private ael(vu $$0) {
      this($$0.p(), $$0.c(vu::p));
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vu::a);
   }

   @Override
   public zh<ael> a() {
      return agn.cp;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
