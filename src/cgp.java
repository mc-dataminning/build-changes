import java.util.List;
import javax.annotation.Nullable;

public class cgp extends cit {
   private final aqa<dcd> a;

   public cgp(aqa<dcd> $$0, cit.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public aqa<dcd> b() {
      return this.a;
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      $$2.add(this.d().a(n.h));
   }

   public ts d() {
      return tf.c(this.a() + ".desc");
   }
}
