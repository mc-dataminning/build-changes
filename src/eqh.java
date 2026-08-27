import javax.annotation.Nullable;

public record eqh(int a, @Nullable eqh.a b, @Nullable tf c, @Nullable String d) {
   private static final tf e = tf.c("chat.tag.system");
   private static final tf f = tf.c("chat.tag.system_single_player");
   private static final tf g = tf.c("chat.tag.not_secure");
   private static final tf h = tf.c("chat.tag.modified");
   private static final tf i = tf.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final eqh l = new eqh(13684944, null, e, "System");
   private static final eqh m = new eqh(13684944, null, f, "System");
   private static final eqh n = new eqh(13684944, null, g, "Not Secure");
   private static final eqh o = new eqh(16733525, null, i, "Chat Error");

   public static eqh a() {
      return l;
   }

   public static eqh b() {
      return m;
   }

   public static eqh c() {
      return n;
   }

   public static eqh a(String $$0) {
      tf $$1 = tf.b($$0).a(n.h);
      tf $$2 = tf.h().b(h).b(te.r).b($$1);
      return new eqh(6316128, eqh.a.a, $$2, "Modified");
   }

   public static eqh d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public eqh.a f() {
      return this.b;
   }

   @Nullable
   public tf g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(new aer("icon/chat_modified"), 9, 9);

      public final aer b;
      public final int c;
      public final int d;

      private a(aer $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(erw $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
