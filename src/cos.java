import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cos {
   private final cor<jq<cvx>> a = new cor<>();

   public void a(cwb $$0) {
      if (col.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cwb $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cwb $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.L());
         this.a.a($$0.i(), $$2);
      }
   }

   public static cor.a<jq<cvx>> a(Stream<jq<cvx>> $$0) {
      List<jq<cvx>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> ly.g.a((cvx)$$0x.a()))).toList();
      return new cor.a<>($$1);
   }

   public boolean a(dap<?> $$0, @Nullable cor.b<jq<cvx>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dap<?> $$0, int $$1, @Nullable cor.b<jq<cvx>> $$2) {
      return this.a.a($$0.a().b(), $$1, $$2);
   }

   public int b(dap<?> $$0, @Nullable cor.b<jq<cvx>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dap<?> $$0, int $$1, @Nullable cor.b<jq<cvx>> $$2) {
      return this.a.b($$0.a().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
