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

public class dpo extends dku implements dlc {
   private static final Codec<eur> f = md.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eur $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dpo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dpo::new));
   public static final dzm b = dzc.aS;
   protected final eur c;
   private final List<eut> g;
   public static final fdo d = dku.b(16.0, 0.0, 8.0);
   public static final ImmutableList<jo> e = ImmutableList.of(jo.a, jo.d, jo.c, jo.f, jo.e);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   protected dpo(eur $$0, dyl.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fdl.a();
   }

   @Override
   protected boolean f(dym $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dym $$0) {
      return false;
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return !this.c.a(axf.b);
   }

   @Override
   protected eut b_(dym $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dym $$0, dym $$1, jo $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected drf a_(dym $$0) {
      return drf.a;
   }

   @Override
   protected List<cxy> a(dym $$0, exo.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return fdl.a();
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dhp $$0, jj $$1, dym $$2) {
      if (this.c.a(axf.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dkw.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jo $$4 = (jo)var5.next();
            jj $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axf.a)) {
               dku $$6 = $$0.b_($$1).b() ? dkw.cv : dkw.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dkw.ny)) {
               $$0.b($$1, dkw.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dhq $$0, jj $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   public cxy a(@Nullable bwr $$0, dhq $$1, jj $$2, dym $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dkw.a.m(), 11);
         return new cxy(this.c.a());
      } else {
         return cxy.k;
      }
   }

   @Override
   public Optional<awj> ao_() {
      return this.c.j();
   }
}
