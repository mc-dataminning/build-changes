import javax.annotation.Nullable;

public record euv(int a, @Nullable euv.a b, @Nullable vd c, @Nullable String d) {
   private static final vd e = vd.c("chat.tag.system");
   private static final vd f = vd.c("chat.tag.system_single_player");
   private static final vd g = vd.c("chat.tag.not_secure");
   private static final vd h = vd.c("chat.tag.modified");
   private static final vd i = vd.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final euv l = new euv(13684944, null, e, "System");
   private static final euv m = new euv(13684944, null, f, "System");
   private static final euv n = new euv(13684944, null, g, "Not Secure");
   private static final euv o = new euv(16733525, null, i, "Chat Error");

   public static euv a() {
      return l;
   }

   public static euv b() {
      return m;
   }

   public static euv c() {
      return n;
   }

   public static euv a(String $$0) {
      vd $$1 = vd.b($$0).a(n.h);
      vd $$2 = vd.i().b(h).b(vc.r).b($$1);
      return new euv(6316128, euv.a.a, $$2, "Modified");
   }

   public static euv d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public euv.a f() {
      return this.b;
   }

   @Nullable
   public vd g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new ahd("icon/chat_modified"), 9, 9);

      public final ahd b;
      public final int c;
      public final int d;

      private a(ahd $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(ewm $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
