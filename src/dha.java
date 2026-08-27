import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dha extends czo implements czi {
   public static final MapCodec<dha> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajb.a(ki.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ajb.a(ki.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ajb.a(ki.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dha::new)
   );
   public static final int b = 7;
   public static final dne c = dmu.av;
   protected static final float d = 1.0F;
   protected static final epo[] e = new epo[]{
      czf.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      czf.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      czf.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      czf.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      czf.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      czf.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      czf.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      czf.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ajb<czf> f;
   private final ajb<czf> g;
   private final ajb<cpl> h;

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   protected dha(ajb<czf> $$0, ajb<czf> $$1, ajb<cpl> $$2, dmd.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(czh.cC);
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dba.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ih $$6 = ih.c.a.a($$3);
               ib $$7 = $$2.a($$6);
               dme $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(czh.cC) || $$8.a(aue.af))) {
                  ix<czf> $$9 = $$1.I_().d(ki.f);
                  Optional<czf> $$10 = $$9.d(this.f);
                  Optional<czf> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(dda.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq((cwd)DataFixUtils.orElse($$0.I_().d(ki.F).d(this.h), this));
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      int $$4 = Math.min(7, $$3.c(c) + awm.a($$0.z, 2, 5));
      dme $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }
}
