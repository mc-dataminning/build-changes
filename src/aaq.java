import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aaq implements ux<wp> {
   private final int a;
   private final List<aaq.a> b;

   public aaq(int $$0, Collection<bka> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bka $$2 : $$1) {
         this.b.add(new aaq.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public aaq(si $$0) {
      this.a = $$0.m();
      this.b = $$0.a((si.a<aaq.a>)($$0x -> {
         aer $$1 = $$0x.s();
         bjz $$2 = jb.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bkc> $$4 = $$0x.a((si.a<bkc>)($$0xx -> new bkc($$0xx.o(), "Unknown synced attribute modifier", $$0xx.readDouble(), bkc.a.a($$0xx.readByte()))));
         return new aaq.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(jb.v.b($$1.a()));
         $$0x.a($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.a($$1x.d());
            $$0xx.k($$1x.c().a());
         });
      });
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<aaq.a> d() {
      return this.b;
   }

   public static class a {
      private final bjz a;
      private final double b;
      private final Collection<bkc> c;

      public a(bjz $$0, double $$1, Collection<bkc> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bjz a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bkc> c() {
         return this.c;
      }
   }
}
