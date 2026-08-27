import javax.annotation.Nullable;

public record fbt(int a, @Nullable fbt.a b, @Nullable wi c, @Nullable String d) {
   private static final wi e = wi.c("chat.tag.system");
   private static final wi f = wi.c("chat.tag.system_single_player");
   private static final wi g = wi.c("chat.tag.not_secure");
   private static final wi h = wi.c("chat.tag.modified");
   private static final wi i = wi.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fbt l = new fbt(13684944, null, e, "System");
   private static final fbt m = new fbt(13684944, null, f, "System");
   private static final fbt n = new fbt(13684944, null, g, "Not Secure");
   private static final fbt o = new fbt(16733525, null, i, "Chat Error");

   public static fbt a() {
      return l;
   }

   public static fbt b() {
      return m;
   }

   public static fbt c() {
      return n;
   }

   public static fbt a(String $$0) {
      wi $$1 = wi.b($$0).a(n.h);
      wi $$2 = wi.i().b(h).b(wh.s).b($$1);
      return new fbt(6316128, fbt.a.a, $$2, "Modified");
   }

   public static fbt d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fbt.a f() {
      return this.b;
   }

   @Nullable
   public wi g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new ajv("icon/chat_modified"), 9, 9);

      public final ajv b;
      public final int c;
      public final int d;

      private a(ajv $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fdl $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
