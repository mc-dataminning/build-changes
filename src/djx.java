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

public class djx extends dfh implements dfo {
   private static final Codec<eof> f = lq.c
      .r()
      .comapFlatMap($$0 -> $$0 instanceof eof $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<djx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, djx::new));
   public static final dtk b = dta.aP;
   protected final eof c;
   private final List<eoh> g;
   public static final ewy d = dfh.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jf> e = ImmutableList.of(jf.a, jf.d, jf.c, jf.f, jf.e);

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   protected djx(eof $$0, dsj.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ewv.a();
   }

   @Override
   protected boolean d_(dsk $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return false;
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return !this.c.a(awc.b);
   }

   @Override
   protected eoh b_(dsk $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dsk $$0, dsk $$1, jf $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.a;
   }

   @Override
   protected List<cuc> a(dsk $$0, eqx.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ewv.a();
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dci)$$1));
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dci)$$1));
      }
   }

   private boolean a(dcf $$0, ja $$1, dsk $$2) {
      if (this.c.a(awc.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dfj.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jf $$4 = (jf)var5.next();
            ja $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awc.a)) {
               dfh $$6 = $$0.b_($$1).b() ? dfj.co : dfj.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dfj.mW)) {
               $$0.b($$1, dfj.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dcg $$0, ja $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   public cuc a(@Nullable cmk $$0, dcg $$1, ja $$2, dsk $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dfj.a.o(), 11);
         return new cuc(this.c.a());
      } else {
         return cuc.l;
      }
   }

   @Override
   public Optional<avg> as_() {
      return this.c.j();
   }
}
