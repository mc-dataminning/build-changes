import java.security.SignatureException;

@FunctionalInterface
public interface avc {
   void update(avc.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
