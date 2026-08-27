import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dac extends czn {
   public static final String a = "sherds";
   private dac.a b = dac.a.a;

   public dac(gu $$0, dcb $$1) {
      super(czp.O, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.b = dac.a.b($$0);
   }

   public uz c() {
      return uz.a(this);
   }

   @Override
   public qr ao_() {
      return this.o();
   }

   public ha d() {
      return this.q().c(dcr.R);
   }

   public dac.a f() {
      return this.b;
   }

   public void a(cfz $$0) {
      this.b = dac.a.b(cds.a($$0));
   }

   public static record a(cfu b, cfu c, cfu d, cfu e) {
      public static final dac.a a = new dac.a(cgc.pX, cgc.pX, cgc.pX, cgc.pX);

      public qr a(qr $$0) {
         qx $$1 = new qx();
         this.a().forEach($$1x -> $$1.add(ri.a(jb.i.b($$1x).toString())));
         $$0.a("sherds", $$1);
         return $$0;
      }

      public Stream<cfu> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dac.a b(@Nullable qr $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            qx $$1 = $$0.c("sherds", 8);
            return new dac.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cfu a(qx $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cgc.pX;
         } else {
            rk $$2 = $$0.k($$1);
            return jb.i.a(new acq($$2.m_()));
         }
      }
   }
}
