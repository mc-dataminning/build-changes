import java.security.SignatureException;

@FunctionalInterface
public interface azw {
   void update(azw.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
