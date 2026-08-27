import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dlf extends djg {
   public static final MapCodec<dlf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqv.a.fieldOf("wood_type").forGetter(djg::d), u()).apply($$0, dlf::new));
   public static final dqc b = dgc.aE;
   public static final etc c = dch.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final etc d = dch.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final etc e = esz.a(c, dch.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final etc i = esz.a(d, dch.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ij, etc> j = Maps.newEnumMap(ImmutableMap.of(ij.c, e, ij.d, e, ij.f, i, ij.e, i));

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   public dlf(dqv $$0, dph.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ij.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$2.c_($$3) instanceof dny $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return boh.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dpi $$0, cka $$1, esf $$2, dny $$3, crs $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.f() instanceof crf && !this.a($$2, $$0);
   }

   private boolean a(esf $$0, dpi $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected etc b_(dpi $$0, cym $$1, id $$2) {
      return this.a($$0, $$1, $$2, eso.a());
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      switch ((ij)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dpi $$0, czj $$1, id $$2) {
      ij $$3 = $$0.c(b).h();
      ij $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(czj $$0, dpi $$1, id $$2, ij $$3) {
      dpi $$4 = $$0.a_($$2);
      return $$4.a(ave.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dkh.a);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = this.n();
      elb $$2 = $$0.q().b_($$0.a());
      czj $$3 = $$0.q();
      id $$4 = $$0.a();

      for (ij $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ij $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == elc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dpi $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnl($$0, $$1);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.i, dny::a);
   }
}
