import javax.annotation.Nullable;

public record eqi(int a, @Nullable eqi.a b, @Nullable te c, @Nullable String d) {
   private static final te e = te.c("chat.tag.system");
   private static final te f = te.c("chat.tag.system_single_player");
   private static final te g = te.c("chat.tag.not_secure");
   private static final te h = te.c("chat.tag.modified");
   private static final int i = 13684944;
   private static final int j = 6316128;
   private static final eqi k = new eqi(13684944, null, e, "System");
   private static final eqi l = new eqi(13684944, null, f, "System");
   private static final eqi m = new eqi(13684944, null, g, "Not Secure");

   public static eqi a() {
      return k;
   }

   public static eqi b() {
      return l;
   }

   public static eqi c() {
      return m;
   }

   public static eqi a(String $$0) {
      te $$1 = te.b($$0).a(n.h);
      te $$2 = te.h().b(h).b(td.r).b($$1);
      return new eqi(6316128, eqi.a.a, $$2, "Modified");
   }

   public int d() {
      return this.a;
   }

   @Nullable
   public eqi.a e() {
      return this.b;
   }

   @Nullable
   public te f() {
      return this.c;
   }

   @Nullable
   public String g() {
      return this.d;
   }

   public static enum a {
      a(new aep("icon/chat_modified"), 9, 9);

      public final aep b;
      public final int c;
      public final int d;

      private a(aep $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(erx $$0, int $$1, int $$2) {
         $$0.a(this.b, $$1, $$2, this.c, this.d);
      }
   }
}
