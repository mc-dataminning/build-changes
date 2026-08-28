import javax.annotation.Nullable;

public record fqk(int a, @Nullable fqk.a b, @Nullable xg c, @Nullable String d) {
   private static final xg e = xg.c("chat.tag.system");
   private static final xg f = xg.c("chat.tag.system_single_player");
   private static final xg g = xg.c("chat.tag.not_secure");
   private static final xg h = xg.c("chat.tag.modified");
   private static final xg i = xg.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fqk l = new fqk(13684944, null, e, "System");
   private static final fqk m = new fqk(13684944, null, f, "System");
   private static final fqk n = new fqk(13684944, null, g, "Not Secure");
   private static final fqk o = new fqk(16733525, null, i, "Chat Error");

   public static fqk a() {
      return l;
   }

   public static fqk b() {
      return m;
   }

   public static fqk c() {
      return n;
   }

   public static fqk a(String $$0) {
      xg $$1 = xg.b($$0).a(o.h);
      xg $$2 = xg.i().b(h).b(xf.s).b($$1);
      return new fqk(6316128, fqk.a.a, $$2, "Modified");
   }

   public static fqk d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fqk.a f() {
      return this.b;
   }

   @Nullable
   public xg g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(alr.b("icon/chat_modified"), 9, 9);

      public final alr b;
      public final int c;
      public final int d;

      private a(final alr $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(ftk $$0, int $$1, int $$2) {
         $$0.a(gry::H, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
