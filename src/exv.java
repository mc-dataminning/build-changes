import javax.annotation.Nullable;

public class exv implements exu {
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

   public uk a(jc.a $$0) {
      uk $$1 = new uk();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xe.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yw.b.encodeStart($$0.a(uy.a), this.h).result().ifPresent($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static exv a(uk $$0, jc.a $$1) {
      exv $$2 = new exv();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xe.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yw.b.parse($$1.a(uy.a), $$0.c("format")).result().ifPresent($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
