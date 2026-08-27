import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dbu extends cuj implements cud {
   public static final MapCodec<dbu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               afv.a(jz.e).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               afv.a(jz.e).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               afv.a(jz.E).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dbu::new)
   );
   public static final int b = 7;
   public static final dhb c = dgr.av;
   protected static final float d = 1.0F;
   protected static final eiy[] e = new eiy[]{
      cua.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cua.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cua.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cua.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cua.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cua.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cua.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cua.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final afv<cua> f;
   private final afv<cua> g;
   private final afv<cke> h;

   @Override
   public MapCodec<dbu> a() {
      return a;
   }

   protected dbu(afv<cua> $$0, afv<cua> $$1, afv<cke> $$2, dga.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(cuc.cC);
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cvt.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               hx $$6 = hx.c.a.a($$3);
               ht $$7 = $$2.a($$6);
               dgb $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(cuc.cC) || $$8.a(aqs.af))) {
                  io<cua> $$9 = $$1.H_().d(jz.e);
                  Optional<cua> $$10 = $$9.d(this.f);
                  Optional<cua> $$11 = $$9.d(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(cxu.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj((cqy)DataFixUtils.orElse($$0.H_().d(jz.E).d(this.h), this));
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      int $$4 = Math.min(7, $$3.c(c) + asy.a($$0.z, 2, 5));
      dgb $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }
}
