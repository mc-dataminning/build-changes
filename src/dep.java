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

public class dep extends daa implements dah {
   private static final Codec<eil> f = ki.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eil $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dep> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dep::new));
   public static final dnz b = dnp.aP;
   protected final eil c;
   private final List<ein> g;
   public static final eqk d = daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ih> e = ImmutableList.of(ih.a, ih.d, ih.c, ih.f, ih.e);

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   protected dep(eil $$0, dmy.d $$1) {
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
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : eqh.a();
   }

   @Override
   protected boolean e_(dmz $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return false;
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return !this.c.a(aus.b);
   }

   @Override
   protected ein c_(dmz $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dmz $$0, dmz $$1, ih $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.a;
   }

   @Override
   protected List<cqk> a(dmz $$0, ela.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return eqh.a();
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cxc)$$1));
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cxc)$$1));
      }
   }

   private boolean a(cwz $$0, ib $$1, dmz $$2) {
      if (this.c.a(aus.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dac.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ih $$4 = (ih)var5.next();
            ib $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(aus.a)) {
               daa $$6 = $$0.b_($$1).b() ? dac.co : dac.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dac.mW)) {
               $$0.b($$1, dac.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cxa $$0, ib $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   public cqk a(@Nullable cis $$0, cxa $$1, ib $$2, dmz $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dac.a.o(), 11);
         return new cqk(this.c.a());
      } else {
         return cqk.h;
      }
   }

   @Override
   public Optional<atx> av_() {
      return this.c.j();
   }
}
