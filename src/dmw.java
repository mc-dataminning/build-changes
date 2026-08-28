import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmw extends dfj implements dfd {
   public static final MapCodec<dmw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a(lq.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               ale.a(lq.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               ale.a(lq.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dmw::new)
   );
   public static final int b = 7;
   public static final dtd c = dst.av;
   protected static final float d = 1.0F;
   protected static final ewl[] e = new ewl[]{
      dfa.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dfa.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dfa.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dfa.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dfa.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dfa.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dfa.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dfa.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final ale<dfa> f;
   private final ale<dfa> g;
   private final ale<cul> h;

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   protected dmw(ale<dfa> $$0, ale<dfa> $$1, ale<cul> $$2, dsc.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(dfc.cC);
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dgv.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               je $$6 = je.c.a.a($$3);
               iz $$7 = $$2.a($$6);
               dsd $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(dfc.cC) || $$8.a(awp.af))) {
                  jv<dfa> $$9 = $$1.H_().d(lq.f);
                  Optional<dfa> $$10 = $$9.e(this.f);
                  Optional<dfa> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().o());
                     $$1.b($$2, $$11.get().o().a(diw.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq((dby)DataFixUtils.orElse($$0.H_().d(lq.G).e(this.h), this));
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayz.a($$0.z, 2, 5));
      dsd $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }
}
