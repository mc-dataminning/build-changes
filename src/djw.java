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

public class djw extends dfc implements dfj {
   private static final Codec<epc> f = lh.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof epc $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<djw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, djw::new));
   public static final duc b = dts.aP;
   protected final epc c;
   private final List<epe> g;
   public static final exn d = dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<iw> e = ImmutableList.of(iw.a, iw.d, iw.c, iw.f, iw.e);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   protected djw(epc $$0, dtb.d $$1) {
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
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : exk.a();
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return false;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return !this.c.a(awj.b);
   }

   @Override
   protected epe b_(dtc $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dtc $$0, dtc $$1, iw $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.a;
   }

   @Override
   protected List<cuh> a(dtc $$0, ers.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return exk.a();
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcd)$$1));
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcd)$$1));
      }
   }

   private boolean a(dca $$0, ir $$1, dtc $$2) {
      if (this.c.a(awj.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dfe.eL);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            iw $$4 = (iw)var5.next();
            ir $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awj.a)) {
               dfc $$6 = $$0.b_($$1).b() ? dfe.cZ : dfe.q;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dfe.nU)) {
               $$0.b($$1, dfe.eM.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dcb $$0, ir $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public cuh a(@Nullable cly $$0, dcb $$1, ir $$2, dtc $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dfe.a.n(), 11);
         return new cuh(this.c.a());
      } else {
         return cuh.i;
      }
   }

   @Override
   public Optional<avn> as_() {
      return this.c.j();
   }
}
