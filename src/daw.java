import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class daw extends cwj implements ddj {
   public static final MapCodec<daw> a = b(daw::new);
   public static final int b = 15;
   public static final dka c = djq.aP;
   public static final djr d = djq.C;
   public static final ToIntFunction<dja> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   public daw(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, d);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if (!$$1.B && $$3.gp()) {
         $$1.a($$2, $$0.a(c), 2);
         return bjv.a;
      } else {
         return bjv.b;
      }
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return $$3.a(cmu.hB) ? emc.b() : emc.a();
   }

   @Override
   public boolean a_(dja $$0, cso $$1, hx $$2) {
      return true;
   }

   @Override
   public dco b_(dja $$0) {
      return dco.a;
   }

   @Override
   public float d(dja $$0, cso $$1, hx $$2) {
      return 1.0F;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(d) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cmr a(cmr $$0, int $$1) {
      if ($$1 != 15) {
         sl $$2 = new sl();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
