import javax.annotation.Nullable;

public record eqq(int a, @Nullable eqq.a b, @Nullable tl c, @Nullable String d) {
   private static final tl e = tl.c("chat.tag.system");
   private static final tl f = tl.c("chat.tag.system_single_player");
   private static final tl g = tl.c("chat.tag.not_secure");
   private static final tl h = tl.c("chat.tag.modified");
   private static final tl i = tl.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final eqq l = new eqq(13684944, null, e, "System");
   private static final eqq m = new eqq(13684944, null, f, "System");
   private static final eqq n = new eqq(13684944, null, g, "Not Secure");
   private static final eqq o = new eqq(16733525, null, i, "Chat Error");

   public static eqq a() {
      return l;
   }

   public static eqq b() {
      return m;
   }

   public static eqq c() {
      return n;
   }

   public static eqq a(String $$0) {
      tl $$1 = tl.b($$0).a(n.h);
      tl $$2 = tl.h().b(h).b(tk.r).b($$1);
      return new eqq(6316128, eqq.a.a, $$2, "Modified");
   }

   public static eqq d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public eqq.a f() {
      return this.b;
   }

   @Nullable
   public tl g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new aew("icon/chat_modified"), 9, 9);

      public final aew b;
      public final int c;
      public final int d;

      private a(aew $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(esf $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
