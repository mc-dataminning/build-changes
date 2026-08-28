import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpj extends dhv implements dhp {
   public static final MapCodec<dpj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ald.a(lw.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ald.a(lw.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ald.a(lw.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dpj::new)
   );
   public static final int b = 7;
   public static final dvs c = dvi.av;
   protected static final float d = 1.0F;
   protected static final ezq[] e = new ezq[]{
      dhm.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dhm.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dhm.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dhm.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dhm.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dhm.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dhm.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dhm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ald<dhm> f;
   private final ald<dhm> g;
   private final ald<cvn> h;

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   protected dpj(ald<dhm> $$0, ald<dhm> $$1, ald<cvn> $$2, dur.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(dho.cC);
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = djh.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jk $$6 = jk.c.a.a($$3);
               jf $$7 = $$2.a($$6);
               dus $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dho.cC) || $$8.a(awv.ag))) {
                  kb<dhm> $$9 = $$1.G_().e(lw.f);
                  Optional<dhm> $$10 = $$9.f(this.f);
                  Optional<dhm> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().n());
                     $$1.b($$2, $$11.get().n().b(dli.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs((dei)DataFixUtils.orElse($$0.G_().e(lw.K).f(this.h), this));
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azf.a($$0.z, 2, 5));
      dus $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }
}
