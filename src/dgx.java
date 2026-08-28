import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgx extends dmz {
   public static final MapCodec<dgx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter(dmz::d), u()).apply($$0, dgx::new));
   public static final duc b = dts.ba;
   public static final dtt c = dts.a;
   protected static final float d = 5.0F;
   protected static final exv e = dfy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, exv> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dfy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dfy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dfy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dfy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   public dgx(dup $$0, dtb.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      if ($$2.c_($$3) instanceof drs $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqt.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cmx $$0, ewy $$1, drs $$2, cuq $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof cud && $$1.b().equals(ji.a);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), ji.a, doa.b);
   }

   @Override
   public dtc a(cyd $$0) {
      dcw $$1 = $$0.q();
      epe $$2 = $$1.b_($$0.a());
      jd $$3 = $$0.a().d();
      dtc $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awe.aB);
      ji $$6 = ji.a((double)$$0.i());
      boolean $$7 = !dfy.a($$4.k($$1, $$3), ji.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(doy.b)) {
            ji $$8 = $$4.c(doy.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ji> $$9 = dui.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dui.a($$6.g()) : dui.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == epf.c));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      exv $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected exv b_(dtc $$0, dcc $$1, jd $$2) {
      return this.a($$0, $$1, $$2, exh.a());
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.b && !this.a($$0, $$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dtc $$0) {
      return dui.b($$0.c(b));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$2, dqj.i, drs::a);
   }
}
