import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dil extends don {
   public static final MapCodec<dil> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwf.a.fieldOf("wood_type").forGetter(don::d), t()).apply($$0, dil::new));
   public static final dvs b = dvi.ba;
   public static final dvj c = dvi.a;
   protected static final float d = 5.0F;
   protected static final ezq e = dhm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ezq> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dhm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dhm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dhm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dhm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dwf $$0, dur.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$2.c_($$3) instanceof dth $$7 && this.a($$4, $$6, $$7, $$0)) {
         return brs.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cnx $$0, eys $$1, dth $$2, cvs $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cvg && $$1.c().equals(jk.a);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jk.a, dpo.b);
   }

   @Override
   public dus a(czn $$0) {
      dej $$1 = $$0.q();
      eqt $$2 = $$1.b_($$0.a());
      jf $$3 = $$0.a().d();
      dus $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awv.aB);
      jk $$6 = jk.a((double)$$0.i());
      boolean $$7 = !dhm.a($$4.g($$1, $$3), jk.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dqm.b)) {
            jk $$8 = $$4.c(dqm.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jk> $$9 = dvy.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dvy.a($$6.g()) : dvy.a($$0.i() + 180.0F);
      return this.n().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == equ.c));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      ezq $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ezq b_(dus $$0, ddo $$1, jf $$2) {
      return this.a($$0, $$1, $$2, ezb.a());
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.b && !this.a($$0, $$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dus $$0) {
      return dvy.b($$0.c(b));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.i, dth::a);
   }
}
