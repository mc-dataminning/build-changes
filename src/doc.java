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

public class doc extends djk implements djs {
   private static final Codec<esv> f = mb.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof esv $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<doc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, doc::new));
   public static final dxu b = dxl.aS;
   protected final esv c;
   private final List<esx> g;
   public static final fbs d = djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jn> e = ImmutableList.of(jn.a, jn.d, jn.c, jn.f, jn.e);

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   protected doc(esv $$0, dwu.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fbp.a();
   }

   @Override
   protected boolean f(dwv $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dwv $$0) {
      return false;
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return !this.c.a(awu.b);
   }

   @Override
   protected esx b_(dwv $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dwv $$0, dwv $$1, jn $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dpv a_(dwv $$0) {
      return dpv.a;
   }

   @Override
   protected List<cwn> a(dwv $$0, evs.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return fbp.a();
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dgg $$0, ji $$1, dwv $$2) {
      if (this.c.a(awu.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(djm.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jn $$4 = (jn)var5.next();
            ji $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awu.a)) {
               djk $$6 = $$0.b_($$1).b() ? djm.cv : djm.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(djm.ny)) {
               $$0.b($$1, djm.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dgh $$0, ji $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   public cwn a(@Nullable cov $$0, dgh $$1, ji $$2, dwv $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, djm.a.m(), 11);
         return new cwn(this.c.a());
      } else {
         return cwn.j;
      }
   }

   @Override
   public Optional<avy> as_() {
      return this.c.j();
   }
}
