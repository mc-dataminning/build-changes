import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class drl extends dju implements djn {
   public static final MapCodec<drl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akt.a(mc.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akt.a(mc.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akt.a(mc.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, drl::new)
   );
   public static final int b = 7;
   public static final dxu c = dxl.ay;
   protected static final float d = 1.0F;
   protected static final fbs[] e = new fbs[]{
      djk.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      djk.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      djk.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      djk.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      djk.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      djk.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      djk.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      djk.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akt<djk> f;
   private final akt<djk> g;
   private final akt<cwj> h;

   @Override
   public MapCodec<drl> a() {
      return a;
   }

   protected drl(akt<djk> $$0, akt<djk> $$1, akt<cwj> $$2, dwu.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(djm.cK);
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dlg.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jn $$6 = jn.c.a.a($$3);
               ji $$7 = $$2.a($$6);
               dwv $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(djm.cK) || $$8.a(awo.ah))) {
                  ke<djk> $$9 = $$1.K_().e(mc.f);
                  Optional<djk> $$10 = $$9.f(this.f);
                  Optional<djk> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dni.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn((dgf)DataFixUtils.orElse($$0.K_().e(mc.K).f(this.h), this));
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayy.a($$0.A, 2, 5));
      dwv $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }
}
