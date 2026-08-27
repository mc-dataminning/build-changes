import javax.annotation.Nullable;

public record fcz(int a, @Nullable fcz.a b, @Nullable wu c, @Nullable String d) {
   private static final wu e = wu.c("chat.tag.system");
   private static final wu f = wu.c("chat.tag.system_single_player");
   private static final wu g = wu.c("chat.tag.not_secure");
   private static final wu h = wu.c("chat.tag.modified");
   private static final wu i = wu.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fcz l = new fcz(13684944, null, e, "System");
   private static final fcz m = new fcz(13684944, null, f, "System");
   private static final fcz n = new fcz(13684944, null, g, "Not Secure");
   private static final fcz o = new fcz(16733525, null, i, "Chat Error");

   public static fcz a() {
      return l;
   }

   public static fcz b() {
      return m;
   }

   public static fcz c() {
      return n;
   }

   public static fcz a(String $$0) {
      wu $$1 = wu.b($$0).a(n.h);
      wu $$2 = wu.i().b(h).b(wt.s).b($$1);
      return new fcz(6316128, fcz.a.a, $$2, "Modified");
   }

   public static fcz d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fcz.a f() {
      return this.b;
   }

   @Nullable
   public wu g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new akh("icon/chat_modified"), 9, 9);

      public final akh b;
      public final int c;
      public final int d;

      private a(akh $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fer $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
