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

public class dmt extends die implements dil {
   private static final Codec<eri> f = ly.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eri $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dmt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dmt::new));
   public static final dwj b = dvz.aP;
   protected final eri c;
   private final List<erk> g;
   public static final fah d = die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jm> e = ImmutableList.of(jm.a, jm.d, jm.c, jm.f, jm.e);

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(eri $$0, dvi.d $$1) {
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
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fae.a();
   }

   @Override
   protected boolean f(dvj $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      $$0.y().b($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dvj $$0) {
      return false;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return !this.c.a(axg.b);
   }

   @Override
   protected erk b_(dvj $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dvj $$0, dvj $$1, jm $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.a;
   }

   @Override
   protected List<cwb> a(dvj $$0, euf.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return fae.a();
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dfe)$$1));
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.y().b() || $$2.y().b()) {
         $$3.a($$4, $$0.y().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dfe)$$1));
      }
   }

   private boolean a(dfb $$0, jh $$1, dvj $$2) {
      if (this.c.a(axg.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dig.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jm $$4 = (jm)var5.next();
            jh $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axg.a)) {
               die $$6 = $$0.b_($$1).b() ? dig.co : dig.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dig.mW)) {
               $$0.b($$1, dig.dY.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dfc $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   public cwb a(@Nullable com $$0, dfc $$1, jh $$2, dvj $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dig.a.m(), 11);
         return new cwb(this.c.a());
      } else {
         return cwb.k;
      }
   }

   @Override
   public Optional<awk> at_() {
      return this.c.j();
   }
}
