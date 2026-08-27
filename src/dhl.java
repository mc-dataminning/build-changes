import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dhl extends dfn {
   public static final MapCodec<dhl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dms.a.fieldOf("wood_type").forGetter(dfn::d), u()).apply($$0, dhl::new));
   public static final dlz b = dcj.aE;
   public static final eol c = cyo.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eol d = cyo.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eol e = eoi.a(c, cyo.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eol i = eoi.a(d, cyo.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ie, eol> j = Maps.newEnumMap(ImmutableMap.of(ie.c, e, ie.d, e, ie.f, i, ie.e, i));

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   public dhl(dms $$0, dle.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ie.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$2.c_($$3) instanceof dkc $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return blw.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dlf $$0, chh $$1, eno $$2, dkc $$3, coz $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof col && !this.a($$2, $$0);
   }

   private boolean a(eno $$0, dlf $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected eol b_(dlf $$0, cut $$1, hz $$2) {
      return this.a($$0, $$1, $$2, enx.a());
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      switch ((ie)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dlf $$0, cvq $$1, hz $$2) {
      ie $$3 = $$0.c(b).h();
      ie $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cvq $$0, dlf $$1, hz $$2, ie $$3) {
      dlf $$4 = $$0.a_($$2);
      return $$4.a(atz.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dgo.a);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = this.o();
      egp $$2 = $$0.q().b_($$0.a());
      cvq $$3 = $$0.q();
      hz $$4 = $$0.a();

      for (ie $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ie $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == egq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dlf $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djq($$0, $$1);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$2, div.i, dkc::a);
   }
}
