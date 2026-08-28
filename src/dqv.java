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

public class dqv extends dma implements dmi {
   private static final Codec<ewe> f = mf.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ewe $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dqv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dqv::new));
   public static final eaz b = eap.aS;
   protected final ewe c;
   private final List<ewg> g;
   public static final ffc d = dma.b(16.0, 0.0, 8.0);
   public static final ImmutableList<ja> e = ImmutableList.of(ja.a, ja.d, ja.c, ja.f, ja.e);

   @Override
   public MapCodec<dqv> a() {
      return a;
   }

   protected dqv(ewe $$0, dzy.d $$1) {
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
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fez.a();
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dzz $$0) {
      return false;
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return !this.c.a(axh.b);
   }

   @Override
   protected ewg b_(dzz $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dzz $$0, dzz $$1, ja $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dsm a_(dzz $$0) {
      return dsm.a;
   }

   @Override
   protected List<cyy> a(dzz $$0, ezc.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return fez.a();
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(div $$0, iu $$1, dzz $$2) {
      if (this.c.a(axh.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dmc.el);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ja $$4 = (ja)var5.next();
            iu $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axh.a)) {
               dma $$6 = $$0.b_($$1).b() ? dmc.cw : dmc.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dmc.nz)) {
               $$0.b($$1, dmc.em.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(diw $$0, iu $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   public cyy a(@Nullable bxc $$0, diw $$1, iu $$2, dzz $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dmc.a.m(), 11);
         return new cyy(this.c.a());
      } else {
         return cyy.k;
      }
   }

   @Override
   public Optional<awm> ao_() {
      return this.c.j();
   }
}
