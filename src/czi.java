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

public class czi extends cut implements cva {
   private static final Codec<ece> f = jy.d
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ece $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<czi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, czi::new));
   public static final dhw b = dhm.aP;
   protected final ece c;
   private final List<ecg> g;
   public static final ekb d = cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<hx> e = ImmutableList.of(hx.a, hx.d, hx.c, hx.f, hx.e);

   @Override
   public MapCodec<czi> a() {
      return a;
   }

   protected czi(ece $$0, dgv.d $$1) {
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
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ejy.a();
   }

   @Override
   public boolean e_(dgw $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dgw $$0, cqy $$1, ht $$2) {
      return false;
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return !this.c.a(arh.b);
   }

   @Override
   public ecg c_(dgw $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dgw $$0, dgw $$1, hx $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public day b_(dgw $$0) {
      return day.a;
   }

   @Override
   public List<clb> a(dgw $$0, eer.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ejy.a();
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((crv)$$1));
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((crv)$$1));
      }
   }

   private boolean a(crs $$0, ht $$1, dgw $$2) {
      if (this.c.a(arh.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cuv.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            hx $$4 = (hx)var5.next();
            ht $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(arh.a)) {
               cut $$6 = $$0.b_($$1).b() ? cuv.co : cuv.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cuv.mW)) {
               $$0.b($$1, cuv.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(crt $$0, ht $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public clb a(@Nullable cdm $$0, crt $$1, ht $$2, dgw $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cuv.a.o(), 11);
         return new clb(this.c.a());
      } else {
         return clb.b;
      }
   }

   @Override
   public Optional<aqm> at_() {
      return this.c.j();
   }
}
