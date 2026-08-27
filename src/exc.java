import javax.annotation.Nullable;

public record exc(int a, @Nullable exc.a b, @Nullable vq c, @Nullable String d) {
   private static final vq e = vq.c("chat.tag.system");
   private static final vq f = vq.c("chat.tag.system_single_player");
   private static final vq g = vq.c("chat.tag.not_secure");
   private static final vq h = vq.c("chat.tag.modified");
   private static final vq i = vq.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final exc l = new exc(13684944, null, e, "System");
   private static final exc m = new exc(13684944, null, f, "System");
   private static final exc n = new exc(13684944, null, g, "Not Secure");
   private static final exc o = new exc(16733525, null, i, "Chat Error");

   public static exc a() {
      return l;
   }

   public static exc b() {
      return m;
   }

   public static exc c() {
      return n;
   }

   public static exc a(String $$0) {
      vq $$1 = vq.b($$0).a(n.h);
      vq $$2 = vq.i().b(h).b(vp.s).b($$1);
      return new exc(6316128, exc.a.a, $$2, "Modified");
   }

   public static exc d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public exc.a f() {
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

      public void a(eyu $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
