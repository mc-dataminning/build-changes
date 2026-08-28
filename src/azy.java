import java.security.SignatureException;

@FunctionalInterface
public interface azy {
   void update(azy.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
