import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dgj extends cyx implements cyr {
   public static final MapCodec<dgj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aix.a(kg.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               aix.a(kg.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               aix.a(kg.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dgj::new)
   );
   public static final int b = 7;
   public static final dmf c = dlv.av;
   protected static final float d = 1.0F;
   protected static final eol[] e = new eol[]{
      cyo.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cyo.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cyo.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cyo.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cyo.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cyo.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cyo.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cyo.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final aix<cyo> f;
   private final aix<cyo> g;
   private final aix<cou> h;

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   protected dgj(aix<cyo> $$0, aix<cyo> $$1, aix<cou> $$2, dle.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.a(cyq.cC);
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = daj.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ie $$6 = ie.c.a.a($$3);
               hz $$7 = $$2.a($$6);
               dlf $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cyq.cC) || $$8.a(atz.af))) {
                  iv<cyo> $$9 = $$1.I_().d(kg.f);
                  Optional<cyo> $$10 = $$9.d(this.f);
                  Optional<cyo> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(dcj.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz((cvm)DataFixUtils.orElse($$0.I_().d(kg.F).d(this.h), this));
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      int $$4 = Math.min(7, $$3.c(c) + awh.a($$0.z, 2, 5));
      dlf $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }
}
