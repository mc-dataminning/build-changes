import java.security.SignatureException;

@FunctionalInterface
public interface asi {
   void update(asi.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
