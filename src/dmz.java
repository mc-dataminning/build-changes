import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dmz extends dla {
   public static final MapCodec<dmz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dsq.a.fieldOf("wood_type").forGetter(dla::d), u()).apply($$0, dmz::new));
   public static final drx b = dhw.aE;
   public static final evf c = dea.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final evf d = dea.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final evf e = evc.a(c, dea.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final evf i = evc.a(d, dea.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<it, evf> j = Maps.newEnumMap(ImmutableMap.of(it.c, e, it.d, e, it.f, i, it.e, i));

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   public dmz(dsq $$0, drc.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, it.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$2.c_($$3) instanceof dps $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bpy.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(drd $$0, cly $$1, eui $$2, dps $$3, ctq $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof ctd && !this.a($$2, $$0);
   }

   private boolean a(eui $$0, drd $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected evf b_(drd $$0, daf $$1, io $$2) {
      return this.a($$0, $$1, $$2, eur.a());
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      switch ((it)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(drd $$0, dbc $$1, io $$2) {
      it $$3 = $$0.c(b).h();
      it $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dbc $$0, drd $$1, io $$2, it $$3) {
      drd $$4 = $$0.a_($$2);
      return $$4.a(avx.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dmb.a);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = this.n();
      emw $$2 = $$0.q().b_($$0.a());
      dbc $$3 = $$0.q();
      io $$4 = $$0.a();

      for (it $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            it $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == emx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drd $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, f);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpf($$0, $$1);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.i, dps::a);
   }
}
