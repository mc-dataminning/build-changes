import javax.annotation.Nullable;

public record fdu(int a, @Nullable fdu.a b, @Nullable wx c, @Nullable String d) {
   private static final wx e = wx.c("chat.tag.system");
   private static final wx f = wx.c("chat.tag.system_single_player");
   private static final wx g = wx.c("chat.tag.not_secure");
   private static final wx h = wx.c("chat.tag.modified");
   private static final wx i = wx.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fdu l = new fdu(13684944, null, e, "System");
   private static final fdu m = new fdu(13684944, null, f, "System");
   private static final fdu n = new fdu(13684944, null, g, "Not Secure");
   private static final fdu o = new fdu(16733525, null, i, "Chat Error");

   public static fdu a() {
      return l;
   }

   public static fdu b() {
      return m;
   }

   public static fdu c() {
      return n;
   }

   public static fdu a(String $$0) {
      wx $$1 = wx.b($$0).a(n.h);
      wx $$2 = wx.i().b(h).b(ww.s).b($$1);
      return new fdu(6316128, fdu.a.a, $$2, "Modified");
   }

   public static fdu d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fdu.a f() {
      return this.b;
   }

   @Nullable
   public wx g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new akm("icon/chat_modified"), 9, 9);

      public final akm b;
      public final int c;
      public final int d;

      private a(akm $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(ffm $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
