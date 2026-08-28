import java.util.List;
import javax.annotation.Nullable;

public record adn(int b, List<ctt.a> c) implements zd<abs> {
   public static final yu<vs, adn> a = yu.a(ys.h, adn::b, ctt.a.a.a(ys.a()), adn::e, adn::new);

   @Override
   public zf<adn> a() {
      return agl.T;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwa a(dip $$0) {
      return $$0.a(this.b);
   }

   public List<ctt.a> e() {
      return this.c;
   }
}
