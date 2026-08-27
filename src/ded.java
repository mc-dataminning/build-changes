import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ded extends dke {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dru.a.fieldOf("wood_type").forGetter(dke::d), u()).apply($$0, ded::new));
   public static final drh b = dqx.ba;
   public static final dqy c = dqx.a;
   protected static final float d = 5.0F;
   protected static final eui e = dde.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eui> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dde.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dde.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dde.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dde.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ded(dru $$0, dqg.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$2.c_($$3) instanceof dow $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bpo.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(clh $$0, etl $$1, dow $$2, csz $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.f() instanceof csm && $$1.b().equals(is.a);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), is.a, dlf.b);
   }

   @Override
   public dqh a(cwi $$0) {
      dad $$1 = $$0.q();
      ema $$2 = $$1.b_($$0.a());
      in $$3 = $$0.a().c();
      dqh $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(avr.aA);
      is $$6 = is.a((double)$$0.i());
      boolean $$7 = !dde.a($$4.k($$1, $$3), is.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dmd.b)) {
            is $$8 = $$4.c(dmd.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<is> $$9 = drn.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? drn.a($$6.g()) : drn.a($$0.i() + 180.0F);
      return this.n().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == emb.c));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      eui $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected eui b_(dqh $$0, czj $$1, in $$2) {
      return this.a($$0, $$1, $$2, etu.a());
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.b && !this.a($$0, $$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dqh $$0) {
      return drn.b($$0.c(b));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new doj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.i, dow::a);
   }
}
