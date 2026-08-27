import java.util.List;
import javax.annotation.Nullable;

public class cqi extends crn {
   public cqi(crn.a $$0) {
      super($$0);
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      $$2.add(this.c().a(n.h));
   }

   public ww c() {
      return wi.c(this.a() + ".desc");
   }
}
