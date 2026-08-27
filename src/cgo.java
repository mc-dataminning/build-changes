import java.util.List;
import javax.annotation.Nullable;

public class cgo extends cis {
   private final aqa<dcc> a;

   public cgo(aqa<dcc> $$0, cis.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public aqa<dcc> b() {
      return this.a;
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      $$2.add(this.d().a(n.h));
   }

   public ts d() {
      return tf.c(this.a() + ".desc");
   }
}
