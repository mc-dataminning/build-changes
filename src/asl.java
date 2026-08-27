import io.netty.buffer.ByteBuf;

public record asl(String c, String d, String e) {
   public static final yg<ByteBuf, asl> a = yg.a(ye.k, asl::b, ye.k, asl::c, ye.k, asl::d, asl::new);
   public static final String b = "minecraft";

   public static asl a(String $$0) {
      return new asl("minecraft", $$0, aa.b().b());
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
