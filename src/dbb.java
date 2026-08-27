import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbb extends dhb {
   public static final MapCodec<dbb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(doo.a.fieldOf("wood_type").forGetter(dhb::d), u()).apply($$0, dbb::new));
   public static final dob b = dnr.ba;
   public static final dns c = dnr.a;
   protected static final float d = 5.0F;
   protected static final eqm e = dac.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eqm> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dac.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dac.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dac.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dac.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dbb> a() {
      return a;
   }

   public dbb(doo $$0, dna.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$2.c_($$3) instanceof dlr $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bnf.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(ciu $$0, epp $$1, dlr $$2, cqm $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cpz && $$1.b().equals(ih.a);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ih.a, dic.b);
   }

   @Override
   public dnb a(csu $$0) {
      cxb $$1 = $$0.q();
      eip $$2 = $$1.b_($$0.a());
      ib $$3 = $$0.a().c();
      dnb $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(aun.aA);
      ih $$6 = ih.a((double)$$0.i());
      boolean $$7 = !dac.a($$4.k($$1, $$3), ih.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dja.b)) {
            ih $$8 = $$4.c(dja.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ih> $$9 = doh.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? doh.a($$6.g()) : doh.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eiq.c));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      eqm $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected eqm b_(dnb $$0, cwh $$1, ib $$2) {
      return this.a($$0, $$1, $$2, epy.a());
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.b && !this.a($$0, $$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dnb $$0) {
      return doh.b($$0.c(b));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.i, dlr::a);
   }
}
