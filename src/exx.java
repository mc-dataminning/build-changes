import javax.annotation.Nullable;

public class exx implements exw {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wy g;
   @Nullable
   private yo h;

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
   public wy d() {
      return this.g;
   }

   public void a(@Nullable wy $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yo c() {
      return this.h;
   }

   public void b(@Nullable yo $$0) {
      this.h = $$0;
   }

   public ua a(jo.a $$0) {
      ua $$1 = new ua();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", wy.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yq.b.encodeStart($$0.a(uo.a), this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static exx a(ua $$0, jo.a $$1) {
      exx $$2 = new exx();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = wy.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yq.b.parse($$1.a(uo.a), $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
