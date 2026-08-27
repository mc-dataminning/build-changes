import javax.annotation.Nullable;

public class etk implements etj {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wi g;
   @Nullable
   private xy h;

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
   public wi d() {
      return this.g;
   }

   public void a(@Nullable wi $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public xy c() {
      return this.h;
   }

   public void b(@Nullable xy $$0) {
      this.h = $$0;
   }

   public to a(ip.a $$0) {
      to $$1 = new to();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", wi.a.a(this.g, $$0));
      }

      if (this.h != null) {
         ya.b.encodeStart($$0.a(uc.a), this.h).result().ifPresent($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static etk a(to $$0, ip.a $$1) {
      etk $$2 = new etk();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = wi.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         ya.b.parse($$1.a(uc.a), $$0.c("format")).result().ifPresent($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
