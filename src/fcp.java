import javax.annotation.Nullable;

public record fcp(int a, @Nullable fcp.a b, @Nullable ws c, @Nullable String d) {
   private static final ws e = ws.c("chat.tag.system");
   private static final ws f = ws.c("chat.tag.system_single_player");
   private static final ws g = ws.c("chat.tag.not_secure");
   private static final ws h = ws.c("chat.tag.modified");
   private static final ws i = ws.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fcp l = new fcp(13684944, null, e, "System");
   private static final fcp m = new fcp(13684944, null, f, "System");
   private static final fcp n = new fcp(13684944, null, g, "Not Secure");
   private static final fcp o = new fcp(16733525, null, i, "Chat Error");

   public static fcp a() {
      return l;
   }

   public static fcp b() {
      return m;
   }

   public static fcp c() {
      return n;
   }

   public static fcp a(String $$0) {
      ws $$1 = ws.b($$0).a(n.h);
      ws $$2 = ws.i().b(h).b(wr.s).b($$1);
      return new fcp(6316128, fcp.a.a, $$2, "Modified");
   }

   public static fcp d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fcp.a f() {
      return this.b;
   }

   @Nullable
   public ws g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new akf("icon/chat_modified"), 9, 9);

      public final akf b;
      public final int c;
      public final int d;

      private a(akf $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(feh $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
