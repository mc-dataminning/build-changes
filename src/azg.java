import java.security.SignatureException;

@FunctionalInterface
public interface azg {
   void update(azg.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
