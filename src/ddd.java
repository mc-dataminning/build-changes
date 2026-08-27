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

public class ddd extends cyo implements cyv {
   private static final Codec<egn> f = kf.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof egn $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<ddd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, ddd::new));
   public static final dmf b = dlv.aP;
   protected final egn c;
   private final List<egp> g;
   public static final eol d = cyo.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ie> e = ImmutableList.of(ie.a, ie.d, ie.c, ie.f, ie.e);

   @Override
   public MapCodec<ddd> a() {
      return a;
   }

   protected ddd(egn $$0, dle.d $$1) {
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
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : eoi.a();
   }

   @Override
   protected boolean e_(dlf $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return false;
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return !this.c.a(aue.b);
   }

   @Override
   protected egp c_(dlf $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dlf $$0, dlf $$1, ie $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.a;
   }

   @Override
   protected List<coz> a(dlf $$0, ejb.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return eoi.a();
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cvq)$$1));
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cvq)$$1));
      }
   }

   private boolean a(cvn $$0, hz $$1, dlf $$2) {
      if (this.c.a(aue.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cyq.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ie $$4 = (ie)var5.next();
            hz $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(aue.a)) {
               cyo $$6 = $$0.b_($$1).b() ? cyq.co : cyq.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cyq.mW)) {
               $$0.b($$1, cyq.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cvo $$0, hz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   public coz a(@Nullable chh $$0, cvo $$1, hz $$2, dlf $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cyq.a.o(), 11);
         return new coz(this.c.a());
      } else {
         return coz.h;
      }
   }

   @Override
   public Optional<atj> ax_() {
      return this.c.j();
   }
}
