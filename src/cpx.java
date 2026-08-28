import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cpx {
   private final cpw<jq<cxg>> a = new cpw<>();

   public void a(cxk $$0) {
      if (cpr.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cxk $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cxk $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.L());
         this.a.a($$0.i(), $$2);
      }
   }

   public static cpw.a<jq<cxg>> a(Stream<jq<cxg>> $$0) {
      List<jq<cxg>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> ma.g.a((cxg)$$0x.a()))).toList();
      return new cpw.a<>($$1);
   }

   public boolean a(dbz<?> $$0, @Nullable cpw.b<jq<cxg>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dbz<?> $$0, int $$1, @Nullable cpw.b<jq<cxg>> $$2) {
      return this.a($$0.ap_().c(), $$1, $$2);
   }

   public boolean a(List<cpw.a<jq<cxg>>> $$0, @Nullable cpw.b<jq<cxg>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<cpw.a<jq<cxg>>> $$0, int $$1, @Nullable cpw.b<jq<cxg>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dbz<?> $$0, @Nullable cpw.b<jq<cxg>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dbz<?> $$0, int $$1, @Nullable cpw.b<jq<cxg>> $$2) {
      return this.a.b($$0.ap_().c(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
