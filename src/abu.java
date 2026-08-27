import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class abu implements wb<xu> {
   private final int a;
   private final List<abu.a> b;

   public abu(int $$0, Collection<bll> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bll $$2 : $$1) {
         this.b.add(new abu.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public abu(tl $$0) {
      this.a = $$0.n();
      this.b = $$0.a((tl.a<abu.a>)($$0x -> {
         afw $$1 = $$0x.t();
         blk $$2 = jy.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bln> $$4 = $$0x.a((tl.a<bln>)($$0xx -> new bln($$0xx.p(), "Unknown synced attribute modifier", $$0xx.readDouble(), bln.a.a($$0xx.readByte()))));
         return new abu.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(tl $$0) {
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

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<abu.a> d() {
      return this.b;
   }

   public static class a {
      private final blk a;
      private final double b;
      private final Collection<bln> c;

      public a(blk $$0, double $$1, Collection<bln> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public blk a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bln> c() {
         return this.c;
      }
   }
}
