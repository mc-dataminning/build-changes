import javax.annotation.Nullable;

public class fdw implements fdv {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wv g;
   @Nullable
   private yl h;

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
   public wv d() {
      return this.g;
   }

   public void a(@Nullable wv $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yl c() {
      return this.h;
   }

   public void b(@Nullable yl $$0) {
      this.h = $$0;
   }

   public tw a(ju.a $$0) {
      tw $$1 = new tw();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      alb<ut> $$2 = $$0.a(uk.a);
      if (this.g != null) {
         $$1.a("display", (ut)wx.a.encodeStart($$2, this.g).getOrThrow());
      }

      if (this.h != null) {
         yn.b.encodeStart($$2, this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static fdw a(tw $$0, ju.a $$1) {
      fdw $$2 = new fdw();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      alb<ut> $$3 = $$1.a(uk.a);
      if ($$0.e("display")) {
         wx.a.parse($$3, $$0.c("display")).ifSuccess($$1x -> $$2.g = $$1x);
      }

      if ($$0.b("format", 10)) {
         yn.b.parse($$3, $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
