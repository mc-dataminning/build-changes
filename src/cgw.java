import java.util.List;
import javax.annotation.Nullable;

public class cgw extends cja {
   private final aqi<dcm> a;

   public cgw(aqi<dcm> $$0, cja.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public aqi<dcm> b() {
      return this.a;
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tm> $$2, ckw $$3) {
      $$2.add(this.d().a(n.h));
   }

   public tz d() {
      return tm.c(this.a() + ".desc");
   }
}
