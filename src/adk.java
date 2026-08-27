import javax.annotation.Nullable;

public record adk(String b, @Nullable String c) implements yn<aay> {
   public static final ye<vg, adk> a = yn.a(adk::a, adk::new);

   private adk(vg $$0) {
      this($$0.p(), $$0.c(vg::p));
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vg::a);
   }

   @Override
   public yp<adk> a() {
      return afj.cc;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
