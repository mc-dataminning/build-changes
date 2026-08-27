import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class ddo extends dbs {
   public static final MapCodec<ddo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dij.a.fieldOf("wood_type").forGetter(dbs::d), t()).apply($$0, ddo::new));
   public static final dhq b = cyo.aE;
   public static final ekb c = cut.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ekb d = cut.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ekb e = ejy.a(c, cut.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ekb i = ejy.a(d, cut.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<hx, ekb> j = Maps.newEnumMap(ImmutableMap.of(hx.c, e, hx.d, e, hx.f, i, hx.e, i));

   @Override
   public MapCodec<ddo> a() {
      return a;
   }

   public ddo(dij $$0, dgv.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, hx.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.c_($$2) instanceof dga $$6) {
         clb $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return biq.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dgw $$0, cdm $$1, eje $$2, dga $$3, clb $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof ckn && !this.a($$2, $$0);
   }

   private boolean a(eje $$0, dgw $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public ekb b_(dgw $$0, cqy $$1, ht $$2) {
      return this.a($$0, $$1, $$2, ejn.a());
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      switch ((hx)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dgw $$0, crv $$1, ht $$2) {
      hx $$3 = $$0.c(b).h();
      hx $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(crv $$0, dgw $$1, ht $$2, hx $$3) {
      dgw $$4 = $$0.a_($$2);
      return $$4.a(arc.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dct.a);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = this.o();
      ecg $$2 = $$0.q().b_($$0.a());
      crv $$3 = $$0.q();
      ht $$4 = $$0.a();

      for (hx $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ech.c));
            }
         }
      }

      return null;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dgw $$0) {
      return $$0.c(b).p();
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, f);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfo($$0, $$1);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.i, dga::a);
   }
}
