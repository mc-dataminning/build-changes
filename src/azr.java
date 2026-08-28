import java.security.SignatureException;

@FunctionalInterface
public interface azr {
   void update(azr.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
