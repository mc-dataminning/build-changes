import java.security.SignatureException;

@FunctionalInterface
public interface ays {
   void update(ays.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
