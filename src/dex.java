import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dex extends dky {
   public static final MapCodec<dex> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dso.a.fieldOf("wood_type").forGetter(dky::d), u()).apply($$0, dex::new));
   public static final dsb b = drr.ba;
   public static final drs c = drr.a;
   protected static final float d = 5.0F;
   protected static final evd e = ddy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, evd> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         ddy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         ddy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         ddy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         ddy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public dex(dso $$0, dra.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$2.c_($$3) instanceof dpq $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bpw.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(clw $$0, eug $$1, dpq $$2, cto $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof ctb && $$1.b().equals(it.a);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), it.a, dlz.b);
   }

   @Override
   public drb a(cwz $$0) {
      dax $$1 = $$0.q();
      emu $$2 = $$1.b_($$0.a());
      io $$3 = $$0.a().c();
      drb $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(avw.aA);
      it $$6 = it.a((double)$$0.i());
      boolean $$7 = !ddy.a($$4.k($$1, $$3), it.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dmx.b)) {
            it $$8 = $$4.c(dmx.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<it> $$9 = dsh.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dsh.a($$6.g()) : dsh.a($$0.i() + 180.0F);
      return this.n().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == emv.c));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      evd $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected evd b_(drb $$0, dad $$1, io $$2) {
      return this.a($$0, $$1, $$2, eup.a());
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.b && !this.a($$0, $$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drb $$0) {
      return dsh.b($$0.c(b));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$2, doi.i, dpq::a);
   }
}
