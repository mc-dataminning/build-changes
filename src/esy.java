import javax.annotation.Nullable;

public record esy(int a, @Nullable esy.a b, @Nullable ur c, @Nullable String d) {
   private static final ur e = ur.c("chat.tag.system");
   private static final ur f = ur.c("chat.tag.system_single_player");
   private static final ur g = ur.c("chat.tag.not_secure");
   private static final ur h = ur.c("chat.tag.modified");
   private static final ur i = ur.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final esy l = new esy(13684944, null, e, "System");
   private static final esy m = new esy(13684944, null, f, "System");
   private static final esy n = new esy(13684944, null, g, "Not Secure");
   private static final esy o = new esy(16733525, null, i, "Chat Error");

   public static esy a() {
      return l;
   }

   public static esy b() {
      return m;
   }

   public static esy c() {
      return n;
   }

   public static esy a(String $$0) {
      ur $$1 = ur.b($$0).a(n.h);
      ur $$2 = ur.i().b(h).b(uq.r).b($$1);
      return new esy(6316128, esy.a.a, $$2, "Modified");
   }

   public static esy d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public esy.a f() {
      return this.b;
   }

   @Nullable
   public ur g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new agi("icon/chat_modified"), 9, 9);

      public final agi b;
      public final int c;
      public final int d;

      private a(agi $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(euo $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
