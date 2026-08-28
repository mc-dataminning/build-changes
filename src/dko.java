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

public class dko extends dfy implements dgf {
   private static final Codec<epc> f = lt.c
      .r()
      .comapFlatMap($$0 -> $$0 instanceof epc $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dko> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dko::new));
   public static final duc b = dts.aP;
   protected final epc c;
   private final List<epe> g;
   public static final exv d = dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ji> e = ImmutableList.of(ji.a, ji.d, ji.c, ji.f, ji.e);

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   protected dko(epc $$0, dtb.d $$1) {
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
   protected exv b(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.u()) ? d : exs.a();
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return false;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return !this.c.a(awk.b);
   }

   @Override
   protected epe b_(dtc $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dtc $$0, dtc $$1, ji $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.a;
   }

   @Override
   protected List<cuq> a(dtc $$0, eru.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return exs.a();
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcz)$$1));
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcz)$$1));
      }
   }

   private boolean a(dcw $$0, jd $$1, dtc $$2) {
      if (this.c.a(awk.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dga.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ji $$4 = (ji)var5.next();
            jd $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awk.a)) {
               dfy $$6 = $$0.b_($$1).b() ? dga.co : dga.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dga.mW)) {
               $$0.b($$1, dga.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dcx $$0, jd $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public cuq a(@Nullable cmx $$0, dcx $$1, jd $$2, dtc $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dga.a.o(), 11);
         return new cuq(this.c.a());
      } else {
         return cuq.l;
      }
   }

   @Override
   public Optional<avo> aw_() {
      return this.c.j();
   }
}
