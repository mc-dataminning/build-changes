import javax.annotation.Nullable;

public class etb implements eta {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wg g;
   @Nullable
   private xw h;

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
   public wg d() {
      return this.g;
   }

   public void a(@Nullable wg $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public xw c() {
      return this.h;
   }

   public void b(@Nullable xw $$0) {
      this.h = $$0;
   }

   public tm a(in.a $$0) {
      tm $$1 = new tm();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", wg.a.a(this.g, $$0));
      }

      if (this.h != null) {
         xy.b.encodeStart($$0.a(ua.a), this.h).result().ifPresent($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static etb a(tm $$0, in.a $$1) {
      etb $$2 = new etb();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = wg.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         xy.b.parse($$1.a(ua.a), $$0.c("format")).result().ifPresent($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
