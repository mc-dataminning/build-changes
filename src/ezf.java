import javax.annotation.Nullable;

public class ezf implements eze {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private xd g;
   @Nullable
   private yt h;

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
   public xd d() {
      return this.g;
   }

   public void a(@Nullable xd $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yt c() {
      return this.h;
   }

   public void b(@Nullable yt $$0) {
      this.h = $$0;
   }

   public uf a(jp.a $$0) {
      uf $$1 = new uf();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", xd.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yv.b.encodeStart($$0.a(ut.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static ezf a(uf $$0, jp.a $$1) {
      ezf $$2 = new ezf();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = xd.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yv.b.parse($$1.a(ut.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
