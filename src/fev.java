import javax.annotation.Nullable;

public record fev(int a, @Nullable fev.a b, @Nullable xl c, @Nullable String d) {
   private static final xl e = xl.c("chat.tag.system");
   private static final xl f = xl.c("chat.tag.system_single_player");
   private static final xl g = xl.c("chat.tag.not_secure");
   private static final xl h = xl.c("chat.tag.modified");
   private static final xl i = xl.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fev l = new fev(13684944, null, e, "System");
   private static final fev m = new fev(13684944, null, f, "System");
   private static final fev n = new fev(13684944, null, g, "Not Secure");
   private static final fev o = new fev(16733525, null, i, "Chat Error");

   public static fev a() {
      return l;
   }

   public static fev b() {
      return m;
   }

   public static fev c() {
      return n;
   }

   public static fev a(String $$0) {
      xl $$1 = xl.b($$0).a(n.h);
      xl $$2 = xl.i().b(h).b(xk.s).b($$1);
      return new fev(6316128, fev.a.a, $$2, "Modified");
   }

   public static fev d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fev.a f() {
      return this.b;
   }

   @Nullable
   public xl g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new alb("icon/chat_modified"), 9, 9);

      public final alb b;
      public final int c;
      public final int d;

      private a(final alb $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fgm $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
