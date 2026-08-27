import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class acq implements wu<yo> {
   private final int a;
   private final List<acq.a> b;

   public acq(int $$0, Collection<bmx> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bmx $$2 : $$1) {
         this.b.add(new acq.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public acq(ue $$0) {
      this.a = $$0.n();
      this.b = $$0.a((ue.a<acq.a>)($$0x -> {
         agt $$1 = $$0x.t();
         bmw $$2 = kb.u.a($$1);
         double $$3 = $$0x.readDouble();
         List<bmz> $$4 = $$0x.a((ue.a<bmz>)($$0xx -> new bmz($$0xx.p(), "Unknown synced attribute modifier", $$0xx.readDouble(), bmz.a.a($$0xx.readByte()))));
         return new acq.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(kb.u.b($$1.a()));
         $$0x.a($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.a($$1x.c());
            $$0xx.k($$1x.b().a());
         });
      });
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<acq.a> d() {
      return this.b;
   }

   public static class a {
      private final bmw a;
      private final double b;
      private final Collection<bmz> c;

      public a(bmw $$0, double $$1, Collection<bmz> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bmw a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bmz> c() {
         return this.c;
      }
   }
}
