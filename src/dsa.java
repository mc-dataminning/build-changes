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

public class dsa extends dne implements dnm {
   private static final Codec<exo> f = mh.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof exo $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dsa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dsa::new));
   public static final ecg b = ebw.aS;
   protected final exo c;
   private final List<exq> g;
   public static final fgm d = dne.b(16.0, 0.0, 8.0);
   public static final ImmutableList<jc> e = ImmutableList.of(jc.a, jc.d, jc.c, jc.f, jc.e);

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   protected dsa(exo $$0, ebf.d $$1) {
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
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fgj.a();
   }

   @Override
   protected boolean f(ebg $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(ebg $$0) {
      return false;
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return !this.c.a(axl.b);
   }

   @Override
   protected exq b_(ebg $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(ebg $$0, ebg $$1, jc $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dtr a_(ebg $$0) {
      return dtr.a;
   }

   @Override
   protected List<daa> a(ebg $$0, fam.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return fgj.a();
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(djz $$0, iw $$1, ebg $$2) {
      if (this.c.a(axl.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dng.eo);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jc $$4 = (jc)var5.next();
            iw $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axl.a)) {
               dne $$6 = $$0.b_($$1).b() ? dng.cy : dng.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dng.nC)) {
               $$0.b($$1, dng.ep.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dka $$0, iw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   public daa a(@Nullable bxw $$0, dka $$1, iw $$2, ebg $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dng.a.m(), 11);
         return new daa(this.c.a());
      } else {
         return daa.k;
      }
   }

   @Override
   public Optional<awq> at_() {
      return this.c.j();
   }
}
