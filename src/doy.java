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

public class doy extends dke implements dkm {
   private static final Codec<etu> f = mb.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof etu $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<doy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, doy::new));
   public static final dyq b = dyg.aS;
   protected final etu c;
   private final List<etw> g;
   public static final fcr d = dke.b(16.0, 0.0, 8.0);
   public static final ImmutableList<jn> e = ImmutableList.of(jn.a, jn.d, jn.c, jn.f, jn.e);

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   protected doy(etu $$0, dxp.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fco.a();
   }

   @Override
   protected boolean f(dxq $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dxq $$0) {
      return false;
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return !this.c.a(awv.b);
   }

   @Override
   protected etw b_(dxq $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dxq $$0, dxq $$1, jn $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dqp a_(dxq $$0) {
      return dqp.a;
   }

   @Override
   protected List<cxh> a(dxq $$0, ewr.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return fco.a();
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dgz $$0, ji $$1, dxq $$2) {
      if (this.c.a(awv.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dkg.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jn $$4 = (jn)var5.next();
            ji $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awv.a)) {
               dke $$6 = $$0.b_($$1).b() ? dkg.cv : dkg.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dkg.ny)) {
               $$0.b($$1, dkg.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dha $$0, ji $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   public cxh a(@Nullable bvy $$0, dha $$1, ji $$2, dxq $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dkg.a.m(), 11);
         return new cxh(this.c.a());
      } else {
         return cxh.k;
      }
   }

   @Override
   public Optional<avz> as_() {
      return this.c.j();
   }
}
