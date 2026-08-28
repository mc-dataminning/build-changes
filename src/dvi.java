import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvi extends dwo implements dnf {
   public static final MapCodec<dvi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alh.a(mh.i).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alh.a(mh.i).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               alh.a(mh.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dvi::new)
   );
   public static final int b = 7;
   public static final ece c = ebu.ay;
   private static final fgk[] d = dnc.a(7, $$0 -> dnc.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final alh<dnc> e;
   private final alh<dnc> f;
   private final alh<czu> g;

   @Override
   public MapCodec<dvi> a() {
      return a;
   }

   protected dvi(alh<dnc> $$0, alh<dnc> $$1, alh<czu> $$2, ebd.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(dne.cN);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = doz.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jb $$6 = jb.c.a.a($$3);
               iv $$7 = $$2.a($$6);
               ebe $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dne.cN) || $$8.a(axe.ah))) {
                  js<dnc> $$9 = $$1.J_().f(mh.i);
                  Optional<dnc> $$10 = $$9.f(this.e);
                  Optional<dnc> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(drd.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy((djw)DataFixUtils.orElse($$0.J_().f(mh.K).f(this.g), this));
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azo.a($$0.A, 2, 5));
      ebe $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }
}
