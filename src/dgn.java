import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dgn extends czb implements cyv {
   public static final MapCodec<dgn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aix.a(kg.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               aix.a(kg.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               aix.a(kg.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dgn::new)
   );
   public static final int b = 7;
   public static final dmj c = dlz.av;
   protected static final float d = 1.0F;
   protected static final eos[] e = new eos[]{
      cys.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cys.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cys.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cys.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cys.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cys.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cys.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cys.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final aix<cys> f;
   private final aix<cys> g;
   private final aix<coy> h;

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   protected dgn(aix<cys> $$0, aix<cys> $$1, aix<coy> $$2, dli.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(cyu.cC);
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dan.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ie $$6 = ie.c.a.a($$3);
               hz $$7 = $$2.a($$6);
               dlj $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cyu.cC) || $$8.a(aua.af))) {
                  iv<cys> $$9 = $$1.I_().d(kg.f);
                  Optional<cys> $$10 = $$9.d(this.f);
                  Optional<cys> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(dcn.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd((cvq)DataFixUtils.orElse($$0.I_().d(kg.F).d(this.h), this));
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      int $$4 = Math.min(7, $$3.c(c) + awi.a($$0.z, 2, 5));
      dlj $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }
}
