import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class drn extends djw implements djp {
   public static final MapCodec<drn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akt.a(mc.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akt.a(mc.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akt.a(mc.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, drn::new)
   );
   public static final int b = 7;
   public static final dxw c = dxn.ay;
   protected static final float d = 1.0F;
   protected static final fbu[] e = new fbu[]{
      djm.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      djm.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      djm.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      djm.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      djm.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      djm.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      djm.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      djm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akt<djm> f;
   private final akt<djm> g;
   private final akt<cwl> h;

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   protected drn(akt<djm> $$0, akt<djm> $$1, akt<cwl> $$2, dww.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(djo.cK);
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dli.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jn $$6 = jn.c.a.a($$3);
               ji $$7 = $$2.a($$6);
               dwx $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(djo.cK) || $$8.a(awp.ah))) {
                  ke<djm> $$9 = $$1.K_().e(mc.f);
                  Optional<djm> $$10 = $$9.f(this.f);
                  Optional<djm> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dnk.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp((dgh)DataFixUtils.orElse($$0.K_().e(mc.K).f(this.h), this));
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      int $$4 = Math.min(7, $$3.c(c) + ayz.a($$0.A, 2, 5));
      dwx $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }
}
