import javax.annotation.Nullable;

public record fhv(int a, @Nullable fhv.a b, @Nullable xd c, @Nullable String d) {
   private static final xd e = xd.c("chat.tag.system");
   private static final xd f = xd.c("chat.tag.system_single_player");
   private static final xd g = xd.c("chat.tag.not_secure");
   private static final xd h = xd.c("chat.tag.modified");
   private static final xd i = xd.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fhv l = new fhv(13684944, null, e, "System");
   private static final fhv m = new fhv(13684944, null, f, "System");
   private static final fhv n = new fhv(13684944, null, g, "Not Secure");
   private static final fhv o = new fhv(16733525, null, i, "Chat Error");

   public static fhv a() {
      return l;
   }

   public static fhv b() {
      return m;
   }

   public static fhv c() {
      return n;
   }

   public static fhv a(String $$0) {
      xd $$1 = xd.b($$0).a(n.h);
      xd $$2 = xd.i().b(h).b(xc.s).b($$1);
      return new fhv(6316128, fhv.a.a, $$2, "Modified");
   }

   public static fhv d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fhv.a f() {
      return this.b;
   }

   @Nullable
   public xd g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(alb.b("icon/chat_modified"), 9, 9);

      public final alb b;
      public final int c;
      public final int d;

      private a(final alb $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fjn $$0, int $$1, int $$2) {
         $$0.a(ghe::C, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
