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

public class cyo extends cua implements cuh {
   private static final Codec<ebc> f = jy.d
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ebc $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<cyo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, cyo::new));
   public static final dhb b = dgr.aP;
   protected final ebc c;
   private final List<ebe> g;
   public static final eiy d = cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<hx> e = ImmutableList.of(hx.a, hx.d, hx.c, hx.f, hx.e);

   @Override
   public MapCodec<cyo> a() {
      return a;
   }

   protected cyo(ebc $$0, dga.d $$1) {
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
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : eiv.a();
   }

   @Override
   public boolean e_(dgb $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return false;
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return !this.c.a(aqx.b);
   }

   @Override
   public ebe c_(dgb $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dgb $$0, dgb $$1, hx $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.a;
   }

   @Override
   public List<ckj> a(dgb $$0, edo.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return eiv.a();
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((crc)$$1));
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((crc)$$1));
      }
   }

   private boolean a(cqz $$0, ht $$1, dgb $$2) {
      if (this.c.a(aqx.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cuc.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            hx $$4 = (hx)var5.next();
            ht $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(aqx.a)) {
               cua $$6 = $$0.b_($$1).b() ? cuc.co : cuc.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cuc.mW)) {
               $$0.b($$1, cuc.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cra $$0, ht $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public ckj a(@Nullable ccx $$0, cra $$1, ht $$2, dgb $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cuc.a.o(), 11);
         return new ckj(this.c.a());
      } else {
         return ckj.b;
      }
   }

   @Override
   public Optional<aqc> at_() {
      return this.c.j();
   }
}
