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

public class dkm extends dfw implements dgd {
   private static final Codec<eow> f = lt.c
      .r()
      .comapFlatMap($$0 -> $$0 instanceof eow $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dkm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dkm::new));
   public static final dua b = dtq.aP;
   protected final eow c;
   private final List<eoy> g;
   public static final exp d = dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ji> e = ImmutableList.of(ji.a, ji.d, ji.c, ji.f, ji.e);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   protected dkm(eow $$0, dsz.d $$1) {
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
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : exm.a();
   }

   @Override
   protected boolean d_(dta $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return false;
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return !this.c.a(awj.b);
   }

   @Override
   protected eoy b_(dta $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dta $$0, dta $$1, ji $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.a;
   }

   @Override
   protected List<cuo> a(dta $$0, ero.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return exm.a();
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcx)$$1));
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcx)$$1));
      }
   }

   private boolean a(dcu $$0, jd $$1, dta $$2) {
      if (this.c.a(awj.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dfy.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ji $$4 = (ji)var5.next();
            jd $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awj.a)) {
               dfw $$6 = $$0.b_($$1).b() ? dfy.co : dfy.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dfy.mW)) {
               $$0.b($$1, dfy.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dcv $$0, jd $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   public cuo a(@Nullable cmv $$0, dcv $$1, jd $$2, dta $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dfy.a.o(), 11);
         return new cuo(this.c.a());
      } else {
         return cuo.l;
      }
   }

   @Override
   public Optional<avn> as_() {
      return this.c.j();
   }
}
