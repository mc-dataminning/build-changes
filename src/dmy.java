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

public class dmy extends dij implements diq {
   private static final Codec<erm> f = lz.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof erm $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dmy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dmy::new));
   public static final dwn b = dwe.aP;
   protected final erm c;
   private final List<ero> g;
   public static final fal d = dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jm> e = ImmutableList.of(jm.a, jm.d, jm.c, jm.f, jm.e);

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   protected dmy(erm $$0, dvn.d $$1) {
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
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fai.a();
   }

   @Override
   protected boolean f(dvo $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      $$0.y().b($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dvo $$0) {
      return false;
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return !this.c.a(axj.b);
   }

   @Override
   protected ero b_(dvo $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dvo $$0, dvo $$1, jm $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.a;
   }

   @Override
   protected List<cwf> a(dvo $$0, euj.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return fai.a();
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dfi)$$1));
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dfi)$$1));
      }
   }

   private boolean a(dff $$0, jh $$1, dvo $$2) {
      if (this.c.a(axj.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dil.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jm $$4 = (jm)var5.next();
            jh $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axj.a)) {
               dij $$6 = $$0.b_($$1).b() ? dil.co : dil.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dil.mW)) {
               $$0.b($$1, dil.dY.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dfg $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   public cwf a(@Nullable cor $$0, dfg $$1, jh $$2, dvo $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dil.a.m(), 11);
         return new cwf(this.c.a());
      } else {
         return cwf.k;
      }
   }

   @Override
   public Optional<awn> at_() {
      return this.c.j();
   }
}
