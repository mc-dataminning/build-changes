import java.security.SignatureException;

@FunctionalInterface
public interface bae {
   void update(bae.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
