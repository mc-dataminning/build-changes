import java.security.SignatureException;

@FunctionalInterface
public interface azo {
   void update(azo.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
