import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cvl extends cvn {
   private final axl<cvk> a;

   public cvl(cvn.a $$0, axl<cvk> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      super.a($$0, $$1, $$2, $$3);
      jq.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jo<cvk>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xs $$6 = $$5.get().a().d().f();
            xh.a($$6, yb.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cvs a(cvn $$0, jo<cvk> $$1) {
      cvs $$2 = new cvs($$0);
      $$2.b(ks.U, $$1);
      return $$2;
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      Optional<? extends jo<cvk>> $$4 = this.a($$3, $$1.dU());
      if ($$4.isPresent()) {
         cvk $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gy().a($$3, azf.d($$5.b() * 20.0F));
         $$1.b(awq.c.b(this));
         return brs.c;
      } else {
         return brs.d;
      }
   }

   @Override
   public int a(cvs $$0, bun $$1) {
      Optional<jo<cvk>> $$2 = this.a($$0, $$1.dU());
      return $$2.<Integer>map($$0x -> azf.d(((cvk)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jo<cvk>> a(cvs $$0, jq.a $$1) {
      jo<cvk> $$2 = $$0.a(ks.U);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<js.c<cvk>> $$3 = $$1.d(lw.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jo<cvk>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cvu a(cvs $$0) {
      return cvu.i;
   }

   private static void a(dej $$0, cnx $$1, cvk $$2) {
      awf $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awh.c, $$4, 1.0F);
      $$0.a(dzp.B, $$1.dq(), dzp.a.a($$1));
   }
}
