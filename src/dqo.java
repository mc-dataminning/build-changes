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

public class dqo extends dlu implements dmc {
   private static final Codec<evt> f = mf.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof evt $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dqo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dqo::new));
   public static final eao b = eae.aS;
   protected final evt c;
   private final List<evv> g;
   public static final feq d = dlu.b(16.0, 0.0, 8.0);
   public static final ImmutableList<ja> e = ImmutableList.of(ja.a, ja.d, ja.c, ja.f, ja.e);

   @Override
   public MapCodec<dqo> a() {
      return a;
   }

   protected dqo(evt $$0, dzn.d $$1) {
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
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fen.a();
   }

   @Override
   protected boolean f(dzo $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dzo $$0) {
      return false;
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return !this.c.a(axf.b);
   }

   @Override
   protected evv b_(dzo $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dzo $$0, dzo $$1, ja $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dsf a_(dzo $$0) {
      return dsf.a;
   }

   @Override
   protected List<cys> a(dzo $$0, eyq.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return fen.a();
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dip $$0, iu $$1, dzo $$2) {
      if (this.c.a(axf.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dlw.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ja $$4 = (ja)var5.next();
            iu $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axf.a)) {
               dlu $$6 = $$0.b_($$1).b() ? dlw.cv : dlw.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dlw.ny)) {
               $$0.b($$1, dlw.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(diq $$0, iu $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   public cys a(@Nullable bwz $$0, diq $$1, iu $$2, dzo $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dlw.a.m(), 11);
         return new cys(this.c.a());
      } else {
         return cys.k;
      }
   }

   @Override
   public Optional<awk> ao_() {
      return this.c.j();
   }
}
