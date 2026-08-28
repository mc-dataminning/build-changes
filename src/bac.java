import java.security.SignatureException;

@FunctionalInterface
public interface bac {
   void update(bac.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
