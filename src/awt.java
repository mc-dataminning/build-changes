import java.security.SignatureException;

@FunctionalInterface
public interface awt {
   void update(awt.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
