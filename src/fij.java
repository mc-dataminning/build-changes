import javax.annotation.Nullable;

public record fij(int a, @Nullable fij.a b, @Nullable xe c, @Nullable String d) {
   private static final xe e = xe.c("chat.tag.system");
   private static final xe f = xe.c("chat.tag.system_single_player");
   private static final xe g = xe.c("chat.tag.not_secure");
   private static final xe h = xe.c("chat.tag.modified");
   private static final xe i = xe.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fij l = new fij(13684944, null, e, "System");
   private static final fij m = new fij(13684944, null, f, "System");
   private static final fij n = new fij(13684944, null, g, "Not Secure");
   private static final fij o = new fij(16733525, null, i, "Chat Error");

   public static fij a() {
      return l;
   }

   public static fij b() {
      return m;
   }

   public static fij c() {
      return n;
   }

   public static fij a(String $$0) {
      xe $$1 = xe.b($$0).a(n.h);
      xe $$2 = xe.i().b(h).b(xd.s).b($$1);
      return new fij(6316128, fij.a.a, $$2, "Modified");
   }

   public static fij d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fij.a f() {
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
      a(ale.b("icon/chat_modified"), 9, 9);

      public final ale b;
      public final int c;
      public final int d;

      private a(final ale $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fkb $$0, int $$1, int $$2) {
         $$0.a(ghv::B, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
