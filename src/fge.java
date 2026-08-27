import javax.annotation.Nullable;

public record fge(int a, @Nullable fge.a b, @Nullable xe c, @Nullable String d) {
   private static final xe e = xe.c("chat.tag.system");
   private static final xe f = xe.c("chat.tag.system_single_player");
   private static final xe g = xe.c("chat.tag.not_secure");
   private static final xe h = xe.c("chat.tag.modified");
   private static final xe i = xe.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fge l = new fge(13684944, null, e, "System");
   private static final fge m = new fge(13684944, null, f, "System");
   private static final fge n = new fge(13684944, null, g, "Not Secure");
   private static final fge o = new fge(16733525, null, i, "Chat Error");

   public static fge a() {
      return l;
   }

   public static fge b() {
      return m;
   }

   public static fge c() {
      return n;
   }

   public static fge a(String $$0) {
      xe $$1 = xe.b($$0).a(n.h);
      xe $$2 = xe.i().a(h).a(xd.s).a($$1);
      return new fge(6316128, fge.a.a, $$2, "Modified");
   }

   public static fge d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fge.a f() {
      return this.b;
   }

   @Nullable
   public xe g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new akt("icon/chat_modified"), 9, 9);

      public final akt b;
      public final int c;
      public final int d;

      private a(akt $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fia $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
