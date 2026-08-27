import javax.annotation.Nullable;

public record evm(int a, @Nullable evm.a b, @Nullable vg c, @Nullable String d) {
   private static final vg e = vg.c("chat.tag.system");
   private static final vg f = vg.c("chat.tag.system_single_player");
   private static final vg g = vg.c("chat.tag.not_secure");
   private static final vg h = vg.c("chat.tag.modified");
   private static final vg i = vg.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final evm l = new evm(13684944, null, e, "System");
   private static final evm m = new evm(13684944, null, f, "System");
   private static final evm n = new evm(13684944, null, g, "Not Secure");
   private static final evm o = new evm(16733525, null, i, "Chat Error");

   public static evm a() {
      return l;
   }

   public static evm b() {
      return m;
   }

   public static evm c() {
      return n;
   }

   public static evm a(String $$0) {
      vg $$1 = vg.b($$0).a(n.h);
      vg $$2 = vg.i().b(h).b(vf.r).b($$1);
      return new evm(6316128, evm.a.a, $$2, "Modified");
   }

   public static evm d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public evm.a f() {
      return this.b;
   }

   @Nullable
   public vg g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new ahh("icon/chat_modified"), 9, 9);

      public final ahh b;
      public final int c;
      public final int d;

      private a(ahh $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(exe $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
