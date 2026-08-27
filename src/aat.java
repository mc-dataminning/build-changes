import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aat implements va<ws> {
   private final int a;
   private final List<aat.a> b;

   public aat(int $$0, Collection<bkd> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bkd $$2 : $$1) {
         this.b.add(new aat.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public aat(sl $$0) {
      this.a = $$0.m();
      this.b = $$0.a((sl.a<aat.a>)($$0x -> {
         aeu $$1 = $$0x.s();
         bkc $$2 = jd.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bkf> $$4 = $$0x.a((sl.a<bkf>)($$0xx -> new bkf($$0xx.o(), "Unknown synced attribute modifier", $$0xx.readDouble(), bkf.a.a($$0xx.readByte()))));
         return new aat.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(sl $$0) {
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

   public void a(ws $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<aat.a> d() {
      return this.b;
   }

   public static class a {
      private final bkc a;
      private final double b;
      private final Collection<bkf> c;

      public a(bkc $$0, double $$1, Collection<bkf> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bkc a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bkf> c() {
         return this.c;
      }
   }
}
