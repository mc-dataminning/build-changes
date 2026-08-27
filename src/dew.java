import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dew extends dcy {
   public static final MapCodec<dew> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkc.a.fieldOf("wood_type").forGetter(dcy::d), u()).apply($$0, dew::new));
   public static final djj b = czu.aE;
   public static final elu c = cvz.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final elu d = cvz.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final elu e = elr.a(c, cvz.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final elu i = elr.a(d, cvz.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ia, elu> j = Maps.newEnumMap(ImmutableMap.of(ia.c, e, ia.d, e, ia.f, i, ia.e, i));

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public dew(dkc $$0, dio.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ia.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.c_($$2) instanceof dhm $$6) {
         cmh $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bjl.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dip $$0, cer $$1, ekx $$2, dhm $$3, cmh $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof clt && !this.a($$2, $$0);
   }

   private boolean a(ekx $$0, dip $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public elu b_(dip $$0, cse $$1, hv $$2) {
      return this.a($$0, $$1, $$2, elg.a());
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      switch ((ia)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dip $$0, ctb $$1, hv $$2) {
      ia $$3 = $$0.c(b).h();
      ia $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(ctb $$0, dip $$1, hv $$2, ia $$3) {
      dip $$4 = $$0.a_($$2);
      return $$4.a(arr.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, ddz.a);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = this.o();
      edz $$2 = $$0.q().b_($$0.a());
      ctb $$3 = $$0.q();
      hv $$4 = $$0.a();

      for (ia $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ia $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eea.c));
            }
         }
      }

      return null;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dip $$0) {
      return $$0.c(b).p();
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dha($$0, $$1);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.i, dhm::a);
   }
}
