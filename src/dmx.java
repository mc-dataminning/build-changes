import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dmx extends dky {
   public static final MapCodec<dmx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dso.a.fieldOf("wood_type").forGetter(dky::d), u()).apply($$0, dmx::new));
   public static final drv b = dhu.aE;
   public static final evd c = ddy.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final evd d = ddy.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final evd e = eva.a(c, ddy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final evd i = eva.a(d, ddy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<it, evd> j = Maps.newEnumMap(ImmutableMap.of(it.c, e, it.d, e, it.f, i, it.e, i));

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(dso $$0, dra.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, it.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$2.c_($$3) instanceof dpq $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bpw.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(drb $$0, clw $$1, eug $$2, dpq $$3, cto $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof ctb && !this.a($$2, $$0);
   }

   private boolean a(eug $$0, drb $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected evd b_(drb $$0, dad $$1, io $$2) {
      return this.a($$0, $$1, $$2, eup.a());
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ((it)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(drb $$0, dba $$1, io $$2) {
      it $$3 = $$0.c(b).h();
      it $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dba $$0, drb $$1, io $$2, it $$3) {
      drb $$4 = $$0.a_($$2);
      return $$4.a(avw.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dlz.a);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = this.n();
      emu $$2 = $$0.q().b_($$0.a());
      dba $$3 = $$0.q();
      io $$4 = $$0.a();

      for (it $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            it $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == emv.c));
            }
         }
      }

      return null;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drb $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpd($$0, $$1);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$2, doi.i, dpq::a);
   }
}
