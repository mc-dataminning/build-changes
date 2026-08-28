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

public class dnf extends diq implements dix {
   private static final Codec<ert> f = lz.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ert $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dnf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dnf::new));
   public static final dwu b = dwl.aP;
   protected final ert c;
   private final List<erv> g;
   public static final fas d = diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jm> e = ImmutableList.of(jm.a, jm.d, jm.c, jm.f, jm.e);

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   protected dnf(ert $$0, dvu.d $$1) {
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
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fap.a();
   }

   @Override
   protected boolean f(dvv $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dvv $$0) {
      return false;
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return !this.c.a(axi.b);
   }

   @Override
   protected erv b_(dvv $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dvv $$0, dvv $$1, jm $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.a;
   }

   @Override
   protected List<cwm> a(dvv $$0, euq.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return fap.a();
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dfm $$0, jh $$1, dvv $$2) {
      if (this.c.a(axi.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dis.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jm $$4 = (jm)var5.next();
            jh $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axi.a)) {
               diq $$6 = $$0.b_($$1).b() ? dis.co : dis.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dis.mW)) {
               $$0.b($$1, dis.dY.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dfn $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   public cwm a(@Nullable cou $$0, dfn $$1, jh $$2, dvv $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dis.a.m(), 11);
         return new cwm(this.c.a());
      } else {
         return cwm.k;
      }
   }

   @Override
   public Optional<awm> as_() {
      return this.c.j();
   }
}
