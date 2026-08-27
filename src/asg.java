import java.security.SignatureException;

@FunctionalInterface
public interface asg {
   void update(asg.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
