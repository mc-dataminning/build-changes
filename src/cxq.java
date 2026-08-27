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

public class cxq extends ctc implements ctj {
   private static final Codec<eae> f = jb.d
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eae $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<cxq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, cxq::new));
   public static final dgd b = dft.aP;
   protected final eae c;
   private final List<eag> g;
   public static final eia d = ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ha> e = ImmutableList.of(ha.a, ha.d, ha.c, ha.f, ha.e);

   @Override
   public MapCodec<cxq> a() {
      return a;
   }

   protected cxq(eae $$0, dfc.d $$1) {
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
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ehx.a();
   }

   @Override
   public boolean e_(dfd $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return false;
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return !this.c.a(aqa.b);
   }

   @Override
   public eag c_(dfd $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dfd $$0, dfd $$1, ha $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.a;
   }

   @Override
   public List<cjl> a(dfd $$0, ecq.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ehx.a();
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cqe)$$1));
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cqe)$$1));
      }
   }

   private boolean a(cqb $$0, gw $$1, dfd $$2) {
      if (this.c.a(aqa.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cte.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ha $$4 = (ha)var5.next();
            gw $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(aqa.a)) {
               ctc $$6 = $$0.b_($$1).b() ? cte.co : cte.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cte.mW)) {
               $$0.b($$1, cte.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cqc $$0, gw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public cjl a(@Nullable cca $$0, cqc $$1, gw $$2, dfd $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cte.a.o(), 11);
         return new cjl(this.c.a());
      } else {
         return cjl.b;
      }
   }

   @Override
   public Optional<apf> aq_() {
      return this.c.j();
   }
}
