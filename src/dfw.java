import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfw extends dlx {
   public static final MapCodec<dfw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtn.a.fieldOf("wood_type").forGetter(dlx::d), u()).apply($$0, dfw::new));
   public static final dta b = dsq.ba;
   public static final dsr c = dsq.a;
   protected static final float d = 5.0F;
   protected static final ewi e = dex.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ewi> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dex.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dex.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dex.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dex.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dfw> a() {
      return a;
   }

   public dfw(dtn $$0, drz.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$2.c_($$3) instanceof dqp $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqu.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cmv $$0, evl $$1, dqp $$2, cun $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof cua && $$1.b().equals(je.a);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), je.a, dmy.b);
   }

   @Override
   public dsa a(cxy $$0) {
      dbw $$1 = $$0.q();
      ent $$2 = $$1.b_($$0.a());
      iz $$3 = $$0.a().c();
      dsa $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awo.aA);
      je $$6 = je.a((double)$$0.i());
      boolean $$7 = !dex.a($$4.k($$1, $$3), je.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dnw.b)) {
            je $$8 = $$4.c(dnw.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<je> $$9 = dtg.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dtg.a($$6.g()) : dtg.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == enu.c));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      ewi $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ewi b_(dsa $$0, dbc $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evu.a());
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.b && !this.a($$0, $$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsa $$0) {
      return dtg.b($$0.c(b));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$2, dph.i, dqp::a);
   }
}
