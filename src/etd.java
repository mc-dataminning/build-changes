import javax.annotation.Nullable;

public record etd(int a, @Nullable etd.a b, @Nullable uv c, @Nullable String d) {
   private static final uv e = uv.c("chat.tag.system");
   private static final uv f = uv.c("chat.tag.system_single_player");
   private static final uv g = uv.c("chat.tag.not_secure");
   private static final uv h = uv.c("chat.tag.modified");
   private static final uv i = uv.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final etd l = new etd(13684944, null, e, "System");
   private static final etd m = new etd(13684944, null, f, "System");
   private static final etd n = new etd(13684944, null, g, "Not Secure");
   private static final etd o = new etd(16733525, null, i, "Chat Error");

   public static etd a() {
      return l;
   }

   public static etd b() {
      return m;
   }

   public static etd c() {
      return n;
   }

   public static etd a(String $$0) {
      uv $$1 = uv.b($$0).a(n.h);
      uv $$2 = uv.i().b(h).b(uu.r).b($$1);
      return new etd(6316128, etd.a.a, $$2, "Modified");
   }

   public static etd d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public etd.a f() {
      return this.b;
   }

   @Nullable
   public uv g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new agm("icon/chat_modified"), 9, 9);

      public final agm b;
      public final int c;
      public final int d;

      private a(agm $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(eut $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
