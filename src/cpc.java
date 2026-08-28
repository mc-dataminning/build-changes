import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cpc {
   private final cpb<jr<cwl>> a = new cpb<>();

   public void a(cwp $$0) {
      if (cow.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cwp $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cwp $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public static cpb.a<jr<cwl>> a(Stream<jr<cwl>> $$0) {
      List<jr<cwl>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> mb.g.a((cwl)$$0x.a()))).toList();
      return new cpb.a<>($$1);
   }

   public boolean a(dbe<?> $$0, @Nullable cpb.b<jr<cwl>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dbe<?> $$0, int $$1, @Nullable cpb.b<jr<cwl>> $$2) {
      dbd $$3 = $$0.ao_();
      return $$3.d() ? false : this.a($$3.c(), $$1, $$2);
   }

   public boolean a(List<cpb.a<jr<cwl>>> $$0, @Nullable cpb.b<jr<cwl>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<cpb.a<jr<cwl>>> $$0, int $$1, @Nullable cpb.b<jr<cwl>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dbe<?> $$0, @Nullable cpb.b<jr<cwl>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dbe<?> $$0, int $$1, @Nullable cpb.b<jr<cwl>> $$2) {
      return this.a.b($$0.ao_().c(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
