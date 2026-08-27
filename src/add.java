import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class add implements xf<za> {
   private final int a;
   private final List<add.a> b;

   public add(int $$0, Collection<bnn> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bnn $$2 : $$1) {
         this.b.add(new add.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public add(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.a((ui.a<add.a>)($$0x -> {
         ahg $$1 = $$0x.t();
         bnm $$2 = kd.u.a($$1);
         double $$3 = $$0x.readDouble();
         List<bnp> $$4 = $$0x.a((ui.a<bnp>)($$0xx -> new bnp($$0xx.p(), "Unknown synced attribute modifier", $$0xx.readDouble(), bnp.a.a($$0xx.readByte()))));
         return new add.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(kd.u.b($$1.a()));
         $$0x.a($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.a($$1x.c());
            $$0xx.k($$1x.b().a());
         });
      });
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<add.a> d() {
      return this.b;
   }

   public static class a {
      private final bnm a;
      private final double b;
      private final Collection<bnp> c;

      public a(bnm $$0, double $$1, Collection<bnp> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bnm a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bnp> c() {
         return this.c;
      }
   }
}
