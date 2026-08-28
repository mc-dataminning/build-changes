import javax.annotation.Nullable;

public class eyb implements eya {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wz g;
   @Nullable
   private yp h;

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
   public wz d() {
      return this.g;
   }

   public void a(@Nullable wz $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yp c() {
      return this.h;
   }

   public void b(@Nullable yp $$0) {
      this.h = $$0;
   }

   public ub a(jo.a $$0) {
      ub $$1 = new ub();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", wz.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yr.b.encodeStart($$0.a(up.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static eyb a(ub $$0, jo.a $$1) {
      eyb $$2 = new eyb();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = wz.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yr.b.parse($$1.a(up.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
