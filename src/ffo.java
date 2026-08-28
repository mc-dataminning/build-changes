import javax.annotation.Nullable;

public record ffo(int a, @Nullable ffo.a b, @Nullable wu c, @Nullable String d) {
   private static final wu e = wu.c("chat.tag.system");
   private static final wu f = wu.c("chat.tag.system_single_player");
   private static final wu g = wu.c("chat.tag.not_secure");
   private static final wu h = wu.c("chat.tag.modified");
   private static final wu i = wu.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final ffo l = new ffo(13684944, null, e, "System");
   private static final ffo m = new ffo(13684944, null, f, "System");
   private static final ffo n = new ffo(13684944, null, g, "Not Secure");
   private static final ffo o = new ffo(16733525, null, i, "Chat Error");

   public static ffo a() {
      return l;
   }

   public static ffo b() {
      return m;
   }

   public static ffo c() {
      return n;
   }

   public static ffo a(String $$0) {
      wu $$1 = wu.b($$0).a(n.h);
      wu $$2 = wu.i().b(h).b(wt.s).b($$1);
      return new ffo(6316128, ffo.a.a, $$2, "Modified");
   }

   public static ffo d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public ffo.a f() {
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

      public void a(fhf $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
