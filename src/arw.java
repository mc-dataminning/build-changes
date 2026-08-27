import java.security.SignatureException;

@FunctionalInterface
public interface arw {
   void update(arw.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
