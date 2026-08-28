import java.security.SignatureException;

@FunctionalInterface
public interface azj {
   void update(azj.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
