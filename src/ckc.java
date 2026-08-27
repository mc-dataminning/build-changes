import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckc extends cke {
   private static final String a = "instrument";
   private final arh<ckb> b;

   public ckc(cke.a $$0, arh<ckb> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<afv<ckb>> $$4 = this.d($$0).flatMap(ib::e);
      if ($$4.isPresent()) {
         uw $$5 = ui.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static ckj a(cke $$0, ib<ckb> $$1) {
      ckj $$2 = new ckj($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(ckj $$0, arh<ckb> $$1, ate $$2) {
      Optional<ib<ckb>> $$3 = jy.an.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(ckj $$0, ib<ckb> $$1) {
      rt $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      Optional<? extends ib<ckb>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         ckb $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gn().a(this, $$5.b());
         $$1.b(aqn.c.b(this));
         return bic.b($$3);
      } else {
         return bic.d($$3);
      }
   }

   @Override
   public int b(ckj $$0) {
      Optional<? extends ib<ckb>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((ckb)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ib<ckb>> d(ckj $$0) {
      rt $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         afw $$2 = afw.a($$1.l("instrument"));
         if ($$2 != null) {
            return jy.an.b(afv.a(jz.C, $$2));
         }
      }

      Iterator<ib<ckb>> $$3 = jy.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cmc c(ckj $$0) {
      return cmc.i;
   }

   private static void a(cqz $$0, ccx $$1, ckb $$2) {
      aqc $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aqe.c, $$4, 1.0F);
      $$0.a(dkl.B, $$1.dj(), dkl.a.a($$1));
   }
}
