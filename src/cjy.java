import java.util.List;
import javax.annotation.Nullable;

public class cjy extends cmc {
   private final asg<dfu> a;

   public cjy(asg<dfu> $$0, cmc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public asg<dfu> b() {
      return this.a;
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      $$2.add(this.d().a(n.h));
   }

   public vp d() {
      return vb.c(this.a() + ".desc");
   }
}
