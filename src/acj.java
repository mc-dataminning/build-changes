import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class acj implements wo<yh> {
   private final int a;
   private final List<acj.a> b;

   public acj(int $$0, Collection<bmn> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bmn $$2 : $$1) {
         this.b.add(new acj.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public acj(ty $$0) {
      this.a = $$0.n();
      this.b = $$0.a((ty.a<acj.a>)($$0x -> {
         agm $$1 = $$0x.t();
         bmm $$2 = kc.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bmp> $$4 = $$0x.a((ty.a<bmp>)($$0xx -> new bmp($$0xx.p(), "Unknown synced attribute modifier", $$0xx.readDouble(), bmp.a.a($$0xx.readByte()))));
         return new acj.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(kc.v.b($$1.a()));
         $$0x.a($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.a($$1x.c());
            $$0xx.k($$1x.b().a());
         });
      });
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<acj.a> d() {
      return this.b;
   }

   public static class a {
      private final bmm a;
      private final double b;
      private final Collection<bmp> c;

      public a(bmm $$0, double $$1, Collection<bmp> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bmm a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bmp> c() {
         return this.c;
      }
   }
}
