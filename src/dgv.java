import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgv extends dmx {
   public static final MapCodec<dgv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dun.a.fieldOf("wood_type").forGetter(dmx::d), u()).apply($$0, dgv::new));
   public static final dua b = dtq.ba;
   public static final dtr c = dtq.a;
   protected static final float d = 5.0F;
   protected static final exp e = dfw.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, exp> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dfw.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dfw.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dfw.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dfw.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   public dgv(dun $$0, dsz.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$2.c_($$3) instanceof drq $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqs.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cmv $$0, ews $$1, drq $$2, cuo $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof cub && $$1.b().equals(ji.a);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ji.a, dny.b);
   }

   @Override
   public dta a(cyb $$0) {
      dcu $$1 = $$0.q();
      eoy $$2 = $$1.b_($$0.a());
      jd $$3 = $$0.a().c();
      dta $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awd.aA);
      ji $$6 = ji.a((double)$$0.i());
      boolean $$7 = !dfw.a($$4.k($$1, $$3), ji.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dow.b)) {
            ji $$8 = $$4.c(dow.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ji> $$9 = dug.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dug.a($$6.g()) : dug.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eoz.c));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      exp $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected exp b_(dta $$0, dca $$1, jd $$2) {
      return this.a($$0, $$1, $$2, exb.a());
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.b && !this.a($$0, $$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dta $$0) {
      return dug.b($$0.c(b));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$2, dqh.i, drq::a);
   }
}
