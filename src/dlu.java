import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlu extends deh implements deb {
   public static final MapCodec<dlu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akl.a(lf.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akl.a(lf.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akl.a(lf.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dlu::new)
   );
   public static final int b = 7;
   public static final dsb c = drr.av;
   protected static final float d = 1.0F;
   protected static final evd[] e = new evd[]{
      ddy.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      ddy.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      ddy.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      ddy.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      ddy.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      ddy.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      ddy.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      ddy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akl<ddy> f;
   private final akl<ddy> g;
   private final akl<ctj> h;

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   protected dlu(akl<ddy> $$0, akl<ddy> $$1, akl<ctj> $$2, dra.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(dea.cC);
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dft.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               it $$6 = it.c.a.a($$3);
               io $$7 = $$2.a($$6);
               drb $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dea.cC) || $$8.a(avw.af))) {
                  jk<ddy> $$9 = $$1.H_().d(lf.f);
                  Optional<ddy> $$10 = $$9.e(this.f);
                  Optional<ddy> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().n());
                     $$1.b($$2, $$11.get().n().a(dhu.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto((daw)DataFixUtils.orElse($$0.H_().d(lf.G).e(this.h), this));
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayd.a($$0.z, 2, 5));
      drb $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }
}
