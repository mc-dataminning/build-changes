import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dro extends djx implements djq {
   public static final MapCodec<dro> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aku.a(mc.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               aku.a(mc.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               aku.a(mc.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dro::new)
   );
   public static final int b = 7;
   public static final dxx c = dxo.ay;
   protected static final float d = 1.0F;
   protected static final fbv[] e = new fbv[]{
      djn.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      djn.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      djn.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      djn.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      djn.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      djn.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      djn.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      djn.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final aku<djn> f;
   private final aku<djn> g;
   private final aku<cwm> h;

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   protected dro(aku<djn> $$0, aku<djn> $$1, aku<cwm> $$2, dwx.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(djp.cK);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dlj.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jn $$6 = jn.c.a.a($$3);
               ji $$7 = $$2.a($$6);
               dwy $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(djp.cK) || $$8.a(awp.ah))) {
                  ke<djn> $$9 = $$1.K_().e(mc.f);
                  Optional<djn> $$10 = $$9.f(this.f);
                  Optional<djn> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dnl.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq((dgi)DataFixUtils.orElse($$0.K_().e(mc.K).f(this.h), this));
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayz.a($$0.A, 2, 5));
      dwy $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }
}
