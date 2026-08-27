import java.security.SignatureException;

@FunctionalInterface
public interface axv {
   void update(axv.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
