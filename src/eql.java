import javax.annotation.Nullable;

public record eql(int a, @Nullable eql.a b, @Nullable ti c, @Nullable String d) {
   private static final ti e = ti.c("chat.tag.system");
   private static final ti f = ti.c("chat.tag.system_single_player");
   private static final ti g = ti.c("chat.tag.not_secure");
   private static final ti h = ti.c("chat.tag.modified");
   private static final ti i = ti.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final eql l = new eql(13684944, null, e, "System");
   private static final eql m = new eql(13684944, null, f, "System");
   private static final eql n = new eql(13684944, null, g, "Not Secure");
   private static final eql o = new eql(16733525, null, i, "Chat Error");

   public static eql a() {
      return l;
   }

   public static eql b() {
      return m;
   }

   public static eql c() {
      return n;
   }

   public static eql a(String $$0) {
      ti $$1 = ti.b($$0).a(n.h);
      ti $$2 = ti.h().b(h).b(th.r).b($$1);
      return new eql(6316128, eql.a.a, $$2, "Modified");
   }

   public static eql d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public eql.a f() {
      return this.b;
   }

   @Nullable
   public ti g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new aeu("icon/chat_modified"), 9, 9);

      public final aeu b;
      public final int c;
      public final int d;

      private a(aeu $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(esa $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
