import javax.annotation.Nullable;

public record fgh(int a, @Nullable fgh.a b, @Nullable wz c, @Nullable String d) {
   private static final wz e = wz.c("chat.tag.system");
   private static final wz f = wz.c("chat.tag.system_single_player");
   private static final wz g = wz.c("chat.tag.not_secure");
   private static final wz h = wz.c("chat.tag.modified");
   private static final wz i = wz.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fgh l = new fgh(13684944, null, e, "System");
   private static final fgh m = new fgh(13684944, null, f, "System");
   private static final fgh n = new fgh(13684944, null, g, "Not Secure");
   private static final fgh o = new fgh(16733525, null, i, "Chat Error");

   public static fgh a() {
      return l;
   }

   public static fgh b() {
      return m;
   }

   public static fgh c() {
      return n;
   }

   public static fgh a(String $$0) {
      wz $$1 = wz.b($$0).a(n.h);
      wz $$2 = wz.i().b(h).b(wy.s).b($$1);
      return new fgh(6316128, fgh.a.a, $$2, "Modified");
   }

   public static fgh d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fgh.a f() {
      return this.b;
   }

   @Nullable
   public wz g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(akr.b("icon/chat_modified"), 9, 9);

      public final akr b;
      public final int c;
      public final int d;

      private a(final akr $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fhx $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
