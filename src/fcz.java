import javax.annotation.Nullable;

public class fcz implements fcy {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private wp g;
   @Nullable
   private yf h;

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
   public wp d() {
      return this.g;
   }

   public void a(@Nullable wp $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yf c() {
      return this.h;
   }

   public void b(@Nullable yf $$0) {
      this.h = $$0;
   }

   public tq a(jt.a $$0) {
      tq $$1 = new tq();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      aks<un> $$2 = $$0.a(ue.a);
      if (this.g != null) {
         $$1.a("display", (un)wr.a.encodeStart($$2, this.g).getOrThrow());
      }

      if (this.h != null) {
         yh.b.encodeStart($$2, this.h).ifSuccess($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static fcz a(tq $$0, jt.a $$1) {
      fcz $$2 = new fcz();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      aks<un> $$3 = $$1.a(ue.a);
      if ($$0.e("display")) {
         wr.a.parse($$3, $$0.c("display")).ifSuccess($$1x -> $$2.g = $$1x);
      }

      if ($$0.b("format", 10)) {
         yh.b.parse($$3, $$0.c("format")).ifSuccess($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
