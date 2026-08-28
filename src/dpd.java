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

public class dpd extends dkl implements dkt {
   private static final Codec<etu> f = ma.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof etu $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dpd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dpd::new));
   public static final dyt b = dyk.aQ;
   protected final etu c;
   private final List<etw> g;
   public static final fcr d = dkl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jm> e = ImmutableList.of(jm.a, jm.d, jm.c, jm.f, jm.e);

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   protected dpd(etu $$0, dxt.d $$1) {
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
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fco.a();
   }

   @Override
   protected boolean f(dxu $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dxu $$0) {
      return false;
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return !this.c.a(aya.b);
   }

   @Override
   protected etw b_(dxu $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dxu $$0, dxu $$1, jm $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.a;
   }

   @Override
   protected List<cxo> a(dxu $$0, ewr.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return fco.a();
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dhh $$0, jh $$1, dxu $$2) {
      if (this.c.a(aya.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dkn.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jm $$4 = (jm)var5.next();
            jh $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(aya.a)) {
               dkl $$6 = $$0.b_($$1).b() ? dkn.cv : dkn.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dkn.nr)) {
               $$0.b($$1, dkn.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dhi $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   public cxo a(@Nullable cpw $$0, dhi $$1, jh $$2, dxu $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dkn.a.m(), 11);
         return new cxo(this.c.a());
      } else {
         return cxo.j;
      }
   }

   @Override
   public Optional<axe> at_() {
      return this.c.j();
   }
}
