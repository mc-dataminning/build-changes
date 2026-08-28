import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cqc {
   private final cqb<jq<cxl>> a = new cqb<>();

   public void a(cxp $$0) {
      if (cpw.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cxp $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cxp $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.L());
         this.a.a($$0.i(), $$2);
      }
   }

   public static cqb.a<jq<cxl>> a(Stream<jq<cxl>> $$0) {
      List<jq<cxl>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> ma.g.a((cxl)$$0x.a()))).toList();
      return new cqb.a<>($$1);
   }

   public boolean a(dce<?> $$0, @Nullable cqb.b<jq<cxl>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dce<?> $$0, int $$1, @Nullable cqb.b<jq<cxl>> $$2) {
      dcd $$3 = $$0.ap_();
      return $$3.d() ? false : this.a($$3.c(), $$1, $$2);
   }

   public boolean a(List<cqb.a<jq<cxl>>> $$0, @Nullable cqb.b<jq<cxl>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<cqb.a<jq<cxl>>> $$0, int $$1, @Nullable cqb.b<jq<cxl>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dce<?> $$0, @Nullable cqb.b<jq<cxl>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dce<?> $$0, int $$1, @Nullable cqb.b<jq<cxl>> $$2) {
      return this.a.b($$0.ap_().c(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
