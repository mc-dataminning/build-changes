import javax.annotation.Nullable;

public class fey implements fex {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private ww g;
   @Nullable
   private ym h;

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
   public ww d() {
      return this.g;
   }

   public void a(@Nullable ww $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public ym c() {
      return this.h;
   }

   public void b(@Nullable ym $$0) {
      this.h = $$0;
   }

   public tx a(jg.a $$0) {
      tx $$1 = new tx();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      alc<uu> $$2 = $$0.a(ul.a);
      if (this.g != null) {
         $$1.a("display", (uu)wy.a.encodeStart($$2, this.g).getOrThrow());
      }

      if (this.h != null) {
         yo.b.encodeStart($$2, this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static fey a(tx $$0, jg.a $$1) {
      fey $$2 = new fey();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      alc<uu> $$3 = $$1.a(ul.a);
      if ($$0.e("display")) {
         wy.a.parse($$3, $$0.c("display")).ifSuccess($$1x -> $$2.g = $$1x);
      }

      if ($$0.b("format", 10)) {
         yo.b.parse($$3, $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
