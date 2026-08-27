import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class acd implements wk<yd> {
   private final int a;
   private final List<acd.a> b;

   public acd(int $$0, Collection<bma> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bma $$2 : $$1) {
         this.b.add(new acd.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public acd(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.a((tu.a<acd.a>)($$0x -> {
         agg $$1 = $$0x.t();
         blz $$2 = jy.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bmc> $$4 = $$0x.a((tu.a<bmc>)($$0xx -> new bmc($$0xx.p(), "Unknown synced attribute modifier", $$0xx.readDouble(), bmc.a.a($$0xx.readByte()))));
         return new acd.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(jy.v.b($$1.a()));
         $$0x.a($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.a($$1x.c());
            $$0xx.k($$1x.b().a());
         });
      });
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<acd.a> d() {
      return this.b;
   }

   public static class a {
      private final blz a;
      private final double b;
      private final Collection<bmc> c;

      public a(blz $$0, double $$1, Collection<bmc> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public blz a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bmc> c() {
         return this.c;
      }
   }
}
