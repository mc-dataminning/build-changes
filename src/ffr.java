import javax.annotation.Nullable;

public record ffr(int a, @Nullable ffr.a b, @Nullable wu c, @Nullable String d) {
   private static final wu e = wu.c("chat.tag.system");
   private static final wu f = wu.c("chat.tag.system_single_player");
   private static final wu g = wu.c("chat.tag.not_secure");
   private static final wu h = wu.c("chat.tag.modified");
   private static final wu i = wu.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final ffr l = new ffr(13684944, null, e, "System");
   private static final ffr m = new ffr(13684944, null, f, "System");
   private static final ffr n = new ffr(13684944, null, g, "Not Secure");
   private static final ffr o = new ffr(16733525, null, i, "Chat Error");

   public static ffr a() {
      return l;
   }

   public static ffr b() {
      return m;
   }

   public static ffr c() {
      return n;
   }

   public static ffr a(String $$0) {
      wu $$1 = wu.b($$0).a(n.h);
      wu $$2 = wu.i().b(h).b(wt.s).b($$1);
      return new ffr(6316128, ffr.a.a, $$2, "Modified");
   }

   public static ffr d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public ffr.a f() {
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
      a(new akk("icon/chat_modified"), 9, 9);

      public final akk b;
      public final int c;
      public final int d;

      private a(final akk $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fhh $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
