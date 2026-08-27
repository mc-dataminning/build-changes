import java.security.SignatureException;

@FunctionalInterface
public interface awx {
   void update(awx.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
