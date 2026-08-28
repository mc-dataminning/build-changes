import javax.annotation.Nullable;

public class ewq implements ewp {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xo g;
   @Nullable
   private ze h;

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
   public xo d() {
      return this.g;
   }

   public void a(@Nullable xo $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public ze c() {
      return this.h;
   }

   public void b(@Nullable ze $$0) {
      this.h = $$0;
   }

   public ur a(jk.a $$0) {
      ur $$1 = new ur();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xo.a.a(this.g, $$0));
      }

      if (this.h != null) {
         zg.b.encodeStart($$0.a(vf.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static ewq a(ur $$0, jk.a $$1) {
      ewq $$2 = new ewq();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xo.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         zg.b.parse($$1.a(vf.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
