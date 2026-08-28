import javax.annotation.Nullable;

public class fba implements faz {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xj g;
   @Nullable
   private yz h;

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
   public xj d() {
      return this.g;
   }

   public void a(@Nullable xj $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yz c() {
      return this.h;
   }

   public void b(@Nullable yz $$0) {
      this.h = $$0;
   }

   public ul a(js.a $$0) {
      ul $$1 = new ul();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xj.a.a(this.g, $$0));
      }

      if (this.h != null) {
         zb.b.encodeStart($$0.a(uz.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static fba a(ul $$0, js.a $$1) {
      fba $$2 = new fba();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xj.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         zb.b.parse($$1.a(uz.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
