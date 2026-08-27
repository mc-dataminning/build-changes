import java.security.SignatureException;

@FunctionalInterface
public interface aub {
   void update(aub.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
