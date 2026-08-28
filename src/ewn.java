import javax.annotation.Nullable;

public class ewn implements ewm {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xl g;
   @Nullable
   private zb h;

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
   public xl d() {
      return this.g;
   }

   public void a(@Nullable xl $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public zb c() {
      return this.h;
   }

   public void b(@Nullable zb $$0) {
      this.h = $$0;
   }

   public ur a(jk.a $$0) {
      ur $$1 = new ur();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xl.a.a(this.g, $$0));
      }

      if (this.h != null) {
         zd.b.encodeStart($$0.a(vf.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static ewn a(ur $$0, jk.a $$1) {
      ewn $$2 = new ewn();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xl.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         zd.b.parse($$1.a(vf.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
