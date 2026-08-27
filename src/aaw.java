import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class aaw implements vd<ww> {
   private final int a;
   private final List<aaw.a> b;

   public aaw(int $$0, Collection<bki> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bki $$2 : $$1) {
         this.b.add(new aaw.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public aaw(so $$0) {
      this.a = $$0.m();
      this.b = $$0.a((so.a<aaw.a>)($$0x -> {
         aew $$1 = $$0x.s();
         bkh $$2 = jb.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bkk> $$4 = $$0x.a((so.a<bkk>)($$0xx -> new bkk($$0xx.o(), "Unknown synced attribute modifier", $$0xx.readDouble(), bkk.a.a($$0xx.readByte()))));
         return new aaw.a($$2, $$3, $$4);
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
            $$0xx.a($$1x.d());
            $$0xx.k($$1x.c().a());
         });
      });
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<aaw.a> d() {
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
