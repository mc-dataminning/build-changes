import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddo extends dcz {
   public static final String a = "sherds";
   private ddo.a b = ddo.a.a;

   public ddo(gw $$0, dfd $$1) {
      super(ddb.O, $$0, $$1);
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.b = ddo.a.b($$0);
   }

   public xe c() {
      return xe.a(this);
   }

   @Override
   public qw as_() {
      return this.o();
   }

   public ha d() {
      return this.q().c(dft.R);
   }

   public ddo.a f() {
      return this.b;
   }

   public void a(cjl $$0) {
      this.b = ddo.a.b(che.a($$0));
   }

   public cjl g() {
      return a(this.b);
   }

   public static cjl a(ddo.a $$0) {
      cjl $$1 = cjo.eg.ai_();
      qw $$2 = $$0.a(new qw());
      che.a($$1, ddb.O, $$2);
      return $$1;
   }

   public static record a(cjg b, cjg c, cjg d, cjg e) {
      public static final ddo.a a = new ddo.a(cjo.pX, cjo.pX, cjo.pX, cjo.pX);

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

      public Stream<cjg> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static ddo.a b(@Nullable qw $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            rc $$1 = $$0.c("sherds", 8);
            return new ddo.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cjg a(rc $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cjo.pX;
         } else {
            rq $$2 = $$0.k($$1);
            return jb.i.a(aez.a($$2.r_()));
         }
      }
   }
}
