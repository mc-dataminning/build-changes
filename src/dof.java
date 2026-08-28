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

public class dof extends djn implements djv {
   private static final Codec<esy> f = mb.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof esy $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dof> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dof::new));
   public static final dxx b = dxo.aS;
   protected final esy c;
   private final List<eta> g;
   public static final fbv d = djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jn> e = ImmutableList.of(jn.a, jn.d, jn.c, jn.f, jn.e);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   protected dof(esy $$0, dwx.d $$1) {
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
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fbs.a();
   }

   @Override
   protected boolean f(dwy $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dwy $$0) {
      return false;
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return !this.c.a(awv.b);
   }

   @Override
   protected eta b_(dwy $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dwy $$0, dwy $$1, jn $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dpy a_(dwy $$0) {
      return dpy.a;
   }

   @Override
   protected List<cwq> a(dwy $$0, evv.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return fbs.a();
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dgj $$0, ji $$1, dwy $$2) {
      if (this.c.a(awv.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(djp.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jn $$4 = (jn)var5.next();
            ji $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awv.a)) {
               djn $$6 = $$0.b_($$1).b() ? djp.cv : djp.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(djp.ny)) {
               $$0.b($$1, djp.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dgk $$0, ji $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   public cwq a(@Nullable coy $$0, dgk $$1, ji $$2, dwy $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, djp.a.m(), 11);
         return new cwq(this.c.a());
      } else {
         return cwq.j;
      }
   }

   @Override
   public Optional<avz> as_() {
      return this.c.j();
   }
}
