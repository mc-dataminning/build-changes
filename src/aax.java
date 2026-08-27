import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aax implements ve<wx> {
   private final int a;
   private final List<aax.a> b;

   public aax(int $$0, Collection<bko> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bko $$2 : $$1) {
         this.b.add(new aax.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public aax(so $$0) {
      this.a = $$0.n();
      this.b = $$0.a((so.a<aax.a>)($$0x -> {
         aez $$1 = $$0x.t();
         bkn $$2 = jb.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bkq> $$4 = $$0x.a((so.a<bkq>)($$0xx -> new bkq($$0xx.p(), "Unknown synced attribute modifier", $$0xx.readDouble(), bkq.a.a($$0xx.readByte()))));
         return new aax.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(jb.v.b($$1.a()));
         $$0x.a($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.a($$1x.c());
            $$0xx.k($$1x.b().a());
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
      private final bkn a;
      private final double b;
      private final Collection<bkq> c;

      public a(bkn $$0, double $$1, Collection<bkq> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bkn a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bkq> c() {
         return this.c;
      }
   }
}
