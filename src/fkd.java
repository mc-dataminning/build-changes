import java.net.InetSocketAddress;

public interface fkd {
   String a();

   String b();

   int c();

   InetSocketAddress d();

   static fkd a(final InetSocketAddress $$0) {
      return new fkd() {
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
