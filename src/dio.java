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

public class dio extends ddy implements def {
   private static final Codec<ems> f = le.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ems $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dio> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dio::new));
   public static final dsb b = drr.aP;
   protected final ems c;
   private final List<emu> g;
   public static final evd d = ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<it> e = ImmutableList.of(it.a, it.d, it.c, it.f, it.e);

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   protected dio(ems $$0, dra.d $$1) {
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
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : eva.a();
   }

   @Override
   protected boolean d_(drb $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return false;
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return !this.c.a(awb.b);
   }

   @Override
   protected emu b_(drb $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(drb $$0, drb $$1, it $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.a;
   }

   @Override
   protected List<cto> a(drb $$0, epi.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return eva.a();
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dba)$$1));
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dba)$$1));
      }
   }

   private boolean a(dax $$0, io $$1, drb $$2) {
      if (this.c.a(awb.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dea.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            it $$4 = (it)var5.next();
            io $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awb.a)) {
               ddy $$6 = $$0.b_($$1).b() ? dea.co : dea.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dea.mW)) {
               $$0.b($$1, dea.dY.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(day $$0, io $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   public cto a(@Nullable clw $$0, day $$1, io $$2, drb $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dea.a.n(), 11);
         return new cto(this.c.a());
      } else {
         return cto.i;
      }
   }

   @Override
   public Optional<avg> as_() {
      return this.c.j();
   }
}
