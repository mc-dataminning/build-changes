import javax.annotation.Nullable;

public record fif(int a, @Nullable fif.a b, @Nullable xd c, @Nullable String d) {
   private static final xd e = xd.c("chat.tag.system");
   private static final xd f = xd.c("chat.tag.system_single_player");
   private static final xd g = xd.c("chat.tag.not_secure");
   private static final xd h = xd.c("chat.tag.modified");
   private static final xd i = xd.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fif l = new fif(13684944, null, e, "System");
   private static final fif m = new fif(13684944, null, f, "System");
   private static final fif n = new fif(13684944, null, g, "Not Secure");
   private static final fif o = new fif(16733525, null, i, "Chat Error");

   public static fif a() {
      return l;
   }

   public static fif b() {
      return m;
   }

   public static fif c() {
      return n;
   }

   public static fif a(String $$0) {
      xd $$1 = xd.b($$0).a(n.h);
      xd $$2 = xd.i().b(h).b(xc.s).b($$1);
      return new fif(6316128, fif.a.a, $$2, "Modified");
   }

   public static fif d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fif.a f() {
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
      a(alc.b("icon/chat_modified"), 9, 9);

      public final alc b;
      public final int c;
      public final int d;

      private a(final alc $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fjx $$0, int $$1, int $$2) {
         $$0.a(ghq::B, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
