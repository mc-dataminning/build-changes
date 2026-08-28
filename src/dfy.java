import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfy extends dlz {
   public static final MapCodec<dfy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtp.a.fieldOf("wood_type").forGetter(dlz::d), u()).apply($$0, dfy::new));
   public static final dtc b = dss.ba;
   public static final dst c = dss.a;
   protected static final float d = 5.0F;
   protected static final ewk e = dez.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ewk> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dez.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dez.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dez.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dez.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   public dfy(dtp $$0, dsb.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$2.c_($$3) instanceof dqr $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqw.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cmx $$0, evn $$1, dqr $$2, cup $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof cuc && $$1.b().equals(je.a);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), je.a, dna.b);
   }

   @Override
   public dsc a(cya $$0) {
      dby $$1 = $$0.q();
      env $$2 = $$1.b_($$0.a());
      iz $$3 = $$0.a().c();
      dsc $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awp.aA);
      je $$6 = je.a((double)$$0.i());
      boolean $$7 = !dez.a($$4.k($$1, $$3), je.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dny.b)) {
            je $$8 = $$4.c(dny.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<je> $$9 = dti.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dti.a($$6.g()) : dti.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == enw.c));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      ewk $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ewk b_(dsc $$0, dbe $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evw.a());
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1 == je.b && !this.a($$0, $$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsc $$0) {
      return dti.b($$0.c(b));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$2, dpj.i, dqr::a);
   }
}
