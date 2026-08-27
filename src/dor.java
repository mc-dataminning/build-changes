import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dor extends dmq {
   public static final MapCodec<dor> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter(dmq::c), u()).apply($$0, dor::new));
   public static final dtw b = djc.aE;
   public static final exn c = dfc.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final exn d = dfc.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final exn e = exk.a(c, dfc.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final exn i = exk.a(d, dfc.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<iw, exn> j = Maps.newEnumMap(ImmutableMap.of(iw.c, e, iw.d, e, iw.f, i, iw.e, i));

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dup $$0, dtb.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, iw.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$2.c_($$3) instanceof drr $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqc.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dtc $$0, cly $$1, ewq $$2, drr $$3, cuh $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.f() instanceof ctt && !this.a($$2, $$0);
   }

   private boolean a(ewq $$0, dtc $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected exn b_(dtc $$0, dbg $$1, ir $$2) {
      return this.a($$0, $$1, $$2, ewz.a());
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      switch ((iw)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dtc $$0, dcd $$1, ir $$2) {
      iw $$3 = $$0.c(b).h();
      iw $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dcd $$0, dtc $$1, ir $$2, iw $$3) {
      dtc $$4 = $$0.a_($$2);
      return $$4.a(awe.aA) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dns.a);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.n();
      epe $$2 = $$0.q().b_($$0.a());
      dcd $$3 = $$0.q();
      ir $$4 = $$0.a();

      for (iw $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            iw $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == epf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dtc $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dra($$0, $$1);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.j, drr::a);
   }
}
