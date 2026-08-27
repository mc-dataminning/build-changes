import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class ddw extends dbz {
   public static final MapCodec<ddw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(div.a.fieldOf("wood_type").forGetter(dbz::d), u()).apply($$0, ddw::new));
   public static final dic b = cyv.aE;
   public static final ekn c = cva.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ekn d = cva.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ekn e = ekk.a(c, cva.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ekn i = ekk.a(d, cva.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<hx, ekn> j = Maps.newEnumMap(ImmutableMap.of(hx.c, e, hx.d, e, hx.f, i, hx.e, i));

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(div $$0, dhh.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, hx.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.c_($$2) instanceof dgm $$6) {
         clj $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bix.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dhi $$0, cdu $$1, ejq $$2, dgm $$3, clj $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof ckv && !this.a($$2, $$0);
   }

   private boolean a(ejq $$0, dhi $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public ekn b_(dhi $$0, crg $$1, ht $$2) {
      return this.a($$0, $$1, $$2, ejz.a());
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      switch ((hx)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dhi $$0, csd $$1, ht $$2) {
      hx $$3 = $$0.c(b).h();
      hx $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(csd $$0, dhi $$1, ht $$2, hx $$3) {
      dhi $$4 = $$0.a_($$2);
      return $$4.a(arg.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dda.a);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = this.o();
      ecs $$2 = $$0.q().b_($$0.a());
      csd $$3 = $$0.q();
      ht $$4 = $$0.a();

      for (hx $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ect.c));
            }
         }
      }

      return null;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dhi $$0) {
      return $$0.c(b).p();
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dga($$0, $$1);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$2, dff.i, dgm::a);
   }
}
