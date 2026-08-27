import javax.annotation.Nullable;

public record evb(int a, @Nullable evb.a b, @Nullable vf c, @Nullable String d) {
   private static final vf e = vf.c("chat.tag.system");
   private static final vf f = vf.c("chat.tag.system_single_player");
   private static final vf g = vf.c("chat.tag.not_secure");
   private static final vf h = vf.c("chat.tag.modified");
   private static final vf i = vf.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final evb l = new evb(13684944, null, e, "System");
   private static final evb m = new evb(13684944, null, f, "System");
   private static final evb n = new evb(13684944, null, g, "Not Secure");
   private static final evb o = new evb(16733525, null, i, "Chat Error");

   public static evb a() {
      return l;
   }

   public static evb b() {
      return m;
   }

   public static evb c() {
      return n;
   }

   public static evb a(String $$0) {
      vf $$1 = vf.b($$0).a(n.h);
      vf $$2 = vf.i().b(h).b(ve.r).b($$1);
      return new evb(6316128, evb.a.a, $$2, "Modified");
   }

   public static evb d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public evb.a f() {
      return this.b;
   }

   @Nullable
   public vf g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new ahg("icon/chat_modified"), 9, 9);

      public final ahg b;
      public final int c;
      public final int d;

      private a(ahg $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(ews $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
