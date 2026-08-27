import javax.annotation.Nullable;

public class end implements enc {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private vg g;
   @Nullable
   private ww h;

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
   public vg d() {
      return this.g;
   }

   public void a(@Nullable vg $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public ww c() {
      return this.h;
   }

   public void b(@Nullable ww $$0) {
      this.h = $$0;
   }

   public so e() {
      so $$0 = new so();
      $$0.a("Score", this.e);
      $$0.a("Locked", this.f);
      if (this.g != null) {
         $$0.a("display", vg.a.a(this.g));
      }

      if (this.h != null) {
         wy.b.encodeStart(tc.a, this.h).result().ifPresent($$1 -> $$0.a("format", $$1));
      }

      return $$0;
   }

   public static end a(so $$0) {
      end $$1 = new end();
      $$1.e = $$0.h("Score");
      $$1.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$1.g = vg.a.a($$0.l("display"));
      }

      if ($$0.b("format", 10)) {
         wy.b.parse(tc.a, $$0.c("format")).result().ifPresent($$1x -> $$1.h = $$1x);
      }

      return $$1;
   }
}
