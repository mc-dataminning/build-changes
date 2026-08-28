import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class frr implements frp {
   private final dmr a;
   private final List<gst> b = new ArrayList<>();

   private frr(dmr $$0) {
      this.a = $$0;
   }

   @Override
   public dmr a() {
      return this.a;
   }

   public static frr a(dmr $$0) {
      return new frr($$0);
   }

   public frr a(gsi $$0) {
      this.b.add(new gst(Optional.empty(), $$0));
      return this;
   }

   private void a(gsq $$0) {
      $$0.instantiate(this.a.l());
   }

   public frr a(gsq $$0, gsi $$1) {
      this.a($$0);
      this.b.add(new gst(Optional.of($$0), $$1));
      return this;
   }

   public frr a(frq $$0, gsi $$1) {
      return this.a($$0.a(), $$1);
   }

   @Override
   public gsc b() {
      return new gsc(Map.of(), Optional.of(new gss.b(List.copyOf(this.b))));
   }
}
