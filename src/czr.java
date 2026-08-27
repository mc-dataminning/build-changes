import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class czr extends dfr {
   public static final MapCodec<czr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmw.a.fieldOf("wood_type").forGetter(dfr::d), u()).apply($$0, czr::new));
   public static final dmj b = dlz.ba;
   public static final dma c = dlz.a;
   protected static final float d = 5.0F;
   protected static final eos e = cys.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eos> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cys.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cys.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cys.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cys.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<czr> a() {
      return a;
   }

   public czr(dmw $$0, dli.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$2.c_($$3) instanceof dkg $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bly.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(chl $$0, env $$1, dkg $$2, cpd $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof coq && $$1.b().equals(ie.a);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ie.a, dgs.b);
   }

   @Override
   public dlj a(crk $$0) {
      cvr $$1 = $$0.q();
      egw $$2 = $$1.b_($$0.a());
      hz $$3 = $$0.a().c();
      dlj $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(aua.az);
      ie $$6 = ie.a((double)$$0.i());
      boolean $$7 = !cys.a($$4.k($$1, $$3), ie.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dhp.b)) {
            ie $$8 = $$4.c(dhp.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ie> $$9 = dmp.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dmp.a($$6.g()) : dmp.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == egx.c));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      eos $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected eos b_(dlj $$0, cux $$1, hz $$2) {
      return this.a($$0, $$1, $$2, eoe.a());
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.b && !this.a($$0, $$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dlj $$0) {
      return dmp.b($$0.c(b));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dju($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.i, dkg::a);
   }
}
