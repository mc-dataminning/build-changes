import javax.annotation.Nullable;

public record fey(int a, @Nullable fey.a b, @Nullable xo c, @Nullable String d) {
   private static final xo e = xo.c("chat.tag.system");
   private static final xo f = xo.c("chat.tag.system_single_player");
   private static final xo g = xo.c("chat.tag.not_secure");
   private static final xo h = xo.c("chat.tag.modified");
   private static final xo i = xo.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fey l = new fey(13684944, null, e, "System");
   private static final fey m = new fey(13684944, null, f, "System");
   private static final fey n = new fey(13684944, null, g, "Not Secure");
   private static final fey o = new fey(16733525, null, i, "Chat Error");

   public static fey a() {
      return l;
   }

   public static fey b() {
      return m;
   }

   public static fey c() {
      return n;
   }

   public static fey a(String $$0) {
      xo $$1 = xo.b($$0).a(n.h);
      xo $$2 = xo.i().b(h).b(xn.s).b($$1);
      return new fey(6316128, fey.a.a, $$2, "Modified");
   }

   public static fey d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fey.a f() {
      return this.b;
   }

   @Nullable
   public xo g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new ale("icon/chat_modified"), 9, 9);

      public final ale b;
      public final int c;
      public final int d;

      private a(final ale $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fgp $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
