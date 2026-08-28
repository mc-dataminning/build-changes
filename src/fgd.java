import javax.annotation.Nullable;

public record fgd(int a, @Nullable fgd.a b, @Nullable wy c, @Nullable String d) {
   private static final wy e = wy.c("chat.tag.system");
   private static final wy f = wy.c("chat.tag.system_single_player");
   private static final wy g = wy.c("chat.tag.not_secure");
   private static final wy h = wy.c("chat.tag.modified");
   private static final wy i = wy.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fgd l = new fgd(13684944, null, e, "System");
   private static final fgd m = new fgd(13684944, null, f, "System");
   private static final fgd n = new fgd(13684944, null, g, "Not Secure");
   private static final fgd o = new fgd(16733525, null, i, "Chat Error");

   public static fgd a() {
      return l;
   }

   public static fgd b() {
      return m;
   }

   public static fgd c() {
      return n;
   }

   public static fgd a(String $$0) {
      wy $$1 = wy.b($$0).a(n.h);
      wy $$2 = wy.i().b(h).b(wx.s).b($$1);
      return new fgd(6316128, fgd.a.a, $$2, "Modified");
   }

   public static fgd d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fgd.a f() {
      return this.b;
   }

   @Nullable
   public wy g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(akq.b("icon/chat_modified"), 9, 9);

      public final akq b;
      public final int c;
      public final int d;

      private a(final akq $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fht $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
