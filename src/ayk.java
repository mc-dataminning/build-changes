import java.security.SignatureException;

@FunctionalInterface
public interface ayk {
   void update(ayk.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
