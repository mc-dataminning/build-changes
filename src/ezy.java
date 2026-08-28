import javax.annotation.Nullable;

public class ezy implements ezx {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xe g;
   @Nullable
   private yu h;

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
   public xe d() {
      return this.g;
   }

   public void a(@Nullable xe $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yu c() {
      return this.h;
   }

   public void b(@Nullable yu $$0) {
      this.h = $$0;
   }

   public ug a(jq.a $$0) {
      ug $$1 = new ug();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xe.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yw.b.encodeStart($$0.a(uu.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static ezy a(ug $$0, jq.a $$1) {
      ezy $$2 = new ezy();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xe.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yw.b.parse($$1.a(uu.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
