import java.security.SignatureException;

@FunctionalInterface
public interface axh {
   void update(axh.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
