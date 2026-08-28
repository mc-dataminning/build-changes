import javax.annotation.Nullable;

public record fjc(int a, @Nullable fjc.a b, @Nullable xi c, @Nullable String d) {
   private static final xi e = xi.c("chat.tag.system");
   private static final xi f = xi.c("chat.tag.system_single_player");
   private static final xi g = xi.c("chat.tag.not_secure");
   private static final xi h = xi.c("chat.tag.modified");
   private static final xi i = xi.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fjc l = new fjc(13684944, null, e, "System");
   private static final fjc m = new fjc(13684944, null, f, "System");
   private static final fjc n = new fjc(13684944, null, g, "Not Secure");
   private static final fjc o = new fjc(16733525, null, i, "Chat Error");

   public static fjc a() {
      return l;
   }

   public static fjc b() {
      return m;
   }

   public static fjc c() {
      return n;
   }

   public static fjc a(String $$0) {
      xi $$1 = xi.b($$0).a(n.h);
      xi $$2 = xi.i().b(h).b(xh.s).b($$1);
      return new fjc(6316128, fjc.a.a, $$2, "Modified");
   }

   public static fjc d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fjc.a f() {
      return this.b;
   }

   @Nullable
   public xi g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(ali.b("icon/chat_modified"), 9, 9);

      public final ali b;
      public final int c;
      public final int d;

      private a(final ali $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fku $$0, int $$1, int $$2) {
         $$0.a(gir::B, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
