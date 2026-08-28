import javax.annotation.Nullable;

public record fnz(int a, @Nullable fnz.a b, @Nullable ww c, @Nullable String d) {
   private static final ww e = ww.c("chat.tag.system");
   private static final ww f = ww.c("chat.tag.system_single_player");
   private static final ww g = ww.c("chat.tag.not_secure");
   private static final ww h = ww.c("chat.tag.modified");
   private static final ww i = ww.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fnz l = new fnz(13684944, null, e, "System");
   private static final fnz m = new fnz(13684944, null, f, "System");
   private static final fnz n = new fnz(13684944, null, g, "Not Secure");
   private static final fnz o = new fnz(16733525, null, i, "Chat Error");

   public static fnz a() {
      return l;
   }

   public static fnz b() {
      return m;
   }

   public static fnz c() {
      return n;
   }

   public static fnz a(String $$0) {
      ww $$1 = ww.b($$0).a(n.h);
      ww $$2 = ww.i().b(h).b(wv.s).b($$1);
      return new fnz(6316128, fnz.a.a, $$2, "Modified");
   }

   public static fnz d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fnz.a f() {
      return this.b;
   }

   @Nullable
   public ww g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(ale.b("icon/chat_modified"), 9, 9);

      public final ale b;
      public final int c;
      public final int d;

      private a(final ale $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(frc $$0, int $$1, int $$2) {
         $$0.a(gpn::H, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
