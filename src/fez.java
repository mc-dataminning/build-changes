import javax.annotation.Nullable;

public record fez(int a, @Nullable fez.a b, @Nullable xo c, @Nullable String d) {
   private static final xo e = xo.c("chat.tag.system");
   private static final xo f = xo.c("chat.tag.system_single_player");
   private static final xo g = xo.c("chat.tag.not_secure");
   private static final xo h = xo.c("chat.tag.modified");
   private static final xo i = xo.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fez l = new fez(13684944, null, e, "System");
   private static final fez m = new fez(13684944, null, f, "System");
   private static final fez n = new fez(13684944, null, g, "Not Secure");
   private static final fez o = new fez(16733525, null, i, "Chat Error");

   public static fez a() {
      return l;
   }

   public static fez b() {
      return m;
   }

   public static fez c() {
      return n;
   }

   public static fez a(String $$0) {
      xo $$1 = xo.b($$0).a(n.h);
      xo $$2 = xo.i().b(h).b(xn.s).b($$1);
      return new fez(6316128, fez.a.a, $$2, "Modified");
   }

   public static fez d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fez.a f() {
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

      public void a(fgq $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
