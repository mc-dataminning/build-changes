import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddf extends dcq {
   public static final String a = "sherds";
   private ddf.a b = ddf.a.a;

   public ddf(gw $$0, dfe $$1) {
      super(dcs.O, $$0, $$1);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.b = ddf.a.b($$0);
   }

   public xa c() {
      return xa.a(this);
   }

   @Override
   public qu an_() {
      return this.o();
   }

   public hc d() {
      return this.q().c(dfu.R);
   }

   public ddf.a f() {
      return this.b;
   }

   public void a(cja $$0) {
      this.b = ddf.a.b(cgt.a($$0));
   }

   public cja g() {
      return a(this.b);
   }

   public static cja a(ddf.a $$0) {
      cja $$1 = cjd.eg.ad_();
      qu $$2 = $$0.a(new qu());
      cgt.a($$1, dcs.O, $$2);
      return $$1;
   }

   public static record a(civ b, civ c, civ d, civ e) {
      public static final ddf.a a = new ddf.a(cjd.pX, cjd.pX, cjd.pX, cjd.pX);

      public qu a(qu $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            ra $$1 = new ra();
            this.a().forEach($$1x -> $$1.add(rl.a(jd.i.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<civ> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static ddf.a b(@Nullable qu $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            ra $$1 = $$0.c("sherds", 8);
            return new ddf.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static civ a(ra $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cjd.pX;
         } else {
            rn $$2 = $$0.k($$1);
            return jd.i.a(aeu.a($$2.m_()));
         }
      }
   }
}
