import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dsq extends dqr {
   public static final MapCodec<dsq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyj.a.fieldOf("wood_type").forGetter(dqr::d), t()).apply($$0, dsq::new));
   public static final dxu<jn> b = dnk.aF;
   public static final fbu c = djm.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fbu d = djm.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fbu e = fbr.a(c, djm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fbu i = fbr.a(d, djm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jn, fbu> j = Maps.newEnumMap(ImmutableMap.of(jn.c, e, jn.d, e, jn.f, i, jn.e, i));

   @Override
   public MapCodec<dsq> a() {
      return a;
   }

   public dsq(dyj $$0, dww.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jn.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      if ($$2.c_($$3) instanceof dvm $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bsj.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dwx $$0, cox $$1, faw $$2, dvm $$3, cwp $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cwe && !this.a($$2, $$0);
   }

   private boolean a(faw $$0, dwx $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fbu b_(dwx $$0, dfn $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fbf.a());
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      switch ((jn)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dwx $$0, dgl $$1, ji $$2) {
      jn $$3 = $$0.c(b).h();
      jn $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dgl $$0, dwx $$1, ji $$2, jn $$3) {
      dwx $$4 = $$0.a_($$2);
      return $$4.a(awp.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, drs.a);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dwx $$1 = this.m();
      esz $$2 = $$0.q().b_($$0.a());
      dgl $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == eta.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwx $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new duz($$0, $$1);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.i, dvm::a);
   }
}
