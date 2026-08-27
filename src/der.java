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

public class der extends dac implements daj {
   private static final Codec<ein> f = ki.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ein $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<der> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, der::new));
   public static final dob b = dnr.aP;
   protected final ein c;
   private final List<eip> g;
   public static final eqm d = dac.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ih> e = ImmutableList.of(ih.a, ih.d, ih.c, ih.f, ih.e);

   @Override
   public MapCodec<der> a() {
      return a;
   }

   protected der(ein $$0, dna.d $$1) {
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
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : eqj.a();
   }

   @Override
   protected boolean e_(dnb $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return false;
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return !this.c.a(aus.b);
   }

   @Override
   protected eip c_(dnb $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dnb $$0, dnb $$1, ih $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.a;
   }

   @Override
   protected List<cqm> a(dnb $$0, elc.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return eqj.a();
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cxe)$$1));
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cxe)$$1));
      }
   }

   private boolean a(cxb $$0, ib $$1, dnb $$2) {
      if (this.c.a(aus.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dae.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ih $$4 = (ih)var5.next();
            ib $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(aus.a)) {
               dac $$6 = $$0.b_($$1).b() ? dae.co : dae.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dae.mW)) {
               $$0.b($$1, dae.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cxc $$0, ib $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   public cqm a(@Nullable ciu $$0, cxc $$1, ib $$2, dnb $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dae.a.o(), 11);
         return new cqm(this.c.a());
      } else {
         return cqm.h;
      }
   }

   @Override
   public Optional<atx> av_() {
      return this.c.j();
   }
}
