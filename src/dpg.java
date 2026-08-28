import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpg extends dhs implements dhm {
   public static final MapCodec<dpg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alb.a(lv.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               alb.a(lv.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               alb.a(lv.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dpg::new)
   );
   public static final int b = 7;
   public static final dvo c = dve.av;
   protected static final float d = 1.0F;
   protected static final ezm[] e = new ezm[]{
      dhj.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dhj.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dhj.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dhj.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dhj.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dhj.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dhj.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dhj.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final alb<dhj> f;
   private final alb<dhj> g;
   private final alb<cvk> h;

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   protected dpg(alb<dhj> $$0, alb<dhj> $$1, alb<cvk> $$2, dun.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(dhl.cC);
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dje.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jj $$6 = jj.c.a.a($$3);
               je $$7 = $$2.a($$6);
               duo $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dhl.cC) || $$8.a(awt.ag))) {
                  ka<dhj> $$9 = $$1.F_().d(lv.f);
                  Optional<dhj> $$10 = $$9.e(this.f);
                  Optional<dhj> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().b(dlf.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp((def)DataFixUtils.orElse($$0.F_().d(lv.K).e(this.h), this));
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azd.a($$0.z, 2, 5));
      duo $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }
}
