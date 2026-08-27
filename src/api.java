import java.security.SignatureException;

@FunctionalInterface
public interface api {
   void update(api.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
