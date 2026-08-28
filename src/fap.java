import javax.annotation.Nullable;

public class fap implements fao {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xi g;
   @Nullable
   private yy h;

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
   public xi d() {
      return this.g;
   }

   public void a(@Nullable xi $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yy c() {
      return this.h;
   }

   public void b(@Nullable yy $$0) {
      this.h = $$0;
   }

   public uk a(js.a $$0) {
      uk $$1 = new uk();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xi.a.a(this.g, $$0));
      }

      if (this.h != null) {
         za.b.encodeStart($$0.a(uy.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static fap a(uk $$0, js.a $$1) {
      fap $$2 = new fap();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xi.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         za.b.parse($$1.a(uy.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
