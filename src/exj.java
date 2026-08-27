import javax.annotation.Nullable;

public record exj(int a, @Nullable exj.a b, @Nullable vq c, @Nullable String d) {
   private static final vq e = vq.c("chat.tag.system");
   private static final vq f = vq.c("chat.tag.system_single_player");
   private static final vq g = vq.c("chat.tag.not_secure");
   private static final vq h = vq.c("chat.tag.modified");
   private static final vq i = vq.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final exj l = new exj(13684944, null, e, "System");
   private static final exj m = new exj(13684944, null, f, "System");
   private static final exj n = new exj(13684944, null, g, "Not Secure");
   private static final exj o = new exj(16733525, null, i, "Chat Error");

   public static exj a() {
      return l;
   }

   public static exj b() {
      return m;
   }

   public static exj c() {
      return n;
   }

   public static exj a(String $$0) {
      vq $$1 = vq.b($$0).a(n.h);
      vq $$2 = vq.i().b(h).b(vp.s).b($$1);
      return new exj(6316128, exj.a.a, $$2, "Modified");
   }

   public static exj d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public exj.a f() {
      return this.b;
   }

   @Nullable
   public vq g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new aiy("icon/chat_modified"), 9, 9);

      public final aiy b;
      public final int c;
      public final int d;

      private a(aiy $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(ezb $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
