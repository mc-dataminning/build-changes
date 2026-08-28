import java.security.SignatureException;

@FunctionalInterface
public interface ban {
   void update(ban.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
