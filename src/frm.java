import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class frm implements frk {
   private final dmm a;
   private final List<gso> b = new ArrayList<>();

   private frm(dmm $$0) {
      this.a = $$0;
   }

   @Override
   public dmm a() {
      return this.a;
   }

   public static frm a(dmm $$0) {
      return new frm($$0);
   }

   public frm a(gsd $$0) {
      this.b.add(new gso(Optional.empty(), $$0));
      return this;
   }

   private void a(gsl $$0) {
      $$0.instantiate(this.a.l());
   }

   public frm a(gsl $$0, gsd $$1) {
      this.a($$0);
      this.b.add(new gso(Optional.of($$0), $$1));
      return this;
   }

   public frm a(frl $$0, gsd $$1) {
      return this.a($$0.a(), $$1);
   }

   @Override
   public grx b() {
      return new grx(Map.of(), Optional.of(new gsn.b(List.copyOf(this.b))));
   }
}
