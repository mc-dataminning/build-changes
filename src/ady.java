import javax.annotation.Nullable;

public record ady(String b, @Nullable String c) implements zb<abm> {
   public static final ys<vu, ady> a = zb.a(ady::a, ady::new);

   private ady(vu $$0) {
      this($$0.p(), $$0.c(vu::p));
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vu::a);
   }

   @Override
   public zd<ady> a() {
      return afx.cc;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
