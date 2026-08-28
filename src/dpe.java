import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpe extends dkm implements dku {
   private static final Codec<etv> f = ma.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof etv $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dpe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dpe::new));
   public static final dyu b = dyl.aQ;
   protected final etv c;
   private final List<etx> g;
   public static final fcs d = dkm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jm> e = ImmutableList.of(jm.a, jm.d, jm.c, jm.f, jm.e);

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   protected dpe(etv $$0, dxu.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fcp.a();
   }

   @Override
   protected boolean f(dxv $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dxv $$0) {
      return false;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return !this.c.a(aya.b);
   }

   @Override
   protected etx b_(dxv $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dxv $$0, dxv $$1, jm $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.a;
   }

   @Override
   protected List<cxp> a(dxv $$0, ews.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return fcp.a();
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dhi $$0, jh $$1, dxv $$2) {
      if (this.c.a(aya.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dko.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jm $$4 = (jm)var5.next();
            jh $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(aya.a)) {
               dkm $$6 = $$0.b_($$1).b() ? dko.cv : dko.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dko.nr)) {
               $$0.b($$1, dko.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dhj $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   public cxp a(@Nullable cpx $$0, dhj $$1, jh $$2, dxv $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dko.a.m(), 11);
         return new cxp(this.c.a());
      } else {
         return cxp.j;
      }
   }

   @Override
   public Optional<axe> at_() {
      return this.c.j();
   }
}
