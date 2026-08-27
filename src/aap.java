import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aap implements uw<wo> {
   private final int a;
   private final List<aap.a> b;

   public aap(int $$0, Collection<bjz> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bjz $$2 : $$1) {
         this.b.add(new aap.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public aap(sh $$0) {
      this.a = $$0.m();
      this.b = $$0.a((sh.a<aap.a>)($$0x -> {
         aep $$1 = $$0x.s();
         bjy $$2 = jc.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bkb> $$4 = $$0x.a((sh.a<bkb>)($$0xx -> new bkb($$0xx.o(), "Unknown synced attribute modifier", $$0xx.readDouble(), bkb.a.a($$0xx.readByte()))));
         return new aap.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(jc.v.b($$1.a()));
         $$0x.a($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.a($$1x.d());
            $$0xx.k($$1x.c().a());
         });
      });
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<aap.a> d() {
      return this.b;
   }

   public static class a {
      private final bjy a;
      private final double b;
      private final Collection<bkb> c;

      public a(bjy $$0, double $$1, Collection<bkb> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bjy a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bkb> c() {
         return this.c;
      }
   }
}
