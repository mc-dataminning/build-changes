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

public class ddh extends cys implements cyz {
   private static final Codec<egu> f = kf.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof egu $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<ddh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, ddh::new));
   public static final dmj b = dlz.aP;
   protected final egu c;
   private final List<egw> g;
   public static final eos d = cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ie> e = ImmutableList.of(ie.a, ie.d, ie.c, ie.f, ie.e);

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   protected ddh(egu $$0, dli.d $$1) {
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
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : eop.a();
   }

   @Override
   protected boolean e_(dlj $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dlj $$0, cux $$1, hz $$2) {
      return false;
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return !this.c.a(auf.b);
   }

   @Override
   protected egw c_(dlj $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dlj $$0, dlj $$1, ie $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.a;
   }

   @Override
   protected List<cpd> a(dlj $$0, eji.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return eop.a();
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cvu)$$1));
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cvu)$$1));
      }
   }

   private boolean a(cvr $$0, hz $$1, dlj $$2) {
      if (this.c.a(auf.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cyu.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ie $$4 = (ie)var5.next();
            hz $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(auf.a)) {
               cys $$6 = $$0.b_($$1).b() ? cyu.co : cyu.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cyu.mW)) {
               $$0.b($$1, cyu.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cvs $$0, hz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   public cpd a(@Nullable chl $$0, cvs $$1, hz $$2, dlj $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cyu.a.o(), 11);
         return new cpd(this.c.a());
      } else {
         return cpd.h;
      }
   }

   @Override
   public Optional<atk> ax_() {
      return this.c.j();
   }
}
