import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dos extends dhe implements dgy {
   public static final MapCodec<dos> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ala.a(lv.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ala.a(lv.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ala.a(lv.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dos::new)
   );
   public static final int b = 7;
   public static final dva c = duq.av;
   protected static final float d = 1.0F;
   protected static final eyx[] e = new eyx[]{
      dgv.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dgv.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dgv.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dgv.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dgv.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dgv.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dgv.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dgv.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ala<dgv> f;
   private final ala<dgv> g;
   private final ala<cvg> h;

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   protected dos(ala<dgv> $$0, ala<dgv> $$1, ala<cvg> $$2, dtz.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.E.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(dgx.cC);
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = diq.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jj $$6 = jj.c.a.a($$3);
               je $$7 = $$2.a($$6);
               dua $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dgx.cC) || $$8.a(aws.ag))) {
                  ka<dgv> $$9 = $$1.F_().d(lv.f);
                  Optional<dgv> $$10 = $$9.e(this.f);
                  Optional<dgv> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().b(dkr.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl((ddr)DataFixUtils.orElse($$0.F_().d(lv.K).e(this.h), this));
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azc.a($$0.z, 2, 5));
      dua $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }
}
