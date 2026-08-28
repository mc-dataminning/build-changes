import io.netty.buffer.ByteBuf;

public record ats(String c, String d, String e) {
   public static final zj<ByteBuf, ats> a = zj.a(zh.l, ats::b, zh.l, ats::c, zh.l, ats::d, ats::new);
   public static final String b = "minecraft";

   public static ats a(String $$0) {
      return new ats("minecraft", $$0, aa.b().b());
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
