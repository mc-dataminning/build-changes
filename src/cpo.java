import java.util.List;
import javax.annotation.Nullable;

public class cpo extends crn {
   private final avt<dme> a;

   public cpo(avt<dme> $$0, crn.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public avt<dme> b() {
      return this.a;
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      $$2.add(this.c().a(n.h));
   }

   public ww c() {
      return wi.c(this.a() + ".desc");
   }
}
