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

public class dao extends cvz implements cwg {
   private static final Codec<edx> f = kb.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof edx $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dao> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dao::new));
   public static final djp b = djf.aP;
   protected final edx c;
   private final List<edz> g;
   public static final elu d = cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ia> e = ImmutableList.of(ia.a, ia.d, ia.c, ia.f, ia.e);

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   protected dao(edx $$0, dio.d $$1) {
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
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : elr.a();
   }

   @Override
   public boolean e_(dip $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return false;
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return !this.c.a(arw.b);
   }

   @Override
   public edz c_(dip $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dip $$0, dip $$1, ia $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.a;
   }

   @Override
   public List<cmh> a(dip $$0, egk.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return elr.a();
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((ctb)$$1));
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((ctb)$$1));
      }
   }

   private boolean a(csy $$0, hv $$1, dip $$2) {
      if (this.c.a(arw.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cwb.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ia $$4 = (ia)var5.next();
            hv $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(arw.a)) {
               cvz $$6 = $$0.b_($$1).b() ? cwb.co : cwb.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cwb.mW)) {
               $$0.b($$1, cwb.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(csz $$0, hv $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public cmh a(@Nullable cer $$0, csz $$1, hv $$2, dip $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cwb.a.o(), 11);
         return new cmh(this.c.a());
      } else {
         return cmh.f;
      }
   }

   @Override
   public Optional<arb> au_() {
      return this.c.j();
   }
}
