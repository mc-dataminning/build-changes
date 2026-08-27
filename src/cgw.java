import java.util.List;
import javax.annotation.Nullable;

public class cgw extends cja {
   private final aqh<dcm> a;

   public cgw(aqh<dcm> $$0, cja.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public aqh<dcm> b() {
      return this.a;
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tl> $$2, ckw $$3) {
      $$2.add(this.d().a(n.h));
   }

   public ty d() {
      return tl.c(this.a() + ".desc");
   }
}
