import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ctw extends cty {
   private final awm<ctv> a;

   public ctw(cty.a $$0, awm<ctv> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<akj<ctv>> $$4 = this.i($$0).flatMap(jj::e);
      if ($$4.isPresent()) {
         xi $$5 = wu.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cud a(cty $$0, jj<ctv> $$1) {
      cud $$2 = new cud($$0);
      $$2.b(kn.P, $$1);
      return $$2;
   }

   public static void a(cud $$0, awm<ctv> $$1, ayo $$2) {
      Optional<jj<ctv>> $$3 = lq.ak.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(kn.P, $$1x));
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      Optional<? extends jj<ctv>> $$4 = this.i($$3);
      if ($$4.isPresent()) {
         ctv $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gv().a(this, $$5.b());
         $$1.b(avr.c.b(this));
         return bqi.b($$3);
      } else {
         return bqi.d($$3);
      }
   }

   @Override
   public int a(cud $$0, btc $$1) {
      Optional<jj<ctv>> $$2 = this.i($$0);
      return $$2.<Integer>map($$0x -> ((ctv)$$0x.a()).b()).orElse(0);
   }

   private Optional<jj<ctv>> i(cud $$0) {
      jj<ctv> $$1 = $$0.a(kn.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<jj<ctv>> $$2 = lq.ak.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cvy b(cud $$0) {
      return cvy.i;
   }

   private static void a(dcg $$0, cml $$1, ctv $$2) {
      avg $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avi.c, $$4, 1.0F);
      $$0.a(dxh.B, $$1.dp(), dxh.a.a($$1));
   }
}
