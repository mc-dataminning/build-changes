import javax.annotation.Nullable;

public class eug implements euf {
   private static final String a = "Score";
   private static final String b = "Locked";
   private static final String c = "display";
   private static final String d = "format";
   private int e;
   private boolean f = true;
   @Nullable
   private ws g;
   @Nullable
   private yi h;

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
   public ws d() {
      return this.g;
   }

   public void a(@Nullable ws $$0) {
      this.g = $$0;
   }

   @Nullable
   @Override
   public yi c() {
      return this.h;
   }

   public void b(@Nullable yi $$0) {
      this.h = $$0;
   }

   public ty a(ix.a $$0) {
      ty $$1 = new ty();
      $$1.a("Score", this.e);
      $$1.a("Locked", this.f);
      if (this.g != null) {
         $$1.a("display", ws.a.a(this.g, $$0));
      }

      if (this.h != null) {
         yk.b.encodeStart($$0.a(um.a), this.h).result().ifPresent($$1x -> $$1.a("format", $$1x));
      }

      return $$1;
   }

   public static eug a(ty $$0, ix.a $$1) {
      eug $$2 = new eug();
      $$2.e = $$0.h("Score");
      $$2.f = $$0.q("Locked");
      if ($$0.b("display", 8)) {
         $$2.g = ws.a.a($$0.l("display"), $$1);
      }

      if ($$0.b("format", 10)) {
         yk.b.parse($$1.a(um.a), $$0.c("format")).result().ifPresent($$1x -> $$2.h = $$1x);
      }

      return $$2;
   }
}
