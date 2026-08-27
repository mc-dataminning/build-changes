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

public class dbn extends cwy implements cxf {
   private static final Codec<eex> f = kd.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eex $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dbn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dbn::new));
   public static final dkp b = dkf.aP;
   protected final eex c;
   private final List<eez> g;
   public static final emv d = cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ic> e = ImmutableList.of(ic.a, ic.d, ic.c, ic.f, ic.e);

   @Override
   public MapCodec<dbn> a() {
      return a;
   }

   protected dbn(eex $$0, djo.d $$1) {
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
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ems.a();
   }

   @Override
   public boolean e_(djp $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return false;
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return !this.c.a(asn.b);
   }

   @Override
   public eez c_(djp $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(djp $$0, djp $$1, ic $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.a;
   }

   @Override
   public List<cng> a(djp $$0, ehl.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ems.a();
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cua)$$1));
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cua)$$1));
      }
   }

   private boolean a(ctx $$0, hx $$1, djp $$2) {
      if (this.c.a(asn.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cxa.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ic $$4 = (ic)var5.next();
            hx $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(asn.a)) {
               cwy $$6 = $$0.b_($$1).b() ? cxa.co : cxa.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cxa.mW)) {
               $$0.b($$1, cxa.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cty $$0, hx $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public cng a(@Nullable cfq $$0, cty $$1, hx $$2, djp $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cxa.a.o(), 11);
         return new cng(this.c.a());
      } else {
         return cng.f;
      }
   }

   @Override
   public Optional<ars> ax_() {
      return this.c.j();
   }
}
