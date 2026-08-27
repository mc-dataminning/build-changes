import java.net.InetSocketAddress;

public interface fpq {
   String a();

   String b();

   int c();

   InetSocketAddress d();

   static fpq a(final InetSocketAddress $$0) {
      return new fpq() {
         @Override
         public String a() {
            return $$0.getAddress().getHostName();
         }

         @Override
         public String b() {
            return $$0.getAddress().getHostAddress();
         }

         @Override
         public int c() {
            return $$0.getPort();
         }

         @Override
         public InetSocketAddress d() {
            return $$0;
         }
      };
   }
}
