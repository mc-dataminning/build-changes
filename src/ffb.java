import javax.annotation.Nullable;

public record ffb(int a, @Nullable ffb.a b, @Nullable xp c, @Nullable String d) {
   private static final xp e = xp.c("chat.tag.system");
   private static final xp f = xp.c("chat.tag.system_single_player");
   private static final xp g = xp.c("chat.tag.not_secure");
   private static final xp h = xp.c("chat.tag.modified");
   private static final xp i = xp.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final ffb l = new ffb(13684944, null, e, "System");
   private static final ffb m = new ffb(13684944, null, f, "System");
   private static final ffb n = new ffb(13684944, null, g, "Not Secure");
   private static final ffb o = new ffb(16733525, null, i, "Chat Error");

   public static ffb a() {
      return l;
   }

   public static ffb b() {
      return m;
   }

   public static ffb c() {
      return n;
   }

   public static ffb a(String $$0) {
      xp $$1 = xp.b($$0).a(n.h);
      xp $$2 = xp.i().b(h).b(xo.s).b($$1);
      return new ffb(6316128, ffb.a.a, $$2, "Modified");
   }

   public static ffb d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public ffb.a f() {
      return this.b;
   }

   @Nullable
   public xp g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new alf("icon/chat_modified"), 9, 9);

      public final alf b;
      public final int c;
      public final int d;

      private a(final alf $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fgs $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
