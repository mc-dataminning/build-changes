import javax.annotation.Nullable;

public class fcd implements fcc {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wp g;
   @Nullable
   private yf h;

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
   public wp d() {
      return this.g;
   }

   public void a(@Nullable wp $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yf c() {
      return this.h;
   }

   public void b(@Nullable yf $$0) {
      this.h = $$0;
   }

   public tq a(jt.a $$0) {
      tq $$1 = new tq();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", wp.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yh.b.encodeStart($$0.a(ue.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static fcd a(tq $$0, jt.a $$1) {
      fcd $$2 = new fcd();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = wp.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yh.b.parse($$1.a(ue.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
