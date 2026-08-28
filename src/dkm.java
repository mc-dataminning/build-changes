import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkm extends dqr {
   public static final MapCodec<dkm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyj.a.fieldOf("wood_type").forGetter(dqr::d), t()).apply($$0, dkm::new));
   public static final dxw b = dxn.bd;
   public static final dxo c = dxn.b;
   protected static final float d = 5.0F;
   protected static final fbu e = djm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fbu> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         djm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         djm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         djm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         djm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(dyj $$0, dww.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsk a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsj $$5, faw $$6) {
      if ($$2.c_($$3) instanceof dvm $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bsk.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cox $$0, faw $$1, dvm $$2, cwp $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cwe && $$1.c().equals(jn.a);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jn.a, drs.b);
   }

   @Override
   public dwx a(dag $$0) {
      dgi $$1 = $$0.q();
      esz $$2 = $$1.b_($$0.a());
      ji $$3 = $$0.a().d();
      dwx $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awp.aD);
      jn $$6 = jn.a((double)$$0.i());
      boolean $$7 = !djm.a($$4.g($$1, $$3), jn.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dsq.b)) {
            jn $$8 = $$4.c(dsq.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jn> $$9 = dyc.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dyc.a($$6.g()) : dyc.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == eta.c));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      fbu $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fbu b_(dwx $$0, dfn $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fbf.a());
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.b && !this.a($$0, $$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwx $$0) {
      return dyc.b($$0.c(b));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new duz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.i, dvm::a);
   }
}
