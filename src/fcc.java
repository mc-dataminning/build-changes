import javax.annotation.Nullable;

public class fcc implements fcb {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wo g;
   @Nullable
   private ye h;

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
   public wo d() {
      return this.g;
   }

   public void a(@Nullable wo $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public ye c() {
      return this.h;
   }

   public void b(@Nullable ye $$0) {
      this.h = $$0;
   }

   public tq a(jt.a $$0) {
      tq $$1 = new tq();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", wo.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yg.b.encodeStart($$0.a(ue.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static fcc a(tq $$0, jt.a $$1) {
      fcc $$2 = new fcc();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = wo.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yg.b.parse($$1.a(ue.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
