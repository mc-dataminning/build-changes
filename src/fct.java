import javax.annotation.Nullable;

public class fct implements fcs {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xk g;
   @Nullable
   private za h;

   @Override
   public int a() {
      return this.e;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   @Override
   public boolean b() {
      return this.f;
   }

   public void a(boolean $$0) {
      this.f = $$0;
   }

   @Nullable
   public xk d() {
      return this.g;
   }

   public void a(@Nullable xk $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public za c() {
      return this.h;
   }

   public void b(@Nullable za $$0) {
      this.h = $$0;
   }

   public um a(js.a $$0) {
      um $$1 = new um();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xk.a.a(this.g, $$0));
      }

      if (this.h != null) {
         zc.b.encodeStart($$0.a(va.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static fct a(um $$0, js.a $$1) {
      fct $$2 = new fct();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xk.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         zc.b.parse($$1.a(va.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
