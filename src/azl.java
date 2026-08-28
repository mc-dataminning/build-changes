import java.security.SignatureException;

@FunctionalInterface
public interface azl {
   void update(azl.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
