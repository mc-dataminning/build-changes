import javax.annotation.Nullable;

public record ezb(int a, @Nullable ezb.a b, @Nullable vu c, @Nullable String d) {
   private static final vu e = vu.c("chat.tag.system");
   private static final vu f = vu.c("chat.tag.system_single_player");
   private static final vu g = vu.c("chat.tag.not_secure");
   private static final vu h = vu.c("chat.tag.modified");
   private static final vu i = vu.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final ezb l = new ezb(13684944, null, e, "System");
   private static final ezb m = new ezb(13684944, null, f, "System");
   private static final ezb n = new ezb(13684944, null, g, "Not Secure");
   private static final ezb o = new ezb(16733525, null, i, "Chat Error");

   public static ezb a() {
      return l;
   }

   public static ezb b() {
      return m;
   }

   public static ezb c() {
      return n;
   }

   public static ezb a(String $$0) {
      vu $$1 = vu.b($$0).a(n.h);
      vu $$2 = vu.i().b(h).b(vt.s).b($$1);
      return new ezb(6316128, ezb.a.a, $$2, "Modified");
   }

   public static ezb d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public ezb.a f() {
      return this.b;
   }

   @Nullable
   public vu g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new ajh("icon/chat_modified"), 9, 9);

      public final ajh b;
      public final int c;
      public final int d;

      private a(ajh $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fat $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
