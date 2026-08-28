import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dus extends dvy implements dmp {
   public static final MapCodec<dus> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alf.a(mh.i).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alf.a(mh.i).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               alf.a(mh.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dus::new)
   );
   public static final int b = 7;
   public static final ebo c = ebe.ay;
   private static final ffr[] d = dmm.a(7, $$0 -> dmm.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final alf<dmm> e;
   private final alf<dmm> f;
   private final alf<czg> g;

   @Override
   public MapCodec<dus> a() {
      return a;
   }

   protected dus(alf<dmm> $$0, alf<dmm> $$1, alf<czg> $$2, ean.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(dmo.cN);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = doj.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jb $$6 = jb.c.a.a($$3);
               iv $$7 = $$2.a($$6);
               eao $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dmo.cN) || $$8.a(axc.ah))) {
                  js<dmm> $$9 = $$1.F_().f(mh.i);
                  Optional<dmm> $$10 = $$9.f(this.e);
                  Optional<dmm> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dqn.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk((djg)DataFixUtils.orElse($$0.F_().f(mh.K).f(this.g), this));
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azm.a($$0.A, 2, 5));
      eao $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }
}
