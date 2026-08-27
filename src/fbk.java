import javax.annotation.Nullable;

public record fbk(int a, @Nullable fbk.a b, @Nullable wg c, @Nullable String d) {
   private static final wg e = wg.c("chat.tag.system");
   private static final wg f = wg.c("chat.tag.system_single_player");
   private static final wg g = wg.c("chat.tag.not_secure");
   private static final wg h = wg.c("chat.tag.modified");
   private static final wg i = wg.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fbk l = new fbk(13684944, null, e, "System");
   private static final fbk m = new fbk(13684944, null, f, "System");
   private static final fbk n = new fbk(13684944, null, g, "Not Secure");
   private static final fbk o = new fbk(16733525, null, i, "Chat Error");

   public static fbk a() {
      return l;
   }

   public static fbk b() {
      return m;
   }

   public static fbk c() {
      return n;
   }

   public static fbk a(String $$0) {
      wg $$1 = wg.b($$0).a(n.h);
      wg $$2 = wg.i().b(h).b(wf.s).b($$1);
      return new fbk(6316128, fbk.a.a, $$2, "Modified");
   }

   public static fbk d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fbk.a f() {
      return this.b;
   }

   @Nullable
   public wg g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new ajt("icon/chat_modified"), 9, 9);

      public final ajt b;
      public final int c;
      public final int d;

      private a(ajt $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fdc $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
