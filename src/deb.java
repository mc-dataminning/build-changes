import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class deb extends dce {
   public static final MapCodec<deb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dja.a.fieldOf("wood_type").forGetter(dce::d), u()).apply($$0, deb::new));
   public static final dih b = cza.aE;
   public static final eks c = cvf.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eks d = cvf.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eks e = ekp.a(c, cvf.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eks i = ekp.a(d, cvf.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ib, eks> j = Maps.newEnumMap(ImmutableMap.of(ib.c, e, ib.d, e, ib.f, i, ib.e, i));

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public deb(dja $$0, dhm.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ib.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.c_($$2) instanceof dgr $$6) {
         clo $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bjb.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dhn $$0, cdz $$1, ejv $$2, dgr $$3, clo $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cla && !this.a($$2, $$0);
   }

   private boolean a(ejv $$0, dhn $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public eks b_(dhn $$0, crl $$1, hx $$2) {
      return this.a($$0, $$1, $$2, eke.a());
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ((ib)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dhn $$0, csi $$1, hx $$2) {
      ib $$3 = $$0.c(b).h();
      ib $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(csi $$0, dhn $$1, hx $$2, ib $$3) {
      dhn $$4 = $$0.a_($$2);
      return $$4.a(ark.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, ddf.a);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = this.o();
      ecx $$2 = $$0.q().b_($$0.a());
      csi $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ib $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ib $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ecy.c));
            }
         }
      }

      return null;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dhn $$0) {
      return $$0.c(b).p();
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgf($$0, $$1);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.i, dgr::a);
   }
}
