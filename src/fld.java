import javax.annotation.Nullable;

public record fld(int a, @Nullable fld.a b, @Nullable wo c, @Nullable String d) {
   private static final wo e = wo.c("chat.tag.system");
   private static final wo f = wo.c("chat.tag.system_single_player");
   private static final wo g = wo.c("chat.tag.not_secure");
   private static final wo h = wo.c("chat.tag.modified");
   private static final wo i = wo.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fld l = new fld(13684944, null, e, "System");
   private static final fld m = new fld(13684944, null, f, "System");
   private static final fld n = new fld(13684944, null, g, "Not Secure");
   private static final fld o = new fld(16733525, null, i, "Chat Error");

   public static fld a() {
      return l;
   }

   public static fld b() {
      return m;
   }

   public static fld c() {
      return n;
   }

   public static fld a(String $$0) {
      wo $$1 = wo.b($$0).a(n.h);
      wo $$2 = wo.i().b(h).b(wn.s).b($$1);
      return new fld(6316128, fld.a.a, $$2, "Modified");
   }

   public static fld d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fld.a f() {
      return this.b;
   }

   @Nullable
   public wo g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(aku.b("icon/chat_modified"), 9, 9);

      public final aku b;
      public final int c;
      public final int d;

      private a(final aku $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fod $$0, int $$1, int $$2) {
         $$0.a(gmh::H, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
