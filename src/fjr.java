import javax.annotation.Nullable;

public record fjr(int a, @Nullable fjr.a b, @Nullable xl c, @Nullable String d) {
   private static final xl e = xl.c("chat.tag.system");
   private static final xl f = xl.c("chat.tag.system_single_player");
   private static final xl g = xl.c("chat.tag.not_secure");
   private static final xl h = xl.c("chat.tag.modified");
   private static final xl i = xl.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fjr l = new fjr(13684944, null, e, "System");
   private static final fjr m = new fjr(13684944, null, f, "System");
   private static final fjr n = new fjr(13684944, null, g, "Not Secure");
   private static final fjr o = new fjr(16733525, null, i, "Chat Error");

   public static fjr a() {
      return l;
   }

   public static fjr b() {
      return m;
   }

   public static fjr c() {
      return n;
   }

   public static fjr a(String $$0) {
      xl $$1 = xl.b($$0).a(n.h);
      xl $$2 = xl.i().b(h).b(xk.s).b($$1);
      return new fjr(6316128, fjr.a.a, $$2, "Modified");
   }

   public static fjr d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fjr.a f() {
      return this.b;
   }

   @Nullable
   public xl g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(all.b("icon/chat_modified"), 9, 9);

      public final all b;
      public final int c;
      public final int d;

      private a(final all $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(flj $$0, int $$1, int $$2) {
         $$0.a(gjh::B, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
