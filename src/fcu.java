import javax.annotation.Nullable;

public class fcu implements fct {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xv g;
   @Nullable
   private zl h;

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
   public xv d() {
      return this.g;
   }

   public void a(@Nullable xv $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public zl c() {
      return this.h;
   }

   public void b(@Nullable zl $$0) {
      this.h = $$0;
   }

   public ux a(js.a $$0) {
      ux $$1 = new ux();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xv.a.a(this.g, $$0));
      }

      if (this.h != null) {
         zn.b.encodeStart($$0.a(vl.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static fcu a(ux $$0, js.a $$1) {
      fcu $$2 = new fcu();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xv.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         zn.b.parse($$1.a(vl.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
