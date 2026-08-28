import javax.annotation.Nullable;

public record flt(int a, @Nullable flt.a b, @Nullable xk c, @Nullable String d) {
   private static final xk e = xk.c("chat.tag.system");
   private static final xk f = xk.c("chat.tag.system_single_player");
   private static final xk g = xk.c("chat.tag.not_secure");
   private static final xk h = xk.c("chat.tag.modified");
   private static final xk i = xk.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final flt l = new flt(13684944, null, e, "System");
   private static final flt m = new flt(13684944, null, f, "System");
   private static final flt n = new flt(13684944, null, g, "Not Secure");
   private static final flt o = new flt(16733525, null, i, "Chat Error");

   public static flt a() {
      return l;
   }

   public static flt b() {
      return m;
   }

   public static flt c() {
      return n;
   }

   public static flt a(String $$0) {
      xk $$1 = xk.b($$0).a(n.h);
      xk $$2 = xk.i().b(h).b(xj.s).b($$1);
      return new flt(6316128, flt.a.a, $$2, "Modified");
   }

   public static flt d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public flt.a f() {
      return this.b;
   }

   @Nullable
   public xk g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(alp.b("icon/chat_modified"), 9, 9);

      public final alp b;
      public final int c;
      public final int d;

      private a(final alp $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fnl $$0, int $$1, int $$2) {
         $$0.a(glq::H, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
