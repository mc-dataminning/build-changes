import javax.annotation.Nullable;

public record eni(int a, @Nullable eni.a b, @Nullable sw c, @Nullable String d) {
   private static final sw e = sw.c("chat.tag.system");
   private static final sw f = sw.c("chat.tag.system_single_player");
   private static final sw g = sw.c("chat.tag.not_secure");
   private static final sw h = sw.c("chat.tag.modified");
   private static final int i = 13684944;
   private static final int j = 6316128;
   private static final eni k = new eni(13684944, null, e, "System");
   private static final eni l = new eni(13684944, null, f, "System");
   private static final eni m = new eni(13684944, null, g, "Not Secure");
   static final acq n = new acq("textures/gui/chat_tags.png");

   public static eni a() {
      return k;
   }

   public static eni b() {
      return l;
   }

   public static eni c() {
      return m;
   }

   public static eni a(String $$0) {
      sw $$1 = sw.b($$0).a(n.h);
      sw $$2 = sw.h().b(h).b(sv.q).b($$1);
      return new eni(6316128, eni.a.a, $$2, "Modified");
   }

   public int d() {
      return this.a;
   }

   @Nullable
   public eni.a e() {
      return this.b;
   }

   @Nullable
   public sw f() {
      return this.c;
   }

   @Nullable
   public String g() {
      return this.d;
   }

   public static enum a {
      a(0, 0, 9, 9);

      public final int b;
      public final int c;
      public final int d;
      public final int e;

      private a(int $$0, int $$1, int $$2, int $$3) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }

      public void a(eox $$0, int $$1, int $$2) {
         $$0.a(eni.n, $$1, $$2, (float)this.b, (float)this.c, this.d, this.e, 32, 32);
      }
   }
}
