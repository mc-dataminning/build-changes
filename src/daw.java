import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class daw extends ctl implements ctf {
   public static final MapCodec<daw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aey.a(jc.e).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               aey.a(jc.e).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               aey.a(jc.E).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, daw::new)
   );
   public static final int b = 7;
   public static final dgd c = dft.av;
   protected static final float d = 1.0F;
   protected static final eia[] e = new eia[]{
      ctc.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      ctc.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      ctc.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      ctc.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      ctc.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      ctc.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      ctc.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      ctc.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final aey<ctc> f;
   private final aey<ctc> g;
   private final aey<cjg> h;

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   protected daw(aey<ctc> $$0, aey<ctc> $$1, aey<cjg> $$2, dfc.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(cte.cC);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cuv.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ha $$6 = ha.c.a.a($$3);
               gw $$7 = $$2.a($$6);
               dfd $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cte.cC) || $$8.a(apv.af))) {
                  hq<ctc> $$9 = $$1.G_().d(jc.e);
                  Optional<ctc> $$10 = $$9.d(this.f);
                  Optional<ctc> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(cww.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl((cqa)DataFixUtils.orElse($$0.G_().d(jc.E).d(this.h), this));
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      int $$4 = Math.min(7, $$3.c(c) + asb.a($$0.z, 2, 5));
      dfd $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }
}
