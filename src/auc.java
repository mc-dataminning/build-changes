import io.netty.buffer.ByteBuf;

public record auc(String c, String d, String e) {
   public static final zc<ByteBuf, auc> a = zc.a(za.m, auc::b, za.m, auc::c, za.m, auc::d, auc::new);
   public static final String b = "minecraft";

   public static auc a(String $$0) {
      return new auc("minecraft", $$0, ab.b().b());
   }

   public boolean a() {
      return this.c.equals("minecraft");
   }

   @Override
   public String toString() {
      return this.c + ":" + this.d + ":" + this.e;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public String d() {
      return this.e;
   }
}
