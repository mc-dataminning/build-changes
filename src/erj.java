import javax.annotation.Nullable;

public record erj(int a, @Nullable erj.a b, @Nullable ui c, @Nullable String d) {
   private static final ui e = ui.c("chat.tag.system");
   private static final ui f = ui.c("chat.tag.system_single_player");
   private static final ui g = ui.c("chat.tag.not_secure");
   private static final ui h = ui.c("chat.tag.modified");
   private static final ui i = ui.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final erj l = new erj(13684944, null, e, "System");
   private static final erj m = new erj(13684944, null, f, "System");
   private static final erj n = new erj(13684944, null, g, "Not Secure");
   private static final erj o = new erj(16733525, null, i, "Chat Error");

   public static erj a() {
      return l;
   }

   public static erj b() {
      return m;
   }

   public static erj c() {
      return n;
   }

   public static erj a(String $$0) {
      ui $$1 = ui.b($$0).a(n.h);
      ui $$2 = ui.i().b(h).b(uh.r).b($$1);
      return new erj(6316128, erj.a.a, $$2, "Modified");
   }

   public static erj d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public erj.a f() {
      return this.b;
   }

   @Nullable
   public ui g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new afw("icon/chat_modified"), 9, 9);

      public final afw b;
      public final int c;
      public final int d;

      private a(afw $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(esy $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
