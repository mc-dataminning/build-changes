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

public class diq extends dea implements deh {
   private static final Codec<emu> f = le.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof emu $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<diq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, diq::new));
   public static final dsd b = drt.aP;
   protected final emu c;
   private final List<emw> g;
   public static final evf d = dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<it> e = ImmutableList.of(it.a, it.d, it.c, it.f, it.e);

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   protected diq(emu $$0, drc.d $$1) {
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
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : evc.a();
   }

   @Override
   protected boolean d_(drd $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return false;
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return !this.c.a(awc.b);
   }

   @Override
   protected emw b_(drd $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(drd $$0, drd $$1, it $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.a;
   }

   @Override
   protected List<ctq> a(drd $$0, epk.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return evc.a();
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dbc)$$1));
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dbc)$$1));
      }
   }

   private boolean a(daz $$0, io $$1, drd $$2) {
      if (this.c.a(awc.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dec.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            it $$4 = (it)var5.next();
            io $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awc.a)) {
               dea $$6 = $$0.b_($$1).b() ? dec.co : dec.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dec.mW)) {
               $$0.b($$1, dec.dY.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dba $$0, io $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   public ctq a(@Nullable cly $$0, dba $$1, io $$2, drd $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dec.a.n(), 11);
         return new ctq(this.c.a());
      } else {
         return ctq.i;
      }
   }

   @Override
   public Optional<avh> at_() {
      return this.c.j();
   }
}
