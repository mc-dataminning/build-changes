import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfz extends dma {
   public static final MapCodec<dfz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtq.a.fieldOf("wood_type").forGetter(dma::d), u()).apply($$0, dfz::new));
   public static final dtd b = dst.ba;
   public static final dsu c = dst.a;
   protected static final float d = 5.0F;
   protected static final ewl e = dfa.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ewl> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dfa.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dfa.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dfa.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dfa.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   public dfz(dtq $$0, dsc.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$2.c_($$3) instanceof dqs $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqx.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cmy $$0, evo $$1, dqs $$2, cuq $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof cud && $$1.b().equals(je.a);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), je.a, dnb.b);
   }

   @Override
   public dsd a(cyb $$0) {
      dbz $$1 = $$0.q();
      enw $$2 = $$1.b_($$0.a());
      iz $$3 = $$0.a().c();
      dsd $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awp.aA);
      je $$6 = je.a((double)$$0.i());
      boolean $$7 = !dfa.a($$4.k($$1, $$3), je.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dnz.b)) {
            je $$8 = $$4.c(dnz.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<je> $$9 = dtj.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dtj.a($$6.g()) : dtj.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == enx.c));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      ewl $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ewl b_(dsd $$0, dbf $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evx.a());
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == je.b && !this.a($$0, $$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsd $$0) {
      return dtj.b($$0.c(b));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.i, dqs::a);
   }
}
