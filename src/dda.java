import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dda extends dcl {
   public static final String a = "sherds";
   private dda.a b = dda.a.a;

   public dda(gu $$0, dez $$1) {
      super(dcn.O, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.b = dda.a.b($$0);
   }

   public wx c() {
      return wx.a(this);
   }

   @Override
   public qr an_() {
      return this.o();
   }

   public ha d() {
      return this.q().c(dfp.R);
   }

   public dda.a f() {
      return this.b;
   }

   public void a(cix $$0) {
      this.b = dda.a.b(cgq.a($$0));
   }

   public cix g() {
      return a(this.b);
   }

   public static cix a(dda.a $$0) {
      cix $$1 = cja.eg.ad_();
      qr $$2 = $$0.a(new qr());
      cgq.a($$1, dcn.O, $$2);
      return $$1;
   }

   public static record a(cis b, cis c, cis d, cis e) {
      public static final dda.a a = new dda.a(cja.pX, cja.pX, cja.pX, cja.pX);

      public qr a(qr $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            qx $$1 = new qx();
            this.a().forEach($$1x -> $$1.add(ri.a(jb.i.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cis> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dda.a b(@Nullable qr $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            qx $$1 = $$0.c("sherds", 8);
            return new dda.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cis a(qx $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cja.pX;
         } else {
            rk $$2 = $$0.k($$1);
            return jb.i.a(aer.a($$2.m_()));
         }
      }
   }
}
