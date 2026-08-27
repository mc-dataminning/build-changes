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

public class dgn extends dby implements dcf {
   private static final Codec<ekq> f = kr.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ekq $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dgn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dgn::new));
   public static final dpz b = dpp.aP;
   protected final ekq c;
   private final List<eks> g;
   public static final est d = dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ih> e = ImmutableList.of(ih.a, ih.d, ih.c, ih.f, ih.e);

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   protected dgn(ekq $$0, doy.d $$1) {
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
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : esq.a();
   }

   @Override
   protected boolean e_(doz $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return false;
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return !this.c.a(avh.b);
   }

   @Override
   protected eks c_(doz $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(doz $$0, doz $$1, ih $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected did b_(doz $$0) {
      return did.a;
   }

   @Override
   protected List<crj> a(doz $$0, enh.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return esq.a();
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cza)$$1));
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cza)$$1));
      }
   }

   private boolean a(cyx $$0, ib $$1, doz $$2) {
      if (this.c.a(avh.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dca.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ih $$4 = (ih)var5.next();
            ib $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(avh.a)) {
               dby $$6 = $$0.b_($$1).b() ? dca.co : dca.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dca.mW)) {
               $$0.b($$1, dca.dY.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cyy $$0, ib $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   public crj a(@Nullable cjt $$0, cyy $$1, ib $$2, doz $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dca.a.n(), 11);
         return new crj(this.c.a());
      } else {
         return crj.i;
      }
   }

   @Override
   public Optional<aul> at_() {
      return this.c.j();
   }
}
