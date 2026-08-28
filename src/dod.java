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

public class dod extends djl implements djt {
   private static final Codec<esw> f = mb.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof esw $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dod> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dod::new));
   public static final dxv b = dxm.aS;
   protected final esw c;
   private final List<esy> g;
   public static final fbt d = djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jn> e = ImmutableList.of(jn.a, jn.d, jn.c, jn.f, jn.e);

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   protected dod(esw $$0, dwv.d $$1) {
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
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fbq.a();
   }

   @Override
   protected boolean f(dww $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dww $$0) {
      return false;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return !this.c.a(awv.b);
   }

   @Override
   protected esy b_(dww $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dww $$0, dww $$1, jn $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dpw a_(dww $$0) {
      return dpw.a;
   }

   @Override
   protected List<cwo> a(dww $$0, evt.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return fbq.a();
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dgh $$0, ji $$1, dww $$2) {
      if (this.c.a(awv.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(djn.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jn $$4 = (jn)var5.next();
            ji $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awv.a)) {
               djl $$6 = $$0.b_($$1).b() ? djn.cv : djn.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(djn.ny)) {
               $$0.b($$1, djn.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dgi $$0, ji $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   public cwo a(@Nullable cow $$0, dgi $$1, ji $$2, dww $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, djn.a.m(), 11);
         return new cwo(this.c.a());
      } else {
         return cwo.j;
      }
   }

   @Override
   public Optional<avz> as_() {
      return this.c.j();
   }
}
