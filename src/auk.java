import java.security.SignatureException;

@FunctionalInterface
public interface auk {
   void update(auk.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
