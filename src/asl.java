import java.security.SignatureException;

@FunctionalInterface
public interface asl {
   void update(asl.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
