import javax.annotation.Nullable;

public record eqs(int a, @Nullable eqs.a b, @Nullable tn c, @Nullable String d) {
   private static final tn e = tn.c("chat.tag.system");
   private static final tn f = tn.c("chat.tag.system_single_player");
   private static final tn g = tn.c("chat.tag.not_secure");
   private static final tn h = tn.c("chat.tag.modified");
   private static final tn i = tn.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final eqs l = new eqs(13684944, null, e, "System");
   private static final eqs m = new eqs(13684944, null, f, "System");
   private static final eqs n = new eqs(13684944, null, g, "Not Secure");
   private static final eqs o = new eqs(16733525, null, i, "Chat Error");

   public static eqs a() {
      return l;
   }

   public static eqs b() {
      return m;
   }

   public static eqs c() {
      return n;
   }

   public static eqs a(String $$0) {
      tn $$1 = tn.b($$0).a(n.h);
      tn $$2 = tn.h().b(h).b(tm.r).b($$1);
      return new eqs(6316128, eqs.a.a, $$2, "Modified");
   }

   public static eqs d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public eqs.a f() {
      return this.b;
   }

   @Nullable
   public tn g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new aey("icon/chat_modified"), 9, 9);

      public final aey b;
      public final int c;
      public final int d;

      private a(aey $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(esh $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
