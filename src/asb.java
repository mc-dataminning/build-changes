import java.security.SignatureException;

@FunctionalInterface
public interface asb {
   void update(asb.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
