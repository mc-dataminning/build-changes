import javax.annotation.Nullable;

public record fma(int a, @Nullable fma.a b, @Nullable wp c, @Nullable String d) {
   private static final wp e = wp.c("chat.tag.system");
   private static final wp f = wp.c("chat.tag.system_single_player");
   private static final wp g = wp.c("chat.tag.not_secure");
   private static final wp h = wp.c("chat.tag.modified");
   private static final wp i = wp.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fma l = new fma(13684944, null, e, "System");
   private static final fma m = new fma(13684944, null, f, "System");
   private static final fma n = new fma(13684944, null, g, "Not Secure");
   private static final fma o = new fma(16733525, null, i, "Chat Error");

   public static fma a() {
      return l;
   }

   public static fma b() {
      return m;
   }

   public static fma c() {
      return n;
   }

   public static fma a(String $$0) {
      wp $$1 = wp.b($$0).a(n.h);
      wp $$2 = wp.i().b(h).b(wo.s).b($$1);
      return new fma(6316128, fma.a.a, $$2, "Modified");
   }

   public static fma d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fma.a f() {
      return this.b;
   }

   @Nullable
   public wp g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(aku.b("icon/chat_modified"), 9, 9);

      public final aku b;
      public final int c;
      public final int d;

      private a(final aku $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fpc $$0, int $$1, int $$2) {
         $$0.a(gnh::H, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
