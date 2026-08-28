import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvu extends dxa implements dnr {
   public static final MapCodec<dvu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alq.a(mi.i).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alq.a(mi.i).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               alq.a(mi.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dvu::new)
   );
   public static final int b = 7;
   public static final ecq c = ecg.ay;
   private static final fgw[] d = dno.a(7, $$0 -> dno.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final alq<dno> e;
   private final alq<dno> f;
   private final alq<dag> g;

   @Override
   public MapCodec<dvu> a() {
      return a;
   }

   protected dvu(alq<dno> $$0, alq<dno> $$1, alq<dag> $$2, ebp.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(dnq.cN);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dpl.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jc $$6 = jc.c.a.a($$3);
               iw $$7 = $$2.a($$6);
               ebq $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dnq.cN) || $$8.a(axn.ah))) {
                  jt<dno> $$9 = $$1.J_().f(mi.i);
                  Optional<dno> $$10 = $$9.f(this.e);
                  Optional<dno> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(drp.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak((dki)DataFixUtils.orElse($$0.J_().f(mi.K).f(this.g), this));
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azz.a($$0.A, 2, 5));
      ebq $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }
}
