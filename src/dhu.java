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

public class dhu extends dde implements ddl {
   private static final Codec<ely> f = ld.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ely $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dhu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dhu::new));
   public static final drh b = dqx.aP;
   protected final ely c;
   private final List<ema> g;
   public static final eui d = dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<is> e = ImmutableList.of(is.a, is.d, is.c, is.f, is.e);

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   protected dhu(ely $$0, dqg.d $$1) {
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
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : euf.a();
   }

   @Override
   protected boolean d_(dqh $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return false;
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return !this.c.a(avw.b);
   }

   @Override
   protected ema b_(dqh $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dqh $$0, dqh $$1, is $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.a;
   }

   @Override
   protected List<csz> a(dqh $$0, eoo.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return euf.a();
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dag)$$1));
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dag)$$1));
      }
   }

   private boolean a(dad $$0, in $$1, dqh $$2) {
      if (this.c.a(avw.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(ddg.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            is $$4 = (is)var5.next();
            in $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(avw.a)) {
               dde $$6 = $$0.b_($$1).b() ? ddg.co : ddg.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(ddg.mW)) {
               $$0.b($$1, ddg.dY.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dae $$0, in $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   public csz a(@Nullable clh $$0, dae $$1, in $$2, dqh $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, ddg.a.n(), 11);
         return new csz(this.c.a());
      } else {
         return csz.i;
      }
   }

   @Override
   public Optional<avb> as_() {
      return this.c.j();
   }
}
