import javax.annotation.Nullable;

public record eyf(int a, @Nullable eyf.a b, @Nullable vs c, @Nullable String d) {
   private static final vs e = vs.c("chat.tag.system");
   private static final vs f = vs.c("chat.tag.system_single_player");
   private static final vs g = vs.c("chat.tag.not_secure");
   private static final vs h = vs.c("chat.tag.modified");
   private static final vs i = vs.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final eyf l = new eyf(13684944, null, e, "System");
   private static final eyf m = new eyf(13684944, null, f, "System");
   private static final eyf n = new eyf(13684944, null, g, "Not Secure");
   private static final eyf o = new eyf(16733525, null, i, "Chat Error");

   public static eyf a() {
      return l;
   }

   public static eyf b() {
      return m;
   }

   public static eyf c() {
      return n;
   }

   public static eyf a(String $$0) {
      vs $$1 = vs.b($$0).a(n.h);
      vs $$2 = vs.i().b(h).b(vr.s).b($$1);
      return new eyf(6316128, eyf.a.a, $$2, "Modified");
   }

   public static eyf d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public eyf.a f() {
      return this.b;
   }

   @Nullable
   public vs g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new ajc("icon/chat_modified"), 9, 9);

      public final ajc b;
      public final int c;
      public final int d;

      private a(ajc $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(ezx $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
