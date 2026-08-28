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

public class dmc extends dhm implements dht {
   private static final Codec<eqr> f = lv.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eqr $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dmc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dmc::new));
   public static final dvs b = dvi.aP;
   protected final eqr c;
   private final List<eqt> g;
   public static final ezq d = dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jk> e = ImmutableList.of(jk.a, jk.d, jk.c, jk.f, jk.e);

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   protected dmc(eqr $$0, dur.d $$1) {
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
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : ezn.a();
   }

   @Override
   protected boolean f(dus $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      $$0.y().b($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dus $$0) {
      return false;
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return !this.c.a(axb.b);
   }

   @Override
   protected eqt b_(dus $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dus $$0, dus $$1, jk $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.a;
   }

   @Override
   protected List<cvs> a(dus $$0, eto.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ezn.a();
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dem)$$1));
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.y().b() || $$2.y().b()) {
         $$3.a($$4, $$0.y().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dem)$$1));
      }
   }

   private boolean a(dej $$0, jf $$1, dus $$2) {
      if (this.c.a(axb.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dho.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jk $$4 = (jk)var5.next();
            jf $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axb.a)) {
               dhm $$6 = $$0.b_($$1).b() ? dho.co : dho.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dho.mW)) {
               $$0.b($$1, dho.dY.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dek $$0, jf $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   public cvs a(@Nullable cnx $$0, dek $$1, jf $$2, dus $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dho.a.n(), 11);
         return new cvs(this.c.a());
      } else {
         return cvs.k;
      }
   }

   @Override
   public Optional<awf> au_() {
      return this.c.j();
   }
}
