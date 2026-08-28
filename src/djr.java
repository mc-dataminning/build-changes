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

public class djr extends dfb implements dfi {
   private static final Codec<env> f = lp.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof env $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<djr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, djr::new));
   public static final dte b = dsu.aP;
   protected final env c;
   private final List<enx> g;
   public static final ewm d = dfb.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<je> e = ImmutableList.of(je.a, je.d, je.c, je.f, je.e);

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   protected djr(env $$0, dsd.d $$1) {
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
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ewj.a();
   }

   @Override
   protected boolean d_(dse $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return !this.c.a(awv.b);
   }

   @Override
   protected enx b_(dse $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dse $$0, dse $$1, je $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.a;
   }

   @Override
   protected List<cur> a(dse $$0, eqn.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return ewj.a();
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcd)$$1));
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcd)$$1));
      }
   }

   private boolean a(dca $$0, iz $$1, dse $$2) {
      if (this.c.a(awv.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dfd.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            je $$4 = (je)var5.next();
            iz $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awv.a)) {
               dfb $$6 = $$0.b_($$1).b() ? dfd.co : dfd.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dfd.mW)) {
               $$0.b($$1, dfd.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dcb $$0, iz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   public cur a(@Nullable cmz $$0, dcb $$1, iz $$2, dse $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dfd.a.o(), 11);
         return new cur(this.c.a());
      } else {
         return cur.l;
      }
   }

   @Override
   public Optional<avz> ar_() {
      return this.c.j();
   }
}
