import javax.annotation.Nullable;

public record fqz(int a, @Nullable fqz.a b, @Nullable xc c, @Nullable String d) {
   private static final xc e = xc.c("chat.tag.system");
   private static final xc f = xc.c("chat.tag.system_single_player");
   private static final xc g = xc.c("chat.tag.not_secure");
   private static final xc h = xc.c("chat.tag.modified");
   private static final xc i = xc.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fqz l = new fqz(13684944, null, e, "System");
   private static final fqz m = new fqz(13684944, null, f, "System");
   private static final fqz n = new fqz(13684944, null, g, "Not Secure");
   private static final fqz o = new fqz(16733525, null, i, "Chat Error");

   public static fqz a() {
      return l;
   }

   public static fqz b() {
      return m;
   }

   public static fqz c() {
      return n;
   }

   public static fqz a(String $$0) {
      xc $$1 = xc.b($$0).a(o.h);
      xc $$2 = xc.i().b(h).b(xb.s).b($$1);
      return new fqz(6316128, fqz.a.a, $$2, "Modified");
   }

   public static fqz d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fqz.a f() {
      return this.b;
   }

   @Nullable
   public xc g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(alk.b("icon/chat_modified"), 9, 9);

      public final alk b;
      public final int c;
      public final int d;

      private a(final alk $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(ftz $$0, int $$1, int $$2) {
         $$0.a(gsn::H, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
