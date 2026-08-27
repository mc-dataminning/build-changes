import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddm extends dcx {
   public static final String a = "sherds";
   private ddm.a b = ddm.a.a;

   public ddm(gw $$0, dfl $$1) {
      super(dcz.O, $$0, $$1);
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.b = ddm.a.b($$0);
   }

   public xf c() {
      return xf.a(this);
   }

   @Override
   public qy as_() {
      return this.o();
   }

   public hc d() {
      return this.q().c(dgb.R);
   }

   public ddm.a f() {
      return this.b;
   }

   public void a(cjh $$0) {
      this.b = ddm.a.b(cha.a($$0));
   }

   public cjh g() {
      return a(this.b);
   }

   public static cjh a(ddm.a $$0) {
      cjh $$1 = cjk.eg.ai_();
      qy $$2 = $$0.a(new qy());
      cha.a($$1, dcz.O, $$2);
      return $$1;
   }

   public static record a(cjc b, cjc c, cjc d, cjc e) {
      public static final ddm.a a = new ddm.a(cjk.pX, cjk.pX, cjk.pX, cjk.pX);

      public qy a(qy $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            re $$1 = new re();
            this.a().forEach($$1x -> $$1.add(rq.a(jd.i.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cjc> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static ddm.a b(@Nullable qy $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            re $$1 = $$0.c("sherds", 8);
            return new ddm.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cjc a(re $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cjk.pX;
         } else {
            rs $$2 = $$0.k($$1);
            return jd.i.a(aey.a($$2.r_()));
         }
      }
   }
}
