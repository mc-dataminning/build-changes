import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddk extends dcv {
   public static final String a = "sherds";
   private ddk.a b = ddk.a.a;

   public ddk(gw $$0, dfj $$1) {
      super(dcx.O, $$0, $$1);
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.b = ddk.a.b($$0);
   }

   public xd c() {
      return xd.a(this);
   }

   @Override
   public qw as_() {
      return this.o();
   }

   public ha d() {
      return this.q().c(dfz.R);
   }

   public ddk.a f() {
      return this.b;
   }

   public void a(cjf $$0) {
      this.b = ddk.a.b(cgy.a($$0));
   }

   public cjf g() {
      return a(this.b);
   }

   public static cjf a(ddk.a $$0) {
      cjf $$1 = cji.eg.ai_();
      qw $$2 = $$0.a(new qw());
      cgy.a($$1, dcx.O, $$2);
      return $$1;
   }

   public static record a(cja b, cja c, cja d, cja e) {
      public static final ddk.a a = new ddk.a(cji.pX, cji.pX, cji.pX, cji.pX);

      public qw a(qw $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            rc $$1 = new rc();
            this.a().forEach($$1x -> $$1.add(ro.a(jb.i.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cja> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static ddk.a b(@Nullable qw $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            rc $$1 = $$0.c("sherds", 8);
            return new ddk.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cja a(rc $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cji.pX;
         } else {
            rq $$2 = $$0.k($$1);
            return jb.i.a(aew.a($$2.r_()));
         }
      }
   }
}
