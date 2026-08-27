import java.security.SignatureException;

@FunctionalInterface
public interface avb {
   void update(avb.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
