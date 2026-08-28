import javax.annotation.Nullable;

public record fiu(int a, @Nullable fiu.a b, @Nullable xh c, @Nullable String d) {
   private static final xh e = xh.c("chat.tag.system");
   private static final xh f = xh.c("chat.tag.system_single_player");
   private static final xh g = xh.c("chat.tag.not_secure");
   private static final xh h = xh.c("chat.tag.modified");
   private static final xh i = xh.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fiu l = new fiu(13684944, null, e, "System");
   private static final fiu m = new fiu(13684944, null, f, "System");
   private static final fiu n = new fiu(13684944, null, g, "Not Secure");
   private static final fiu o = new fiu(16733525, null, i, "Chat Error");

   public static fiu a() {
      return l;
   }

   public static fiu b() {
      return m;
   }

   public static fiu c() {
      return n;
   }

   public static fiu a(String $$0) {
      xh $$1 = xh.b($$0).a(n.h);
      xh $$2 = xh.i().b(h).b(xg.s).b($$1);
      return new fiu(6316128, fiu.a.a, $$2, "Modified");
   }

   public static fiu d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fiu.a f() {
      return this.b;
   }

   @Nullable
   public xh g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(alh.b("icon/chat_modified"), 9, 9);

      public final alh b;
      public final int c;
      public final int d;

      private a(final alh $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fkm $$0, int $$1, int $$2) {
         $$0.a(gig::B, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
