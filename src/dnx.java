import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnx extends dly {
   public static final MapCodec<dnx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dto.a.fieldOf("wood_type").forGetter(dly::d), u()).apply($$0, dnx::new));
   public static final dsv b = diu.aE;
   public static final ewj c = dey.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ewj d = dey.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ewj e = ewg.a(c, dey.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ewj i = ewg.a(d, dey.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<je, ewj> j = Maps.newEnumMap(ImmutableMap.of(je.c, e, je.d, e, je.f, i, je.e, i));

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dto $$0, dsa.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$2.c_($$3) instanceof dqq $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqv.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dsb $$0, cmw $$1, evm $$2, dqq $$3, cuo $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof cub && !this.a($$2, $$0);
   }

   private boolean a(evm $$0, dsb $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ewj b_(dsb $$0, dbd $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evv.a());
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      switch ((je)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dsb $$0, dca $$1, iz $$2) {
      je $$3 = $$0.c(b).h();
      je $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dca $$0, dsb $$1, iz $$2, je $$3) {
      dsb $$4 = $$0.a_($$2);
      return $$4.a(awo.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dmz.a);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = this.o();
      enu $$2 = $$0.q().b_($$0.a());
      dca $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == env.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsb $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqd($$0, $$1);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$2, dpi.i, dqq::a);
   }
}
