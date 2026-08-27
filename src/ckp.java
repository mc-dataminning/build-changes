import java.util.List;
import javax.annotation.Nullable;

public class ckp extends cmt {
   private final asw<dgm> a;

   public ckp(asw<dgm> $$0, cmt.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public asw<dgm> b() {
      return this.a;
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      $$2.add(this.d().a(n.h));
   }

   public vt d() {
      return vf.c(this.a() + ".desc");
   }
}
