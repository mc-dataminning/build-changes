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

public class dow extends dke implements dkm {
   private static final Codec<etn> f = ma.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof etn $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dow> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dow::new));
   public static final dym b = dyd.aQ;
   protected final etn c;
   private final List<etp> g;
   public static final fcm d = dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jm> e = ImmutableList.of(jm.a, jm.d, jm.c, jm.f, jm.e);

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   protected dow(etn $$0, dxm.d $$1) {
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
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fcj.a();
   }

   @Override
   protected boolean f(dxn $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dxn $$0) {
      return false;
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return !this.c.a(aya.b);
   }

   @Override
   protected etp b_(dxn $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dxn $$0, dxn $$1, jm $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.a;
   }

   @Override
   protected List<cxk> a(dxn $$0, ewk.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return fcj.a();
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dha $$0, jh $$1, dxn $$2) {
      if (this.c.a(aya.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dkg.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jm $$4 = (jm)var5.next();
            jh $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(aya.a)) {
               dke $$6 = $$0.b_($$1).b() ? dkg.cv : dkg.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dkg.nr)) {
               $$0.b($$1, dkg.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dhb $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   public cxk a(@Nullable cps $$0, dhb $$1, jh $$2, dxn $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dkg.a.m(), 11);
         return new cxk(this.c.a());
      } else {
         return cxk.k;
      }
   }

   @Override
   public Optional<axe> at_() {
      return this.c.j();
   }
}
