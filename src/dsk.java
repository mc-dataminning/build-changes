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

public class dsk extends dno implements dnw {
   private static final Codec<exy> f = mh.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof exy $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dsk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dsk::new));
   public static final ecq b = ecg.aS;
   protected final exy c;
   private final List<eya> g;
   public static final fgw d = dno.b(16.0, 0.0, 8.0);
   public static final ImmutableList<jc> e = ImmutableList.of(jc.a, jc.d, jc.c, jc.f, jc.e);

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   protected dsk(exy $$0, ebp.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fgt.a();
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(ebq $$0) {
      return false;
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return !this.c.a(axs.b);
   }

   @Override
   protected eya b_(ebq $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(ebq $$0, ebq $$1, jc $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dub a_(ebq $$0) {
      return dub.a;
   }

   @Override
   protected List<dak> a(ebq $$0, faw.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.a();
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dkj $$0, iw $$1, ebq $$2) {
      if (this.c.a(axs.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dnq.eo);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jc $$4 = (jc)var5.next();
            iw $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axs.a)) {
               dno $$6 = $$0.b_($$1).b() ? dnq.cy : dnq.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dnq.nC)) {
               $$0.b($$1, dnq.ep.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dkk $$0, iw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   public dak a(@Nullable byf $$0, dkk $$1, iw $$2, ebq $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dnq.a.m(), 11);
         return new dak(this.c.a());
      } else {
         return dak.l;
      }
   }

   @Override
   public Optional<awx> ap_() {
      return this.c.j();
   }
}
