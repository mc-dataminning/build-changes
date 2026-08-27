import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class ada implements xd<yx> {
   private final int a;
   private final List<ada.a> b;

   public ada(int $$0, Collection<bnh> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bnh $$2 : $$1) {
         this.b.add(new ada.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public ada(ug $$0) {
      this.a = $$0.n();
      this.b = $$0.a((ug.a<ada.a>)($$0x -> {
         ahd $$1 = $$0x.t();
         bng $$2 = kd.u.a($$1);
         double $$3 = $$0x.readDouble();
         List<bnj> $$4 = $$0x.a((ug.a<bnj>)($$0xx -> new bnj($$0xx.p(), "Unknown synced attribute modifier", $$0xx.readDouble(), bnj.a.a($$0xx.readByte()))));
         return new ada.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(ug $$0) {
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

   public void a(yx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<ada.a> d() {
      return this.b;
   }

   public static class a {
      private final bng a;
      private final double b;
      private final Collection<bnj> c;

      public a(bng $$0, double $$1, Collection<bnj> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bng a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bnj> c() {
         return this.c;
      }
   }
}
