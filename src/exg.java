import javax.annotation.Nullable;

public class exg implements exf {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wu g;
   @Nullable
   private yk h;

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
   public wu d() {
      return this.g;
   }

   public void a(@Nullable wu $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yk c() {
      return this.h;
   }

   public void b(@Nullable yk $$0) {
      this.h = $$0;
   }

   public tx a(jl.a $$0) {
      tx $$1 = new tx();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", wu.a.a(this.g, $$0));
      }

      if (this.h != null) {
         ym.b.encodeStart($$0.a(ul.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static exg a(tx $$0, jl.a $$1) {
      exg $$2 = new exg();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = wu.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         ym.b.parse($$1.a(ul.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
