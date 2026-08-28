import javax.annotation.Nullable;

public record fmx(int a, @Nullable fmx.a b, @Nullable wv c, @Nullable String d) {
   private static final wv e = wv.c("chat.tag.system");
   private static final wv f = wv.c("chat.tag.system_single_player");
   private static final wv g = wv.c("chat.tag.not_secure");
   private static final wv h = wv.c("chat.tag.modified");
   private static final wv i = wv.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fmx l = new fmx(13684944, null, e, "System");
   private static final fmx m = new fmx(13684944, null, f, "System");
   private static final fmx n = new fmx(13684944, null, g, "Not Secure");
   private static final fmx o = new fmx(16733525, null, i, "Chat Error");

   public static fmx a() {
      return l;
   }

   public static fmx b() {
      return m;
   }

   public static fmx c() {
      return n;
   }

   public static fmx a(String $$0) {
      wv $$1 = wv.b($$0).a(n.h);
      wv $$2 = wv.i().b(h).b(wu.s).b($$1);
      return new fmx(6316128, fmx.a.a, $$2, "Modified");
   }

   public static fmx d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fmx.a f() {
      return this.b;
   }

   @Nullable
   public wv g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(ald.b("icon/chat_modified"), 9, 9);

      public final ald b;
      public final int c;
      public final int d;

      private a(final ald $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fpz $$0, int $$1, int $$2) {
         $$0.a(goi::H, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
