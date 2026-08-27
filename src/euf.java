import javax.annotation.Nullable;

public record euf(int a, @Nullable euf.a b, @Nullable vb c, @Nullable String d) {
   private static final vb e = vb.c("chat.tag.system");
   private static final vb f = vb.c("chat.tag.system_single_player");
   private static final vb g = vb.c("chat.tag.not_secure");
   private static final vb h = vb.c("chat.tag.modified");
   private static final vb i = vb.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final euf l = new euf(13684944, null, e, "System");
   private static final euf m = new euf(13684944, null, f, "System");
   private static final euf n = new euf(13684944, null, g, "Not Secure");
   private static final euf o = new euf(16733525, null, i, "Chat Error");

   public static euf a() {
      return l;
   }

   public static euf b() {
      return m;
   }

   public static euf c() {
      return n;
   }

   public static euf a(String $$0) {
      vb $$1 = vb.b($$0).a(n.h);
      vb $$2 = vb.i().b(h).b(va.r).b($$1);
      return new euf(6316128, euf.a.a, $$2, "Modified");
   }

   public static euf d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public euf.a f() {
      return this.b;
   }

   @Nullable
   public vb g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new agt("icon/chat_modified"), 9, 9);

      public final agt b;
      public final int c;
      public final int d;

      private a(agt $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(evw $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
