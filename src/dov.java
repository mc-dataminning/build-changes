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

public class dov extends dkd implements dkl {
   private static final Codec<eto> f = ma.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eto $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dov> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dov::new));
   public static final dyn b = dye.aS;
   protected final eto c;
   private final List<etq> g;
   public static final fcl d = dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jm> e = ImmutableList.of(jm.a, jm.d, jm.c, jm.f, jm.e);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   protected dov(eto $$0, dxn.d $$1) {
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
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fci.a();
   }

   @Override
   protected boolean f(dxo $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dxo $$0) {
      return false;
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return !this.c.a(axq.b);
   }

   @Override
   protected etq b_(dxo $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dxo $$0, dxo $$1, jm $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.a;
   }

   @Override
   protected List<cxg> a(dxo $$0, ewl.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return fci.a();
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dgz $$0, jh $$1, dxo $$2) {
      if (this.c.a(axq.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dkf.ek);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jm $$4 = (jm)var5.next();
            jh $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axq.a)) {
               dkd $$6 = $$0.b_($$1).b() ? dkf.cv : dkf.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dkf.ny)) {
               $$0.b($$1, dkf.el.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dha $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   public cxg a(@Nullable cpo $$0, dha $$1, jh $$2, dxo $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dkf.a.m(), 11);
         return new cxg(this.c.a());
      } else {
         return cxg.j;
      }
   }

   @Override
   public Optional<awu> at_() {
      return this.c.j();
   }
}
