import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class acf implements wk<yd> {
   private final int a;
   private final List<acf.a> b;

   public acf(int $$0, Collection<bmi> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bmi $$2 : $$1) {
         this.b.add(new acf.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public acf(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.a((tu.a<acf.a>)($$0x -> {
         agi $$1 = $$0x.t();
         bmh $$2 = jy.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bmk> $$4 = $$0x.a((tu.a<bmk>)($$0xx -> new bmk($$0xx.p(), "Unknown synced attribute modifier", $$0xx.readDouble(), bmk.a.a($$0xx.readByte()))));
         return new acf.a($$2, $$3, $$4);
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

   public List<acf.a> d() {
      return this.b;
   }

   public static class a {
      private final bmh a;
      private final double b;
      private final Collection<bmk> c;

      public a(bmh $$0, double $$1, Collection<bmk> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bmh a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bmk> c() {
         return this.c;
      }
   }
}
