import java.security.SignatureException;

@FunctionalInterface
public interface ats {
   void update(ats.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
