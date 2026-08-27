import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dcz extends dck {
   public static final String a = "sherds";
   private dcz.a b = dcz.a.a;

   public dcz(gv $$0, dey $$1) {
      super(dcm.O, $$0, $$1);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.b = dcz.a.b($$0);
   }

   public ww c() {
      return ww.a(this);
   }

   @Override
   public qs ao_() {
      return this.o();
   }

   public hb d() {
      return this.q().c(dfo.R);
   }

   public dcz.a f() {
      return this.b;
   }

   public void a(ciw $$0) {
      this.b = dcz.a.b(cgp.a($$0));
   }

   public ciw g() {
      return a(this.b);
   }

   public static ciw a(dcz.a $$0) {
      ciw $$1 = ciz.eg.ae_();
      qs $$2 = $$0.a(new qs());
      cgp.a($$1, dcm.O, $$2);
      return $$1;
   }

   public static record a(cir b, cir c, cir d, cir e) {
      public static final dcz.a a = new dcz.a(ciz.pX, ciz.pX, ciz.pX, ciz.pX);

      public qs a(qs $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            qy $$1 = new qy();
            this.a().forEach($$1x -> $$1.add(rj.a(jc.i.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cir> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dcz.a b(@Nullable qs $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            qy $$1 = $$0.c("sherds", 8);
            return new dcz.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cir a(qy $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return ciz.pX;
         } else {
            rl $$2 = $$0.k($$1);
            return jc.i.a(aep.a($$2.m_()));
         }
      }
   }
}
