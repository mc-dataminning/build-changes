import java.security.SignatureException;

@FunctionalInterface
public interface aza {
   void update(aza.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
