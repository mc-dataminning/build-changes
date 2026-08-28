import javax.annotation.Nullable;

public record fqx(int a, @Nullable fqx.a b, @Nullable xa c, @Nullable String d) {
   private static final xa e = xa.c("chat.tag.system");
   private static final xa f = xa.c("chat.tag.system_single_player");
   private static final xa g = xa.c("chat.tag.not_secure");
   private static final xa h = xa.c("chat.tag.modified");
   private static final xa i = xa.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fqx l = new fqx(13684944, null, e, "System");
   private static final fqx m = new fqx(13684944, null, f, "System");
   private static final fqx n = new fqx(13684944, null, g, "Not Secure");
   private static final fqx o = new fqx(16733525, null, i, "Chat Error");

   public static fqx a() {
      return l;
   }

   public static fqx b() {
      return m;
   }

   public static fqx c() {
      return n;
   }

   public static fqx a(String $$0) {
      xa $$1 = xa.b($$0).a(o.h);
      xa $$2 = xa.i().b(h).b(wz.s).b($$1);
      return new fqx(6316128, fqx.a.a, $$2, "Modified");
   }

   public static fqx d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fqx.a f() {
      return this.b;
   }

   @Nullable
   public xa g() {
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

      public void a(ftx $$0, int $$1, int $$2) {
         $$0.a(gsl::H, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
