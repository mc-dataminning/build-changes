import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgh extends dmi {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dty.a.fieldOf("wood_type").forGetter(dmi::d), u()).apply($$0, dgh::new));
   public static final dtl b = dtb.ba;
   public static final dtc c = dtb.a;
   protected static final float d = 5.0F;
   protected static final exa e = dfi.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, exa> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dfi.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dfi.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dfi.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dfi.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(dty $$0, dsk.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$2.c_($$3) instanceof drb $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqj.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cml $$0, ewd $$1, drb $$2, cud $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof ctq && $$1.b().equals(jf.a);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), jf.a, dnj.b);
   }

   @Override
   public dsl a(cxn $$0) {
      dcg $$1 = $$0.q();
      eoj $$2 = $$1.b_($$0.a());
      ja $$3 = $$0.a().c();
      dsl $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(avw.aA);
      jf $$6 = jf.a((double)$$0.i());
      boolean $$7 = !dfi.a($$4.k($$1, $$3), jf.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(doh.b)) {
            jf $$8 = $$4.c(doh.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jf> $$9 = dtr.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dtr.a($$6.g()) : dtr.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eok.c));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      exa $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected exa b_(dsl $$0, dbm $$1, ja $$2) {
      return this.a($$0, $$1, $$2, ewm.a());
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == jf.b && !this.a($$0, $$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsl $$0) {
      return dtr.b($$0.c(b));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.i, drb::a);
   }
}
