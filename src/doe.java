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

public class doe extends djm implements dju {
   private static final Codec<esx> f = mb.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof esx $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<doe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, doe::new));
   public static final dxw b = dxn.aS;
   protected final esx c;
   private final List<esz> g;
   public static final fbu d = djm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jn> e = ImmutableList.of(jn.a, jn.d, jn.c, jn.f, jn.e);

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   protected doe(esx $$0, dww.d $$1) {
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
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fbr.a();
   }

   @Override
   protected boolean f(dwx $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dwx $$0) {
      return false;
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return !this.c.a(awv.b);
   }

   @Override
   protected esz b_(dwx $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dwx $$0, dwx $$1, jn $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.a;
   }

   @Override
   protected List<cwp> a(dwx $$0, evu.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return fbr.a();
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dgi $$0, ji $$1, dwx $$2) {
      if (this.c.a(awv.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(djo.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jn $$4 = (jn)var5.next();
            ji $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awv.a)) {
               djm $$6 = $$0.b_($$1).b() ? djo.cv : djo.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(djo.ny)) {
               $$0.b($$1, djo.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dgj $$0, ji $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   public cwp a(@Nullable cox $$0, dgj $$1, ji $$2, dwx $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, djo.a.m(), 11);
         return new cwp(this.c.a());
      } else {
         return cwp.j;
      }
   }

   @Override
   public Optional<avz> as_() {
      return this.c.j();
   }
}
