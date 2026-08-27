import javax.annotation.Nullable;

public class emt implements ems {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private vf g;
   @Nullable
   private wv h;

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
   public vf d() {
      return this.g;
   }

   public void a(@Nullable vf $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public wv c() {
      return this.h;
   }

   public void b(@Nullable wv $$0) {
      this.h = $$0;
   }

   public sn e() {
      sn $$0 = new sn();
      $$0.a("Score", this.e);
      $$0.a("Locked", this.f);
      if (this.g != null) {
         $$0.a("display", vf.a.a(this.g));
      }

      if (this.h != null) {
         wx.b.encodeStart(tb.a, this.h).result().ifPresent($$1 -> $$0.a("format", $$1));
      }

      return $$0;
   }

   public static emt a(sn $$0) {
      emt $$1 = new emt();
      $$1.e = $$0.h("Score");
      $$1.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$1.g = vf.a.a($$0.l("display"));
      }

      if ($$0.b("format", 10)) {
         wx.b.parse(tb.a, $$0.c("format")).result().ifPresent($$1x -> $$1.h = $$1x);
      }

      return $$1;
   }
}
