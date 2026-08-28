import javax.annotation.Nullable;

public record aeu(String b, @Nullable String c) implements zv<ach> {
   public static final zm<wl, aeu> a = zv.a(aeu::a, aeu::new);

   private aeu(wl $$0) {
      this($$0.p(), $$0.c(wl::p));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wl::a);
   }

   @Override
   public zx<aeu> a() {
      return agt.ce;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
