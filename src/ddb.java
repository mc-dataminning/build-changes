import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddb extends dcm {
   public static final String a = "sherds";
   private ddb.a b = ddb.a.a;

   public ddb(gu $$0, dfa $$1) {
      super(dco.O, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.b = ddb.a.b($$0);
   }

   public wx c() {
      return wx.a(this);
   }

   @Override
   public qr ao_() {
      return this.o();
   }

   public ha d() {
      return this.q().c(dfq.R);
   }

   public ddb.a f() {
      return this.b;
   }

   public void a(ciy $$0) {
      this.b = ddb.a.b(cgr.a($$0));
   }

   public ciy g() {
      return a(this.b);
   }

   public static ciy a(ddb.a $$0) {
      ciy $$1 = cjb.eg.ae_();
      qr $$2 = $$0.a(new qr());
      cgr.a($$1, dco.O, $$2);
      return $$1;
   }

   public static record a(cit b, cit c, cit d, cit e) {
      public static final ddb.a a = new ddb.a(cjb.pX, cjb.pX, cjb.pX, cjb.pX);

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

      public Stream<cit> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static ddb.a b(@Nullable qr $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            qx $$1 = $$0.c("sherds", 8);
            return new ddb.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cit a(qx $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cjb.pX;
         } else {
            rk $$2 = $$0.k($$1);
            return jb.i.a(aer.a($$2.m_()));
         }
      }
   }
}
