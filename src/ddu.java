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

public class ddu extends czf implements czm {
   private static final Codec<ehp> f = kh.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ehp $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<ddu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, ddu::new));
   public static final dne b = dmu.aP;
   protected final ehp c;
   private final List<ehr> g;
   public static final epo d = czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ih> e = ImmutableList.of(ih.a, ih.d, ih.c, ih.f, ih.e);

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   protected ddu(ehp $$0, dmd.d $$1) {
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
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : epl.a();
   }

   @Override
   protected boolean e_(dme $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return false;
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return !this.c.a(auj.b);
   }

   @Override
   protected ehr c_(dme $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dme $$0, dme $$1, ih $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.a;
   }

   @Override
   protected List<cpq> a(dme $$0, eke.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return epl.a();
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cwh)$$1));
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cwh)$$1));
      }
   }

   private boolean a(cwe $$0, ib $$1, dme $$2) {
      if (this.c.a(auj.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(czh.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ih $$4 = (ih)var5.next();
            ib $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(auj.a)) {
               czf $$6 = $$0.b_($$1).b() ? czh.co : czh.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(czh.mW)) {
               $$0.b($$1, czh.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cwf $$0, ib $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   public cpq a(@Nullable cia $$0, cwf $$1, ib $$2, dme $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, czh.a.o(), 11);
         return new cpq(this.c.a());
      } else {
         return cpq.h;
      }
   }

   @Override
   public Optional<ato> aw_() {
      return this.c.j();
   }
}
