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

public class dmn extends dhy implements dif {
   private static final Codec<erc> f = lx.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof erc $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dmn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dmn::new));
   public static final dwd b = dvt.aP;
   protected final erc c;
   private final List<ere> g;
   public static final fab d = dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jl> e = ImmutableList.of(jl.a, jl.d, jl.c, jl.f, jl.e);

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   protected dmn(erc $$0, dvc.d $$1) {
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
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : ezy.a();
   }

   @Override
   protected boolean f(dvd $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      $$0.y().b($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dvd $$0) {
      return false;
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return !this.c.a(axf.b);
   }

   @Override
   protected ere b_(dvd $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dvd $$0, dvd $$1, jl $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.a;
   }

   @Override
   protected List<cvx> a(dvd $$0, etz.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return ezy.a();
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dey)$$1));
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.y().b() || $$2.y().b()) {
         $$3.a($$4, $$0.y().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dey)$$1));
      }
   }

   private boolean a(dev $$0, jg $$1, dvd $$2) {
      if (this.c.a(axf.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dia.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jl $$4 = (jl)var5.next();
            jg $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axf.a)) {
               dhy $$6 = $$0.b_($$1).b() ? dia.co : dia.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dia.mW)) {
               $$0.b($$1, dia.dY.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dew $$0, jg $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   public cvx a(@Nullable coh $$0, dew $$1, jg $$2, dvd $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dia.a.m(), 11);
         return new cvx(this.c.a());
      } else {
         return cvx.k;
      }
   }

   @Override
   public Optional<awj> au_() {
      return this.c.j();
   }
}
