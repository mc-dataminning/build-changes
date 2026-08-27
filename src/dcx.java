import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcx extends dix {
   public static final MapCodec<dcx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqm.a.fieldOf("wood_type").forGetter(dix::d), u()).apply($$0, dcx::new));
   public static final dpz b = dpp.ba;
   public static final dpq c = dpp.a;
   protected static final float d = 5.0F;
   protected static final est e = dby.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, est> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dby.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dby.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dby.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dby.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   public dcx(dqm $$0, doy.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$2.c_($$3) instanceof dnp $$7 && this.a($$4, $$6, $$7, $$0)) {
         return boc.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cjt $$0, erw $$1, dnp $$2, crj $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.f() instanceof cqw && $$1.b().equals(ih.a);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ih.a, djy.b);
   }

   @Override
   public doz a(cuo $$0) {
      cyx $$1 = $$0.q();
      eks $$2 = $$1.b_($$0.a());
      ib $$3 = $$0.a().c();
      doz $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(avc.aA);
      ih $$6 = ih.a((double)$$0.i());
      boolean $$7 = !dby.a($$4.k($$1, $$3), ih.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dkw.b)) {
            ih $$8 = $$4.c(dkw.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ih> $$9 = dqf.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dqf.a($$6.g()) : dqf.a($$0.i() + 180.0F);
      return this.n().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == ekt.c));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      est $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected est b_(doz $$0, cyd $$1, ib $$2) {
      return this.a($$0, $$1, $$2, esf.a());
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.b && !this.a($$0, $$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(doz $$0) {
      return dqf.b($$0.c(b));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.i, dnp::a);
   }
}
