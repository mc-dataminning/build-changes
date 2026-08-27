import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aay implements vf<wy> {
   private final int a;
   private final List<aay.a> b;

   public aay(int $$0, Collection<bkk> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bkk $$2 : $$1) {
         this.b.add(new aay.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public aay(sq $$0) {
      this.a = $$0.m();
      this.b = $$0.a((sq.a<aay.a>)($$0x -> {
         aey $$1 = $$0x.s();
         bkj $$2 = jd.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bkm> $$4 = $$0x.a((sq.a<bkm>)($$0xx -> new bkm($$0xx.o(), "Unknown synced attribute modifier", $$0xx.readDouble(), bkm.a.a($$0xx.readByte()))));
         return new aay.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(sq $$0) {
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

   public void a(wy $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<aay.a> d() {
      return this.b;
   }

   public static class a {
      private final bkj a;
      private final double b;
      private final Collection<bkm> c;

      public a(bkj $$0, double $$1, Collection<bkm> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bkj a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bkm> c() {
         return this.c;
      }
   }
}
