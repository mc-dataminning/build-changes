import java.security.SignatureException;

@FunctionalInterface
public interface ayq {
   void update(ayq.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
