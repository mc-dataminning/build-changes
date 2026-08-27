import java.util.List;
import javax.annotation.Nullable;

public class chc extends cjg {
   private final aqk<dcq> a;

   public chc(aqk<dcq> $$0, cjg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public aqk<dcq> b() {
      return this.a;
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      $$2.add(this.d().a(n.h));
   }

   public tz d() {
      return tl.c(this.a() + ".desc");
   }
}
