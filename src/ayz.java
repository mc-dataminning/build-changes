import java.security.SignatureException;

@FunctionalInterface
public interface ayz {
   void update(ayz.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
