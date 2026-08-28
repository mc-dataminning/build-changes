import javax.annotation.Nullable;

public class ewu implements ewt {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xp g;
   @Nullable
   private zf h;

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
   public xp d() {
      return this.g;
   }

   public void a(@Nullable xp $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public zf c() {
      return this.h;
   }

   public void b(@Nullable zf $$0) {
      this.h = $$0;
   }

   public us a(jk.a $$0) {
      us $$1 = new us();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xp.a.a(this.g, $$0));
      }

      if (this.h != null) {
         zh.b.encodeStart($$0.a(vg.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static ewu a(us $$0, jk.a $$1) {
      ewu $$2 = new ewu();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xp.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         zh.b.parse($$1.a(vg.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
