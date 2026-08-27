import javax.annotation.Nullable;

public class evn implements evm {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wx g;
   @Nullable
   private yn h;

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
   public wx d() {
      return this.g;
   }

   public void a(@Nullable wx $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yn c() {
      return this.h;
   }

   public void b(@Nullable yn $$0) {
      this.h = $$0;
   }

   public ud a(iz.a $$0) {
      ud $$1 = new ud();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", wx.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yp.b.encodeStart($$0.a(ur.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static evn a(ud $$0, iz.a $$1) {
      evn $$2 = new evn();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = wx.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yp.b.parse($$1.a(ur.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
