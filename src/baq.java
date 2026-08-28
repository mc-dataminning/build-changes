import java.security.SignatureException;

@FunctionalInterface
public interface baq {
   void update(baq.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
