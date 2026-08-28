import javax.annotation.Nullable;

public record fly(int a, @Nullable fly.a b, @Nullable xv c, @Nullable String d) {
   private static final xv e = xv.c("chat.tag.system");
   private static final xv f = xv.c("chat.tag.system_single_player");
   private static final xv g = xv.c("chat.tag.not_secure");
   private static final xv h = xv.c("chat.tag.modified");
   private static final xv i = xv.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fly l = new fly(13684944, null, e, "System");
   private static final fly m = new fly(13684944, null, f, "System");
   private static final fly n = new fly(13684944, null, g, "Not Secure");
   private static final fly o = new fly(16733525, null, i, "Chat Error");

   public static fly a() {
      return l;
   }

   public static fly b() {
      return m;
   }

   public static fly c() {
      return n;
   }

   public static fly a(String $$0) {
      xv $$1 = xv.b($$0).a(n.h);
      xv $$2 = xv.i().b(h).b(xu.s).b($$1);
      return new fly(6316128, fly.a.a, $$2, "Modified");
   }

   public static fly d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fly.a f() {
      return this.b;
   }

   @Nullable
   public xv g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(alz.b("icon/chat_modified"), 9, 9);

      public final alz b;
      public final int c;
      public final int d;

      private a(final alz $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fnq $$0, int $$1, int $$2) {
         $$0.a(glt::B, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
