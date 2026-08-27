import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aax implements ve<wx> {
   private final int a;
   private final List<aax.a> b;

   public aax(int $$0, Collection<bki> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bki $$2 : $$1) {
         this.b.add(new aax.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public aax(sp $$0) {
      this.a = $$0.m();
      this.b = $$0.a((sp.a<aax.a>)($$0x -> {
         aex $$1 = $$0x.s();
         bkh $$2 = jd.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bkk> $$4 = $$0x.a((sp.a<bkk>)($$0xx -> new bkk($$0xx.o(), "Unknown synced attribute modifier", $$0xx.readDouble(), bkk.a.a($$0xx.readByte()))));
         return new aax.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(sp $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(jd.v.b($$1.a()));
         $$0x.a($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.a($$1x.d());
            $$0xx.k($$1x.c().a());
         });
      });
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<aax.a> d() {
      return this.b;
   }

   public static class a {
      private final bkh a;
      private final double b;
      private final Collection<bkk> c;

      public a(bkh $$0, double $$1, Collection<bkk> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bkh a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bkk> c() {
         return this.c;
      }
   }
}
