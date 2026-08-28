import javax.annotation.Nullable;

public record fjy(int a, @Nullable fjy.a b, @Nullable xj c, @Nullable String d) {
   private static final xj e = xj.c("chat.tag.system");
   private static final xj f = xj.c("chat.tag.system_single_player");
   private static final xj g = xj.c("chat.tag.not_secure");
   private static final xj h = xj.c("chat.tag.modified");
   private static final xj i = xj.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fjy l = new fjy(13684944, null, e, "System");
   private static final fjy m = new fjy(13684944, null, f, "System");
   private static final fjy n = new fjy(13684944, null, g, "Not Secure");
   private static final fjy o = new fjy(16733525, null, i, "Chat Error");

   public static fjy a() {
      return l;
   }

   public static fjy b() {
      return m;
   }

   public static fjy c() {
      return n;
   }

   public static fjy a(String $$0) {
      xj $$1 = xj.b($$0).a(n.h);
      xj $$2 = xj.i().b(h).b(xi.s).b($$1);
      return new fjy(6316128, fjy.a.a, $$2, "Modified");
   }

   public static fjy d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fjy.a f() {
      return this.b;
   }

   @Nullable
   public xj g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(alj.b("icon/chat_modified"), 9, 9);

      public final alj b;
      public final int c;
      public final int d;

      private a(final alj $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(flq $$0, int $$1, int $$2) {
         $$0.a(gjq::B, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
