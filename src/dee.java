import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dee extends cws implements cwm {
   public static final MapCodec<dee> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ahc.a(ke.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ahc.a(ke.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ahc.a(ke.F).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dee::new)
   );
   public static final int b = 7;
   public static final dka c = djq.av;
   protected static final float d = 1.0F;
   protected static final emf[] e = new emf[]{
      cwj.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cwj.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cwj.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cwj.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cwj.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cwj.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cwj.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cwj.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ahc<cwj> f;
   private final ahc<cwj> g;
   private final ahc<cmm> h;

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   protected dee(ahc<cwj> $$0, ahc<cwj> $$1, ahc<cmm> $$2, diz.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(cwl.cC);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cye.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ic $$6 = ic.c.a.a($$3);
               hx $$7 = $$2.a($$6);
               dja $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cwl.cC) || $$8.a(asb.af))) {
                  it<cwj> $$9 = $$1.I_().d(ke.f);
                  Optional<cwj> $$10 = $$9.d(this.f);
                  Optional<cwj> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(dae.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr((cth)DataFixUtils.orElse($$0.I_().d(ke.F).d(this.h), this));
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      int $$4 = Math.min(7, $$3.c(c) + aui.a($$0.z, 2, 5));
      dja $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }
}
