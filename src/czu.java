import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czu extends cso implements dab {
   public static final MapCodec<czu> a = b(czu::new);
   public static final dfu b = dft.F;
   public static final dfu c = dft.C;
   public static final dfu d = dft.G;
   protected static final eia e = ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ha.a.b);

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   public czu(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, biw $$3) {
      if ($$0 instanceof akt $$4) {
         aku $$5 = def.a($$3);
         if ($$5 != null) {
            $$4.a($$1, ddb.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if ($$1 instanceof akt $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, ddb.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, ddb.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return e;
   }

   @Override
   public eia f(dfd $$0, cph $$1, gw $$2) {
      return e;
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new def($$0, $$1);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eah.c));
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(c) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, cjl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bgg.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return !$$0.B ? cso.a($$2, ddb.L, ($$0x, $$1x, $$2x, $$3) -> djw.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }
}
