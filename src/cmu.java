import java.util.List;
import javax.annotation.Nullable;

public class cmu extends coy {
   private final aup<dio> a;

   public cmu(aup<dio> $$0, coy.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public aup<dio> b() {
      return this.a;
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      $$2.add(this.d().a(n.h));
   }

   public we d() {
      return vq.c(this.a() + ".desc");
   }
}
