import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfx extends dly {
   public static final MapCodec<dfx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dto.a.fieldOf("wood_type").forGetter(dly::d), u()).apply($$0, dfx::new));
   public static final dtb b = dsr.ba;
   public static final dss c = dsr.a;
   protected static final float d = 5.0F;
   protected static final ewj e = dey.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ewj> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dey.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dey.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dey.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dey.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dfx> a() {
      return a;
   }

   public dfx(dto $$0, dsa.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$2.c_($$3) instanceof dqq $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqv.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cmw $$0, evm $$1, dqq $$2, cuo $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof cub && $$1.b().equals(je.a);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), je.a, dmz.b);
   }

   @Override
   public dsb a(cxz $$0) {
      dbx $$1 = $$0.q();
      enu $$2 = $$1.b_($$0.a());
      iz $$3 = $$0.a().c();
      dsb $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awo.aA);
      je $$6 = je.a((double)$$0.i());
      boolean $$7 = !dey.a($$4.k($$1, $$3), je.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dnx.b)) {
            je $$8 = $$4.c(dnx.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<je> $$9 = dth.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dth.a($$6.g()) : dth.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == env.c));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      ewj $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ewj b_(dsb $$0, dbd $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evv.a());
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == je.b && !this.a($$0, $$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsb $$0) {
      return dth.b($$0.c(b));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$2, dpi.i, dqq::a);
   }
}
