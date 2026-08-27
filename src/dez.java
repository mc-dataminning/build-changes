import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dez extends dla {
   public static final MapCodec<dez> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dsq.a.fieldOf("wood_type").forGetter(dla::d), u()).apply($$0, dez::new));
   public static final dsd b = drt.ba;
   public static final dru c = drt.a;
   protected static final float d = 5.0F;
   protected static final evf e = dea.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, evf> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dea.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dea.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dea.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dea.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   public dez(dsq $$0, drc.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$2.c_($$3) instanceof dps $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bpy.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cly $$0, eui $$1, dps $$2, ctq $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof ctd && $$1.b().equals(it.a);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), it.a, dmb.b);
   }

   @Override
   public drd a(cxb $$0) {
      daz $$1 = $$0.q();
      emw $$2 = $$1.b_($$0.a());
      io $$3 = $$0.a().c();
      drd $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(avx.aA);
      it $$6 = it.a((double)$$0.i());
      boolean $$7 = !dea.a($$4.k($$1, $$3), it.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dmz.b)) {
            it $$8 = $$4.c(dmz.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<it> $$9 = dsj.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dsj.a($$6.g()) : dsj.a($$0.i() + 180.0F);
      return this.n().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == emx.c));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      evf $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected evf b_(drd $$0, daf $$1, io $$2) {
      return this.a($$0, $$1, $$2, eur.a());
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.b && !this.a($$0, $$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drd $$0) {
      return dsj.b($$0.c(b));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.i, dps::a);
   }
}
