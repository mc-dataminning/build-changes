import javax.annotation.Nullable;

public class faj implements fai {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xh g;
   @Nullable
   private yx h;

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
   public xh d() {
      return this.g;
   }

   public void a(@Nullable xh $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yx c() {
      return this.h;
   }

   public void b(@Nullable yx $$0) {
      this.h = $$0;
   }

   public uj a(jr.a $$0) {
      uj $$1 = new uj();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xh.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yz.b.encodeStart($$0.a(ux.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static faj a(uj $$0, jr.a $$1) {
      faj $$2 = new faj();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xh.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yz.b.parse($$1.a(ux.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
